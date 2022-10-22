package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserStackAssociation extends StObject {
  
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typingsJapgolly.awsSdk.clientsAppstreamMod.AuthenticationType
  
  /**
    * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
    */
  var SendEmailNotification: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: String
  
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username
}
object UserStackAssociation {
  
  inline def apply(AuthenticationType: AuthenticationType, StackName: String, UserName: Username): UserStackAssociation = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStackAssociation]
  }
  
  extension [Self <: UserStackAssociation](x: Self) {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setSendEmailNotification(value: Boolean): Self = StObject.set(x, "SendEmailNotification", value.asInstanceOf[js.Any])
    
    inline def setSendEmailNotificationUndefined: Self = StObject.set(x, "SendEmailNotification", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
