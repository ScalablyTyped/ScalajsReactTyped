package typingsJapgolly.maplibreGl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValue[T] extends StObject {
  
  var default: T
  
  var current: T
  
  var dirty: Boolean
  
  def get(): T
  
  def set(value: T): scala.Unit
  
  def setDefault(): scala.Unit
}
object IValue {
  
  inline def apply[T](
    current: T,
    default: T,
    dirty: Boolean,
    get: CallbackTo[T],
    set: T => japgolly.scalajs.react.Callback,
    setDefault: japgolly.scalajs.react.Callback
  ): IValue[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], get = get.toJsFn, set = js.Any.fromFunction1((t0: T) => set(t0).runNow()), setDefault = setDefault.toJsFn)
    __obj.asInstanceOf[IValue[T]]
  }
  
  extension [Self <: IValue[?], T](x: Self & IValue[T]) {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setSet(value: T => japgolly.scalajs.react.Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setSetDefault(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "setDefault", value.toJsFn)
  }
}
