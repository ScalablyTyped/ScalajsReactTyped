package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugQueryPage extends StObject {
  
  var parameters: PathTeamslugQueryPage
  
  var responses: `63`
}
object ParametersPathTeamslugQueryPage {
  
  inline def apply(parameters: PathTeamslugQueryPage, responses: `63`): ParametersPathTeamslugQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugQueryPage]
  }
  
  extension [Self <: ParametersPathTeamslugQueryPage](x: Self) {
    
    inline def setParameters(value: PathTeamslugQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
