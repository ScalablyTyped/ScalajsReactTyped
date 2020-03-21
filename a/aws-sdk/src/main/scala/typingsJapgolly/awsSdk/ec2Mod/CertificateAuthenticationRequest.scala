package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthenticationRequest extends js.Object {
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM).
    */
  var ClientRootCertificateChainArn: js.UndefOr[String] = js.native
}

object CertificateAuthenticationRequest {
  @scala.inline
  def apply(ClientRootCertificateChainArn: String = null): CertificateAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientRootCertificateChainArn != null) __obj.updateDynamic("ClientRootCertificateChainArn")(ClientRootCertificateChainArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthenticationRequest]
  }
}

