package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content329 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `200Content329`
}
object Responses200Content329 {
  
  inline def apply(parameters: PathOrgSecretname, responses: `200Content329`): Responses200Content329 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content329]
  }
  
  extension [Self <: Responses200Content329](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content329`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
