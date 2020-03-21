package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.Ionic1BuildOptions
import typingsJapgolly.ionic.ionic1Mod.Ionic1Project
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic1/build", JSImport.Namespace)
@js.native
object ionic1BuildMod extends js.Object {
  @js.native
  class Ionic1BuildRunner protected () extends BuildRunner[Ionic1BuildOptions] {
    def this(e: Ionic1BuildRunnerDeps) = this()
    @JSName("e")
    val e_Ionic1BuildRunner: Ionic1BuildRunnerDeps = js.native
  }
  
  @js.native
  trait Ionic1BuildRunnerDeps extends BuildRunnerDeps {
    @JSName("project")
    val project_Ionic1BuildRunnerDeps: Ionic1Project = js.native
  }
  
}

