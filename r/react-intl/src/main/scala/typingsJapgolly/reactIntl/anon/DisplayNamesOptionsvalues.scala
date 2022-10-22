package typingsJapgolly.reactIntl.anon

import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.code
import typingsJapgolly.reactIntl.reactIntlStrings.currency
import typingsJapgolly.reactIntl.reactIntlStrings.language
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.none
import typingsJapgolly.reactIntl.reactIntlStrings.region
import typingsJapgolly.reactIntl.reactIntlStrings.script
import typingsJapgolly.reactIntl.reactIntlStrings.short
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNamesOptions & {  value :string | number | std.Record<string, unknown>} */
trait DisplayNamesOptionsvalues extends StObject {
  
  var fallback: js.UndefOr[code | none] = js.undefined
  
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  
  var style: js.UndefOr[narrow | short | long] = js.undefined
  
  var `type`: language | region | script | currency
  
  var value: String | Double | (Record[String, Any])
}
object DisplayNamesOptionsvalues {
  
  inline def apply(`type`: language | region | script | currency, value: String | Double | (Record[String, Any])): DisplayNamesOptionsvalues = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptionsvalues]
  }
  
  extension [Self <: DisplayNamesOptionsvalues](x: Self) {
    
    inline def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double | (Record[String, Any])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
