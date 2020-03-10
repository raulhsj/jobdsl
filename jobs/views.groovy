listView('node') {
    description('node pipelines')
    jobs {
        regex(/.*test.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }    
}
