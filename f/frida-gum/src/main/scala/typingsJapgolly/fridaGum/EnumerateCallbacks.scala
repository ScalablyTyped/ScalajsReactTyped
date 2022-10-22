package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateCallbacks[T] extends StObject {
  
  def onComplete(): Unit
  
  def onMatch(item: T): Unit | EnumerateAction
}
object EnumerateCallbacks {
  
  inline def apply[T](onComplete: Callback, onMatch: T => Unit | EnumerateAction): EnumerateCallbacks[T] = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateCallbacks[T]]
  }
  
  extension [Self <: EnumerateCallbacks[?], T](x: Self & EnumerateCallbacks[T]) {
    
    inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
    
    inline def setOnMatch(value: T => Unit | EnumerateAction): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
  }
}
