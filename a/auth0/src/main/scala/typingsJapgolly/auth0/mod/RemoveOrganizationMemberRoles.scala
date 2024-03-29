package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveOrganizationMemberRoles extends StObject {
  
  var roles: js.Array[String]
}
object RemoveOrganizationMemberRoles {
  
  inline def apply(roles: js.Array[String]): RemoveOrganizationMemberRoles = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOrganizationMemberRoles]
  }
  
  extension [Self <: RemoveOrganizationMemberRoles](x: Self) {
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
