package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines access rights for a single file */
trait FileACL extends StObject {
  
  /** Full name of the user who owns this file, e.g. "system.user.admin" */
  var owner: String
  
  /** Full name of the group who owns this file, e.g. "system.group.administrator" */
  var ownerGroup: String
  
  /** Linux-type permissions defining access to this file */
  var permissions: Double
}
object FileACL {
  
  inline def apply(owner: String, ownerGroup: String, permissions: Double): FileACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileACL]
  }
  
  extension [Self <: FileACL](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerGroup(value: String): Self = StObject.set(x, "ownerGroup", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Double): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
  }
}
