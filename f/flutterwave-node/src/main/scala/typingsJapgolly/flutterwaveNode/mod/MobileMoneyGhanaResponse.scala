package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.flutterwaveNode.anon.Acctvalrespmsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyGhanaResponse
  extends StObject
     with BaseResponse {
  
  var data: Acctvalrespmsg
}
object MobileMoneyGhanaResponse {
  
  inline def apply(data: Acctvalrespmsg, message: String, status: String): MobileMoneyGhanaResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyGhanaResponse]
  }
  
  extension [Self <: MobileMoneyGhanaResponse](x: Self) {
    
    inline def setData(value: Acctvalrespmsg): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
