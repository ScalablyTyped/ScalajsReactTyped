package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304404503 extends StObject {
  
  var parameters: PathAlertnumberOwner
  
  var responses: `200304404503`
}
object Responses200304404503 {
  
  inline def apply(parameters: PathAlertnumberOwner, responses: `200304404503`): Responses200304404503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304404503]
  }
  
  extension [Self <: Responses200304404503](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
