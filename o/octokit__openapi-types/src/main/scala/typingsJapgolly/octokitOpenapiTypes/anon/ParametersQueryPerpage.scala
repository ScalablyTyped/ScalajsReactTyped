package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpage extends StObject {
  
  var parameters: QueryPerpage
  
  var responses: `200ContentApplicationjsonRunnergroups`
}
object ParametersQueryPerpage {
  
  inline def apply(parameters: QueryPerpage, responses: `200ContentApplicationjsonRunnergroups`): ParametersQueryPerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpage]
  }
  
  extension [Self <: ParametersQueryPerpage](x: Self) {
    
    inline def setParameters(value: QueryPerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnergroups`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
