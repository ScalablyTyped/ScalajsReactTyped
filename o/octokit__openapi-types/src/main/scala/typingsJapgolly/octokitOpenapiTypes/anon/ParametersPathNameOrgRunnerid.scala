package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOrgRunnerid extends StObject {
  
  var parameters: PathNameOrgRunnerid
  
  var responses: `262`
}
object ParametersPathNameOrgRunnerid {
  
  inline def apply(parameters: PathNameOrgRunnerid, responses: `262`): ParametersPathNameOrgRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOrgRunnerid]
  }
  
  extension [Self <: ParametersPathNameOrgRunnerid](x: Self) {
    
    inline def setParameters(value: PathNameOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `262`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
