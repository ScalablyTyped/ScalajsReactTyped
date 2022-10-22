package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseBooleanMod {
  
  @JSImport("ahooks/lib/useBoolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Boolean, Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Boolean, Actions]]
  inline def default(defaultValue: Boolean): js.Tuple2[Boolean, Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Actions]]
  
  trait Actions extends StObject {
    
    def set(value: Boolean): Unit
    
    def setFalse(): Unit
    
    def setTrue(): Unit
    
    def toggle(): Unit
  }
  object Actions {
    
    inline def apply(set: Boolean => Callback, setFalse: Callback, setTrue: Callback, toggle: Callback): Actions = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: Boolean) => set(t0).runNow()), setFalse = setFalse.toJsFn, setTrue = setTrue.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setSet(value: Boolean => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetFalse(value: Callback): Self = StObject.set(x, "setFalse", value.toJsFn)
      
      inline def setSetTrue(value: Callback): Self = StObject.set(x, "setTrue", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
}
