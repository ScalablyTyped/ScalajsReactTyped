package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndsWith[T] extends StObject {
  
  def endsWith(input: T): Unit
  
  def startsWith(input: T): Unit
}
object EndsWith {
  
  inline def apply[T](endsWith: T => Callback, startsWith: T => Callback): EndsWith[T] = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction1((t0: T) => endsWith(t0).runNow()), startsWith = js.Any.fromFunction1((t0: T) => startsWith(t0).runNow()))
    __obj.asInstanceOf[EndsWith[T]]
  }
  
  extension [Self <: EndsWith[?], T](x: Self & EndsWith[T]) {
    
    inline def setEndsWith(value: T => Callback): Self = StObject.set(x, "endsWith", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setStartsWith(value: T => Callback): Self = StObject.set(x, "startsWith", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
