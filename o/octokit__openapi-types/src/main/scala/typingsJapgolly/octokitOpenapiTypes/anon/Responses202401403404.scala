package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202401403404 extends StObject {
  
  var parameters: Path622
  
  var responses: `202401403404`
}
object Responses202401403404 {
  
  inline def apply(parameters: Path622, responses: `202401403404`): Responses202401403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202401403404]
  }
  
  extension [Self <: Responses202401403404](x: Self) {
    
    inline def setParameters(value: Path622): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
