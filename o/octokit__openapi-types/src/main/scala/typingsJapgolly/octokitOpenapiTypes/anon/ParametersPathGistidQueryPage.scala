package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidQueryPage extends StObject {
  
  var parameters: PathGistidQueryPage
  
  var responses: `200304403404`
}
object ParametersPathGistidQueryPage {
  
  inline def apply(parameters: PathGistidQueryPage, responses: `200304403404`): ParametersPathGistidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidQueryPage]
  }
  
  extension [Self <: ParametersPathGistidQueryPage](x: Self) {
    
    inline def setParameters(value: PathGistidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
