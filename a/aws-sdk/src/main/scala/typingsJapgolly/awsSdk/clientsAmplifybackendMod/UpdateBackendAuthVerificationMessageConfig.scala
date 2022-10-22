package typingsJapgolly.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthVerificationMessageConfig extends StObject {
  
  /**
    * The type of verification message to send.
    */
  var DeliveryMethod: typingsJapgolly.awsSdk.clientsAmplifybackendMod.DeliveryMethod
  
  /**
    * The settings for the email message.
    */
  var EmailSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.EmailSettings] = js.undefined
  
  /**
    * The settings for the SMS message.
    */
  var SmsSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.SmsSettings] = js.undefined
}
object UpdateBackendAuthVerificationMessageConfig {
  
  inline def apply(DeliveryMethod: DeliveryMethod): UpdateBackendAuthVerificationMessageConfig = {
    val __obj = js.Dynamic.literal(DeliveryMethod = DeliveryMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackendAuthVerificationMessageConfig]
  }
  
  extension [Self <: UpdateBackendAuthVerificationMessageConfig](x: Self) {
    
    inline def setDeliveryMethod(value: DeliveryMethod): Self = StObject.set(x, "DeliveryMethod", value.asInstanceOf[js.Any])
    
    inline def setEmailSettings(value: EmailSettings): Self = StObject.set(x, "EmailSettings", value.asInstanceOf[js.Any])
    
    inline def setEmailSettingsUndefined: Self = StObject.set(x, "EmailSettings", js.undefined)
    
    inline def setSmsSettings(value: SmsSettings): Self = StObject.set(x, "SmsSettings", value.asInstanceOf[js.Any])
    
    inline def setSmsSettingsUndefined: Self = StObject.set(x, "SmsSettings", js.undefined)
  }
}
