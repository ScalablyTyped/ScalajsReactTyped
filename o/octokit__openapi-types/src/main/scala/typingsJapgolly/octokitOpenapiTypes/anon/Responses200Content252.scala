package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content252 extends StObject {
  
  var parameters: Path246
  
  var responses: `200Content252`
}
object Responses200Content252 {
  
  inline def apply(parameters: Path246, responses: `200Content252`): Responses200Content252 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content252]
  }
  
  extension [Self <: Responses200Content252](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content252`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
