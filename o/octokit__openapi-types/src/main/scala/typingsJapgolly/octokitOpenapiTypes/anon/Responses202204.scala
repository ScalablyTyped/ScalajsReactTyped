package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202204 extends StObject {
  
  var parameters: `76`
  
  var responses: `202204`
}
object Responses202204 {
  
  inline def apply(parameters: `76`, responses: `202204`): Responses202204 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202204]
  }
  
  extension [Self <: Responses202204](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
