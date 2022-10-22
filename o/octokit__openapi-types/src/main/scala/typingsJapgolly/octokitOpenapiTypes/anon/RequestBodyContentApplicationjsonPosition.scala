package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPosition extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: ContentApplicationjsonPosition
  
  var responses: `401403422`
}
object RequestBodyContentApplicationjsonPosition {
  
  inline def apply(
    parameters: PathColumnidNumber,
    requestBody: ContentApplicationjsonPosition,
    responses: `401403422`
  ): RequestBodyContentApplicationjsonPosition = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPosition]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPosition](x: Self) {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPosition): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
