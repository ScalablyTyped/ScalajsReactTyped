package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReviewid extends StObject {
  
  var parameters: PathReviewid
  
  var responses: `200ContentApplicationjsonBodyBodyhtml404Content6`
}
object ParametersPathReviewid {
  
  inline def apply(parameters: PathReviewid, responses: `200ContentApplicationjsonBodyBodyhtml404Content6`): ParametersPathReviewid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReviewid]
  }
  
  extension [Self <: ParametersPathReviewid](x: Self) {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyBodyhtml404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
