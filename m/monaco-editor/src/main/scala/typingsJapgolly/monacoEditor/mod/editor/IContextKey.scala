package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContextKey[T /* <: ContextKeyValue */] extends StObject {
  
  def get(): js.UndefOr[T]
  
  def reset(): Unit
  
  def set(value: T): Unit
}
object IContextKey {
  
  inline def apply[T /* <: ContextKeyValue */](get: CallbackTo[js.UndefOr[T]], reset: Callback, set: T => Callback): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, reset = reset.toJsFn, set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
    __obj.asInstanceOf[IContextKey[T]]
  }
  
  extension [Self <: IContextKey[?], T /* <: ContextKeyValue */](x: Self & IContextKey[T]) {
    
    inline def setGet(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
