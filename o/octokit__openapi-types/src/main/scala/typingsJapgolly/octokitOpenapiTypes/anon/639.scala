package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `639` extends StObject {
  
  /** The unique identifier of the migration. */
  var migration_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['migration-id'] */ js.Any
  
  /** repo_name parameter */
  var repo_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo-name'] */ js.Any
}
object `639` {
  
  inline def apply(
    migration_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['migration-id'] */ js.Any,
    repo_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo-name'] */ js.Any
  ): `639` = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`639`]
  }
  
  extension [Self <: `639`](x: Self) {
    
    inline def setMigration_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['migration-id'] */ js.Any
    ): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    inline def setRepo_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo-name'] */ js.Any
    ): Self = StObject.set(x, "repo_name", value.asInstanceOf[js.Any])
  }
}
