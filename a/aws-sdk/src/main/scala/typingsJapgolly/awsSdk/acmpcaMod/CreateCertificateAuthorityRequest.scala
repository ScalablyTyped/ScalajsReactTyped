package typingsJapgolly.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateAuthorityRequest extends js.Object {
  /**
    * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject information.
    */
  var CertificateAuthorityConfiguration: typingsJapgolly.awsSdk.acmpcaMod.CertificateAuthorityConfiguration = js.native
  /**
    * The type of the certificate authority.
    */
  var CertificateAuthorityType: typingsJapgolly.awsSdk.acmpcaMod.CertificateAuthorityType = js.native
  /**
    * Alphanumeric string that can be used to distinguish between calls to CreateCertificateAuthority. Idempotency tokens time out after five minutes. Therefore, if you call CreateCertificateAuthority multiple times with the same idempotency token within a five minute period, ACM Private CA recognizes that you are requesting only one certificate. As a result, ACM Private CA issues only one. If you change the idempotency token for each call, however, ACM Private CA recognizes that you are requesting multiple certificates.
    */
  var IdempotencyToken: js.UndefOr[typingsJapgolly.awsSdk.acmpcaMod.IdempotencyToken] = js.native
  /**
    * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of the S3 bucket to which ACM Private CA will write the CRL, and an optional CNAME alias that you can use to hide the name of your bucket in the CRL Distribution Points extension of your CA certificate. For more information, see the CrlConfiguration structure. 
    */
  var RevocationConfiguration: js.UndefOr[typingsJapgolly.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
  /**
    * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA. For information using tags with  IAM to manage permissions, see Controlling Access Using IAM Tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateCertificateAuthorityRequest {
  @scala.inline
  def apply(
    CertificateAuthorityConfiguration: CertificateAuthorityConfiguration,
    CertificateAuthorityType: CertificateAuthorityType,
    IdempotencyToken: IdempotencyToken = null,
    RevocationConfiguration: RevocationConfiguration = null,
    Tags: TagList = null
  ): CreateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityConfiguration = CertificateAuthorityConfiguration.asInstanceOf[js.Any], CertificateAuthorityType = CertificateAuthorityType.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (RevocationConfiguration != null) __obj.updateDynamic("RevocationConfiguration")(RevocationConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityRequest]
  }
}

