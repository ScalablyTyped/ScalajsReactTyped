package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamid extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var responses: `200ContentApplicationjsonOwnerurl`
}
object ParametersPathProjectidTeamid {
  
  inline def apply(parameters: PathProjectidTeamid, responses: `200ContentApplicationjsonOwnerurl`): ParametersPathProjectidTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamid]
  }
  
  extension [Self <: ParametersPathProjectidTeamid](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOwnerurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
