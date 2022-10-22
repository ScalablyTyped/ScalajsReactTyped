package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArtifactid extends StObject {
  
  var parameters: PathArtifactid
  
  var responses: `200ContentApplicationjsonArchivedownloadurl`
}
object ParametersPathArtifactid {
  
  inline def apply(parameters: PathArtifactid, responses: `200ContentApplicationjsonArchivedownloadurl`): ParametersPathArtifactid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArtifactid]
  }
  
  extension [Self <: ParametersPathArtifactid](x: Self) {
    
    inline def setParameters(value: PathArtifactid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArchivedownloadurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
