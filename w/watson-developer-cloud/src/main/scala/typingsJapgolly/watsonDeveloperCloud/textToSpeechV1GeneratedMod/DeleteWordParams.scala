package typingsJapgolly.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteWord` operation. */
trait DeleteWordParams extends StObject {
  
  /** The customization ID (GUID) of the custom voice model. You must make the request with service credentials created for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The word that is to be deleted from the custom voice model. */
  var word: String
}
object DeleteWordParams {
  
  inline def apply(customization_id: String, word: String): DeleteWordParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWordParams]
  }
  
  extension [Self <: DeleteWordParams](x: Self) {
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
