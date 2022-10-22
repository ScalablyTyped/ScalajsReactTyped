package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleResult extends StObject {
  
  def get_value(): Double
}
object DoubleResult {
  
  inline def apply(get_value: CallbackTo[Double]): DoubleResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[DoubleResult]
  }
  
  extension [Self <: DoubleResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[Double]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
