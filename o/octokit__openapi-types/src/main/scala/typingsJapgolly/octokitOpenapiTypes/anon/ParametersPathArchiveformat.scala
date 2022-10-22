package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArchiveformat extends StObject {
  
  var parameters: PathArchiveformat
  
  var responses: `410Content6`
}
object ParametersPathArchiveformat {
  
  inline def apply(parameters: PathArchiveformat, responses: `410Content6`): ParametersPathArchiveformat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArchiveformat]
  }
  
  extension [Self <: ParametersPathArchiveformat](x: Self) {
    
    inline def setParameters(value: PathArchiveformat): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
