package typingsJapgolly.meteor.Meteor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVariable[T] extends StObject {
  
  def get(): T
  
  def getOrNullIfOutsideFiber(): T | Null
  
  val slot: Double
  
  def withValue[U](value: T, fn: js.Function0[U]): U
}
object EnvironmentVariable {
  
  inline def apply[T](
    get: CallbackTo[T],
    getOrNullIfOutsideFiber: CallbackTo[T | Null],
    slot: Double,
    withValue: (T, js.Function0[Any]) => Any
  ): EnvironmentVariable[T] = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, getOrNullIfOutsideFiber = getOrNullIfOutsideFiber.toJsFn, slot = slot.asInstanceOf[js.Any], withValue = js.Any.fromFunction2(withValue))
    __obj.asInstanceOf[EnvironmentVariable[T]]
  }
  
  extension [Self <: EnvironmentVariable[?], T](x: Self & EnvironmentVariable[T]) {
    
    inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGetOrNullIfOutsideFiber(value: CallbackTo[T | Null]): Self = StObject.set(x, "getOrNullIfOutsideFiber", value.toJsFn)
    
    inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setWithValue(value: (T, js.Function0[Any]) => Any): Self = StObject.set(x, "withValue", js.Any.fromFunction2(value))
  }
}
