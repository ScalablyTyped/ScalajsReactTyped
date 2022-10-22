package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CustomBuildOptions
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libBuildMod.BuildRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectCustomBuildMod {
  
  @JSImport("ionic/lib/project/custom/build", "CustomBuildRunner")
  @js.native
  open class CustomBuildRunner protected () extends BuildRunner[CustomBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
}
