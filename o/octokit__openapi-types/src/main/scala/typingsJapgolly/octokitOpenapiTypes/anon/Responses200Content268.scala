package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content268 extends StObject {
  
  var parameters: Path300
  
  var responses: `200Content268`
}
object Responses200Content268 {
  
  inline def apply(parameters: Path300, responses: `200Content268`): Responses200Content268 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content268]
  }
  
  extension [Self <: Responses200Content268](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content268`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
