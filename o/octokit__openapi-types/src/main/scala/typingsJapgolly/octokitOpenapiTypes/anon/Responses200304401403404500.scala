package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304401403404500 extends StObject {
  
  var parameters: PathCodespacenameOrg
  
  var responses: `200304401403404500`
}
object Responses200304401403404500 {
  
  inline def apply(parameters: PathCodespacenameOrg, responses: `200304401403404500`): Responses200304401403404500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304401403404500]
  }
  
  extension [Self <: Responses200304401403404500](x: Self) {
    
    inline def setParameters(value: PathCodespacenameOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
