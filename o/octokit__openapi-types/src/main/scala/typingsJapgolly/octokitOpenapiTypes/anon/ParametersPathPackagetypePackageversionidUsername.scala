package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypePackageversionidUsername extends StObject {
  
  var parameters: PathPackagetypePackageversionidUsername
  
  var responses: `200Content357`
}
object ParametersPathPackagetypePackageversionidUsername {
  
  inline def apply(parameters: PathPackagetypePackageversionidUsername, responses: `200Content357`): ParametersPathPackagetypePackageversionidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypePackageversionidUsername]
  }
  
  extension [Self <: ParametersPathPackagetypePackageversionidUsername](x: Self) {
    
    inline def setParameters(value: PathPackagetypePackageversionidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content357`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
