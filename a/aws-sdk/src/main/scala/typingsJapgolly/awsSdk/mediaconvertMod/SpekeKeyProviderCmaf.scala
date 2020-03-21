package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpekeKeyProviderCmaf extends js.Object {
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[stringPatternArnAwsUsGovAcm] = js.native
  /**
    * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var DashSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  /**
    * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var HlsSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[stringPatternW] = js.native
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[stringPatternHttps] = js.native
}

object SpekeKeyProviderCmaf {
  @scala.inline
  def apply(
    CertificateArn: stringPatternArnAwsUsGovAcm = null,
    DashSignaledSystemIds: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = null,
    HlsSignaledSystemIds: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = null,
    ResourceId: stringPatternW = null,
    Url: stringPatternHttps = null
  ): SpekeKeyProviderCmaf = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (DashSignaledSystemIds != null) __obj.updateDynamic("DashSignaledSystemIds")(DashSignaledSystemIds.asInstanceOf[js.Any])
    if (HlsSignaledSystemIds != null) __obj.updateDynamic("HlsSignaledSystemIds")(HlsSignaledSystemIds.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProviderCmaf]
  }
}

