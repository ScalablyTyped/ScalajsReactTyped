package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeResult extends StObject {
  
  def get_value(): js.Date
}
object DateTimeResult {
  
  inline def apply(get_value: CallbackTo[js.Date]): DateTimeResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[DateTimeResult]
  }
  
  extension [Self <: DateTimeResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[js.Date]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
