package com.projectv.build.dependencies


import org.gradle.api.Project
import org.gradle.kotlin.dsl.ScriptHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories


class DependencyManager {

    companion object {

        fun applyBuildScript(scriptHandlerScope: ScriptHandlerScope) {

            scriptHandlerScope.repositories {

                mavenLocal()
                google()
                mavenCentral()
                jcenter() // Warning: this repository is going to shut down soon
            }

            scriptHandlerScope.dependencies {
                getClassPaths().forEach { classPathPlugin ->
                    apply {
                        add("classpath", classPathPlugin.fullyQualifiedName)
                    }
                }
            }

        }
    }
}

fun Project.applyImplementationDependencies(vararg dependencies: Dependency) {

    this.dependencies {

        dependencies.forEach { add("implementation", it.fullyQualifiedName) }
    }
}

fun Project.applyTestImplementationDependencies(vararg dependencies: Dependency = arrayOf(Dependency.JUNIT)) {

    this.dependencies {

        dependencies.forEach { add("testImplementation", it.fullyQualifiedName) }
    }
}

fun Project.applyAndroidTestImplementationDependencies(vararg dependencies: Dependency = arrayOf(Dependency.JUNIT_EXT,
    Dependency.ESPRESSO
    )) {

  this.dependencies {

      dependencies.forEach { add("androidTestImplementation", it.fullyQualifiedName) }
  }
}
