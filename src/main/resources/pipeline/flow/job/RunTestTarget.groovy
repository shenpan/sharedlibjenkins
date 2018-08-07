package flow.job

import javaposse.jobdsl.dsl.DslFactory

import flow.util.Utility

public class RunTestTarget {

    public final static String JOB_NAME = "run-test-target"

    public static void createJob(DslFactory dslFactory) {
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script("""
                      println "run-test-target"
                    """.stripIndent())
                }
            }
        }
    }

}
