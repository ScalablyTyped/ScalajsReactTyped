package typingsJapgolly.formatjsIntlUnifiedNumberformat.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberFormatRoundingType
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberILD
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberLocalePatternData
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import typingsJapgolly.std.Intl.PluralRules
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedNumberFormatInternal extends NumberFormatDigitInternalSlots {
  var boundFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  var compactDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]]
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]]
  var currencySign: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]]
  var dataLocale: String
  var ild: NumberILD
  var locale: String
  @JSName("notation")
  var notation_UnifiedNumberFormatInternal: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]]
  var numberingSystem: String
  var patterns: NumberLocalePatternData
  var pl: PluralRules
  var signDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]]
  var style: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]]
  var unit: js.UndefOr[String] = js.undefined
  var unitDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]]
  var useGrouping: Boolean
}

object UnifiedNumberFormatInternal {
  @scala.inline
  def apply(
    currencyDisplay: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsCurrencyDisplay]],
    dataLocale: String,
    ild: NumberILD,
    locale: String,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    patterns: NumberLocalePatternData,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    style: NonNullable[js.UndefOr[String] with js.UndefOr[UnifiedNumberFormatOptionsStyle]],
    useGrouping: Boolean,
    boundFormat: /* value */ Double => CallbackTo[String] = null,
    compactDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay]] = null,
    currency: String = null,
    currencySign: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsCurrencySign]] = null,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    notation: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsNotation]] = null,
    signDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsSignDisplay]] = null,
    unit: String = null,
    unitDisplay: NonNullable[js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay]] = null
  ): UnifiedNumberFormatInternal = {
    val __obj = js.Dynamic.literal(currencyDisplay = currencyDisplay.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], ild = ild.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    if (boundFormat != null) __obj.updateDynamic("boundFormat")(js.Any.fromFunction1((t0: /* value */ scala.Double) => boundFormat(t0).runNow()))
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatInternal]
  }
}

