package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilerMod.WebpackCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackPluginMod {
  
  trait WebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: WebpackCompiler): Unit
  }
  object WebpackPlugin {
    
    inline def apply(apply: WebpackCompiler => Callback): WebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: WebpackCompiler) => apply(t0).runNow()))
      __obj.asInstanceOf[WebpackPlugin]
    }
    
    extension [Self <: WebpackPlugin](x: Self) {
      
      inline def setApply(value: WebpackCompiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: WebpackCompiler) => value(t0).runNow()))
    }
  }
}
