package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPackagenameQueryToken extends StObject {
  
  var parameters: PathOrgPackagenameQueryToken
  
  var responses: `354`
}
object ParametersPathOrgPackagenameQueryToken {
  
  inline def apply(parameters: PathOrgPackagenameQueryToken, responses: `354`): ParametersPathOrgPackagenameQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPackagenameQueryToken]
  }
  
  extension [Self <: ParametersPathOrgPackagenameQueryToken](x: Self) {
    
    inline def setParameters(value: PathOrgPackagenameQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
