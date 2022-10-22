package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnumerator[T] extends StObject {
  
  def get_current(): T
  
  def moveNext(): Boolean
  
  def reset(): Unit
}
object IEnumerator {
  
  inline def apply[T](get_current: CallbackTo[T], moveNext: CallbackTo[Boolean], reset: Callback): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = get_current.toJsFn, moveNext = moveNext.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[IEnumerator[T]]
  }
  
  extension [Self <: IEnumerator[?], T](x: Self & IEnumerator[T]) {
    
    inline def setGet_current(value: CallbackTo[T]): Self = StObject.set(x, "get_current", value.toJsFn)
    
    inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
