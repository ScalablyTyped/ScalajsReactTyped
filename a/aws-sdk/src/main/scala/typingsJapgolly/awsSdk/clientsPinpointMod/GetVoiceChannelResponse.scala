package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typingsJapgolly.awsSdk.clientsPinpointMod.VoiceChannelResponse
}
object GetVoiceChannelResponse {
  
  inline def apply(VoiceChannelResponse: VoiceChannelResponse): GetVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceChannelResponse]
  }
  
  extension [Self <: GetVoiceChannelResponse](x: Self) {
    
    inline def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}
