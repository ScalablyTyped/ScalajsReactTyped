package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathUsername
  
  var responses: `422ContentApplicationjsonDocumentationurlMessage`
}
object Responses422ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(parameters: PathUsername, responses: `422ContentApplicationjsonDocumentationurlMessage`): Responses422ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422ContentApplicationjsonDocumentationurlMessage]
  }
  
  extension [Self <: Responses422ContentApplicationjsonDocumentationurlMessage](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
