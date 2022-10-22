package typingsJapgolly.reactIntl.anon

import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsSignDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.RoundingModeType
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.RoundingPriorityType
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.TrailingZeroDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.UseGroupingType
import typingsJapgolly.reactIntl.reactIntlStrings.compact
import typingsJapgolly.reactIntl.reactIntlStrings.engineering
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.scientific
import typingsJapgolly.reactIntl.reactIntlStrings.short
import typingsJapgolly.reactIntl.reactIntlStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.NumberFormatOptions, 'localeMatcher'> */
trait OmitNumberFormatOptionslo extends StObject {
  
  var compactDisplay: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay]
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay]
  
  var currencySign: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign]
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation]
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var roundingIncrement: js.UndefOr[Double] = js.undefined
  
  var roundingMode: js.UndefOr[RoundingModeType] = js.undefined
  
  var roundingPriority: js.UndefOr[RoundingPriorityType] = js.undefined
  
  var signDisplay: js.UndefOr[NumberFormatOptionsSignDisplay] = js.undefined
  
  var style: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle]
  
  var trailingZeroDisplay: js.UndefOr[TrailingZeroDisplay] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]
  
  var useGrouping: js.UndefOr[UseGroupingType] = js.undefined
}
object OmitNumberFormatOptionslo {
  
  inline def apply(
    compactDisplay: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay],
    currencyDisplay: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    currencySign: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign],
    notation: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation],
    style: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle],
    unitDisplay: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]
  ): OmitNumberFormatOptionslo = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitNumberFormatOptionslo]
  }
  
  extension [Self <: OmitNumberFormatOptionslo](x: Self) {
    
    inline def setCompactDisplay(value: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay]): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay]): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencySign(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign]): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(
      value: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation]
    ): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setRoundingIncrement(value: Double): Self = StObject.set(x, "roundingIncrement", value.asInstanceOf[js.Any])
    
    inline def setRoundingIncrementUndefined: Self = StObject.set(x, "roundingIncrement", js.undefined)
    
    inline def setRoundingMode(value: RoundingModeType): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
    
    inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
    
    inline def setRoundingPriority(value: RoundingPriorityType): Self = StObject.set(x, "roundingPriority", value.asInstanceOf[js.Any])
    
    inline def setRoundingPriorityUndefined: Self = StObject.set(x, "roundingPriority", js.undefined)
    
    inline def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    inline def setStyle(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTrailingZeroDisplay(value: TrailingZeroDisplay): Self = StObject.set(x, "trailingZeroDisplay", value.asInstanceOf[js.Any])
    
    inline def setTrailingZeroDisplayUndefined: Self = StObject.set(x, "trailingZeroDisplay", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: UseGroupingType): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
