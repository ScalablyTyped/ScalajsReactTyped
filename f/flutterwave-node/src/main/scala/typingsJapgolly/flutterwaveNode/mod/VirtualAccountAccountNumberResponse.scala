package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.flutterwaveNode.anon.Accountstatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualAccountAccountNumberResponse
  extends StObject
     with BaseResponse {
  
  var data: Accountstatus
}
object VirtualAccountAccountNumberResponse {
  
  inline def apply(data: Accountstatus, message: String, status: String): VirtualAccountAccountNumberResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualAccountAccountNumberResponse]
  }
  
  extension [Self <: VirtualAccountAccountNumberResponse](x: Self) {
    
    inline def setData(value: Accountstatus): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
