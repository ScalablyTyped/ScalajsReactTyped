package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters215 extends StObject {
  
  var parameters: `215`
  
  var responses: `401Content6`
}
object Parameters215 {
  
  inline def apply(parameters: `215`, responses: `401Content6`): Parameters215 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters215]
  }
  
  extension [Self <: Parameters215](x: Self) {
    
    inline def setParameters(value: `215`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
