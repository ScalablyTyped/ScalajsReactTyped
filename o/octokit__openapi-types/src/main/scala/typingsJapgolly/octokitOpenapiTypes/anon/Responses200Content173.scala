package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content173 extends StObject {
  
  var parameters: PathPullnumberQueryPage
  
  var responses: `200Content173`
}
object Responses200Content173 {
  
  inline def apply(parameters: PathPullnumberQueryPage, responses: `200Content173`): Responses200Content173 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content173]
  }
  
  extension [Self <: Responses200Content173](x: Self) {
    
    inline def setParameters(value: PathPullnumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content173`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
