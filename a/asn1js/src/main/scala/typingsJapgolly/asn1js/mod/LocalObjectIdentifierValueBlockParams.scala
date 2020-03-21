package typingsJapgolly.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalObjectIdentifierValueBlockParams extends LocalBaseBlockParams {
  var value: js.UndefOr[String] = js.undefined
}

object LocalObjectIdentifierValueBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    value: String = null,
    valueBeforeDecode: scala.scalajs.js.typedarray.ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalObjectIdentifierValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalObjectIdentifierValueBlockParams]
  }
}

