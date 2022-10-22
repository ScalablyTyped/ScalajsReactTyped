package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201403404410 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201403404410`
}
object Responses201403404410 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: ContentApplicationjsonBodyString,
    responses: `201403404410`
  ): Responses201403404410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201403404410]
  }
  
  extension [Self <: Responses201403404410](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
