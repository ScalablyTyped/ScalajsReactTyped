package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content456 extends StObject {
  
  /**
    * Lists the CodeQL databases that are available in a repository.
    *
    * For private repositories, you must use an access token with the `security_events` scope.
    * For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
    * GitHub Apps must have the `contents` read permission to use this endpoint.
    */
  var get: Responses200Content456
}
object GetResponses200Content456 {
  
  inline def apply(get: Responses200Content456): GetResponses200Content456 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content456]
  }
  
  extension [Self <: GetResponses200Content456](x: Self) {
    
    inline def setGet(value: Responses200Content456): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
