package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202403Unknown extends StObject {
  
  var parameters: `395`
  
  var responses: `202403Unknown`
}
object Responses202403Unknown {
  
  inline def apply(parameters: `395`, responses: `202403Unknown`): Responses202403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202403Unknown]
  }
  
  extension [Self <: Responses202403Unknown](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
