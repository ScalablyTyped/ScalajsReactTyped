package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.VueServeOptions
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectVueServeMod {
  
  @JSImport("ionic/lib/project/vue/serve", "VueServeRunner")
  @js.native
  open class VueServeRunner protected () extends ServeRunner[VueServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
