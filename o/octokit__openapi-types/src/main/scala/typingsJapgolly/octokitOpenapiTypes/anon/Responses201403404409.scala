package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201403404409 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonContentEncoding
  
  var responses: `201403404409`
}
object Responses201403404409 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonContentEncoding, responses: `201403404409`): Responses201403404409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201403404409]
  }
  
  extension [Self <: Responses201403404409](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContentEncoding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
