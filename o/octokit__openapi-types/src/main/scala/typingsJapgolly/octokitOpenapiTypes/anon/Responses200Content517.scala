package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content517 extends StObject {
  
  var parameters: `395`
  
  var responses: `200Content517`
}
object Responses200Content517 {
  
  inline def apply(parameters: `395`, responses: `200Content517`): Responses200Content517 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content517]
  }
  
  extension [Self <: Responses200Content517](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content517`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
