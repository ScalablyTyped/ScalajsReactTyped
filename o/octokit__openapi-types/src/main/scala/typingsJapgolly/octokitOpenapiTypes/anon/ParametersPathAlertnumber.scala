package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumber extends StObject {
  
  var parameters: PathAlertnumber
  
  var responses: `304403404503`
}
object ParametersPathAlertnumber {
  
  inline def apply(parameters: PathAlertnumber, responses: `304403404503`): ParametersPathAlertnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumber]
  }
  
  extension [Self <: ParametersPathAlertnumber](x: Self) {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
