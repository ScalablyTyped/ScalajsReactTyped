package typingsJapgolly.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedSecret extends StObject {
  
  /**
    * ASCII representation of the secret
    */
  var ascii: String
  
  /**
    * Base32 representation of the secret
    */
  var base32: String
  
  /**
    * URL for the Google Authenticator otpauth
    * URL's QR code.
    *
    * @deprecated use a separate QR code library
    */
  var google_auth_qr: String
  
  /**
    * Hex representation of the secret
    */
  var hex: String
  
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  var otpauth_url: js.UndefOr[String] = js.undefined
  
  /**
    * URL for the QR code for the ASCII secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_ascii: js.UndefOr[String] = js.undefined
  
  /**
    * URL for the QR code for the base32 secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_base32: js.UndefOr[String] = js.undefined
  
  /**
    * URL for the QR code for the hex secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_hex: js.UndefOr[String] = js.undefined
}
object GeneratedSecret {
  
  inline def apply(ascii: String, base32: String, google_auth_qr: String, hex: String): GeneratedSecret = {
    val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], google_auth_qr = google_auth_qr.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSecret]
  }
  
  extension [Self <: GeneratedSecret](x: Self) {
    
    inline def setAscii(value: String): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
    
    inline def setBase32(value: String): Self = StObject.set(x, "base32", value.asInstanceOf[js.Any])
    
    inline def setGoogle_auth_qr(value: String): Self = StObject.set(x, "google_auth_qr", value.asInstanceOf[js.Any])
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setOtpauth_url(value: String): Self = StObject.set(x, "otpauth_url", value.asInstanceOf[js.Any])
    
    inline def setOtpauth_urlUndefined: Self = StObject.set(x, "otpauth_url", js.undefined)
    
    inline def setQr_code_ascii(value: String): Self = StObject.set(x, "qr_code_ascii", value.asInstanceOf[js.Any])
    
    inline def setQr_code_asciiUndefined: Self = StObject.set(x, "qr_code_ascii", js.undefined)
    
    inline def setQr_code_base32(value: String): Self = StObject.set(x, "qr_code_base32", value.asInstanceOf[js.Any])
    
    inline def setQr_code_base32Undefined: Self = StObject.set(x, "qr_code_base32", js.undefined)
    
    inline def setQr_code_hex(value: String): Self = StObject.set(x, "qr_code_hex", value.asInstanceOf[js.Any])
    
    inline def setQr_code_hexUndefined: Self = StObject.set(x, "qr_code_hex", js.undefined)
  }
}
