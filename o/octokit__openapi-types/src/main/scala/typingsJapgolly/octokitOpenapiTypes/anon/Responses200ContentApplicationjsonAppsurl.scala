package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAppsurl extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonAppsurl`
}
object Responses200ContentApplicationjsonAppsurl {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonAppsurl`): Responses200ContentApplicationjsonAppsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAppsurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonAppsurl](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAppsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
