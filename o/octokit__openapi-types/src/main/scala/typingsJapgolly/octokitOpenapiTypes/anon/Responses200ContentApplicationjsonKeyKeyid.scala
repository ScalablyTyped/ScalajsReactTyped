package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonKeyKeyid extends StObject {
  
  var parameters: `37`
  
  var responses: `200ContentApplicationjsonKeyKeyid`
}
object Responses200ContentApplicationjsonKeyKeyid {
  
  inline def apply(parameters: `37`, responses: `200ContentApplicationjsonKeyKeyid`): Responses200ContentApplicationjsonKeyKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonKeyKeyid]
  }
  
  extension [Self <: Responses200ContentApplicationjsonKeyKeyid](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonKeyKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
