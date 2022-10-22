package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPermission extends StObject {
  
  /** Account profiles associated with this account permission. Possible values are: - "ACCOUNT_PROFILE_BASIC" - "ACCOUNT_PROFILE_STANDARD" */
  var accountProfiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /** ID of this account permission. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermission". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Administrative level required to enable this account permission. */
  var level: js.UndefOr[String] = js.undefined
  
  /** Name of this account permission. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Permission group of this account permission. */
  var permissionGroupId: js.UndefOr[String] = js.undefined
}
object AccountPermission {
  
  inline def apply(): AccountPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermission]
  }
  
  extension [Self <: AccountPermission](x: Self) {
    
    inline def setAccountProfiles(value: js.Array[String]): Self = StObject.set(x, "accountProfiles", value.asInstanceOf[js.Any])
    
    inline def setAccountProfilesUndefined: Self = StObject.set(x, "accountProfiles", js.undefined)
    
    inline def setAccountProfilesVarargs(value: String*): Self = StObject.set(x, "accountProfiles", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionGroupId(value: String): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
