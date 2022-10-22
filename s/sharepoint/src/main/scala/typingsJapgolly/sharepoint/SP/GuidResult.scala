package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidResult extends StObject {
  
  def get_value(): Guid
}
object GuidResult {
  
  inline def apply(get_value: CallbackTo[Guid]): GuidResult = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn)
    __obj.asInstanceOf[GuidResult]
  }
  
  extension [Self <: GuidResult](x: Self) {
    
    inline def setGet_value(value: CallbackTo[Guid]): Self = StObject.set(x, "get_value", value.toJsFn)
  }
}
