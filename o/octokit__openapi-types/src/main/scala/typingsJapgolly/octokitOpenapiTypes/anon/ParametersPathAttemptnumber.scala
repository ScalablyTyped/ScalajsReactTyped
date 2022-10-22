package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumber extends StObject {
  
  var parameters: PathAttemptnumber
  
  var responses: `200ContentApplicationjsonCancelurl`
}
object ParametersPathAttemptnumber {
  
  inline def apply(parameters: PathAttemptnumber, responses: `200ContentApplicationjsonCancelurl`): ParametersPathAttemptnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumber]
  }
  
  extension [Self <: ParametersPathAttemptnumber](x: Self) {
    
    inline def setParameters(value: PathAttemptnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCancelurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
