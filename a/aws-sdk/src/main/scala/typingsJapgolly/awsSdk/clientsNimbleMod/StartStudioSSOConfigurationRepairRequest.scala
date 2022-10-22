package typingsJapgolly.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStudioSSOConfigurationRepairRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object StartStudioSSOConfigurationRepairRequest {
  
  inline def apply(studioId: String): StartStudioSSOConfigurationRepairRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStudioSSOConfigurationRepairRequest]
  }
  
  extension [Self <: StartStudioSSOConfigurationRepairRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
