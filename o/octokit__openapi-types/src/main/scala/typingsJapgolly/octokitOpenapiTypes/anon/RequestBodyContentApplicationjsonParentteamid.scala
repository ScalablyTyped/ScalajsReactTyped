package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonParentteamid extends StObject {
  
  var parameters: PathTeamslug
  
  var requestBody: ContentApplicationjsonParentteamid
  
  var responses: `200201`
}
object RequestBodyContentApplicationjsonParentteamid {
  
  inline def apply(parameters: PathTeamslug, requestBody: ContentApplicationjsonParentteamid, responses: `200201`): RequestBodyContentApplicationjsonParentteamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonParentteamid]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonParentteamid](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonParentteamid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
