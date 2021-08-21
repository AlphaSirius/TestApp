
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}


rootProject.name = "BuildSrc"
include(":app")
