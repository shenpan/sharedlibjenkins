package job

import javaposse.jobdsl.dsl.DslFactory

import job.Utility

public class FlowGeneric {

    public final static String JOB_NAME = "flow-generic"

    public static void createJob(DslFactory dslFactory) {
        println Utility.test()
        println "=="
        def pipelineScript = readFileFromWorkspace('src/main/resources/pipeline/script/flow-generic.pipeline')
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script(pipelineScript)
                }
            }
        }
    }

}
