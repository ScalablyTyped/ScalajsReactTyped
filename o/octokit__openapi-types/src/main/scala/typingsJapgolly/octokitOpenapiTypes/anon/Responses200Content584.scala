package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content584 extends StObject {
  
  var parameters: `395`
  
  var responses: `200Content584`
}
object Responses200Content584 {
  
  inline def apply(parameters: `395`, responses: `200Content584`): Responses200Content584 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content584]
  }
  
  extension [Self <: Responses200Content584](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content584`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
