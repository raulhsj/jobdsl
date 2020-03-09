project_name = "jenkins-pipeline-test1"
repo = "git@github.com:raulhsj/tests-jenkins-1.git"
repo_name = "origin"

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
          }
        }
        scriptPath("Jenkinsfile")
      }
    }
  }
}
