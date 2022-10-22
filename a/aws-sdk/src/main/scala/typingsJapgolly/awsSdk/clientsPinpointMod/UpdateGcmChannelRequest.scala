package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGcmChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var GCMChannelRequest: typingsJapgolly.awsSdk.clientsPinpointMod.GCMChannelRequest
}
object UpdateGcmChannelRequest {
  
  inline def apply(ApplicationId: string, GCMChannelRequest: GCMChannelRequest): UpdateGcmChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGcmChannelRequest]
  }
  
  extension [Self <: UpdateGcmChannelRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setGCMChannelRequest(value: GCMChannelRequest): Self = StObject.set(x, "GCMChannelRequest", value.asInstanceOf[js.Any])
  }
}
