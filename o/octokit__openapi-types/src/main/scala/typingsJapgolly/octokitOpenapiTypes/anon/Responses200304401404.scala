package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304401404 extends StObject {
  
  var parameters: `267`
  
  var responses: `200304401404`
}
object Responses200304401404 {
  
  inline def apply(parameters: `267`, responses: `200304401404`): Responses200304401404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304401404]
  }
  
  extension [Self <: Responses200304401404](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
