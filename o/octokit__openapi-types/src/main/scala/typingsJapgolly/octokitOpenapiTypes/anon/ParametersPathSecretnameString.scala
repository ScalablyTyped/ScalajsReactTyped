package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameString extends StObject {
  
  var parameters: PathSecretnameString
  
  var responses: `200ContentApplicationjsonVisibility`
}
object ParametersPathSecretnameString {
  
  inline def apply(parameters: PathSecretnameString, responses: `200ContentApplicationjsonVisibility`): ParametersPathSecretnameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameString]
  }
  
  extension [Self <: ParametersPathSecretnameString](x: Self) {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVisibility`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
