package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.ClientApp
import typingsJapgolly.invityApi.invityApiStrings.External
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepPhoneVerification
  extends StObject
     with SavingsStepEnabled {
  
  /**
    * Determines way of phone number verification.
    * - ClientApp - we are verify the user's phone number
    * - External - we provide the phone number to partner to be verified by the partner or externally
    */
  var phoneVerificationType: ClientApp | External
}
object SavingsStepPhoneVerification {
  
  inline def apply(isEnabled: Boolean, phoneVerificationType: ClientApp | External): SavingsStepPhoneVerification = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], phoneVerificationType = phoneVerificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepPhoneVerification]
  }
  
  extension [Self <: SavingsStepPhoneVerification](x: Self) {
    
    inline def setPhoneVerificationType(value: ClientApp | External): Self = StObject.set(x, "phoneVerificationType", value.asInstanceOf[js.Any])
  }
}
