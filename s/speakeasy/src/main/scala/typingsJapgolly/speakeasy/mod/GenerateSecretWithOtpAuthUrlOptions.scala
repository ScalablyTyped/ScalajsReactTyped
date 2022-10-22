package typingsJapgolly.speakeasy.mod

import typingsJapgolly.speakeasy.speakeasyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSecretWithOtpAuthUrlOptions
  extends StObject
     with GenerateSecretOptions {
  
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  @JSName("otpauth_url")
  var otpauth_url_GenerateSecretWithOtpAuthUrlOptions: `true`
}
object GenerateSecretWithOtpAuthUrlOptions {
  
  inline def apply(): GenerateSecretWithOtpAuthUrlOptions = {
    val __obj = js.Dynamic.literal(otpauth_url = true)
    __obj.asInstanceOf[GenerateSecretWithOtpAuthUrlOptions]
  }
  
  extension [Self <: GenerateSecretWithOtpAuthUrlOptions](x: Self) {
    
    inline def setOtpauth_url(value: `true`): Self = StObject.set(x, "otpauth_url", value.asInstanceOf[js.Any])
  }
}
