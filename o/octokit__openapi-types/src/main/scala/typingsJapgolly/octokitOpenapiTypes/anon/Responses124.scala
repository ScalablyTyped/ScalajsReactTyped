package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses124 extends StObject {
  
  var parameters: PathBranchpolicyid
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `124`
}
object Responses124 {
  
  inline def apply(parameters: PathBranchpolicyid, requestBody: ContentApplicationjsonNameString, responses: `124`): Responses124 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses124]
  }
  
  extension [Self <: Responses124](x: Self) {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `124`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
