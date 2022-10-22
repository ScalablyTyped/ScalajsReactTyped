package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRequestBody extends StObject {
  
  var parameters: PathInstallationid
  
  var requestBody: ContentApplicationjsonRepositoryids
  
  var responses: `401`
}
object ParametersRequestBody {
  
  inline def apply(parameters: PathInstallationid, requestBody: ContentApplicationjsonRepositoryids, responses: `401`): ParametersRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestBody]
  }
  
  extension [Self <: ParametersRequestBody](x: Self) {
    
    inline def setParameters(value: PathInstallationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
