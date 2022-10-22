package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompiler.mod.InterpolationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscXi18nSrcContextMod {
  
  trait Xi18nContext extends StObject {
    
    /**
      * Capture i18n messages from the template.
      *
      * In `MessageBundle` itself, this returns any `ParseError`s from the template. In this interface,
      * the return type is declared as `void` for simplicity, since any parse errors would be reported
      * as diagnostics anyway.
      */
    def updateFromTemplate(html: String, url: String, interpolationConfig: InterpolationConfig): Unit
  }
  object Xi18nContext {
    
    inline def apply(updateFromTemplate: (String, String, InterpolationConfig) => Callback): Xi18nContext = {
      val __obj = js.Dynamic.literal(updateFromTemplate = js.Any.fromFunction3((t0: String, t1: String, t2: InterpolationConfig) => (updateFromTemplate(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Xi18nContext]
    }
    
    extension [Self <: Xi18nContext](x: Self) {
      
      inline def setUpdateFromTemplate(value: (String, String, InterpolationConfig) => Callback): Self = StObject.set(x, "updateFromTemplate", js.Any.fromFunction3((t0: String, t1: String, t2: InterpolationConfig) => (value(t0, t1, t2)).runNow()))
    }
  }
}
