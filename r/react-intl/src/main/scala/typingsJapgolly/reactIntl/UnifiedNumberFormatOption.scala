package typingsJapgolly.reactIntl

import typingsJapgolly.formatjsIntlUnifiedNumberformat.mod.Unit
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsLocaleMatcher
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions & react-intl.react-intl.CustomFormatConfig & {  value  :number} */
trait UnifiedNumberFormatOption extends js.Object {
  var compactDisplay: js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: js.UndefOr[String with UnifiedNumberFormatOptionsCurrencyDisplay] = js.undefined
  var currencySign: js.UndefOr[UnifiedNumberFormatOptionsCurrencySign] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var localeMatcher: js.UndefOr[String with UnifiedNumberFormatOptionsLocaleMatcher] = js.undefined
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var notation: js.UndefOr[UnifiedNumberFormatOptionsNotation] = js.undefined
  var signDisplay: js.UndefOr[UnifiedNumberFormatOptionsSignDisplay] = js.undefined
  var style: js.UndefOr[String with UnifiedNumberFormatOptionsStyle] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay] = js.undefined
  var useGrouping: js.UndefOr[Boolean] = js.undefined
  var value: Double
}

object UnifiedNumberFormatOption {
  @scala.inline
  def apply(
    value: Double,
    compactDisplay: UnifiedNumberFormatOptionsCompactDisplay = null,
    currency: String = null,
    currencyDisplay: String with UnifiedNumberFormatOptionsCurrencyDisplay = null,
    currencySign: UnifiedNumberFormatOptionsCurrencySign = null,
    format: String = null,
    localeMatcher: String with UnifiedNumberFormatOptionsLocaleMatcher = null,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    notation: UnifiedNumberFormatOptionsNotation = null,
    signDisplay: UnifiedNumberFormatOptionsSignDisplay = null,
    style: String with UnifiedNumberFormatOptionsStyle = null,
    unit: Unit = null,
    unitDisplay: UnifiedNumberFormatOptionsUnitDisplay = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): UnifiedNumberFormatOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatOption]
  }
}

