package typingsJapgolly.formatjsEcma402Abstract

import typingsJapgolly.formatjsEcma402Abstract.anon.FnCall
import typingsJapgolly.formatjsEcma402Abstract.anon.FullLong
import typingsJapgolly.formatjsEcma402Abstract.anon.IntervalFormatFallback
import typingsJapgolly.formatjsEcma402Abstract.anon.Long
import typingsJapgolly.formatjsEcma402Abstract.anon.LongEraData
import typingsJapgolly.formatjsEcma402Abstract.anon.Medium
import typingsJapgolly.formatjsEcma402Abstract.anon.RecordTABLE2defaultRangePAmpm
import typingsJapgolly.formatjsEcma402Abstract.anon.Short
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0`
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`1`
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`2`
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`3`
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`2-digit`
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.full
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.longGeneric
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.longOffset
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.medium
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.numeric
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.shortGeneric
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.shortOffset
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDateTimeMod {
  
  @js.native
  sealed trait RangePatternType extends StObject
  @JSImport("@formatjs/ecma402-abstract/types/date-time", "RangePatternType")
  @js.native
  object RangePatternType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RangePatternType & String] = js.native
    
    @js.native
    sealed trait endRange
      extends StObject
         with RangePatternType
    /* "endRange" */ val endRange: typingsJapgolly.formatjsEcma402Abstract.typesDateTimeMod.RangePatternType.endRange & String = js.native
    
    @js.native
    sealed trait shared
      extends StObject
         with RangePatternType
    /* "shared" */ val shared: typingsJapgolly.formatjsEcma402Abstract.typesDateTimeMod.RangePatternType.shared & String = js.native
    
    @js.native
    sealed trait startRange
      extends StObject
         with RangePatternType
    /* "startRange" */ val startRange: typingsJapgolly.formatjsEcma402Abstract.typesDateTimeMod.RangePatternType.startRange & String = js.native
  }
  
  /* Inlined parent std.Omit<std.Intl.DateTimeFormat, 'resolvedOptions' | 'formatRange' | 'formatRangeToParts' | 'formatToParts'> */
  @js.native
  trait DateTimeFormat extends StObject {
    
    def format(): String = js.native
    
    def formatRange(startDate: js.Date, endDate: js.Date): String = js.native
    def formatRange(startDate: js.Date, endDate: Double): String = js.native
    def formatRange(startDate: Double, endDate: js.Date): String = js.native
    def formatRange(startDate: Double, endDate: Double): String = js.native
    
    def formatRangeToParts(startDate: js.Date, endDate: js.Date): js.Array[IntlDateTimeFormatPart] = js.native
    def formatRangeToParts(startDate: js.Date, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
    def formatRangeToParts(startDate: Double, endDate: js.Date): js.Array[IntlDateTimeFormatPart] = js.native
    def formatRangeToParts(startDate: Double, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
    
    def formatToParts(): js.Array[IntlDateTimeFormatPart] = js.native
    def formatToParts(date: js.Date): js.Array[IntlDateTimeFormatPart] = js.native
    def formatToParts(date: Double): js.Array[IntlDateTimeFormatPart] = js.native
    
    @JSName("format")
    var format_Original: js.Function0[String] = js.native
    
    def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
  }
  
  trait DateTimeFormatLocaleInternalData extends StObject {
    
    var am: String
    
    var ca: js.Array[String]
    
    var dateFormat: FullLong
    
    var dateTimeFormat: Medium
    
    var era: LongEraData
    
    var formats: Record[String, js.Array[Formats]]
    
    /**
      * So we can construct GMT+08:00
      */
    var gmtFormat: String
    
    var hc: js.Array[String]
    
    var hourCycle: String
    
    /**
      * So we can construct GMT+08:00
      */
    var hourFormat: String
    
    var month: Long
    
    var nu: js.Array[String]
    
    var pm: String
    
    var timeFormat: FullLong
    
    var timeZoneName: TimeZoneNameData
    
    var weekday: Long
  }
  object DateTimeFormatLocaleInternalData {
    
    inline def apply(
      am: String,
      ca: js.Array[String],
      dateFormat: FullLong,
      dateTimeFormat: Medium,
      era: LongEraData,
      formats: Record[String, js.Array[Formats]],
      gmtFormat: String,
      hc: js.Array[String],
      hourCycle: String,
      hourFormat: String,
      month: Long,
      nu: js.Array[String],
      pm: String,
      timeFormat: FullLong,
      timeZoneName: TimeZoneNameData,
      weekday: Long
    ): DateTimeFormatLocaleInternalData = {
      val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], gmtFormat = gmtFormat.asInstanceOf[js.Any], hc = hc.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], hourFormat = hourFormat.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeFormatLocaleInternalData]
    }
    
    extension [Self <: DateTimeFormatLocaleInternalData](x: Self) {
      
      inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setDateFormat(value: FullLong): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormat(value: Medium): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setEra(value: LongEraData): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setFormats(value: Record[String, js.Array[Formats]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setGmtFormat(value: String): Self = StObject.set(x, "gmtFormat", value.asInstanceOf[js.Any])
      
      inline def setHc(value: js.Array[String]): Self = StObject.set(x, "hc", value.asInstanceOf[js.Any])
      
      inline def setHcVarargs(value: String*): Self = StObject.set(x, "hc", js.Array(value*))
      
      inline def setHourCycle(value: String): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setNu(value: js.Array[String]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuVarargs(value: String*): Self = StObject.set(x, "nu", js.Array(value*))
      
      inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      inline def setTimeFormat(value: FullLong): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: TimeZoneNameData): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: Long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    }
  }
  
  trait EraData extends StObject {
    
    var AD: String
    
    var BC: String
  }
  object EraData {
    
    inline def apply(AD: String, BC: String): EraData = {
      val __obj = js.Dynamic.literal(AD = AD.asInstanceOf[js.Any], BC = BC.asInstanceOf[js.Any])
      __obj.asInstanceOf[EraData]
    }
    
    extension [Self <: EraData](x: Self) {
      
      inline def setAD(value: String): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setBC(value: String): Self = StObject.set(x, "BC", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.Intl.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'dayPeriod' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  fractionalSecondDigits :0 | 1 | 2 | undefined,   hour12 :boolean | undefined,   pattern :string,   pattern12 :string,   skeleton :string,   rawPattern :string,   rangePatterns :std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatterns>,   rangePatterns12 :std.Record<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.TABLE_2 | 'default', @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatterns>} */
  trait Formats extends StObject {
    
    var day: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var dayPeriod: js.UndefOr[narrow | short | long] = js.undefined
    
    var era: js.UndefOr[long | short | narrow] = js.undefined
    
    var fractionalSecondDigits: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var hour: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var hour12: js.UndefOr[Boolean] = js.undefined
    
    var minute: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.undefined
    
    var pattern: String
    
    var pattern12: String
    
    var rangePatterns: RecordTABLE2defaultRangePAmpm
    
    var rangePatterns12: RecordTABLE2defaultRangePAmpm
    
    var rawPattern: String
    
    var second: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var skeleton: String
    
    var timeZoneName: js.UndefOr[short | long | shortOffset | longOffset | shortGeneric | longGeneric] = js.undefined
    
    var weekday: js.UndefOr[long | short | narrow] = js.undefined
    
    var year: js.UndefOr[numeric | `2-digit`] = js.undefined
  }
  object Formats {
    
    inline def apply(
      pattern: String,
      pattern12: String,
      rangePatterns: RecordTABLE2defaultRangePAmpm,
      rangePatterns12: RecordTABLE2defaultRangePAmpm,
      rawPattern: String,
      skeleton: String
    ): Formats = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], pattern12 = pattern12.asInstanceOf[js.Any], rangePatterns = rangePatterns.asInstanceOf[js.Any], rangePatterns12 = rangePatterns12.asInstanceOf[js.Any], rawPattern = rawPattern.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formats]
    }
    
    extension [Self <: Formats](x: Self) {
      
      inline def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayPeriod(value: narrow | short | long): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
      
      inline def setDayPeriodUndefined: Self = StObject.set(x, "dayPeriod", js.undefined)
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: long | short | narrow): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setFractionalSecondDigits(value: `0` | `1` | `2`): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
      
      inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
      
      inline def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: numeric | `2-digit` | long | short | narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPattern12(value: String): Self = StObject.set(x, "pattern12", value.asInstanceOf[js.Any])
      
      inline def setRangePatterns(value: RecordTABLE2defaultRangePAmpm): Self = StObject.set(x, "rangePatterns", value.asInstanceOf[js.Any])
      
      inline def setRangePatterns12(value: RecordTABLE2defaultRangePAmpm): Self = StObject.set(x, "rangePatterns12", value.asInstanceOf[js.Any])
      
      inline def setRawPattern(value: String): Self = StObject.set(x, "rawPattern", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setSkeleton(value: String): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: short | long | shortOffset | longOffset | shortGeneric | longGeneric): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setWeekday(value: long | short | narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  type IntervalFormatsData = IntervalFormatFallback & (Record[String, Record[String, String]])
  
  trait IntlDateTimeFormatInternal extends StObject {
    
    var boundFormat: js.UndefOr[FnCall] = js.undefined
    
    var calendar: js.UndefOr[String] = js.undefined
    
    var dataLocale: String
    
    var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
    
    var day: `2-digit` | numeric
    
    var dayPeriod: narrow | short | long
    
    var era: narrow | short | long
    
    var format: Formats
    
    var fractionalSecondDigits: js.UndefOr[`1` | `2` | `3`] = js.undefined
    
    var hour: `2-digit` | numeric
    
    var hourCycle: String
    
    var locale: String
    
    var minute: `2-digit` | numeric
    
    var month: `2-digit` | numeric | narrow | short | long
    
    var numberingSystem: String
    
    var pattern: String
    
    var rangePatterns: RecordTABLE2defaultRangePAmpm
    
    var second: `2-digit` | numeric
    
    var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
    
    var timeZone: String
    
    var timeZoneName: short | long | shortOffset | longOffset | shortGeneric | longGeneric
    
    var weekday: narrow | short | long
    
    var year: `2-digit` | numeric
  }
  object IntlDateTimeFormatInternal {
    
    inline def apply(
      dataLocale: String,
      day: `2-digit` | numeric,
      dayPeriod: narrow | short | long,
      era: narrow | short | long,
      format: Formats,
      hour: `2-digit` | numeric,
      hourCycle: String,
      locale: String,
      minute: `2-digit` | numeric,
      month: `2-digit` | numeric | narrow | short | long,
      numberingSystem: String,
      pattern: String,
      rangePatterns: RecordTABLE2defaultRangePAmpm,
      second: `2-digit` | numeric,
      timeZone: String,
      timeZoneName: short | long | shortOffset | longOffset | shortGeneric | longGeneric,
      weekday: narrow | short | long,
      year: `2-digit` | numeric
    ): IntlDateTimeFormatInternal = {
      val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], dayPeriod = dayPeriod.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rangePatterns = rangePatterns.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlDateTimeFormatInternal]
    }
    
    extension [Self <: IntlDateTimeFormatInternal](x: Self) {
      
      inline def setBoundFormat(value: FnCall): Self = StObject.set(x, "boundFormat", value.asInstanceOf[js.Any])
      
      inline def setBoundFormatUndefined: Self = StObject.set(x, "boundFormat", js.undefined)
      
      inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      inline def setDataLocale(value: String): Self = StObject.set(x, "dataLocale", value.asInstanceOf[js.Any])
      
      inline def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setDay(value: `2-digit` | numeric): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayPeriod(value: narrow | short | long): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
      
      inline def setEra(value: narrow | short | long): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Formats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFractionalSecondDigits(value: `1` | `2` | `3`): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
      
      inline def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
      
      inline def setHour(value: `2-digit` | numeric): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourCycle(value: String): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: `2-digit` | numeric): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setRangePatterns(value: RecordTABLE2defaultRangePAmpm): Self = StObject.set(x, "rangePatterns", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: `2-digit` | numeric): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: short | long | shortOffset | longOffset | shortGeneric | longGeneric): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: narrow | short | long): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setYear(value: `2-digit` | numeric): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntlDateTimeFormatPart extends StObject {
    
    var source: js.UndefOr[RangePatternType] = js.undefined
    
    var `type`: IntlDateTimeFormatPartType
    
    var value: js.UndefOr[String] = js.undefined
  }
  object IntlDateTimeFormatPart {
    
    inline def apply(`type`: IntlDateTimeFormatPartType): IntlDateTimeFormatPart = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlDateTimeFormatPart]
    }
    
    extension [Self <: IntlDateTimeFormatPart](x: Self) {
      
      inline def setSource(value: RangePatternType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setType(value: IntlDateTimeFormatPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.relatedYear
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.yearName
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.unknown
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecond
  */
  trait IntlDateTimeFormatPartType extends StObject
  object IntlDateTimeFormatPartType {
    
    inline def ampm: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm = "ampm".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm]
    
    inline def day: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def dayPeriod: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod = "dayPeriod".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod]
    
    inline def era: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era = "era".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era]
    
    inline def fractionalSecond: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecond = "fractionalSecond".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecond]
    
    inline def fractionalSecondDigits: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits = "fractionalSecondDigits".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits]
    
    inline def hour: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def literal: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal = "literal".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal]
    
    inline def minute: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def month: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def relatedYear: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.relatedYear = "relatedYear".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.relatedYear]
    
    inline def second: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def timeZoneName: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName = "timeZoneName".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName]
    
    inline def unknown: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.unknown]
    
    inline def weekday: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday = "weekday".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday]
    
    inline def year: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
    
    inline def yearName: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.yearName = "yearName".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.yearName]
  }
  
  trait RangePatternPart[T /* <: RangePatternType */] extends StObject {
    
    var pattern: String
    
    var source: T
  }
  object RangePatternPart {
    
    inline def apply[T /* <: RangePatternType */](pattern: String, source: T): RangePatternPart[T] = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePatternPart[T]]
    }
    
    extension [Self <: RangePatternPart[?], T /* <: RangePatternType */](x: Self & RangePatternPart[T]) {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.Intl.DateTimeFormatOptions, 'weekday' | 'era' | 'year' | 'month' | 'day' | 'hour' | 'minute' | 'second' | 'timeZoneName'> & {  hour12 :boolean | undefined,   patternParts :std.Array<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatternPart<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.RangePatternType>>} */
  trait RangePatterns extends StObject {
    
    var day: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var era: js.UndefOr[long | short | narrow] = js.undefined
    
    var hour: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var hour12: js.UndefOr[Boolean] = js.undefined
    
    var minute: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.undefined
    
    var patternParts: js.Array[RangePatternPart[RangePatternType]]
    
    var second: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    var timeZoneName: js.UndefOr[short | long | shortOffset | longOffset | shortGeneric | longGeneric] = js.undefined
    
    var weekday: js.UndefOr[long | short | narrow] = js.undefined
    
    var year: js.UndefOr[numeric | `2-digit`] = js.undefined
  }
  object RangePatterns {
    
    inline def apply(patternParts: js.Array[RangePatternPart[RangePatternType]]): RangePatterns = {
      val __obj = js.Dynamic.literal(patternParts = patternParts.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangePatterns]
    }
    
    extension [Self <: RangePatterns](x: Self) {
      
      inline def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: long | short | narrow): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: numeric | `2-digit` | long | short | narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setPatternParts(value: js.Array[RangePatternPart[RangePatternType]]): Self = StObject.set(x, "patternParts", value.asInstanceOf[js.Any])
      
      inline def setPatternPartsVarargs(value: RangePatternPart[RangePatternType]*): Self = StObject.set(x, "patternParts", js.Array(value*))
      
      inline def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setTimeZoneName(value: short | long | shortOffset | longOffset | shortGeneric | longGeneric): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setWeekday(value: long | short | narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait ResolvedDateTimeFormatOptions
    extends StObject
       with typingsJapgolly.std.Intl.ResolvedDateTimeFormatOptions
  object ResolvedDateTimeFormatOptions {
    
    inline def apply(calendar: String, locale: String, numberingSystem: String, timeZone: String): ResolvedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits
  */
  trait TABLE_2 extends StObject
  object TABLE_2 {
    
    inline def ampm: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm = "ampm".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm]
    
    inline def day: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def dayPeriod: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod = "dayPeriod".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod]
    
    inline def era: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era = "era".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era]
    
    inline def fractionalSecondDigits: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits = "fractionalSecondDigits".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits]
    
    inline def hour: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def minute: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def month: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def second: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def year: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName
  */
  trait TABLE_6 extends StObject
  object TABLE_6 {
    
    inline def day: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day = "day".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day]
    
    inline def dayPeriod: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod = "dayPeriod".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.dayPeriod]
    
    inline def era: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era = "era".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era]
    
    inline def fractionalSecondDigits: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits = "fractionalSecondDigits".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.fractionalSecondDigits]
    
    inline def hour: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour = "hour".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour]
    
    inline def minute: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute = "minute".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute]
    
    inline def month: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month = "month".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month]
    
    inline def second: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second = "second".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second]
    
    inline def timeZoneName: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName = "timeZoneName".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName]
    
    inline def weekday: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday = "weekday".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday]
    
    inline def year: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year = "year".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year]
  }
  
  type TimeZoneNameData = Record[String, Short]
  
  type UnpackedZoneData = js.Tuple4[Double, String, Double, Boolean]
}
