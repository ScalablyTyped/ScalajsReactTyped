package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwner extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var responses: `200Content446`
}
object ParametersPathCheckrunidOwner {
  
  inline def apply(parameters: PathCheckrunidOwner, responses: `200Content446`): ParametersPathCheckrunidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwner]
  }
  
  extension [Self <: ParametersPathCheckrunidOwner](x: Self) {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content446`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
