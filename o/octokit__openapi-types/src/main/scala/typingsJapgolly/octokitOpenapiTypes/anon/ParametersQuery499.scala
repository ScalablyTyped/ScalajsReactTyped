package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery499 extends StObject {
  
  var parameters: Query499
  
  var responses: `200Content349400`
}
object ParametersQuery499 {
  
  inline def apply(parameters: Query499, responses: `200Content349400`): ParametersQuery499 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery499]
  }
  
  extension [Self <: ParametersQuery499](x: Self) {
    
    inline def setParameters(value: Query499): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content349400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
