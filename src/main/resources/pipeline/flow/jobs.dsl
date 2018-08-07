//import job.FlowGeneric
//import job.RunTestTarget
//import job.EnvSetup

File test = new File()
println "test path:" + test.getAbsolutePath()

File sourceFile = new File("job/lib/jenkins/jobs/PROJ/jobs/PROJ.jenkins.dsl.helpers/jobs/master/jobs/build/workspace/FlowGeneric.groovy")
Class TemplatesDSL = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile)


TemplatesDSL.createJob(this)
//FlowGeneric.createJob(this)
//RunTestTarget.createJob(this)
//EnvSetup.createJob(this)

