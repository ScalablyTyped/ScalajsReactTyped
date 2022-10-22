package typingsJapgolly.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the rights a user or group has to change objects */
trait ObjectPermissions extends StObject {
  
  /** The access rights for files */
  var file: ObjectOperationPermissions
  
  /** The access rights for objects */
  var `object`: ObjectOperationPermissions
  
  /** The access rights for states */
  var state: js.UndefOr[ObjectOperationPermissions] = js.undefined
  
  /** The access rights for users/groups */
  var users: ObjectOperationPermissions
}
object ObjectPermissions {
  
  inline def apply(
    file: ObjectOperationPermissions,
    `object`: ObjectOperationPermissions,
    users: ObjectOperationPermissions
  ): ObjectPermissions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPermissions]
  }
  
  extension [Self <: ObjectPermissions](x: Self) {
    
    inline def setFile(value: ObjectOperationPermissions): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObjectOperationPermissions): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setState(value: ObjectOperationPermissions): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUsers(value: ObjectOperationPermissions): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
