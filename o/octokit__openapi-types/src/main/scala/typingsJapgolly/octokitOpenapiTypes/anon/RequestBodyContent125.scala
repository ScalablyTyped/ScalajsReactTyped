package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent125 extends StObject {
  
  var parameters: `76`
  
  var requestBody: Content125
  
  var responses: `202400`
}
object RequestBodyContent125 {
  
  inline def apply(parameters: `76`, requestBody: Content125, responses: `202400`): RequestBodyContent125 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent125]
  }
  
  extension [Self <: RequestBodyContent125](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content125): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
