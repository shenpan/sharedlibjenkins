package job

import javaposse.jobdsl.dsl.DslFactory

public class FlowGeneric {

    public final static String JOB_NAME = "flow-generic"

    public static void createJob(DslFactory dslFactory) {
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script("""
                      println "flow-generic"
                    """.stripIndent())
                }
            }
        }
    }

}
