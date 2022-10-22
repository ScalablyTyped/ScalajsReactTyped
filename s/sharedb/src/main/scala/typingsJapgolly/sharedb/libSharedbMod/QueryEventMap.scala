package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryEventMap[T] extends StObject {
  
  def changed(docs: js.Array[Doc[T]]): Unit
  
  def error(error: Error): Unit
  
  def extra(extra: Any): Unit
  
  def insert(inserted: js.Array[Doc[T]], index: Double): Unit
  
  def move(moved: js.Array[Doc[T]], from: Double, to: Double): Unit
  
  def ready(): Unit
  
  def remove(removed: js.Array[Doc[T]], index: Double): Unit
}
object QueryEventMap {
  
  inline def apply[T](
    changed: js.Array[Doc[T]] => japgolly.scalajs.react.Callback,
    error: Error => japgolly.scalajs.react.Callback,
    extra: Any => japgolly.scalajs.react.Callback,
    insert: (js.Array[Doc[T]], Double) => japgolly.scalajs.react.Callback,
    move: (js.Array[Doc[T]], Double, Double) => japgolly.scalajs.react.Callback,
    ready: japgolly.scalajs.react.Callback,
    remove: (js.Array[Doc[T]], Double) => japgolly.scalajs.react.Callback
  ): QueryEventMap[T] = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction1((t0: js.Array[Doc[T]]) => changed(t0).runNow()), error = js.Any.fromFunction1((t0: Error) => error(t0).runNow()), extra = js.Any.fromFunction1((t0: Any) => extra(t0).runNow()), insert = js.Any.fromFunction2((t0: js.Array[Doc[T]], t1: Double) => (insert(t0, t1)).runNow()), move = js.Any.fromFunction3((t0: js.Array[Doc[T]], t1: Double, t2: Double) => (move(t0, t1, t2)).runNow()), ready = ready.toJsFn, remove = js.Any.fromFunction2((t0: js.Array[Doc[T]], t1: Double) => (remove(t0, t1)).runNow()))
    __obj.asInstanceOf[QueryEventMap[T]]
  }
  
  extension [Self <: QueryEventMap[?], T](x: Self & QueryEventMap[T]) {
    
    inline def setChanged(value: js.Array[Doc[T]] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "changed", js.Any.fromFunction1((t0: js.Array[Doc[T]]) => value(t0).runNow()))
    
    inline def setError(value: Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
    
    inline def setExtra(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "extra", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setInsert(value: (js.Array[Doc[T]], Double) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: js.Array[Doc[T]], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setMove(value: (js.Array[Doc[T]], Double, Double) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "move", js.Any.fromFunction3((t0: js.Array[Doc[T]], t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setReady(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setRemove(value: (js.Array[Doc[T]], Double) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: js.Array[Doc[T]], t1: Double) => (value(t0, t1)).runNow()))
  }
}
