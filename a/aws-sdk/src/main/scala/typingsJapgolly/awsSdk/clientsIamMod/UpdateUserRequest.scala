package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * New path for the IAM user. Include this parameter only if you're changing the user's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.undefined
  
  /**
    * New name for the user. Include this parameter only if you're changing the user's name. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var NewUserName: js.UndefOr[userNameType] = js.undefined
  
  /**
    * Name of the user to update. If you're changing the name of the user, this is the original user name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}
object UpdateUserRequest {
  
  inline def apply(UserName: existingUserNameType): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  extension [Self <: UpdateUserRequest](x: Self) {
    
    inline def setNewPath(value: pathType): Self = StObject.set(x, "NewPath", value.asInstanceOf[js.Any])
    
    inline def setNewPathUndefined: Self = StObject.set(x, "NewPath", js.undefined)
    
    inline def setNewUserName(value: userNameType): Self = StObject.set(x, "NewUserName", value.asInstanceOf[js.Any])
    
    inline def setNewUserNameUndefined: Self = StObject.set(x, "NewUserName", js.undefined)
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
