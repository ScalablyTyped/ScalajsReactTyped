package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content288 extends StObject {
  
  var parameters: `267`
  
  var responses: `200Content288`
}
object Responses200Content288 {
  
  inline def apply(parameters: `267`, responses: `200Content288`): Responses200Content288 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content288]
  }
  
  extension [Self <: Responses200Content288](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content288`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
