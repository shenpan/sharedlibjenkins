hudson.FilePath workspace = hudson.model.Executor.currentExecutor().getCurrentWorkspace()
hudson.FilePath pipelineFolder = workspace.child("src/main/resources/pipeline")

ClassLoader classLoader = new GroovyClassLoader(getClass().getClassLoader())
// Load util classes
pipelineFolder.child("flow/util").list().each {
    println "== Loading util class: $it"
    classLoader.parseClass(new File(it.getRemote()))
}
println "== Loading util class done!"

// Execute job dsl:s
pipelineFolder.child("flow/job").list().eachWithIndex { jobFile, i ->
    int fileNumber = i + 1
    println "== Processing No.$fileNumber job dsl file: $sourceFilePath"
    String sourceFilePath = jobFile.getRemote()
    File jobDslSource = new File(sourceFilePath)
    Class jobDslClass = classLoader.parseClass(jobDslSource)
    jobDslClass.createJob(this)
}
println "== Processing job dsl file done!"
