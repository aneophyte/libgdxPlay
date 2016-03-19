import com.beust.kobalt.file
import com.beust.kobalt.plugin.application.application
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.project
import com.beust.kobalt.repos

val repos = repos()

val gdxVersion = "1.9.2"

val p = project {

    name = "libgdxPlay"
    group = "com.example"
    artifactId = name
    version = "0.1"

    sourceDirectories {
        path("src/main/kotlin")
    }

    sourceDirectoriesTest {
        path("src/test/kotlin")
    }

    dependencies {
//        compile("com.beust:jcommander:1.48")
        compile("com.badlogicgames.gdx:gdx:$gdxVersion",
                "com.badlogicgames.gdx:gdx-backend-lwjgl:$gdxVersion",
                "com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop",
                file("lib/gdx-backend-lwjgl-natives.jar"),
                "org.lwjgl.lwjgl:lwjgl:2.9.3",
                file("lib/gdx-natives.jar"))
    }

    dependenciesTest {
        compile("org.testng:testng:6.9.9")

    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }


}
