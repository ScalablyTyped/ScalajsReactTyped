package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.flutterwaveNode.anon.Accountid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardChargeResponse
  extends StObject
     with BaseResponse {
  
  var data: Accountid
}
object CardChargeResponse {
  
  inline def apply(data: Accountid, message: String, status: String): CardChargeResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardChargeResponse]
  }
  
  extension [Self <: CardChargeResponse](x: Self) {
    
    inline def setData(value: Accountid): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
