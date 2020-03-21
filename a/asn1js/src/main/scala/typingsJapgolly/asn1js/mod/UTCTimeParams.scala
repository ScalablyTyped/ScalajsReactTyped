package typingsJapgolly.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UTCTimeParams extends LocalHexBlockParams {
  var value: js.UndefOr[String] = js.undefined
  var valueDate: js.UndefOr[js.Date] = js.undefined
}

object UTCTimeParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    value: String = null,
    valueBeforeDecode: scala.scalajs.js.typedarray.ArrayBuffer = null,
    valueDate: js.Date = null,
    valueHex: scala.scalajs.js.typedarray.ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): UTCTimeParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueDate != null) __obj.updateDynamic("valueDate")(valueDate.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UTCTimeParams]
  }
}

