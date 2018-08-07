package flow.job

import javaposse.jobdsl.dsl.DslFactory

import flow.util.Utility

public class FlowGeneric {

    public final static String JOB_NAME = "flow-generic"

    public static void createJob(DslFactory dslFactory) {
        def pipelineScript = dslFactory.readFileFromWorkspace(Utility.PIPELINE_SCRIPT_DIR + "flow-generic.pipeline")
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script(pipelineScript)
                }
            }
        }
    }

}
