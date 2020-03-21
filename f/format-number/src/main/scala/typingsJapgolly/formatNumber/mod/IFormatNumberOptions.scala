package typingsJapgolly.formatNumber.mod

import typingsJapgolly.formatNumber.formatNumberStrings.brackets
import typingsJapgolly.formatNumber.formatNumberStrings.left
import typingsJapgolly.formatNumber.formatNumberStrings.none
import typingsJapgolly.formatNumber.formatNumberStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatNumberOptions extends js.Object {
  var decimal: js.UndefOr[String] = js.undefined
  var decimalsSeparator: js.UndefOr[String] = js.undefined
  var integerSeparator: js.UndefOr[String] = js.undefined
  var negativeLeftOut: js.UndefOr[Boolean] = js.undefined
  var negativeLeftSymbol: js.UndefOr[String] = js.undefined
  var negativeRightOut: js.UndefOr[Boolean] = js.undefined
  var negativeRightSymbol: js.UndefOr[String] = js.undefined
  var negativeType: js.UndefOr[right | left | brackets | none] = js.undefined
  var padLeft: js.UndefOr[Double] = js.undefined
  var padRight: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var round: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
}

object IFormatNumberOptions {
  @scala.inline
  def apply(
    decimal: String = null,
    decimalsSeparator: String = null,
    integerSeparator: String = null,
    negativeLeftOut: js.UndefOr[Boolean] = js.undefined,
    negativeLeftSymbol: String = null,
    negativeRightOut: js.UndefOr[Boolean] = js.undefined,
    negativeRightSymbol: String = null,
    negativeType: right | left | brackets | none = null,
    padLeft: Int | Double = null,
    padRight: Int | Double = null,
    prefix: String = null,
    round: Int | Double = null,
    suffix: String = null,
    truncate: Int | Double = null
  ): IFormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (decimalsSeparator != null) __obj.updateDynamic("decimalsSeparator")(decimalsSeparator.asInstanceOf[js.Any])
    if (integerSeparator != null) __obj.updateDynamic("integerSeparator")(integerSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeLeftOut)) __obj.updateDynamic("negativeLeftOut")(negativeLeftOut.asInstanceOf[js.Any])
    if (negativeLeftSymbol != null) __obj.updateDynamic("negativeLeftSymbol")(negativeLeftSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeRightOut)) __obj.updateDynamic("negativeRightOut")(negativeRightOut.asInstanceOf[js.Any])
    if (negativeRightSymbol != null) __obj.updateDynamic("negativeRightSymbol")(negativeRightSymbol.asInstanceOf[js.Any])
    if (negativeType != null) __obj.updateDynamic("negativeType")(negativeType.asInstanceOf[js.Any])
    if (padLeft != null) __obj.updateDynamic("padLeft")(padLeft.asInstanceOf[js.Any])
    if (padRight != null) __obj.updateDynamic("padRight")(padRight.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormatNumberOptions]
  }
}

