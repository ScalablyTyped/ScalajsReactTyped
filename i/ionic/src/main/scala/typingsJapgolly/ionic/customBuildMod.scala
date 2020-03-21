package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CustomBuildOptions
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/custom/build", JSImport.Namespace)
@js.native
object customBuildMod extends js.Object {
  @js.native
  class CustomBuildRunner protected () extends BuildRunner[CustomBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
  
}

