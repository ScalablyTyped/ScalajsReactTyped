package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInputSettings extends StObject {
  
  /**
    * Specifies HLS input settings when the uri is for a HLS manifest.
    */
  var HlsInputSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.HlsInputSettings] = js.undefined
  
  /**
    * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error. This setting is ignored for protocols that do not use https.
    */
  var ServerValidation: js.UndefOr[NetworkInputServerValidation] = js.undefined
}
object NetworkInputSettings {
  
  inline def apply(): NetworkInputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInputSettings]
  }
  
  extension [Self <: NetworkInputSettings](x: Self) {
    
    inline def setHlsInputSettings(value: HlsInputSettings): Self = StObject.set(x, "HlsInputSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsInputSettingsUndefined: Self = StObject.set(x, "HlsInputSettings", js.undefined)
    
    inline def setServerValidation(value: NetworkInputServerValidation): Self = StObject.set(x, "ServerValidation", value.asInstanceOf[js.Any])
    
    inline def setServerValidationUndefined: Self = StObject.set(x, "ServerValidation", js.undefined)
  }
}
