package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202205 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjson164
  
  var responses: `202205`
}
object Responses202205 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjson164, responses: `202205`): Responses202205 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202205]
  }
  
  extension [Self <: Responses202205](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson164): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202205`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
