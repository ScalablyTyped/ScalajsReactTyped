package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSelectedworkflows extends StObject {
  
  var parameters: PathRunnergroupid
  
  var requestBody: ContentApplicationjsonSelectedworkflows
  
  var responses: `200ContentApplicationjsonAllowspublicrepositories`
}
object RequestBodyContentApplicationjsonSelectedworkflows {
  
  inline def apply(
    parameters: PathRunnergroupid,
    requestBody: ContentApplicationjsonSelectedworkflows,
    responses: `200ContentApplicationjsonAllowspublicrepositories`
  ): RequestBodyContentApplicationjsonSelectedworkflows = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSelectedworkflows]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSelectedworkflows](x: Self) {
    
    inline def setParameters(value: PathRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllowspublicrepositories`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
