package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDir extends StObject {
  
  var parameters: PathDir
  
  var responses: `200ContentApplicationjsonSize`
}
object ParametersPathDir {
  
  inline def apply(parameters: PathDir, responses: `200ContentApplicationjsonSize`): ParametersPathDir = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDir]
  }
  
  extension [Self <: ParametersPathDir](x: Self) {
    
    inline def setParameters(value: PathDir): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSize`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
