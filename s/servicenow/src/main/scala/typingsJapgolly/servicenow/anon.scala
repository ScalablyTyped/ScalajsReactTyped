package typingsJapgolly.servicenow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    def get(index: Double): String
    
    def size(): Double
  }
  object Get {
    
    inline def apply(get: Double => String, size: CallbackTo[Double]): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), size = size.toJsFn)
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: Double => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    }
  }
}
