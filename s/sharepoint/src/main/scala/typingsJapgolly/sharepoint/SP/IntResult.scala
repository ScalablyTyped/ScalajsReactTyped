package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntResult extends StObject {
  
  def get_value(): Double
}
object IntResult {
  
  inline def apply(get_value: CallbackTo[Double]): IntResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[IntResult]
  }
  
  extension [Self <: IntResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[Double]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
