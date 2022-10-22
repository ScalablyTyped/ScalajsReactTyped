package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.formatjsIntl.formatjsIntlStrings.code
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.currency
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.language
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.long
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.narrow
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.none
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.region
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.script
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNamesOptions, 'localeMatcher'> */
trait FormatDisplayNameOptions extends StObject {
  
  var fallback: js.UndefOr[code | none] = js.undefined
  
  var style: js.UndefOr[narrow | short | long] = js.undefined
  
  var `type`: language | region | script | currency
}
object FormatDisplayNameOptions {
  
  inline def apply(`type`: language | region | script | currency): FormatDisplayNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDisplayNameOptions]
  }
  
  extension [Self <: FormatDisplayNameOptions](x: Self) {
    
    inline def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
