package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IonicAngularBuildOptions
import typingsJapgolly.ionic.ionicAngularMod.IonicAngularProject
import typingsJapgolly.ionic.ionicStrings.`@ionicSlashapp-scripts`
import typingsJapgolly.ionic.ionicStrings.`Ionic App Scripts`
import typingsJapgolly.ionic.ionicStrings.`app-scripts`
import typingsJapgolly.ionic.ionicStrings.`ionic-app-scripts`
import typingsJapgolly.ionic.libBuildMod.BuildCLI
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/build", JSImport.Namespace)
@js.native
object ionicAngularBuildMod extends js.Object {
  @js.native
  class IonicAngularBuildCLI () extends BuildCLI[IonicAngularBuildOptions] {
    @JSName("name")
    val name_IonicAngularBuildCLI: `Ionic App Scripts` = js.native
    @JSName("pkg")
    val pkg_IonicAngularBuildCLI: `@ionicSlashapp-scripts` = js.native
    val prefix: `app-scripts` = js.native
    @JSName("program")
    val program_IonicAngularBuildCLI: `ionic-app-scripts` = js.native
    /* protected */ def buildOptionsToAppScriptsArgs(options: IonicAngularBuildOptions): js.Array[String] = js.native
  }
  
  @js.native
  class IonicAngularBuildRunner protected () extends BuildRunner[IonicAngularBuildOptions] {
    def this(e: IonicAngularBuildRunnerDeps) = this()
    @JSName("e")
    val e_IonicAngularBuildRunner: IonicAngularBuildRunnerDeps = js.native
  }
  
  @js.native
  trait IonicAngularBuildRunnerDeps extends BuildRunnerDeps {
    @JSName("project")
    val project_IonicAngularBuildRunnerDeps: IonicAngularProject = js.native
  }
  
  val DEFAULT_BUILD_SCRIPT_VALUE: String = js.native
  val DEFAULT_PROGRAM: `ionic-app-scripts` = js.native
}

