package typingsJapgolly.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionViewerCertificate extends js.Object {
  /**
    * The ARN of the [AWS Certificate Manager][6]
    * certificate that you wish to use with this distribution. Specify this,
    * `cloudfrontDefaultCertificate`, or `iamCertificateId`.  The ACM
    * certificate must be in  US-EAST-1.
    */
  var acmCertificateArn: js.UndefOr[String] = js.native
  /**
    * `true` if you want viewers to use HTTPS
    * to request your objects and you're using the CloudFront domain name for your
    * distribution. Specify this, `acmCertificateArn`, or `iamCertificateId`.
    */
  var cloudfrontDefaultCertificate: js.UndefOr[Boolean] = js.native
  /**
    * The IAM certificate identifier of the custom viewer
    * certificate for this distribution if you are using a custom domain. Specify
    * this, `acmCertificateArn`, or `cloudfrontDefaultCertificate`.
    */
  var iamCertificateId: js.UndefOr[String] = js.native
  /**
    * The minimum version of the SSL protocol that
    * you want CloudFront to use for HTTPS connections. Can only be set if
    * `cloudfrontDefaultCertificate = false`. One of `SSLv3`, `TLSv1`,
    * `TLSv1_2016`, `TLSv1.1_2016` or `TLSv1.2_2018`. Default: `TLSv1`. **NOTE**:
    * If you are using a custom certificate (specified with `acmCertificateArn`
    * or `iamCertificateId`), and have specified `sni-only` in
    * `sslSupportMethod`, `TLSv1` or later must be specified. If you have
    * specified `vip` in `sslSupportMethod`, only `SSLv3` or `TLSv1` can be
    * specified. If you have specified `cloudfrontDefaultCertificate`, `TLSv1`
    * must be specified.
    */
  var minimumProtocolVersion: js.UndefOr[String] = js.native
  var sslSupportMethod: js.UndefOr[String] = js.native
}

object DistributionViewerCertificate {
  @scala.inline
  def apply(
    acmCertificateArn: String = null,
    cloudfrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
    iamCertificateId: String = null,
    minimumProtocolVersion: String = null,
    sslSupportMethod: String = null
  ): DistributionViewerCertificate = {
    val __obj = js.Dynamic.literal()
    if (acmCertificateArn != null) __obj.updateDynamic("acmCertificateArn")(acmCertificateArn.asInstanceOf[js.Any])
    if (!js.isUndefined(cloudfrontDefaultCertificate)) __obj.updateDynamic("cloudfrontDefaultCertificate")(cloudfrontDefaultCertificate.asInstanceOf[js.Any])
    if (iamCertificateId != null) __obj.updateDynamic("iamCertificateId")(iamCertificateId.asInstanceOf[js.Any])
    if (minimumProtocolVersion != null) __obj.updateDynamic("minimumProtocolVersion")(minimumProtocolVersion.asInstanceOf[js.Any])
    if (sslSupportMethod != null) __obj.updateDynamic("sslSupportMethod")(sslSupportMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionViewerCertificate]
  }
}

