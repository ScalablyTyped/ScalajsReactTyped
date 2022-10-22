package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.std.Intl.RelativeTimeFormatNumeric
import typingsJapgolly.std.Intl.RelativeTimeFormatStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Intl.RelativeTimeFormatOptions, 'localeMatcher'> & @formatjs/intl.@formatjs/intl/lib/src/types.CustomFormatConfig<'time'> */
trait FormatRelativeTimeOptions extends StObject {
  
  var format: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'time' extends keyof @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats['time'] : string */ js.Any
  ] = js.undefined
  
  var numeric: js.UndefOr[RelativeTimeFormatNumeric] = js.undefined
  
  var style: js.UndefOr[RelativeTimeFormatStyle] = js.undefined
}
object FormatRelativeTimeOptions {
  
  inline def apply(): FormatRelativeTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatRelativeTimeOptions]
  }
  
  extension [Self <: FormatRelativeTimeOptions](x: Self) {
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'time' extends keyof @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats['time'] : string */ js.Any
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNumeric(value: RelativeTimeFormatNumeric): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
