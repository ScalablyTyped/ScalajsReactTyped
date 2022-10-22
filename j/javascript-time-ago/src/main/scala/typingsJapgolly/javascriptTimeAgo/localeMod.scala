package typingsJapgolly.javascriptTimeAgo

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
  */
  trait DefaultFormats extends StObject
  object DefaultFormats {
    
    inline def long: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long = "long".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long]
    
    inline def narrow: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = "narrow".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow]
    
    inline def short: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short = "short".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short]
  }
  
  trait Duration extends StObject {
    
    var day: Tense
    
    var flavour: js.UndefOr[Formats] = js.undefined
    
    var hour: Tense
    
    var minute: Tense
    
    var month: Tense
    
    var quarter: Tense
    
    var second: Tense
    
    var week: Tense
    
    var year: Tense
  }
  object Duration {
    
    inline def apply(
      day: Tense,
      hour: Tense,
      minute: Tense,
      month: Tense,
      quarter: Tense,
      second: Tense,
      week: Tense,
      year: Tense
    ): Duration = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], quarter = quarter.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDay(value: Tense): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setFlavour(value: Formats): Self = StObject.set(x, "flavour", value.asInstanceOf[js.Any])
      
      inline def setFlavourUndefined: Self = StObject.set(x, "flavour", js.undefined)
      
      inline def setHour(value: Tense): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Tense): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Tense): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setQuarter(value: Tense): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Tense): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: Tense): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Tense): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`
  */
  trait ExtendedFormats extends StObject
  object ExtendedFormats {
    
    inline def `long-convenient`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient` = "long-convenient".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`]
    
    inline def `long-time`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time` = "long-time".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`]
    
    inline def `short-convenient`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient` = "short-convenient".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`]
    
    inline def `short-time`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = "short-time".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`]
    
    inline def tiny: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`
  */
  trait Formats extends StObject
  object Formats {
    
    inline def long: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long = "long".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long]
    
    inline def `long-convenient`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient` = "long-convenient".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`]
    
    inline def `long-time`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time` = "long-time".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`]
    
    inline def narrow: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = "narrow".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow]
    
    inline def short: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short = "short".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short]
    
    inline def `short-convenient`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient` = "short-convenient".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`]
    
    inline def `short-time`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = "short-time".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`]
    
    inline def tiny: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny]
  }
  
  trait Locale extends StObject {
    
    var locale: String
    
    var long: js.UndefOr[Duration] = js.undefined
    
    var `long-convenient`: js.UndefOr[Duration] = js.undefined
    
    var `long-time`: js.UndefOr[Duration] = js.undefined
    
    var narrow: js.UndefOr[Duration] = js.undefined
    
    def quantify(n: Double): one | two | few | other
    
    var short: js.UndefOr[Duration] = js.undefined
    
    var `short-convenient`: js.UndefOr[Duration] = js.undefined
    
    var `short-time`: js.UndefOr[Duration] = js.undefined
    
    var tiny: js.UndefOr[Duration] = js.undefined
  }
  object Locale {
    
    inline def apply(locale: String, quantify: Double => one | two | few | other): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def `setLong-convenient`(value: Duration): Self = StObject.set(x, "long-convenient", value.asInstanceOf[js.Any])
      
      inline def `setLong-convenientUndefined`: Self = StObject.set(x, "long-convenient", js.undefined)
      
      inline def `setLong-time`(value: Duration): Self = StObject.set(x, "long-time", value.asInstanceOf[js.Any])
      
      inline def `setLong-timeUndefined`: Self = StObject.set(x, "long-time", js.undefined)
      
      inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      inline def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      inline def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
      
      inline def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      inline def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def `setShort-convenient`(value: Duration): Self = StObject.set(x, "short-convenient", value.asInstanceOf[js.Any])
      
      inline def `setShort-convenientUndefined`: Self = StObject.set(x, "short-convenient", js.undefined)
      
      inline def `setShort-time`(value: Duration): Self = StObject.set(x, "short-time", value.asInstanceOf[js.Any])
      
      inline def `setShort-timeUndefined`: Self = StObject.set(x, "short-time", js.undefined)
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setTiny(value: Duration): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
      
      inline def setTinyUndefined: Self = StObject.set(x, "tiny", js.undefined)
    }
  }
  
  trait QuantifyType extends StObject {
    
    var few: js.UndefOr[String] = js.undefined
    
    var one: String
    
    var other: String
    
    var two: js.UndefOr[String] = js.undefined
  }
  object QuantifyType {
    
    inline def apply(one: String, other: String): QuantifyType = {
      val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuantifyType]
    }
    
    extension [Self <: QuantifyType](x: Self) {
      
      inline def setFew(value: String): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setTwo(value: String): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
    }
  }
  
  trait RTFFormatter extends StObject {
    
    var locale: String
    
    var localeMatcher: String
    
    var numberFormat: StringDictionary[Any]
    
    var numeric: String
    
    var style: DefaultFormats
  }
  object RTFFormatter {
    
    inline def apply(
      locale: String,
      localeMatcher: String,
      numberFormat: StringDictionary[Any],
      numeric: String,
      style: DefaultFormats
    ): RTFFormatter = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTFFormatter]
    }
    
    extension [Self <: RTFFormatter](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: StringDictionary[Any]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      inline def setNumeric(value: String): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: DefaultFormats): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tense extends StObject {
    
    var current: js.UndefOr[QuantifyType | String] = js.undefined
    
    var future: js.UndefOr[QuantifyType | String] = js.undefined
    
    var next: js.UndefOr[QuantifyType | String] = js.undefined
    
    var past: js.UndefOr[QuantifyType | String] = js.undefined
    
    var previous: js.UndefOr[QuantifyType | String] = js.undefined
  }
  object Tense {
    
    inline def apply(): Tense = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tense]
    }
    
    extension [Self <: Tense](x: Self) {
      
      inline def setCurrent(value: QuantifyType | String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setFuture(value: QuantifyType | String): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setNext(value: QuantifyType | String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPast(value: QuantifyType | String): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      inline def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      inline def setPrevious(value: QuantifyType | String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.now
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.second
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.minute
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.hour
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.day
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.week
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.month
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.quarter
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.year
  */
  trait TimeUnit extends StObject
  object TimeUnit {
    
    inline def day: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.day = "day".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.day]
    
    inline def hour: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.hour = "hour".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.hour]
    
    inline def minute: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.minute = "minute".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.minute]
    
    inline def month: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.month = "month".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.month]
    
    inline def now: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.now = "now".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.now]
    
    inline def quarter: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.quarter = "quarter".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.quarter]
    
    inline def second: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.second = "second".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.second]
    
    inline def week: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.week = "week".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.week]
    
    inline def year: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.year = "year".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.year]
  }
}
