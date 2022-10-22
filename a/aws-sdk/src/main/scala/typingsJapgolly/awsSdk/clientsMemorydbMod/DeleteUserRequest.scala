package typingsJapgolly.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The name of the user to delete
    */
  var UserName: typingsJapgolly.awsSdk.clientsMemorydbMod.UserName
}
object DeleteUserRequest {
  
  inline def apply(UserName: UserName): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  extension [Self <: DeleteUserRequest](x: Self) {
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
