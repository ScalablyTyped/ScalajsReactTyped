package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403422 extends StObject {
  
  var parameters: QuerySince
  
  var responses: `403422`
}
object Responses403422 {
  
  inline def apply(parameters: QuerySince, responses: `403422`): Responses403422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403422]
  }
  
  extension [Self <: Responses403422](x: Self) {
    
    inline def setParameters(value: QuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
