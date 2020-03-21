package typingsJapgolly.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCertificateResponse extends js.Object {
  /**
    * The certificate to be uploaded.
    */
  var Certificate: js.UndefOr[typingsJapgolly.awsSdk.dmsMod.Certificate] = js.native
}

object ImportCertificateResponse {
  @scala.inline
  def apply(Certificate: Certificate = null): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateResponse]
  }
}

