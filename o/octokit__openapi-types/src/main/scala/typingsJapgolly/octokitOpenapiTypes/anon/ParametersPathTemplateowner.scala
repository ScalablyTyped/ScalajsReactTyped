package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTemplateowner extends StObject {
  
  var parameters: PathTemplateowner
  
  var requestBody: ContentApplicationjsonIncludeallbranches
  
  var responses: `201ContentApplicationjsonAllowmergecommit`
}
object ParametersPathTemplateowner {
  
  inline def apply(
    parameters: PathTemplateowner,
    requestBody: ContentApplicationjsonIncludeallbranches,
    responses: `201ContentApplicationjsonAllowmergecommit`
  ): ParametersPathTemplateowner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTemplateowner]
  }
  
  extension [Self <: ParametersPathTemplateowner](x: Self) {
    
    inline def setParameters(value: PathTemplateowner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeallbranches): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAllowmergecommit`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
