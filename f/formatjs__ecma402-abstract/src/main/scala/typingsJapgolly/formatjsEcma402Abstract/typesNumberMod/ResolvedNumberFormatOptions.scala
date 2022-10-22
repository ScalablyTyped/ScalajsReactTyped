package typingsJapgolly.formatjsEcma402Abstract.typesNumberMod

import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.always
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.auto
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.compact
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.engineering
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.exceptZero
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.never
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.scientific
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Intl.ResolvedNumberFormatOptions & std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/number.NumberFormatInternal, 'currencySign' | 'unit' | 'unitDisplay' | 'notation' | 'compactDisplay' | 'signDisplay'> */
trait ResolvedNumberFormatOptions extends StObject {
  
  /* standard es2020.intl */
  var compactDisplay: (js.UndefOr[short | long]) & NumberFormatOptionsCompactDisplay
  
  /* standard es5 */
  var currency: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var currencySign: js.UndefOr[String] & NumberFormatOptionsCurrencySign
  
  /* standard es5 */
  var locale: String
  
  /* standard es5 */
  var maximumFractionDigits: Double
  
  /* standard es5 */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumFractionDigits: Double
  
  /* standard es5 */
  var minimumIntegerDigits: Double
  
  /* standard es5 */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2020.intl */
  var notation: (js.UndefOr[standard | scientific | engineering | compact]) & NumberFormatOptionsNotation
  
  /* standard es5 */
  var numberingSystem: String
  
  /* standard es2020.intl */
  var signDisplay: (js.UndefOr[auto | never | always | exceptZero]) & NumberFormatOptionsSignDisplay
  
  /* standard es5 */
  var style: String
  
  /* standard es2020.intl */
  var unit: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var unitDisplay: (js.UndefOr[short | long | narrow]) & NumberFormatOptionsUnitDisplay
  
  /* standard es5 */
  var useGrouping: Boolean
}
object ResolvedNumberFormatOptions {
  
  inline def apply(
    compactDisplay: (js.UndefOr[short | long]) & NumberFormatOptionsCompactDisplay,
    currencySign: js.UndefOr[String] & NumberFormatOptionsCurrencySign,
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    notation: (js.UndefOr[standard | scientific | engineering | compact]) & NumberFormatOptionsNotation,
    numberingSystem: String,
    signDisplay: (js.UndefOr[auto | never | always | exceptZero]) & NumberFormatOptionsSignDisplay,
    style: String,
    unitDisplay: (js.UndefOr[short | long | narrow]) & NumberFormatOptionsUnitDisplay,
    useGrouping: Boolean
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
  
  extension [Self <: ResolvedNumberFormatOptions](x: Self) {
    
    inline def setCompactDisplay(value: (js.UndefOr[short | long]) & NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencySign(value: js.UndefOr[String] & NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(value: (js.UndefOr[standard | scientific | engineering | compact]) & NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setSignDisplay(value: (js.UndefOr[auto | never | always | exceptZero]) & NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: (js.UndefOr[short | long | narrow]) & NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
  }
}
