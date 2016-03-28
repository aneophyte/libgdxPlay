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
        compile("com.badlogicgames.gdx:gdx:$gdxVersion"
                , "com.badlogicgames.gdx:gdx-backend-lwjgl:$gdxVersion"
                , "com.badlogicgames.gdx:gdx-platform:jar:natives-desktop:$gdxVersion"
                )
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
