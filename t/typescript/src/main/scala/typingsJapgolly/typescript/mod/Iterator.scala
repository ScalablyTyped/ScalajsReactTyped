package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescript.anon.Done
import typingsJapgolly.typescript.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Iterator type. */
trait Iterator[T] extends StObject {
  
  def next(): Done[T] | Value
}
object Iterator {
  
  inline def apply[T](next: CallbackTo[Done[T] | Value]): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = next.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
  
  extension [Self <: Iterator[?], T](x: Self & Iterator[T]) {
    
    inline def setNext(value: CallbackTo[Done[T] | Value]): Self = StObject.set(x, "next", value.toJsFn)
  }
}
