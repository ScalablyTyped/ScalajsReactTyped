package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDedicatedIpWarmupAttributesRequest extends StObject {
  
  /**
    * The dedicated IP address that you want to update the warm-up attributes for.
    */
  var Ip: typingsJapgolly.awsSdk.clientsSesv2Mod.Ip
  
  /**
    * The warm-up percentage that you want to associate with the dedicated IP address.
    */
  var WarmupPercentage: Percentage100Wrapper
}
object PutDedicatedIpWarmupAttributesRequest {
  
  inline def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
  }
  
  extension [Self <: PutDedicatedIpWarmupAttributesRequest](x: Self) {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setWarmupPercentage(value: Percentage100Wrapper): Self = StObject.set(x, "WarmupPercentage", value.asInstanceOf[js.Any])
  }
}
