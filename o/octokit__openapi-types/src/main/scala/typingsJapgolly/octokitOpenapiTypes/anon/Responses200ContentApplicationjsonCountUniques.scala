package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCountUniques extends StObject {
  
  var parameters: QueryPer
  
  var responses: `200ContentApplicationjsonCountUniques`
}
object Responses200ContentApplicationjsonCountUniques {
  
  inline def apply(parameters: QueryPer, responses: `200ContentApplicationjsonCountUniques`): Responses200ContentApplicationjsonCountUniques = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCountUniques]
  }
  
  extension [Self <: Responses200ContentApplicationjsonCountUniques](x: Self) {
    
    inline def setParameters(value: QueryPer): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCountUniques`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
