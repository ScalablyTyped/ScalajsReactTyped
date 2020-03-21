package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInputSettings extends js.Object {
  /**
    * Specifies HLS input settings when the uri is for a HLS manifest.
    */
  var HlsInputSettings: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.HlsInputSettings] = js.native
  /**
    * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error. This setting is ignored for protocols that do not use https.
    */
  var ServerValidation: js.UndefOr[NetworkInputServerValidation] = js.native
}

object NetworkInputSettings {
  @scala.inline
  def apply(HlsInputSettings: HlsInputSettings = null, ServerValidation: NetworkInputServerValidation = null): NetworkInputSettings = {
    val __obj = js.Dynamic.literal()
    if (HlsInputSettings != null) __obj.updateDynamic("HlsInputSettings")(HlsInputSettings.asInstanceOf[js.Any])
    if (ServerValidation != null) __obj.updateDynamic("ServerValidation")(ServerValidation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInputSettings]
  }
}

