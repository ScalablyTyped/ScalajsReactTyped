package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameRunnerid extends StObject {
  
  var parameters: PathNameRunnerid
  
  var responses: `262`
}
object ParametersPathNameRunnerid {
  
  inline def apply(parameters: PathNameRunnerid, responses: `262`): ParametersPathNameRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameRunnerid]
  }
  
  extension [Self <: ParametersPathNameRunnerid](x: Self) {
    
    inline def setParameters(value: PathNameRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `262`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
