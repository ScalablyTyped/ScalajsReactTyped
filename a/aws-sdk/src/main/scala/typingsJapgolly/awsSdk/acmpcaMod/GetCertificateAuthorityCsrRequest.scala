package typingsJapgolly.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityCsrRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority action. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
}

object GetCertificateAuthorityCsrRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): GetCertificateAuthorityCsrRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCertificateAuthorityCsrRequest]
  }
}

