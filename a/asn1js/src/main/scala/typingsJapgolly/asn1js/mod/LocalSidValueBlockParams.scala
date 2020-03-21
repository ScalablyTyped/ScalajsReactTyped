package typingsJapgolly.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSidValueBlockParams extends LocalHexBlockParams {
  var isFirstSid: js.UndefOr[scala.Boolean] = js.undefined
  var valueDec: js.UndefOr[Double] = js.undefined
}

object LocalSidValueBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isFirstSid: js.UndefOr[scala.Boolean] = js.undefined,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    valueBeforeDecode: scala.scalajs.js.typedarray.ArrayBuffer = null,
    valueDec: Int | Double = null,
    valueHex: scala.scalajs.js.typedarray.ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstSid)) __obj.updateDynamic("isFirstSid")(isFirstSid.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueDec != null) __obj.updateDynamic("valueDec")(valueDec.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
}

