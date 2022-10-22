package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionPage extends StObject {
  
  var parameters: QueryDirectionPage
  
  var responses: `57`
}
object ParametersQueryDirectionPage {
  
  inline def apply(parameters: QueryDirectionPage, responses: `57`): ParametersQueryDirectionPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionPage]
  }
  
  extension [Self <: ParametersQueryDirectionPage](x: Self) {
    
    inline def setParameters(value: QueryDirectionPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `57`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
