package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSarifid extends StObject {
  
  var parameters: PathOwnerRepoSarifid
  
  var responses: `200Content459`
}
object ParametersPathOwnerRepoSarifid {
  
  inline def apply(parameters: PathOwnerRepoSarifid, responses: `200Content459`): ParametersPathOwnerRepoSarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSarifid]
  }
  
  extension [Self <: ParametersPathOwnerRepoSarifid](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content459`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
