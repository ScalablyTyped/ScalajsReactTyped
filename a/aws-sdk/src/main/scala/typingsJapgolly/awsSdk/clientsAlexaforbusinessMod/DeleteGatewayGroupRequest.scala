package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayGroupRequest extends StObject {
  
  /**
    * The ARN of the gateway group to delete.
    */
  var GatewayGroupArn: Arn
}
object DeleteGatewayGroupRequest {
  
  inline def apply(GatewayGroupArn: Arn): DeleteGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayGroupRequest]
  }
  
  extension [Self <: DeleteGatewayGroupRequest](x: Self) {
    
    inline def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
  }
}
