package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsername extends StObject {
  
  var parameters: PathPackagetypeUsername
  
  var responses: `200ContentApplicationjsonVersioncount`
}
object ParametersPathPackagetypeUsername {
  
  inline def apply(parameters: PathPackagetypeUsername, responses: `200ContentApplicationjsonVersioncount`): ParametersPathPackagetypeUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsername]
  }
  
  extension [Self <: ParametersPathPackagetypeUsername](x: Self) {
    
    inline def setParameters(value: PathPackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVersioncount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
