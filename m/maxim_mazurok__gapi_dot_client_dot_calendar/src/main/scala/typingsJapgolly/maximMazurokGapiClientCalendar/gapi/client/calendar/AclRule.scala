package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclRule extends StObject {
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Identifier of the Access Control List (ACL) rule. See Sharing calendars. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Type of the resource ("calendar#aclRule"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The role assigned to the scope. Possible values are:
    * - "none" - Provides no access.
    * - "freeBusyReader" - Provides read access to free/busy information.
    * - "reader" - Provides read access to the calendar. Private events will appear to users with reader access, but event details will be hidden.
    * - "writer" - Provides read and write access to the calendar. Private events will appear to users with writer access, and event details will be visible.
    * - "owner" - Provides ownership of the calendar. This role has all of the permissions of the writer role with the additional ability to see and manipulate ACLs.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /** The extent to which calendar access is granted by this ACL rule. */
  var scope: js.UndefOr[Type] = js.undefined
}
object AclRule {
  
  inline def apply(): AclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AclRule]
  }
  
  extension [Self <: AclRule](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setScope(value: Type): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
