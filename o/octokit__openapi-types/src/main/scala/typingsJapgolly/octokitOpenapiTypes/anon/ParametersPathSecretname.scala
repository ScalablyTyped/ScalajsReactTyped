package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretname extends StObject {
  
  var parameters: PathSecretname
  
  var responses: `200ContentApplicationjsonSelectedrepositoriesurl`
}
object ParametersPathSecretname {
  
  inline def apply(parameters: PathSecretname, responses: `200ContentApplicationjsonSelectedrepositoriesurl`): ParametersPathSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretname]
  }
  
  extension [Self <: ParametersPathSecretname](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSelectedrepositoriesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
