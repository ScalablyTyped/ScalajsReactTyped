package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonStatusUrl extends StObject {
  
  var parameters: `76`
  
  var responses: `201ContentApplicationjsonStatusUrl`
}
object Responses201ContentApplicationjsonStatusUrl {
  
  inline def apply(parameters: `76`, responses: `201ContentApplicationjsonStatusUrl`): Responses201ContentApplicationjsonStatusUrl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonStatusUrl]
  }
  
  extension [Self <: Responses201ContentApplicationjsonStatusUrl](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonStatusUrl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
