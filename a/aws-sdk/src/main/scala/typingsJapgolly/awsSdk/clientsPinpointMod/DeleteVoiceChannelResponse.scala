package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typingsJapgolly.awsSdk.clientsPinpointMod.VoiceChannelResponse
}
object DeleteVoiceChannelResponse {
  
  inline def apply(VoiceChannelResponse: VoiceChannelResponse): DeleteVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceChannelResponse]
  }
  
  extension [Self <: DeleteVoiceChannelResponse](x: Self) {
    
    inline def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}
