package typingsJapgolly.reactIntl.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.conjunction
import typingsJapgolly.reactIntl.reactIntlStrings.disjunction
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.short
import typingsJapgolly.reactIntl.reactIntlStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions & {  value :std.Array<react.react.ReactNode>} */
trait IntlListFormatOptionsvalu extends StObject {
  
  /**
    * The locale matching algorithm to use.
    * Possible values are "lookup" and "best fit"; the default is "best fit".
    * For information about this option, see
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
    */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
  
  /**
    * The length of the formatted message.
    * Possible values are:
    * - "long" (default, e.g., "A, B, and C");
    * - "short" (e.g., "A, B, C"), or
    * - "narrow" (e.g., "A B C").
    * When style is "short" or "narrow", "unit" is the only allowed value for the type option.
    */
  var style: js.UndefOr[long | short | narrow] = js.undefined
  
  /**
    * The format of output message.
    * Possible values are :
    * - "conjunction" that stands for "and"-based lists (default, e.g., "A, B, and C")
    * - "disjunction" that stands for "or"-based lists (e.g., "A, B, or C").
    * - "unit" stands for lists of values with units (e.g., "5 pounds, 12 ounces").
    */
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.undefined
  
  var value: js.Array[Node]
}
object IntlListFormatOptionsvalu {
  
  inline def apply(value: js.Array[Node]): IntlListFormatOptionsvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlListFormatOptionsvalu]
  }
  
  extension [Self <: IntlListFormatOptionsvalu](x: Self) {
    
    inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: js.Array[Node]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Node*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
