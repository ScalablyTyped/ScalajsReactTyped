package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMigrationidOrg extends StObject {
  
  /**
    * Fetches the status of a migration.
    *
    * The `state` of a migration can be one of the following values:
    *
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  var get: ParametersPathMigrationidOrg
}
object GetParametersPathMigrationidOrg {
  
  inline def apply(get: ParametersPathMigrationidOrg): GetParametersPathMigrationidOrg = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMigrationidOrg]
  }
  
  extension [Self <: GetParametersPathMigrationidOrg](x: Self) {
    
    inline def setGet(value: ParametersPathMigrationidOrg): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
