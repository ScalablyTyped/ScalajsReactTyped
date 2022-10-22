package typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getPronunciation` operation. */
trait GetPronunciationParams extends StObject {
  
  /** The customization ID (GUID) of a custom voice model for which the pronunciation is to be returned. The language of a specified custom model must match the language of the specified voice. If the word is not defined in the specified custom model, the service returns the default translation for the custom model's language. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to see the translation for the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.undefined
  
  /** The phoneme format in which to return the pronunciation. Omit the parameter to obtain the pronunciation in the default format. */
  var format: js.UndefOr[Format | String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The word for which the pronunciation is requested. */
  var text: String
  
  /** A voice that specifies the language in which the pronunciation is to be returned. All voices for the same language (for example, `en-US`) return the same translation. */
  var voice: js.UndefOr[
    typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice | String
  ] = js.undefined
}
object GetPronunciationParams {
  
  inline def apply(text: String): GetPronunciationParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPronunciationParams]
  }
  
  extension [Self <: GetPronunciationParams](x: Self) {
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setCustomization_idUndefined: Self = StObject.set(x, "customization_id", js.undefined)
    
    inline def setFormat(value: Format | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setVoice(
      value: typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice | String
    ): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
