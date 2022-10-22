package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.flutterwaveNode.anon.Accountcountry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementFetchResponse
  extends StObject
     with BaseResponse {
  
  var data: Accountcountry
}
object SettlementFetchResponse {
  
  inline def apply(data: Accountcountry, message: String, status: String): SettlementFetchResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettlementFetchResponse]
  }
  
  extension [Self <: SettlementFetchResponse](x: Self) {
    
    inline def setData(value: Accountcountry): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
