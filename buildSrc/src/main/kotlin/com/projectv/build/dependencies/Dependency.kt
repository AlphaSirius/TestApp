package com.projectv.build.dependencies

//artifactId
enum class Dependency(private val groupId:String, private val artifactId: String, private val version: String, val fullyQualifiedName: String = "$groupId:$artifactId:$version") {

    //class paths
    GRADLE("com.android.tools.build","gradle","7.0.0"),
    KOTLIN_GRADLE_PLUGIN("org.jetbrains.kotlin","kotlin-gradle-plugin","1.5.21"),

    //android
    CORE_KTX("androidx.core", "core-ktx", "1.6.0"),
    APPCOMPAT("androidx.appcompat","appcompat", "1.3.1"),
    MATERIAL("com.google.android.material","material", "1.4.0"),
    CONSTRAINT_LAYOUT("androidx.constraintlayout","constraintlayout","2.1.0"),






    //test
    JUNIT("junit","junit","4.0.0"),




    //android test
    JUNIT_EXT("androidx.test.ext","junit","1.1.3"),
    ESPRESSO("androidx.test.espresso", "espresso-core","3.4.0")
}


fun getClassPaths() : List<Dependency> {

    return listOf(Dependency.GRADLE, Dependency.KOTLIN_GRADLE_PLUGIN)
}