// project-a/jenkins-pipeline-test1 mete el pipelineJob dentro del folder
project_name = "project-a/jenkins-pipeline-test1"
repo = "git@github.com:raulhsj/tests-jenkins-1.git"
repo_name = "repo"

folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}

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
            credentials('raulhsj-SSH')
          }
        }
        scriptPath("./Jenkinsfile")
      }
    }
  }
}
