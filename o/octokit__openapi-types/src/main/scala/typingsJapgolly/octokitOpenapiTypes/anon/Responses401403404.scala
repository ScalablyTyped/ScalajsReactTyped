package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403404 extends StObject {
  
  var parameters: PathPackagename
  
  var responses: `401403404`
}
object Responses401403404 {
  
  inline def apply(parameters: PathPackagename, responses: `401403404`): Responses401403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403404]
  }
  
  extension [Self <: Responses401403404](x: Self) {
    
    inline def setParameters(value: PathPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
