package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath289 extends StObject {
  
  var parameters: Path289
  
  var responses: `401404422`
}
object ParametersPath289 {
  
  inline def apply(parameters: Path289, responses: `401404422`): ParametersPath289 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath289]
  }
  
  extension [Self <: ParametersPath289](x: Self) {
    
    inline def setParameters(value: Path289): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
