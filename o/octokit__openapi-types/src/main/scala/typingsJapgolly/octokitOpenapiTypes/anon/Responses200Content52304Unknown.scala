package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content52304Unknown extends StObject {
  
  var parameters: `17`
  
  var responses: `200Content52304Unknown`
}
object Responses200Content52304Unknown {
  
  inline def apply(parameters: `17`, responses: `200Content52304Unknown`): Responses200Content52304Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content52304Unknown]
  }
  
  extension [Self <: Responses200Content52304Unknown](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content52304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
