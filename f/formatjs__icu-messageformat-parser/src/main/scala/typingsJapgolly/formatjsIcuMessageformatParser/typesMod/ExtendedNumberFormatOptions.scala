package typingsJapgolly.formatjsIcuMessageformatParser.typesMod

import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.compact
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.engineering
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.scientific
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.standard
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsLocaleMatcher
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedNumberFormatOptions
  extends StObject
     with NumberFormatOptions {
  
  var scale: js.UndefOr[Double] = js.undefined
}
object ExtendedNumberFormatOptions {
  
  inline def apply(
    compactDisplay: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay],
    currencyDisplay: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    currencySign: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign],
    localeMatcher: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsLocaleMatcher],
    notation: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation],
    style: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle],
    unitDisplay: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]
  ): ExtendedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedNumberFormatOptions]
  }
  
  extension [Self <: ExtendedNumberFormatOptions](x: Self) {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
