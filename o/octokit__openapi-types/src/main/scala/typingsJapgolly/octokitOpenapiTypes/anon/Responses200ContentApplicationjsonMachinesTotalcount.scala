package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMachinesTotalcount extends StObject {
  
  var parameters: Path622
  
  var responses: `200ContentApplicationjsonMachinesTotalcount`
}
object Responses200ContentApplicationjsonMachinesTotalcount {
  
  inline def apply(parameters: Path622, responses: `200ContentApplicationjsonMachinesTotalcount`): Responses200ContentApplicationjsonMachinesTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMachinesTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonMachinesTotalcount](x: Self) {
    
    inline def setParameters(value: Path622): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMachinesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
