package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanResult extends StObject {
  
  def get_value(): Boolean
}
object BooleanResult {
  
  inline def apply(get_value: CallbackTo[Boolean]): BooleanResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[BooleanResult]
  }
  
  extension [Self <: BooleanResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
