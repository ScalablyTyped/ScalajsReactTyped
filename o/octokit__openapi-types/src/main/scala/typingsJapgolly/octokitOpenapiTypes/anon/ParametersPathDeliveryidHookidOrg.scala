package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOrg extends StObject {
  
  var parameters: PathDeliveryidHookidOrg
  
  var responses: `200400422`
}
object ParametersPathDeliveryidHookidOrg {
  
  inline def apply(parameters: PathDeliveryidHookidOrg, responses: `200400422`): ParametersPathDeliveryidHookidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOrg]
  }
  
  extension [Self <: ParametersPathDeliveryidHookidOrg](x: Self) {
    
    inline def setParameters(value: PathDeliveryidHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
