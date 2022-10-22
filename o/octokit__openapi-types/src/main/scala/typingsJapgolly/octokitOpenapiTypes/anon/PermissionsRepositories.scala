package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionsRepositories extends StObject {
  
  var permissions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
  ] = js.undefined
  
  /** @description List of repository names that the token should have access to */
  var repositories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description List of repository IDs that the token should have access to
    * @example [
    *   1
    * ]
    */
  var repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
}
object PermissionsRepositories {
  
  inline def apply(): PermissionsRepositories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionsRepositories]
  }
  
  extension [Self <: PermissionsRepositories](x: Self) {
    
    inline def setPermissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
    ): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRepositories(value: js.Array[String]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: String*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_ids(value: js.Array[Double]): Self = StObject.set(x, "repository_ids", value.asInstanceOf[js.Any])
    
    inline def setRepository_idsUndefined: Self = StObject.set(x, "repository_ids", js.undefined)
    
    inline def setRepository_idsVarargs(value: Double*): Self = StObject.set(x, "repository_ids", js.Array(value*))
  }
}
