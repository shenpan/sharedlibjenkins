import javaposse.jobdsl.plugin.GlobalJobDslSecurityConfiguration
import jenkins.model.GlobalConfiguration

GlobalConfiguration.all().get(GlobalJobDslSecurityConfiguration.class).useScriptSecurity=false

import job.FlowGeneric
import job.RunTestTarget
import job.EnvSetup

FlowGeneric.createJob(this)
RunTestTarget.createJob(this)
EnvSetup.createJob(this)

