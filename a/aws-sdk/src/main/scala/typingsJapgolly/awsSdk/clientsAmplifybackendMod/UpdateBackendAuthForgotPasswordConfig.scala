package typingsJapgolly.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthForgotPasswordConfig extends StObject {
  
  /**
    * (DEPRECATED) Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover their password.
    */
  var DeliveryMethod: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.DeliveryMethod] = js.undefined
  
  /**
    * (DEPRECATED) The configuration for the email sent when an app user forgets their password.
    */
  var EmailSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.EmailSettings] = js.undefined
  
  /**
    * (DEPRECATED) The configuration for the SMS message sent when an Amplify app user forgets their password.
    */
  var SmsSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.SmsSettings] = js.undefined
}
object UpdateBackendAuthForgotPasswordConfig {
  
  inline def apply(): UpdateBackendAuthForgotPasswordConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendAuthForgotPasswordConfig]
  }
  
  extension [Self <: UpdateBackendAuthForgotPasswordConfig](x: Self) {
    
    inline def setDeliveryMethod(value: DeliveryMethod): Self = StObject.set(x, "DeliveryMethod", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMethodUndefined: Self = StObject.set(x, "DeliveryMethod", js.undefined)
    
    inline def setEmailSettings(value: EmailSettings): Self = StObject.set(x, "EmailSettings", value.asInstanceOf[js.Any])
    
    inline def setEmailSettingsUndefined: Self = StObject.set(x, "EmailSettings", js.undefined)
    
    inline def setSmsSettings(value: SmsSettings): Self = StObject.set(x, "SmsSettings", value.asInstanceOf[js.Any])
    
    inline def setSmsSettingsUndefined: Self = StObject.set(x, "SmsSettings", js.undefined)
  }
}
