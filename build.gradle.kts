buildscript {

    com.projectv.build.dependencies.DependencyManager.Companion.applyBuildScript(this)
}


tasks.register("clean", Delete::class) {

    delete(rootProject.buildDir)
}