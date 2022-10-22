package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseToggleMod {
  
  @JSImport("ahooks/lib/useToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Tuple2[Boolean, Actions[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Boolean, Actions[T]]]
  inline def default[T](defaultValue: T): js.Tuple2[T, Actions[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, Actions[T]]]
  inline def default[T, U](defaultValue: T, reverseValue: U): js.Tuple2[T | U, Actions[T | U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any], reverseValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T | U, Actions[T | U]]]
  
  trait Actions[T] extends StObject {
    
    def set(value: T): Unit
    
    def setLeft(): Unit
    
    def setRight(): Unit
    
    def toggle(): Unit
  }
  object Actions {
    
    inline def apply[T](set: T => Callback, setLeft: Callback, setRight: Callback, toggle: Callback): Actions[T] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: T) => set(t0).runNow()), setLeft = setLeft.toJsFn, setRight = setRight.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[Actions[T]]
    }
    
    extension [Self <: Actions[?], T](x: Self & Actions[T]) {
      
      inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setSetLeft(value: Callback): Self = StObject.set(x, "setLeft", value.toJsFn)
      
      inline def setSetRight(value: Callback): Self = StObject.set(x, "setRight", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
}
