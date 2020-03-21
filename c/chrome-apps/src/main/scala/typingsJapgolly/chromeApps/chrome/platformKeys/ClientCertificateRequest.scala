package typingsJapgolly.chromeApps.chrome.platformKeys

import typingsJapgolly.chromeApps.AnonECDSASIGN
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.ecdsaSign
import typingsJapgolly.chromeApps.chromeAppsStrings.rsaSign
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Analogous to TLS1.1's CertificateRequest.
  * @see{@link http://tools.ietf.org/html/rfc4346#section-7.4.4}
  */
trait ClientCertificateRequest extends js.Object {
  /**
    * List of distinguished names of certificate authorities allowed by the
    * server. Each entry must be a DER-encoded X.509 DistinguishedName.
    */
  var certificateAuthorities: js.Array[scala.scalajs.js.typedarray.ArrayBuffer]
  /**
    * This field is a list of the types of certificates requested, sorted in
    * order of the server's preference. Only certificates of a type contained
    * in this list will be retrieved. If *certificateTypes* is the
    * empty list, however, certificates of any type will be returned.
    * @see ClientCertificateType
    */
  var certificateTypes: js.Array[ToStringLiteral[AnonECDSASIGN, String, Exclude[String, rsaSign | ecdsaSign]]]
}

object ClientCertificateRequest {
  @scala.inline
  def apply(
    certificateAuthorities: js.Array[scala.scalajs.js.typedarray.ArrayBuffer],
    certificateTypes: js.Array[ToStringLiteral[AnonECDSASIGN, String, Exclude[String, rsaSign | ecdsaSign]]]
  ): ClientCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientCertificateRequest]
  }
}

