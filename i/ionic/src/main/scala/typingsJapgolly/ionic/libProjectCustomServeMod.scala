package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CustomServeOptions
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectCustomServeMod {
  
  @JSImport("ionic/lib/project/custom/serve", "CustomServeRunner")
  @js.native
  open class CustomServeRunner protected () extends ServeRunner[CustomServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
