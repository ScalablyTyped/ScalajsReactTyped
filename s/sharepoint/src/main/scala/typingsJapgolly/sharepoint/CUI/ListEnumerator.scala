package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnumerator[T] extends StObject {
  
  def get_current(): T
  
  def moveNext(): Boolean
  
  def movePrevious(): Boolean
  
  def reset(): scala.Unit
}
object ListEnumerator {
  
  inline def apply[T](
    get_current: CallbackTo[T],
    moveNext: CallbackTo[Boolean],
    movePrevious: CallbackTo[Boolean],
    reset: Callback
  ): ListEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = get_current.toJsFn, moveNext = moveNext.toJsFn, movePrevious = movePrevious.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[ListEnumerator[T]]
  }
  
  extension [Self <: ListEnumerator[?], T](x: Self & ListEnumerator[T]) {
    
    inline def setGet_current(value: CallbackTo[T]): Self = StObject.set(x, "get_current", value.toJsFn)
    
    inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
    
    inline def setMovePrevious(value: CallbackTo[Boolean]): Self = StObject.set(x, "movePrevious", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
