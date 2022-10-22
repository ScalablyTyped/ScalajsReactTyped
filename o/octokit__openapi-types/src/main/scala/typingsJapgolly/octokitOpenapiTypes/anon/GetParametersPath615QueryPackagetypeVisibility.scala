package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath615QueryPackagetypeVisibility extends StObject {
  
  /**
    * Lists all packages in a user's namespace for which the requesting user has access.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPath615QueryPackagetypeVisibility
}
object GetParametersPath615QueryPackagetypeVisibility {
  
  inline def apply(get: ParametersPath615QueryPackagetypeVisibility): GetParametersPath615QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath615QueryPackagetypeVisibility]
  }
  
  extension [Self <: GetParametersPath615QueryPackagetypeVisibility](x: Self) {
    
    inline def setGet(value: ParametersPath615QueryPackagetypeVisibility): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
