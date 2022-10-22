package typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `getVoice` operation. */
trait GetVoiceParams extends StObject {
  
  /** The customization ID (GUID) of a custom voice model for which information is to be returned. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to see information about the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The voice for which information is to be returned. */
  var voice: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String
}
object GetVoiceParams {
  
  inline def apply(
    voice: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String
  ): GetVoiceParams = {
    val __obj = js.Dynamic.literal(voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceParams]
  }
  
  extension [Self <: GetVoiceParams](x: Self) {
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setCustomization_idUndefined: Self = StObject.set(x, "customization_id", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setVoice(
      value: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String
    ): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
  }
}
