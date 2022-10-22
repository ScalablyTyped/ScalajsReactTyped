package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsCancelWarmupRequest
  extends StObject
     with BaseRequest {
  
  /** a dedicated ip address */
  var ip: String
}
object IpsCancelWarmupRequest {
  
  inline def apply(ip: String): IpsCancelWarmupRequest = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsCancelWarmupRequest]
  }
  
  extension [Self <: IpsCancelWarmupRequest](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
