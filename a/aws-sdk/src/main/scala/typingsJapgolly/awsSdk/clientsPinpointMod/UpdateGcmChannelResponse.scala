package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGcmChannelResponse extends StObject {
  
  var GCMChannelResponse: typingsJapgolly.awsSdk.clientsPinpointMod.GCMChannelResponse
}
object UpdateGcmChannelResponse {
  
  inline def apply(GCMChannelResponse: GCMChannelResponse): UpdateGcmChannelResponse = {
    val __obj = js.Dynamic.literal(GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGcmChannelResponse]
  }
  
  extension [Self <: UpdateGcmChannelResponse](x: Self) {
    
    inline def setGCMChannelResponse(value: GCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
  }
}
