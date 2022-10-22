package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoleDescriptionResponse extends StObject {
  
  /**
    * A structure that contains details about the modified role.
    */
  var Role: js.UndefOr[typingsJapgolly.awsSdk.clientsIamMod.Role] = js.undefined
}
object UpdateRoleDescriptionResponse {
  
  inline def apply(): UpdateRoleDescriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoleDescriptionResponse]
  }
  
  extension [Self <: UpdateRoleDescriptionResponse](x: Self) {
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
