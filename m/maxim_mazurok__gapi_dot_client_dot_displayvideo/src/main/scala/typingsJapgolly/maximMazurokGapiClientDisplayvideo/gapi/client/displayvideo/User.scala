package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /** The assigned user roles. Required in CreateUser. Output only in UpdateUser. Can only be updated through BulkEditAssignedUserRoles. */
  var assignedUserRoles: js.UndefOr[js.Array[AssignedUserRole]] = js.undefined
  
  /** Required. The display name of the user. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The email address used to identify the user. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the user. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the user. Assigned by the system. */
  var userId: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setAssignedUserRoles(value: js.Array[AssignedUserRole]): Self = StObject.set(x, "assignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserRolesUndefined: Self = StObject.set(x, "assignedUserRoles", js.undefined)
    
    inline def setAssignedUserRolesVarargs(value: AssignedUserRole*): Self = StObject.set(x, "assignedUserRoles", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
