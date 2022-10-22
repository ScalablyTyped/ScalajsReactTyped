package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdentityHeadersInNotificationsEnabledRequest extends StObject {
  
  /**
    * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified notification type. A value of true specifies that Amazon SES will include headers in notifications, and a value of false specifies that Amazon SES will not include headers in notifications. This value can only be set when NotificationType is already set to use a particular Amazon SNS topic.
    */
  var Enabled: typingsJapgolly.awsSdk.clientsSesMod.Enabled
  
  /**
    * The identity for which to enable or disable headers in notifications. Examples: user@example.com, example.com.
    */
  var Identity: typingsJapgolly.awsSdk.clientsSesMod.Identity
  
  /**
    * The notification type for which to enable or disable headers in notifications. 
    */
  var NotificationType: typingsJapgolly.awsSdk.clientsSesMod.NotificationType
}
object SetIdentityHeadersInNotificationsEnabledRequest {
  
  inline def apply(Enabled: Enabled, Identity: Identity, NotificationType: NotificationType): SetIdentityHeadersInNotificationsEnabledRequest = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
  }
  
  extension [Self <: SetIdentityHeadersInNotificationsEnabledRequest](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
  }
}
