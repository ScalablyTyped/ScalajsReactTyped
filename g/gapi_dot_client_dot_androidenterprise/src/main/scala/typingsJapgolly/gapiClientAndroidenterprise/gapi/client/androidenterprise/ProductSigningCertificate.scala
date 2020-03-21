package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductSigningCertificate extends js.Object {
  /**
    * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is deprecated in favor of SHA2-256. It should not be used and may be removed at
    * any time.)
    */
  var certificateHashSha1: js.UndefOr[String] = js.undefined
  /** The base64 urlsafe encoded SHA2-256 hash of the certificate. */
  var certificateHashSha256: js.UndefOr[String] = js.undefined
}

object ProductSigningCertificate {
  @scala.inline
  def apply(certificateHashSha1: String = null, certificateHashSha256: String = null): ProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificateHashSha1 != null) __obj.updateDynamic("certificateHashSha1")(certificateHashSha1.asInstanceOf[js.Any])
    if (certificateHashSha256 != null) __obj.updateDynamic("certificateHashSha256")(certificateHashSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSigningCertificate]
  }
}

