package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath317Query250 extends StObject {
  
  var parameters: Path317Query250
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object ParametersPath317Query250 {
  
  inline def apply(parameters: Path317Query250, responses: `200ContentApplicationjsonRunnersTotalcount`): ParametersPath317Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath317Query250]
  }
  
  extension [Self <: ParametersPath317Query250](x: Self) {
    
    inline def setParameters(value: Path317Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
