package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCodespacenameString extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `404500`
}
object ParametersPathCodespacenameString {
  
  inline def apply(parameters: PathCodespacenameString, responses: `404500`): ParametersPathCodespacenameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCodespacenameString]
  }
  
  extension [Self <: ParametersPathCodespacenameString](x: Self) {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
