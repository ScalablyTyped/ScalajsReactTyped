package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsername extends StObject {
  
  var parameters: PathUsername
  
  var responses: `404ContentApplicationjson`
}
object ParametersPathUsername {
  
  inline def apply(parameters: PathUsername, responses: `404ContentApplicationjson`): ParametersPathUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsername]
  }
  
  extension [Self <: ParametersPathUsername](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404ContentApplicationjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
