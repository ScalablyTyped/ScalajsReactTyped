package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonArtifactsTotalcount extends StObject {
  
  var parameters: Path292
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object Responses200ContentApplicationjsonArtifactsTotalcount {
  
  inline def apply(parameters: Path292, responses: `200ContentApplicationjsonArtifactsTotalcount`): Responses200ContentApplicationjsonArtifactsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonArtifactsTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonArtifactsTotalcount](x: Self) {
    
    inline def setParameters(value: Path292): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
