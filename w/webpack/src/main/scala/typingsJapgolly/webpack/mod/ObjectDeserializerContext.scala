package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDeserializerContext extends StObject {
  
  def read(): Any
}
object ObjectDeserializerContext {
  
  inline def apply(read: CallbackTo[Any]): ObjectDeserializerContext = {
    val __obj = js.Dynamic.literal(read = read.toJsFn)
    __obj.asInstanceOf[ObjectDeserializerContext]
  }
  
  extension [Self <: ObjectDeserializerContext](x: Self) {
    
    inline def setRead(value: CallbackTo[Any]): Self = StObject.set(x, "read", value.toJsFn)
  }
}
