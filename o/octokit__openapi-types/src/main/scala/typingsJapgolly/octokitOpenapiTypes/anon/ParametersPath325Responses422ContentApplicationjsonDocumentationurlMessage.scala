package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: Path325
  
  var responses: `422ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(parameters: Path325, responses: `422ContentApplicationjsonDocumentationurlMessage`): ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage]
  }
  
  extension [Self <: ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
