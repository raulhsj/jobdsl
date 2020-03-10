project_name = "jenkins-pipeline-test1"
repo = "git@github.com:raulhsj/tests-jenkins-1.git"
repo_name = "repo"

pipelineJob(project_name) {
  definition {
    triggers {
      scm('H/1 * * * *')
    }

    cpsScm {
      scm {
        git {
          remote {
            name(repo_name)
            url(repo)
            credentials('cadc4801-ca68-4fdd-8aa7-46fcd9e4b976')
          }
        }
        scriptPath("./Jenkinsfile")
      }
    }
  }
}