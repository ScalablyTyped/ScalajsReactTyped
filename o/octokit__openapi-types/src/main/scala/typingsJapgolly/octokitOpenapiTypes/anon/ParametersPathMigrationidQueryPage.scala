package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidQueryPage extends StObject {
  
  var parameters: PathMigrationidQueryPage
  
  var responses: `200Content52`
}
object ParametersPathMigrationidQueryPage {
  
  inline def apply(parameters: PathMigrationidQueryPage, responses: `200Content52`): ParametersPathMigrationidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidQueryPage]
  }
  
  extension [Self <: ParametersPathMigrationidQueryPage](x: Self) {
    
    inline def setParameters(value: PathMigrationidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content52`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
