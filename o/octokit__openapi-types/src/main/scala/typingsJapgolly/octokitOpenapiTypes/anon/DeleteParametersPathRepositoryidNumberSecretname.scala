package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRepositoryidNumberSecretname extends StObject {
  
  /**
    * Removes a repository from the selected repositories for a user's codespace secret.
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var delete: ParametersPathRepositoryidNumberSecretname
  
  /**
    * Adds a repository to the selected repositories for a user's codespace secret.
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on the referenced repository to use this endpoint.
    */
  var put: ParametersPathRepositoryidNumberSecretname
}
object DeleteParametersPathRepositoryidNumberSecretname {
  
  inline def apply(
    delete: ParametersPathRepositoryidNumberSecretname,
    put: ParametersPathRepositoryidNumberSecretname
  ): DeleteParametersPathRepositoryidNumberSecretname = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRepositoryidNumberSecretname]
  }
  
  extension [Self <: DeleteParametersPathRepositoryidNumberSecretname](x: Self) {
    
    inline def setDelete(value: ParametersPathRepositoryidNumberSecretname): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRepositoryidNumberSecretname): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
