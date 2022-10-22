package typingsJapgolly.std.Intl

import typingsJapgolly.std.stdStrings.`best fit`
import typingsJapgolly.std.stdStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralRulesOptions extends StObject {
  
  /* standard es2018.intl */
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  
  /* standard es2018.intl */
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var `type`: js.UndefOr[PluralRuleType] = js.undefined
}
object PluralRulesOptions {
  
  inline def apply(): PluralRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralRulesOptions]
  }
  
  extension [Self <: PluralRulesOptions](x: Self) {
    
    inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
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
    
    inline def setType(value: PluralRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
