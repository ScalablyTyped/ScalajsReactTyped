package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberResponses extends StObject {
  
  var parameters: PathDiscussionnumber
}
object ParametersPathDiscussionnumberResponses {
  
  inline def apply(parameters: PathDiscussionnumber): ParametersPathDiscussionnumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberResponses]
  }
  
  extension [Self <: ParametersPathDiscussionnumberResponses](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
