package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.date
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.number
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.time
import typingsJapgolly.intlMessageformat.srcFormattersMod.Format
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.RelativeTimeFormatOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<intl-messageformat.intl-messageformat.Formats> */
trait CustomFormats extends StObject {
  
  var date: js.UndefOr[
    Record[
      Format[typingsJapgolly.formatjsIntl.formatjsIntlStrings.date], 
      DateTimeFormatOptions
    ]
  ] = js.undefined
  
  var number: js.UndefOr[
    Record[
      Format[typingsJapgolly.formatjsIntl.formatjsIntlStrings.number], 
      NumberFormatOptions
    ]
  ] = js.undefined
  
  var relative: js.UndefOr[Record[String, RelativeTimeFormatOptions]] = js.undefined
  
  var time: js.UndefOr[
    Record[
      Format[typingsJapgolly.formatjsIntl.formatjsIntlStrings.time], 
      DateTimeFormatOptions
    ]
  ] = js.undefined
}
object CustomFormats {
  
  inline def apply(): CustomFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFormats]
  }
  
  extension [Self <: CustomFormats](x: Self) {
    
    inline def setDate(value: Record[Format[date], DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: Record[Format[number], NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setRelative(value: Record[String, RelativeTimeFormatOptions]): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setTime(value: Record[Format[time], DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
