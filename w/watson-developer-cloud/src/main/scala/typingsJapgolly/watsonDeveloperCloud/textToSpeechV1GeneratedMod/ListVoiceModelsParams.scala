package typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listVoiceModels` operation. */
trait ListVoiceModelsParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The language for which custom voice models that are owned by the requesting service credentials are to be returned. Omit the parameter to see all custom voice models that are owned by the requester. */
  var language: js.UndefOr[Language | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object ListVoiceModelsParams {
  
  inline def apply(): ListVoiceModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceModelsParams]
  }
  
  extension [Self <: ListVoiceModelsParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLanguage(value: Language | String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
