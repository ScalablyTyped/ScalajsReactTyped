package typingsJapgolly.pulumiAws.domainNameMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameState extends js.Object {
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate issued for the domain name
    * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
    * `regionalCertificateName`.
    */
  val certificateBody: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate for the CA that issued the
    * certificate, along with any intermediate CA certificates required to
    * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
    * `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * The unique name to use when registering this
    * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
    * `regionalCertificateName`. Required if `certificateArn` is not set.
    */
  val certificateName: js.UndefOr[Input[String]] = js.native
  /**
    * The private key associated with the
    * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificatePrivateKey: js.UndefOr[Input[String]] = js.native
  /**
    * The upload date associated with the domain certificate.
    */
  val certificateUploadDate: js.UndefOr[Input[String]] = js.native
  /**
    * The hostname created by Cloudfront to represent
    * the distribution that implements this domain name mapping.
    */
  val cloudfrontDomainName: js.UndefOr[Input[String]] = js.native
  /**
    * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
    * that can be used to create a Route53 alias record for the distribution.
    */
  val cloudfrontZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The fully-qualified domain name to register
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block defining API endpoint information including type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[DomainNameEndpointConfiguration]] = js.native
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
    */
  val regionalCertificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
    * `certificatePrivateKey`.
    */
  val regionalCertificateName: js.UndefOr[Input[String]] = js.native
  /**
    * The hostname for the custom domain's regional endpoint.
    */
  val regionalDomainName: js.UndefOr[Input[String]] = js.native
  /**
    * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
    */
  val regionalZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
    */
  val securityPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DomainNameState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificateArn: Input[String] = null,
    certificateBody: Input[String] = null,
    certificateChain: Input[String] = null,
    certificateName: Input[String] = null,
    certificatePrivateKey: Input[String] = null,
    certificateUploadDate: Input[String] = null,
    cloudfrontDomainName: Input[String] = null,
    cloudfrontZoneId: Input[String] = null,
    domainName: Input[String] = null,
    endpointConfiguration: Input[DomainNameEndpointConfiguration] = null,
    regionalCertificateArn: Input[String] = null,
    regionalCertificateName: Input[String] = null,
    regionalDomainName: Input[String] = null,
    regionalZoneId: Input[String] = null,
    securityPolicy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): DomainNameState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName.asInstanceOf[js.Any])
    if (certificatePrivateKey != null) __obj.updateDynamic("certificatePrivateKey")(certificatePrivateKey.asInstanceOf[js.Any])
    if (certificateUploadDate != null) __obj.updateDynamic("certificateUploadDate")(certificateUploadDate.asInstanceOf[js.Any])
    if (cloudfrontDomainName != null) __obj.updateDynamic("cloudfrontDomainName")(cloudfrontDomainName.asInstanceOf[js.Any])
    if (cloudfrontZoneId != null) __obj.updateDynamic("cloudfrontZoneId")(cloudfrontZoneId.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration.asInstanceOf[js.Any])
    if (regionalCertificateArn != null) __obj.updateDynamic("regionalCertificateArn")(regionalCertificateArn.asInstanceOf[js.Any])
    if (regionalCertificateName != null) __obj.updateDynamic("regionalCertificateName")(regionalCertificateName.asInstanceOf[js.Any])
    if (regionalDomainName != null) __obj.updateDynamic("regionalDomainName")(regionalDomainName.asInstanceOf[js.Any])
    if (regionalZoneId != null) __obj.updateDynamic("regionalZoneId")(regionalZoneId.asInstanceOf[js.Any])
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameState]
  }
}

