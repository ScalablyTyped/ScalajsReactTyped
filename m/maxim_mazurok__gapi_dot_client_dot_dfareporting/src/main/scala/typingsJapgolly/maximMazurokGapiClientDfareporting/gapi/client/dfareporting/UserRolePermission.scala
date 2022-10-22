package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserRolePermission extends StObject {
  
  /** Levels of availability for a user role permission. */
  var availability: js.UndefOr[String] = js.undefined
  
  /** ID of this user role permission. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermission". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this user role permission. */
  var name: js.UndefOr[String] = js.undefined
  
  /** ID of the permission group that this user role permission belongs to. */
  var permissionGroupId: js.UndefOr[String] = js.undefined
}
object UserRolePermission {
  
  inline def apply(): UserRolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolePermission]
  }
  
  extension [Self <: UserRolePermission](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionGroupId(value: String): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
