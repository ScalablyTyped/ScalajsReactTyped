package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses301404410422 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: Content151
  
  var responses: `301404410422`
}
object Responses301404410422 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, requestBody: Content151, responses: `301404410422`): Responses301404410422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses301404410422]
  }
  
  extension [Self <: Responses301404410422](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content151): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
