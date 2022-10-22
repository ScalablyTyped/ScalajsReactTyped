package typingsJapgolly.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteCorpus` operation. */
trait DeleteCorpusParams extends StObject {
  
  /** The name of the corpus for the custom language model. */
  var corpus_name: String
  
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object DeleteCorpusParams {
  
  inline def apply(corpus_name: String, customization_id: String): DeleteCorpusParams = {
    val __obj = js.Dynamic.literal(corpus_name = corpus_name.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCorpusParams]
  }
  
  extension [Self <: DeleteCorpusParams](x: Self) {
    
    inline def setCorpus_name(value: String): Self = StObject.set(x, "corpus_name", value.asInstanceOf[js.Any])
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
