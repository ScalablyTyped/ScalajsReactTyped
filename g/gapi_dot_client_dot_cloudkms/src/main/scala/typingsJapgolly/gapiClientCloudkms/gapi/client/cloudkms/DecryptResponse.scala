package typingsJapgolly.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResponse extends js.Object {
  /** The decrypted data originally supplied in EncryptRequest.plaintext. */
  var plaintext: js.UndefOr[String] = js.undefined
}

object DecryptResponse {
  @scala.inline
  def apply(plaintext: String = null): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResponse]
  }
}

