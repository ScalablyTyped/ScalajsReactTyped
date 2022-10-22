package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonObjectResult extends StObject {
  
  def get_value(): Any
}
object JsonObjectResult {
  
  inline def apply(get_value: CallbackTo[Any]): JsonObjectResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[JsonObjectResult]
  }
  
  extension [Self <: JsonObjectResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[Any]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
