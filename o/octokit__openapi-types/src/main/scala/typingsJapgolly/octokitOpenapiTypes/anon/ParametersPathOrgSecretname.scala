package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretname extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `200Content306`
}
object ParametersPathOrgSecretname {
  
  inline def apply(parameters: PathOrgSecretname, responses: `200Content306`): ParametersPathOrgSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretname]
  }
  
  extension [Self <: ParametersPathOrgSecretname](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content306`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
