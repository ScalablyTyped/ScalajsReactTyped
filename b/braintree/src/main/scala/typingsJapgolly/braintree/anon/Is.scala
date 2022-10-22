package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Is[T] extends StObject {
  
  def is(input: T): Unit
  
  def isNot(input: T): Unit
}
object Is {
  
  inline def apply[T](is: T => Callback, isNot: T => Callback): Is[T] = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1((t0: T) => is(t0).runNow()), isNot = js.Any.fromFunction1((t0: T) => isNot(t0).runNow()))
    __obj.asInstanceOf[Is[T]]
  }
  
  extension [Self <: Is[?], T](x: Self & Is[T]) {
    
    inline def setIs(value: T => Callback): Self = StObject.set(x, "is", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setIsNot(value: T => Callback): Self = StObject.set(x, "isNot", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
