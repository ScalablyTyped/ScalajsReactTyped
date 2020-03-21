package typingsJapgolly.soap.wssecuritycertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWSSecurityCertOptions extends js.Object {
  var hasTimeStamp: js.UndefOr[Boolean] = js.undefined
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  var signatureTransformations: js.UndefOr[js.Array[String]] = js.undefined
  var signerOptions: js.UndefOr[IXmlSignerOptions] = js.undefined
}

object IWSSecurityCertOptions {
  @scala.inline
  def apply(
    hasTimeStamp: js.UndefOr[Boolean] = js.undefined,
    signatureAlgorithm: String = null,
    signatureTransformations: js.Array[String] = null,
    signerOptions: IXmlSignerOptions = null
  ): IWSSecurityCertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasTimeStamp)) __obj.updateDynamic("hasTimeStamp")(hasTimeStamp.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    if (signatureTransformations != null) __obj.updateDynamic("signatureTransformations")(signatureTransformations.asInstanceOf[js.Any])
    if (signerOptions != null) __obj.updateDynamic("signerOptions")(signerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWSSecurityCertOptions]
  }
}

