package com.github.cciro94.dataprofilingextension.services

import com.intellij.openapi.project.Project
import com.github.cciro94.dataprofilingextension.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
