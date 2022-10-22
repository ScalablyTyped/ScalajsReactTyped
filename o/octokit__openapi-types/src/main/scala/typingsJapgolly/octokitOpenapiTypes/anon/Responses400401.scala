package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400401 extends StObject {
  
  var parameters: PathOwnerRepoQueryPage
  
  var responses: `400401`
}
object Responses400401 {
  
  inline def apply(parameters: PathOwnerRepoQueryPage, responses: `400401`): Responses400401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400401]
  }
  
  extension [Self <: Responses400401](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
