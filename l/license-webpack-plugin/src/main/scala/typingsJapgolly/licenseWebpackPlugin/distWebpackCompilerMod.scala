package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.licenseWebpackPlugin.anon.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackCompilerMod {
  
  trait WebpackCompiler extends StObject {
    
    var context: String
    
    var hooks: Compilation
    
    var inputFileSystem: Any
    
    def isChild(): Boolean
    
    var plugin: js.UndefOr[js.Function2[/* phase */ String, /* callback */ js.Function, Unit]] = js.undefined
  }
  object WebpackCompiler {
    
    inline def apply(context: String, hooks: Compilation, inputFileSystem: Any, isChild: CallbackTo[Boolean]): WebpackCompiler = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], inputFileSystem = inputFileSystem.asInstanceOf[js.Any], isChild = isChild.toJsFn)
      __obj.asInstanceOf[WebpackCompiler]
    }
    
    extension [Self <: WebpackCompiler](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: Compilation): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setInputFileSystem(value: Any): Self = StObject.set(x, "inputFileSystem", value.asInstanceOf[js.Any])
      
      inline def setIsChild(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChild", value.toJsFn)
      
      inline def setPlugin(value: (/* phase */ String, /* callback */ js.Function) => Callback): Self = StObject.set(x, "plugin", js.Any.fromFunction2((t0: /* phase */ String, t1: /* callback */ js.Function) => (value(t0, t1)).runNow()))
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    }
  }
}
