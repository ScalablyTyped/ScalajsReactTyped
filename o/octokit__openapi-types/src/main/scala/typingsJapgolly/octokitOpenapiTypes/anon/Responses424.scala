package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses424 extends StObject {
  
  var parameters: `418`
  
  var responses: `424`
}
object Responses424 {
  
  inline def apply(parameters: `418`, responses: `424`): Responses424 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses424]
  }
  
  extension [Self <: Responses424](x: Self) {
    
    inline def setParameters(value: `418`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `424`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
