package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonKeyid extends StObject {
  
  var parameters: `76`
  
  var responses: `200ContentApplicationjsonKeyid`
}
object Responses200ContentApplicationjsonKeyid {
  
  inline def apply(parameters: `76`, responses: `200ContentApplicationjsonKeyid`): Responses200ContentApplicationjsonKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonKeyid]
  }
  
  extension [Self <: Responses200ContentApplicationjsonKeyid](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
