package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumber extends StObject {
  
  var parameters: PathMigrationidNumber
  
  var responses: `200ContentApplicationjsonExcludeattachments304Unknown`
}
object ParametersPathMigrationidNumber {
  
  inline def apply(
    parameters: PathMigrationidNumber,
    responses: `200ContentApplicationjsonExcludeattachments304Unknown`
  ): ParametersPathMigrationidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumber]
  }
  
  extension [Self <: ParametersPathMigrationidNumber](x: Self) {
    
    inline def setParameters(value: PathMigrationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonExcludeattachments304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
