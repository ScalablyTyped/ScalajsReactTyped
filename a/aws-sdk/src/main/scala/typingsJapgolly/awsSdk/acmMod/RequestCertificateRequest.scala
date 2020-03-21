package typingsJapgolly.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCertificateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt to issue a public certificate. For more information about private CAs, see the AWS Certificate Manager Private Certificate Authority (PCA) user guide. The ARN must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    *  Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.   The first domain name you enter cannot exceed 64 octets, including periods. Each subsequent Subject Alternative Name (SAN), however, can be up to 253 octets in length. 
    */
  var DomainName: DomainNameString = js.native
  /**
    * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
    */
  var DomainValidationOptions: js.UndefOr[DomainValidationOptionList] = js.native
  /**
    * Customer chosen string that can be used to distinguish between calls to RequestCertificate. Idempotency tokens time out after one hour. Therefore, if you call RequestCertificate multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting multiple certificates.
    */
  var IdempotencyToken: js.UndefOr[typingsJapgolly.awsSdk.acmMod.IdempotencyToken] = js.native
  /**
    * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For more information, see Opting Out of Certificate Transparency Logging.
    */
  var Options: js.UndefOr[CertificateOptions] = js.native
  /**
    * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example, add the name www.example.net to a certificate for which the DomainName field is www.example.com if users can reach your site by using either name. The maximum number of domain names that you can add to an ACM certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must request a limit increase. For more information, see Limits.  The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods. No label can be longer than 63 octets. Consider the following examples:     (63 octets).(63 octets).(63 octets).(61 octets) is legal because the total length is 253 octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.    (64 octets).(63 octets).(63 octets).(61 octets) is not legal because the total length exceeds 253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.    (63 octets).(63 octets).(63 octets).(62 octets) is not legal because the total length of the DNS name (63+1+63+1+63+1+62) exceeds 253 octets.  
    */
  var SubjectAlternativeNames: js.UndefOr[DomainList] = js.native
  /**
    * One or more resource tags to associate with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The method you want to use if you are requesting a public certificate to validate that you own or control domain. You can validate with DNS or validate with email. We recommend that you use DNS validation. 
    */
  var ValidationMethod: js.UndefOr[typingsJapgolly.awsSdk.acmMod.ValidationMethod] = js.native
}

object RequestCertificateRequest {
  @scala.inline
  def apply(
    DomainName: DomainNameString,
    CertificateAuthorityArn: Arn = null,
    DomainValidationOptions: DomainValidationOptionList = null,
    IdempotencyToken: IdempotencyToken = null,
    Options: CertificateOptions = null,
    SubjectAlternativeNames: DomainList = null,
    Tags: TagList = null,
    ValidationMethod: ValidationMethod = null
  ): RequestCertificateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn.asInstanceOf[js.Any])
    if (DomainValidationOptions != null) __obj.updateDynamic("DomainValidationOptions")(DomainValidationOptions.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (SubjectAlternativeNames != null) __obj.updateDynamic("SubjectAlternativeNames")(SubjectAlternativeNames.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (ValidationMethod != null) __obj.updateDynamic("ValidationMethod")(ValidationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCertificateRequest]
  }
}

