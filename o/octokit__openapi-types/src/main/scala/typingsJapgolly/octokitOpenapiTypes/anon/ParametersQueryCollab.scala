package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCollab extends StObject {
  
  var parameters: QueryCollab
  
  var responses: `304404`
}
object ParametersQueryCollab {
  
  inline def apply(parameters: QueryCollab, responses: `304404`): ParametersQueryCollab = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCollab]
  }
  
  extension [Self <: ParametersQueryCollab](x: Self) {
    
    inline def setParameters(value: QueryCollab): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
