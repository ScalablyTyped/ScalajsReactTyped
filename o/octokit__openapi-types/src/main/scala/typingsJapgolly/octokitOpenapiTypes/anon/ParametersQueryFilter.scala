package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFilter extends StObject {
  
  var parameters: QueryFilter
  
  var responses: `200Content29`
}
object ParametersQueryFilter {
  
  inline def apply(parameters: QueryFilter, responses: `200Content29`): ParametersQueryFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFilter]
  }
  
  extension [Self <: ParametersQueryFilter](x: Self) {
    
    inline def setParameters(value: QueryFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content29`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
