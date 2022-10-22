package typingsJapgolly.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRedRuntime.mod.UsernamePermissions
  - typingsJapgolly.nodeRedRuntime.mod.AnonymousPermissions
*/
trait User extends StObject
object User {
  
  inline def AnonymousPermissions(permissions: Permission | js.Array[Permission]): typingsJapgolly.nodeRedRuntime.mod.AnonymousPermissions = {
    val __obj = js.Dynamic.literal(anonymous = true, permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodeRedRuntime.mod.AnonymousPermissions]
  }
  
  inline def UsernamePermissions(permissions: Permission | js.Array[Permission], username: String): typingsJapgolly.nodeRedRuntime.mod.UsernamePermissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodeRedRuntime.mod.UsernamePermissions]
  }
}
