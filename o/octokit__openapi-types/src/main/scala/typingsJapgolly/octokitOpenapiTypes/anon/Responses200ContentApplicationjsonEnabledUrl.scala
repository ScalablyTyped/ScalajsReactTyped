package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEnabledUrl extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonEnabledUrl`
}
object Responses200ContentApplicationjsonEnabledUrl {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonEnabledUrl`): Responses200ContentApplicationjsonEnabledUrl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEnabledUrl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonEnabledUrl](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnabledUrl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
