package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/composite-disposable/
trait CompositeDisposable
  extends StObject
     with Disposable {
  
  def add(`object`: Disposable): Unit
  
  def clear(): Unit
  
  def delete(`object`: Disposable): Unit
  
  def remove(`object`: Disposable): Unit
}
object CompositeDisposable {
  
  inline def apply(
    add: Disposable => Callback,
    clear: Callback,
    delete: Disposable => Callback,
    dispose: Callback,
    remove: Disposable => Callback
  ): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Disposable) => add(t0).runNow()), clear = clear.toJsFn, delete = js.Any.fromFunction1((t0: Disposable) => delete(t0).runNow()), dispose = dispose.toJsFn, remove = js.Any.fromFunction1((t0: Disposable) => remove(t0).runNow()))
    __obj.asInstanceOf[CompositeDisposable]
  }
  
  extension [Self <: CompositeDisposable](x: Self) {
    
    inline def setAdd(value: Disposable => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Disposable) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDelete(value: Disposable => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: Disposable) => value(t0).runNow()))
    
    inline def setRemove(value: Disposable => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Disposable) => value(t0).runNow()))
  }
}
