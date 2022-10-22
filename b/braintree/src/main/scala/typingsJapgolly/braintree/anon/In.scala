package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In[T] extends StObject {
  
  def in(input: js.Array[T]): Unit
  
  def is(input: T): Unit
}
object In {
  
  inline def apply[T](in: js.Array[T] => Callback, is: T => Callback): In[T] = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1((t0: js.Array[T]) => in(t0).runNow()), is = js.Any.fromFunction1((t0: T) => is(t0).runNow()))
    __obj.asInstanceOf[In[T]]
  }
  
  extension [Self <: In[?], T](x: Self & In[T]) {
    
    inline def setIn(value: js.Array[T] => Callback): Self = StObject.set(x, "in", js.Any.fromFunction1((t0: js.Array[T]) => value(t0).runNow()))
    
    inline def setIs(value: T => Callback): Self = StObject.set(x, "is", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
