package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceTemplateResponse extends StObject {
  
  var VoiceTemplateResponse: typingsJapgolly.awsSdk.clientsPinpointMod.VoiceTemplateResponse
}
object GetVoiceTemplateResponse {
  
  inline def apply(VoiceTemplateResponse: VoiceTemplateResponse): GetVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(VoiceTemplateResponse = VoiceTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceTemplateResponse]
  }
  
  extension [Self <: GetVoiceTemplateResponse](x: Self) {
    
    inline def setVoiceTemplateResponse(value: VoiceTemplateResponse): Self = StObject.set(x, "VoiceTemplateResponse", value.asInstanceOf[js.Any])
  }
}
