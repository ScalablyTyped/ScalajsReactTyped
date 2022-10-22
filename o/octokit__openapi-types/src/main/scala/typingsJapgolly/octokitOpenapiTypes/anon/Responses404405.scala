package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404405 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: Content172
  
  var responses: `404405`
}
object Responses404405 {
  
  inline def apply(parameters: PathPullnumberRepo, requestBody: Content172, responses: `404405`): Responses404405 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404405]
  }
  
  extension [Self <: Responses404405](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content172): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404405`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
