package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserGroupMessage extends StObject {
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: String
}
object DeleteUserGroupMessage {
  
  inline def apply(UserGroupId: String): DeleteUserGroupMessage = {
    val __obj = js.Dynamic.literal(UserGroupId = UserGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserGroupMessage]
  }
  
  extension [Self <: DeleteUserGroupMessage](x: Self) {
    
    inline def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
  }
}
