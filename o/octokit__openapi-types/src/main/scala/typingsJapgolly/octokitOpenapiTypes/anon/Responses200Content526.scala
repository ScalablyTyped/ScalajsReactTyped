package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content526 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var responses: `200Content526`
}
object Responses200Content526 {
  
  inline def apply(parameters: PathCommentidOwnerRepo, responses: `200Content526`): Responses200Content526 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content526]
  }
  
  extension [Self <: Responses200Content526](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content526`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
