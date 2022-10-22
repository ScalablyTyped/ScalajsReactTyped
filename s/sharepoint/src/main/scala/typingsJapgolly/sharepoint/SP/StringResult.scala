package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringResult extends StObject {
  
  def get_value(): String
}
object StringResult {
  
  inline def apply(get_value: CallbackTo[String]): StringResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[StringResult]
  }
  
  extension [Self <: StringResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[String]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
