listView('node') {
    description('node pipelines')
    jobs {
        regex(/.*test.*/)
    }    
}
