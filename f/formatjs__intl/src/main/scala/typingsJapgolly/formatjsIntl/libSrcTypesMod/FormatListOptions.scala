package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.formatjsIntl.formatjsIntlStrings.conjunction
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.disjunction
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.long
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.narrow
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.short
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions, 'localeMatcher'> */
trait FormatListOptions extends StObject {
  
  var style: js.UndefOr[long | short | narrow] = js.undefined
  
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.undefined
}
object FormatListOptions {
  
  inline def apply(): FormatListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatListOptions]
  }
  
  extension [Self <: FormatListOptions](x: Self) {
    
    inline def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
