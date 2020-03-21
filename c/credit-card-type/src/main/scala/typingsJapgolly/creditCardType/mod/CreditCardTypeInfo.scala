package typingsJapgolly.creditCardType.mod

import typingsJapgolly.creditCardType.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardTypeInfo extends js.Object {
  var code: js.UndefOr[AnonName] = js.undefined
  var exactPattern: js.UndefOr[js.RegExp] = js.undefined
  var gaps: js.UndefOr[js.Array[Double]] = js.undefined
  var lengths: js.UndefOr[js.Array[Double]] = js.undefined
  var niceType: js.UndefOr[String] = js.undefined
  var prefixPattern: js.UndefOr[js.RegExp] = js.undefined
  var `type`: js.UndefOr[CardBrand] = js.undefined
}

object CreditCardTypeInfo {
  @scala.inline
  def apply(
    code: AnonName = null,
    exactPattern: js.RegExp = null,
    gaps: js.Array[Double] = null,
    lengths: js.Array[Double] = null,
    niceType: String = null,
    prefixPattern: js.RegExp = null,
    `type`: CardBrand = null
  ): CreditCardTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (exactPattern != null) __obj.updateDynamic("exactPattern")(exactPattern.asInstanceOf[js.Any])
    if (gaps != null) __obj.updateDynamic("gaps")(gaps.asInstanceOf[js.Any])
    if (lengths != null) __obj.updateDynamic("lengths")(lengths.asInstanceOf[js.Any])
    if (niceType != null) __obj.updateDynamic("niceType")(niceType.asInstanceOf[js.Any])
    if (prefixPattern != null) __obj.updateDynamic("prefixPattern")(prefixPattern.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardTypeInfo]
  }
}

