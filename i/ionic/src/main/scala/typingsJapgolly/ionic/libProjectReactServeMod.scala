package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.ReactServeOptions
import typingsJapgolly.ionic.libServeMod.ServeCLI
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectReactServeMod {
  
  @JSImport("ionic/lib/project/react/serve", "ReactServeCLI")
  @js.native
  open class ReactServeCLI protected () extends ServeCLI[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
    
    /* protected */ var chunks: Double = js.native
    
    @JSName("script")
    val script_ReactServeCLI: /* "ionic:serve" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/react/serve", "ReactServeRunner")
  @js.native
  open class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
