package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetype extends StObject {
  
  var parameters: PathPackagenamePackagetype
  
  var responses: `200ContentApplicationjsonVersioncount`
}
object ParametersPathPackagenamePackagetype {
  
  inline def apply(parameters: PathPackagenamePackagetype, responses: `200ContentApplicationjsonVersioncount`): ParametersPathPackagenamePackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetype]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetype](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVersioncount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
