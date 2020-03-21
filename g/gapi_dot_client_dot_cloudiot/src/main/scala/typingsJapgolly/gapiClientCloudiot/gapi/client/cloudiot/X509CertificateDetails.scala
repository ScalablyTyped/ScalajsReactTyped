package typingsJapgolly.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X509CertificateDetails extends js.Object {
  /** The time the certificate becomes invalid. */
  var expiryTime: js.UndefOr[String] = js.undefined
  /** The entity that signed the certificate. */
  var issuer: js.UndefOr[String] = js.undefined
  /** The type of public key in the certificate. */
  var publicKeyType: js.UndefOr[String] = js.undefined
  /** The algorithm used to sign the certificate. */
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  /** The time the certificate becomes valid. */
  var startTime: js.UndefOr[String] = js.undefined
  /** The entity the certificate and public key belong to. */
  var subject: js.UndefOr[String] = js.undefined
}

object X509CertificateDetails {
  @scala.inline
  def apply(
    expiryTime: String = null,
    issuer: String = null,
    publicKeyType: String = null,
    signatureAlgorithm: String = null,
    startTime: String = null,
    subject: String = null
  ): X509CertificateDetails = {
    val __obj = js.Dynamic.literal()
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (publicKeyType != null) __obj.updateDynamic("publicKeyType")(publicKeyType.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateDetails]
  }
}

