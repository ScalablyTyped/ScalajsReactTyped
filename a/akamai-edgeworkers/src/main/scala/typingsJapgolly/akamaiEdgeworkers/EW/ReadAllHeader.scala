package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadAllHeader extends StObject {
  
  def getHeaders(): Headers
}
object ReadAllHeader {
  
  inline def apply(getHeaders: CallbackTo[Headers]): ReadAllHeader = {
    val __obj = js.Dynamic.literal(getHeaders = getHeaders.toJsFn)
    __obj.asInstanceOf[ReadAllHeader]
  }
  
  extension [Self <: ReadAllHeader](x: Self) {
    
    inline def setGetHeaders(value: CallbackTo[Headers]): Self = StObject.set(x, "getHeaders", value.toJsFn)
  }
}
