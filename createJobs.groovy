pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TomStanley95/ThemePark.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TomStanley95/ThemePark.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}