package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeQueryToken extends StObject {
  
  var parameters: PathPackagenamePackagetypeQueryToken
  
  var responses: `401403404`
}
object ParametersPathPackagenamePackagetypeQueryToken {
  
  inline def apply(parameters: PathPackagenamePackagetypeQueryToken, responses: `401403404`): ParametersPathPackagenamePackagetypeQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeQueryToken]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypeQueryToken](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypeQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
