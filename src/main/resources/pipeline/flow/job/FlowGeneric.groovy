package flow.job

import javaposse.jobdsl.dsl.DslFactory

import flow.util.Utility

public class FlowGeneric {

    public final static String JOB_NAME = "flow-generic"

    public static void createJob(DslFactory dslFactory) {
        String testStr = Utility.test()
        System.out.println(testStr)
        System.out.println("==")
        def pipelineScript = dslFactory.readFileFromWorkspace("src/main/resources/pipeline/script/flow-generic.pipeline")
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script(testStr)
                }
            }
        }
    }

}
