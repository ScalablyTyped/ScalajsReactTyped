package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageState extends StObject {
  
  var parameters: QueryPagePerpageState
  
  var responses: `200Content56`
}
object ParametersQueryPagePerpageState {
  
  inline def apply(parameters: QueryPagePerpageState, responses: `200Content56`): ParametersQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageState]
  }
  
  extension [Self <: ParametersQueryPagePerpageState](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content56`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
