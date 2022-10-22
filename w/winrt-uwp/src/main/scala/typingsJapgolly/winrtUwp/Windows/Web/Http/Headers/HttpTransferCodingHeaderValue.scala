package typingsJapgolly.winrtUwp.Windows.Web.Http.Headers

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
trait HttpTransferCodingHeaderValue extends StObject {
  
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  var value: String
}
object HttpTransferCodingHeaderValue {
  
  inline def apply(parameters: IVector[HttpNameValueHeaderValue], value: String): HttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransferCodingHeaderValue]
  }
  
  extension [Self <: HttpTransferCodingHeaderValue](x: Self) {
    
    inline def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
