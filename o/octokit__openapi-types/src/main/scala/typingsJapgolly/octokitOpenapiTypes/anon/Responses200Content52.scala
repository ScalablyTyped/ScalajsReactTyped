package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content52 extends StObject {
  
  var parameters: PathTeamidQueryPage
  
  var responses: `200Content52`
}
object Responses200Content52 {
  
  inline def apply(parameters: PathTeamidQueryPage, responses: `200Content52`): Responses200Content52 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content52]
  }
  
  extension [Self <: Responses200Content52](x: Self) {
    
    inline def setParameters(value: PathTeamidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content52`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
