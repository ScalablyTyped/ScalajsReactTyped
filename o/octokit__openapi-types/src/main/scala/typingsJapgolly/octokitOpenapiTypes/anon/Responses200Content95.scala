package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content95 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200Content95`
}
object Responses200Content95 {
  
  inline def apply(parameters: PathBranchOwner, responses: `200Content95`): Responses200Content95 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content95]
  }
  
  extension [Self <: Responses200Content95](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content95`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
