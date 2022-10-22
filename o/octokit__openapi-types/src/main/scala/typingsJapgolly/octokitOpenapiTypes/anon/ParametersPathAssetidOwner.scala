package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssetidOwner extends StObject {
  
  var parameters: PathAssetidOwner
  
  var responses: `200302404`
}
object ParametersPathAssetidOwner {
  
  inline def apply(parameters: PathAssetidOwner, responses: `200302404`): ParametersPathAssetidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssetidOwner]
  }
  
  extension [Self <: ParametersPathAssetidOwner](x: Self) {
    
    inline def setParameters(value: PathAssetidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200302404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
