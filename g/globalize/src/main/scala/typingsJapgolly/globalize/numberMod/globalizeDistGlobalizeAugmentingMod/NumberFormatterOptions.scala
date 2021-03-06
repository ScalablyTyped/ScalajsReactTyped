package typingsJapgolly.globalize.numberMod.globalizeDistGlobalizeAugmentingMod

import typingsJapgolly.globalize.globalizeMod.CommonNumberFormatterOptions
import typingsJapgolly.globalize.globalizeStrings.ceil
import typingsJapgolly.globalize.globalizeStrings.decimal
import typingsJapgolly.globalize.globalizeStrings.floor
import typingsJapgolly.globalize.globalizeStrings.long
import typingsJapgolly.globalize.globalizeStrings.percent
import typingsJapgolly.globalize.globalizeStrings.round
import typingsJapgolly.globalize.globalizeStrings.short
import typingsJapgolly.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatterOptions
  extends CommonNumberFormatterOptions
     with NumberParserOptions

object NumberFormatterOptions {
  @scala.inline
  def apply(
    compact: short | long = null,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    round: ceil | floor | round | truncate = null,
    style: decimal | percent = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): NumberFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatterOptions]
  }
}

