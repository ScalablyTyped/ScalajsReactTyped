package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoResponses345 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `345`
}
object ParametersPathIssuenumberOwnerRepoResponses345 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `345`): ParametersPathIssuenumberOwnerRepoResponses345 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoResponses345]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoResponses345](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `345`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
