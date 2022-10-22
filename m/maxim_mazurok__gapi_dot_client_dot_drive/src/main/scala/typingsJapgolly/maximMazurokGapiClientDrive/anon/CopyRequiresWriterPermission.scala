package typingsJapgolly.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyRequiresWriterPermission extends StObject {
  
  /** Whether administrative privileges on this Team Drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the options to copy, print, or download files inside this Team Drive, should be disabled for readers and commenters. When this restriction is set to true, it will
    * override the similarly named field to true for any file inside this Team Drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether access to this Team Drive and items inside this Team Drive is restricted to users of the domain to which this Team Drive belongs. This restriction may be overridden by
    * other sharing policies controlled outside of this Team Drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Whether access to items inside this Team Drive is restricted to members of this Team Drive. */
  var teamMembersOnly: js.UndefOr[Boolean] = js.undefined
}
object CopyRequiresWriterPermission {
  
  inline def apply(): CopyRequiresWriterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyRequiresWriterPermission]
  }
  
  extension [Self <: CopyRequiresWriterPermission](x: Self) {
    
    inline def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
    
    inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    inline def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
    
    inline def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
    
    inline def setTeamMembersOnly(value: Boolean): Self = StObject.set(x, "teamMembersOnly", value.asInstanceOf[js.Any])
    
    inline def setTeamMembersOnlyUndefined: Self = StObject.set(x, "teamMembersOnly", js.undefined)
  }
}
