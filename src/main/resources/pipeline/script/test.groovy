@GrabResolver(name='restlet.org', root='http://maven.restlet.org/')
@Grab(group='org.restlet', module='org.restlet', version='1.1.9')

pipeline {
    agent any
    stages {
        stage ('Initialize') {
            steps {
                echo 'This is the Initialize step.'
            }
        }

        stage ('Build') {
            steps {
                echo 'This is the Build step.'
            }
        }
    }
}