package typingsJapgolly.vueReactivity.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WritableComputedOptions[T] extends StObject {
  
  def get(args: Any*): T
  @JSName("get")
  var get_Original: ComputedGetter[T]
  
  def set(v: T): Unit
  @JSName("set")
  var set_Original: ComputedSetter[T]
}
object WritableComputedOptions {
  
  inline def apply[T](get: ComputedGetter[T], set: T => Callback): WritableComputedOptions[T] = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
    __obj.asInstanceOf[WritableComputedOptions[T]]
  }
  
  extension [Self <: WritableComputedOptions[?], T](x: Self & WritableComputedOptions[T]) {
    
    inline def setGet(value: ComputedGetter[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
