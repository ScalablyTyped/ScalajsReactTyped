package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201401403 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `201401403`
}
object Responses201401403 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonBodyNameString, responses: `201401403`): Responses201401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201401403]
  }
  
  extension [Self <: Responses201401403](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
