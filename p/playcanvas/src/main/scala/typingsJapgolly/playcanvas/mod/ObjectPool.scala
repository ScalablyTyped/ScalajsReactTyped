package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPool extends StObject {
  
  var _constructor: Any
  
  var _count: Double
  
  var _pool: js.Array[Any]
  
  def _resize(size: Any): Unit
  
  def allocate(): Any
  
  def freeAll(): Unit
}
object ObjectPool {
  
  inline def apply(
    _constructor: Any,
    _count: Double,
    _pool: js.Array[Any],
    _resize: Any => Callback,
    allocate: CallbackTo[Any],
    freeAll: Callback
  ): ObjectPool = {
    val __obj = js.Dynamic.literal(_constructor = _constructor.asInstanceOf[js.Any], _count = _count.asInstanceOf[js.Any], _pool = _pool.asInstanceOf[js.Any], _resize = js.Any.fromFunction1((t0: Any) => _resize(t0).runNow()), allocate = allocate.toJsFn, freeAll = freeAll.toJsFn)
    __obj.asInstanceOf[ObjectPool]
  }
  
  extension [Self <: ObjectPool](x: Self) {
    
    inline def setAllocate(value: CallbackTo[Any]): Self = StObject.set(x, "allocate", value.toJsFn)
    
    inline def setFreeAll(value: Callback): Self = StObject.set(x, "freeAll", value.toJsFn)
    
    inline def set_constructor(value: Any): Self = StObject.set(x, "_constructor", value.asInstanceOf[js.Any])
    
    inline def set_count(value: Double): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    inline def set_pool(value: js.Array[Any]): Self = StObject.set(x, "_pool", value.asInstanceOf[js.Any])
    
    inline def set_poolVarargs(value: Any*): Self = StObject.set(x, "_pool", js.Array(value*))
    
    inline def set_resize(value: Any => Callback): Self = StObject.set(x, "_resize", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
