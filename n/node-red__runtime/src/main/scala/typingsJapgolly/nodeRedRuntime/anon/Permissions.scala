package typingsJapgolly.nodeRedRuntime.anon

import typingsJapgolly.nodeRedRuntime.mod.Permission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissions extends StObject {
  
  var permissions: Permission | js.Array[Permission]
}
object Permissions {
  
  inline def apply(permissions: Permission | js.Array[Permission]): Permissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  
  extension [Self <: Permissions](x: Self) {
    
    inline def setPermissions(value: Permission | js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
