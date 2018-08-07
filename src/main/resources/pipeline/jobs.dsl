hudson.FilePath workspace = hudson.model.Executor.currentExecutor().getCurrentWorkspace()

workspace.child("src/main/resources/pipeline/job").list().eachWithIndex { jobFile, i ->
    String sourceFilePath = jobFile.getRemote()
    int fileNumber = i + 1
    println "== Processing No.$fileNumber JOB DSL file: $sourceFilePath"
    File jobDslSource = new File(sourceFilePath)
    Class jobDslClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(jobDslSource)
    jobDslClass.createJob(this)
    println "== Done No.$fileNumber JOB DSL file: $sourceFilePath"
}