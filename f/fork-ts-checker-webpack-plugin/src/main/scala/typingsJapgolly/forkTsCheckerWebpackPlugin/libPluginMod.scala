package typingsJapgolly.forkTsCheckerWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginMod {
  
  trait ForkTsCheckerWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /* private */ val options: Any
  }
  object ForkTsCheckerWebpackPlugin {
    
    inline def apply(apply: Compiler => Callback, options: Any): ForkTsCheckerWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkTsCheckerWebpackPlugin]
    }
    
    extension [Self <: ForkTsCheckerWebpackPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
