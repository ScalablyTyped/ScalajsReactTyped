package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAlertnumberOwnerQuery309 extends StObject {
  
  /**
    * Lists all locations for a given secret scanning alert for an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: ParametersPathAlertnumberOwnerQuery309
}
object GetParametersPathAlertnumberOwnerQuery309 {
  
  inline def apply(get: ParametersPathAlertnumberOwnerQuery309): GetParametersPathAlertnumberOwnerQuery309 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAlertnumberOwnerQuery309]
  }
  
  extension [Self <: GetParametersPathAlertnumberOwnerQuery309](x: Self) {
    
    inline def setGet(value: ParametersPathAlertnumberOwnerQuery309): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
