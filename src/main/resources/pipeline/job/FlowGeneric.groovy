package job

import javaposse.jobdsl.dsl.DslFactory

import job.Utility

public class FlowGeneric {

    public final static String JOB_NAME = "flow-generic"

    public static void createJob(DslFactory dslFactory) {
        Utility.test()
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script(readFileFromWorkspace("src/main/resources/pipeline/script/flow-generic.pipeline"))
                }
            }
        }
    }

}
