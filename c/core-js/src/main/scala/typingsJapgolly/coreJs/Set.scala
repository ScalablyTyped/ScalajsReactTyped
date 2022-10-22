package typingsJapgolly.coreJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set[T] extends StObject {
  
  def toJSON(): Any
}
object Set {
  
  inline def apply[T](toJSON: CallbackTo[Any]): Set[T] = {
    val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Set[T]]
  }
  
  extension [Self <: Set[?], T](x: Self & Set[T]) {
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
