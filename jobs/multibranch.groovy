multibranchPipelineJob('node-deploy') {
    triggers {
      periodic(1)
    }
    branchSources {
        git {
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
