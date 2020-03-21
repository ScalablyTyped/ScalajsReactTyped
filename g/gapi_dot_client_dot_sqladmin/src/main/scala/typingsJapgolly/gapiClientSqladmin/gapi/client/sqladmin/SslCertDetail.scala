package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertDetail extends js.Object {
  /** The public information about the cert. */
  var certInfo: js.UndefOr[SslCert] = js.undefined
  /** The private key for the client cert, in pem format. Keep private in order to protect your security. */
  var certPrivateKey: js.UndefOr[String] = js.undefined
}

object SslCertDetail {
  @scala.inline
  def apply(certInfo: SslCert = null, certPrivateKey: String = null): SslCertDetail = {
    val __obj = js.Dynamic.literal()
    if (certInfo != null) __obj.updateDynamic("certInfo")(certInfo.asInstanceOf[js.Any])
    if (certPrivateKey != null) __obj.updateDynamic("certPrivateKey")(certPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslCertDetail]
  }
}

