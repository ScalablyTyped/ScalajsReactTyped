package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOptionHeaderValue extends StObject {
  
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: HttpConnectionOptionHeaderValue
  
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ConnectionOptionHeaderValue {
  
  inline def apply(connectionOptionHeaderValue: HttpConnectionOptionHeaderValue, returnValue: Boolean): ConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptionHeaderValue]
  }
  
  extension [Self <: ConnectionOptionHeaderValue](x: Self) {
    
    inline def setConnectionOptionHeaderValue(value: HttpConnectionOptionHeaderValue): Self = StObject.set(x, "connectionOptionHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
