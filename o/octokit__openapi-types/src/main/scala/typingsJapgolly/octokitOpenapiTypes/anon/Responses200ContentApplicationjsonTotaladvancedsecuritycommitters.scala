package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTotaladvancedsecuritycommitters extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200ContentApplicationjsonTotaladvancedsecuritycommitters`
}
object Responses200ContentApplicationjsonTotaladvancedsecuritycommitters {
  
  inline def apply(parameters: QueryPage, responses: `200ContentApplicationjsonTotaladvancedsecuritycommitters`): Responses200ContentApplicationjsonTotaladvancedsecuritycommitters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTotaladvancedsecuritycommitters]
  }
  
  extension [Self <: Responses200ContentApplicationjsonTotaladvancedsecuritycommitters](x: Self) {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotaladvancedsecuritycommitters`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
