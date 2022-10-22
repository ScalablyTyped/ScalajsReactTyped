package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocEventMap[T] extends StObject {
  
  def `before op`(ops: js.Array[Any], source: Any, clientId: String): Unit
  
  def `before op batch`(ops: js.Array[Any], source: Any): Unit
  
  def create(source: Any): Unit
  
  def del(data: T, source: Any): Unit
  
  def destroy(): Unit
  
  def error(error: Error): Unit
  
  def load(): Unit
  
  def `no write pending`(): Unit
  
  def `nothing pending`(): Unit
  
  def op(ops: js.Array[Any], source: Any, clientId: String): Unit
  
  def `op batch`(ops: js.Array[Any], source: Any): Unit
}
object DocEventMap {
  
  inline def apply[T](
    `before op`: (js.Array[Any], Any, String) => japgolly.scalajs.react.Callback,
    `before op batch`: (js.Array[Any], Any) => japgolly.scalajs.react.Callback,
    create: Any => japgolly.scalajs.react.Callback,
    del: (T, Any) => japgolly.scalajs.react.Callback,
    destroy: japgolly.scalajs.react.Callback,
    error: Error => japgolly.scalajs.react.Callback,
    load: japgolly.scalajs.react.Callback,
    `no write pending`: japgolly.scalajs.react.Callback,
    `nothing pending`: japgolly.scalajs.react.Callback,
    op: (js.Array[Any], Any, String) => japgolly.scalajs.react.Callback,
    `op batch`: (js.Array[Any], Any) => japgolly.scalajs.react.Callback
  ): DocEventMap[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1((t0: Any) => create(t0).runNow()), del = js.Any.fromFunction2((t0: T, t1: Any) => (del(t0, t1)).runNow()), destroy = destroy.toJsFn, error = js.Any.fromFunction1((t0: Error) => error(t0).runNow()), load = load.toJsFn, op = js.Any.fromFunction3((t0: js.Array[Any], t1: Any, t2: String) => (op(t0, t1, t2)).runNow()))
    __obj.updateDynamic("before op")(js.Any.fromFunction3((t0: js.Array[Any], t1: Any, t2: String) => (`before op`(t0, t1, t2)).runNow()))
    __obj.updateDynamic("before op batch")(js.Any.fromFunction2((t0: js.Array[Any], t1: Any) => (`before op batch`(t0, t1)).runNow()))
    __obj.updateDynamic("no write pending")((`no write pending`).toJsFn)
    __obj.updateDynamic("nothing pending")((`nothing pending`).toJsFn)
    __obj.updateDynamic("op batch")(js.Any.fromFunction2((t0: js.Array[Any], t1: Any) => (`op batch`(t0, t1)).runNow()))
    __obj.asInstanceOf[DocEventMap[T]]
  }
  
  extension [Self <: DocEventMap[?], T](x: Self & DocEventMap[T]) {
    
    inline def `setBefore op`(value: (js.Array[Any], Any, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "before op", js.Any.fromFunction3((t0: js.Array[Any], t1: Any, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def `setBefore op batch`(value: (js.Array[Any], Any) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "before op batch", js.Any.fromFunction2((t0: js.Array[Any], t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setCreate(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDel(value: (T, Any) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "del", js.Any.fromFunction2((t0: T, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setDestroy(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setError(value: Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
    
    inline def setLoad(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "load", value.toJsFn)
    
    inline def `setNo write pending`(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "no write pending", value.toJsFn)
    
    inline def `setNothing pending`(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "nothing pending", value.toJsFn)
    
    inline def setOp(value: (js.Array[Any], Any, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "op", js.Any.fromFunction3((t0: js.Array[Any], t1: Any, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def `setOp batch`(value: (js.Array[Any], Any) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "op batch", js.Any.fromFunction2((t0: js.Array[Any], t1: Any) => (value(t0, t1)).runNow()))
  }
}
