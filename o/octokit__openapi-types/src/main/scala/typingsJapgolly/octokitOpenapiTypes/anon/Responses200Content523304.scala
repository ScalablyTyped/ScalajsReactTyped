package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content523304 extends StObject {
  
  var parameters: `267`
  
  var responses: `200Content523304`
}
object Responses200Content523304 {
  
  inline def apply(parameters: `267`, responses: `200Content523304`): Responses200Content523304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content523304]
  }
  
  extension [Self <: Responses200Content523304](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content523304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
