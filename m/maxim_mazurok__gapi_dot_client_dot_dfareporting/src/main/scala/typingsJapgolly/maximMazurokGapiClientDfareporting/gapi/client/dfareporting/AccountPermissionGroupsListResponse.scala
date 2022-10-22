package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPermissionGroupsListResponse extends StObject {
  
  /** Account permission group collection. */
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountPermissionGroupsListResponse {
  
  inline def apply(): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
  
  extension [Self <: AccountPermissionGroupsListResponse](x: Self) {
    
    inline def setAccountPermissionGroups(value: js.Array[AccountPermissionGroup]): Self = StObject.set(x, "accountPermissionGroups", value.asInstanceOf[js.Any])
    
    inline def setAccountPermissionGroupsUndefined: Self = StObject.set(x, "accountPermissionGroups", js.undefined)
    
    inline def setAccountPermissionGroupsVarargs(value: AccountPermissionGroup*): Self = StObject.set(x, "accountPermissionGroups", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
