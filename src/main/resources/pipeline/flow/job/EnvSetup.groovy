package flow.job

import javaposse.jobdsl.dsl.DslFactory

public class EnvSetup {

    public final static String JOB_NAME = "env-setup"

    public static void createJob(DslFactory dslFactory) {
        dslFactory.pipelineJob(JOB_NAME) {
            definition {
                cps {
                    script("""
                      @GrabResolver(name='RCS CI', root='https://arm001-eiffel003.rnd.ki.sw.ericsson.se:8443/nexus/content/repositories/jcat-test-snapshots-host/')
                      @Grab('com.ericsson.rcsci:rcsci:0.0.1-SNAPSHOT')
                      import com.ericsson.rcsci.datamodel.parser.TestParamParser
        
                      println TestParamParser.test()
                    """.stripIndent())
                }
            }
        }
    }

}