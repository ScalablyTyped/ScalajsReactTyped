package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content341403404 extends StObject {
  
  var parameters: Path607Query250
  
  var responses: `200Content341403404`
}
object Responses200Content341403404 {
  
  inline def apply(parameters: Path607Query250, responses: `200Content341403404`): Responses200Content341403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content341403404]
  }
  
  extension [Self <: Responses200Content341403404](x: Self) {
    
    inline def setParameters(value: Path607Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content341403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
