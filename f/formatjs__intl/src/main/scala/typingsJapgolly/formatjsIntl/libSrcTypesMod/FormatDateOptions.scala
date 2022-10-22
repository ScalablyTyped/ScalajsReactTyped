package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.formatjsIntl.formatjsIntlInts.`1`
import typingsJapgolly.formatjsIntl.formatjsIntlInts.`2`
import typingsJapgolly.formatjsIntl.formatjsIntlInts.`3`
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.`2-digit`
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.`best fit`
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.basic
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.full
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.h11
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.h12
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.h23
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.h24
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.long
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.longGeneric
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.longOffset
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.medium
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.narrow
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.numeric
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.short
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.shortGeneric
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.shortOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Intl.DateTimeFormatOptions, 'localeMatcher'> & @formatjs/intl.@formatjs/intl/lib/src/types.CustomFormatConfig<'date'> */
trait FormatDateOptions extends StObject {
  
  var calendar: js.UndefOr[String] = js.undefined
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var day: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var dayPeriod: js.UndefOr[narrow | short | long] = js.undefined
  
  var era: js.UndefOr[long | short | narrow] = js.undefined
  
  var format: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'date' extends keyof @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats['date'] : string */ js.Any
  ] = js.undefined
  
  var formatMatcher: (js.UndefOr[(`best fit`) | basic]) & (js.UndefOr[basic | (`best fit`)])
  
  var fractionalSecondDigits: js.UndefOr[`1` | `2` | `3`] = js.undefined
  
  var hour: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
  
  var minute: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.undefined
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var second: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var timeZoneName: js.UndefOr[short | long | shortOffset | longOffset | shortGeneric | longGeneric] = js.undefined
  
  var weekday: js.UndefOr[long | short | narrow] = js.undefined
  
  var year: js.UndefOr[numeric | `2-digit`] = js.undefined
}
object FormatDateOptions {
  
  inline def apply(formatMatcher: (js.UndefOr[(`best fit`) | basic]) & (js.UndefOr[basic | (`best fit`)])): FormatDateOptions = {
    val __obj = js.Dynamic.literal(formatMatcher = formatMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDateOptions]
  }
  
  extension [Self <: FormatDateOptions](x: Self) {
    
    inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    inline def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayPeriod(value: narrow | short | long): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
    
    inline def setDayPeriodUndefined: Self = StObject.set(x, "dayPeriod", js.undefined)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: long | short | narrow): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'date' extends keyof @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats ? @formatjs/intl.@formatjs/intl/lib/src/types.<global>.FormatjsIntl.Formats['date'] : string */ js.Any
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcher(value: (js.UndefOr[(`best fit`) | basic]) & (js.UndefOr[basic | (`best fit`)])): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFractionalSecondDigits(value: `1` | `2` | `3`): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    inline def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    inline def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: numeric | `2-digit` | long | short | narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: short | long | shortOffset | longOffset | shortGeneric | longGeneric): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setWeekday(value: long | short | narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
