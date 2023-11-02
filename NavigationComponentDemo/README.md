# NavigationComponentLearning
This is the master branch for Jetpack Navigation Component demo app

This branch will have initial setup for Navigation component dependencies.

1) added dependencies
    def nav_version = "2.7.4"
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

2) added safe-args plugin for auto generating Navigation Direction corresponding to Fragment in main_nav_graph.xml 

    project level build.gradle
    dependencies {
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
    }

    app level build.gradle add plugin
    id 'androidx.navigation.safeargs.kotlin'

