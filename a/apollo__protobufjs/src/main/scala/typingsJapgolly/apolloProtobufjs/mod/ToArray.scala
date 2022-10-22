package typingsJapgolly.apolloProtobufjs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToArray[T] extends StObject {
  
  def toArray(): js.Array[T]
}
object ToArray {
  
  inline def apply[T](toArray: CallbackTo[js.Array[T]]): ToArray[T] = {
    val __obj = js.Dynamic.literal(toArray = toArray.toJsFn)
    __obj.asInstanceOf[ToArray[T]]
  }
  
  extension [Self <: ToArray[?], T](x: Self & ToArray[T]) {
    
    inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
  }
}
