package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content42 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200Content42`
}
object Responses200Content42 {
  
  inline def apply(parameters: PathOrgString, responses: `200Content42`): Responses200Content42 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content42]
  }
  
  extension [Self <: Responses200Content42](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content42`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
