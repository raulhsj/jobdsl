final String gitId = "123456789"
multibranchPipelineJob('node-deploy') {
    triggers {
      cron('* * * * *')
    }
    branchSources {
        git {
            id(gitId) / IMPORTANT: use a constant and unique identifier
            remote('git@github.com:raulhsj/tests-jenkins-1.git')
            credentialsId('cadc4801-ca68-4fdd-8aa7-46fcd9e4b976')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
