package typingsJapgolly.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackOptions extends StObject {
  
  /**
    * Callback to call with the result instead of returning the result directly.
    */
  def callback(): Unit
  def callback(err: Unit, value: js.Array[Change]): Unit
  /**
    * Callback to call with the result instead of returning the result directly.
    */
  @JSName("callback")
  var callback_Original: Callback
}
object CallbackOptions {
  
  inline def apply(
    callback: (/* err */ Unit, /* value */ js.UndefOr[js.Array[Change]]) => japgolly.scalajs.react.Callback
  ): CallbackOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* err */ Unit, t1: /* value */ js.UndefOr[js.Array[Change]]) => (callback(t0, t1)).runNow()))
    __obj.asInstanceOf[CallbackOptions]
  }
  
  extension [Self <: CallbackOptions](x: Self) {
    
    inline def setCallback(
      value: (/* err */ Unit, /* value */ js.UndefOr[js.Array[Change]]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* err */ Unit, t1: /* value */ js.UndefOr[js.Array[Change]]) => (value(t0, t1)).runNow()))
  }
}
