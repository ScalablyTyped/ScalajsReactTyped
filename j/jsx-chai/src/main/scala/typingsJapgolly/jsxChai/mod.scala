package typingsJapgolly.jsxChai

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chai.Chai.ChaiStatic
import typingsJapgolly.chai.Chai.ChaiUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsx-chai", JSImport.Namespace)
  @js.native
  val ^ : JsxChaiStatic = js.native
  
  trait JsxChaiStatic extends StObject {
    
    def jsxChai(chai: ChaiStatic, utils: ChaiUtils): Unit
    @JSName("jsxChai")
    var jsxChai_Original: jsxChaiFunction
  }
  object JsxChaiStatic {
    
    inline def apply(jsxChai: (/* chai */ ChaiStatic, /* utils */ ChaiUtils) => Callback): JsxChaiStatic = {
      val __obj = js.Dynamic.literal(jsxChai = js.Any.fromFunction2((t0: /* chai */ ChaiStatic, t1: /* utils */ ChaiUtils) => (jsxChai(t0, t1)).runNow()))
      __obj.asInstanceOf[JsxChaiStatic]
    }
    
    extension [Self <: JsxChaiStatic](x: Self) {
      
      inline def setJsxChai(value: (/* chai */ ChaiStatic, /* utils */ ChaiUtils) => Callback): Self = StObject.set(x, "jsxChai", js.Any.fromFunction2((t0: /* chai */ ChaiStatic, t1: /* utils */ ChaiUtils) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = JsxChaiStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JsxChaiStatic = ^
  
  type jsxChaiFunction = ChaiPlugin
}
