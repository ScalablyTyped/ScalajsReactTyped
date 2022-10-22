package typingsJapgolly.flatpickr

import typingsJapgolly.flatpickr.anon.Longhand
import typingsJapgolly.flatpickr.anon.Shorthand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLocaleMod {
  
  trait CustomLocale extends StObject {
    
    var amPM: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var daysInMonth: js.UndefOr[
        js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var months: Longhand
    
    var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.undefined
    
    var rangeSeparator: js.UndefOr[String] = js.undefined
    
    var scrollTitle: js.UndefOr[String] = js.undefined
    
    var time_24hr: js.UndefOr[Boolean] = js.undefined
    
    var toggleTitle: js.UndefOr[String] = js.undefined
    
    var weekAbbreviation: js.UndefOr[String] = js.undefined
    
    var weekdays: Shorthand
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
  }
  object CustomLocale {
    
    inline def apply(months: Longhand, weekdays: Shorthand): CustomLocale = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLocale]
    }
    
    extension [Self <: CustomLocale](x: Self) {
      
      inline def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      inline def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      inline def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysInMonthUndefined: Self = StObject.set(x, "daysInMonth", js.undefined)
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonths(value: Longhand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setOrdinal(value: /* nth */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      inline def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      inline def setScrollTitleUndefined: Self = StObject.set(x, "scrollTitle", js.undefined)
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
      
      inline def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      inline def setToggleTitleUndefined: Self = StObject.set(x, "toggleTitle", js.undefined)
      
      inline def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setWeekAbbreviationUndefined: Self = StObject.set(x, "weekAbbreviation", js.undefined)
      
      inline def setWeekdays(value: Shorthand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
    }
  }
  
  trait Locale extends StObject {
    
    var amPM: js.Tuple2[String, String]
    
    var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
    
    var firstDayOfWeek: Double
    
    var hourAriaLabel: String
    
    var minuteAriaLabel: String
    
    var monthAriaLabel: String
    
    var months: Longhand
    
    def ordinal(nth: Double): String
    
    var rangeSeparator: String
    
    var scrollTitle: String
    
    var time_24hr: Boolean
    
    var toggleTitle: String
    
    var weekAbbreviation: String
    
    var weekdays: Shorthand
    
    var yearAriaLabel: String
  }
  object Locale {
    
    inline def apply(
      amPM: js.Tuple2[String, String],
      daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double],
      firstDayOfWeek: Double,
      hourAriaLabel: String,
      minuteAriaLabel: String,
      monthAriaLabel: String,
      months: Longhand,
      ordinal: Double => String,
      rangeSeparator: String,
      scrollTitle: String,
      time_24hr: Boolean,
      toggleTitle: String,
      weekAbbreviation: String,
      weekdays: Shorthand,
      yearAriaLabel: String
    ): Locale = {
      val __obj = js.Dynamic.literal(amPM = amPM.asInstanceOf[js.Any], daysInMonth = daysInMonth.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], hourAriaLabel = hourAriaLabel.asInstanceOf[js.Any], minuteAriaLabel = minuteAriaLabel.asInstanceOf[js.Any], monthAriaLabel = monthAriaLabel.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator.asInstanceOf[js.Any], scrollTitle = scrollTitle.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], toggleTitle = toggleTitle.asInstanceOf[js.Any], weekAbbreviation = weekAbbreviation.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], yearAriaLabel = yearAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      inline def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: Longhand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      inline def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      inline def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setWeekdays(value: Shorthand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.flatpickr.flatpickrStrings.ar
    - typingsJapgolly.flatpickr.flatpickrStrings.at
    - typingsJapgolly.flatpickr.flatpickrStrings.az
    - typingsJapgolly.flatpickr.flatpickrStrings.be
    - typingsJapgolly.flatpickr.flatpickrStrings.bg
    - typingsJapgolly.flatpickr.flatpickrStrings.bn
    - typingsJapgolly.flatpickr.flatpickrStrings.bs
    - typingsJapgolly.flatpickr.flatpickrStrings.ca
    - typingsJapgolly.flatpickr.flatpickrStrings.cat
    - typingsJapgolly.flatpickr.flatpickrStrings.ckb
    - typingsJapgolly.flatpickr.flatpickrStrings.cs
    - typingsJapgolly.flatpickr.flatpickrStrings.cy
    - typingsJapgolly.flatpickr.flatpickrStrings.da
    - typingsJapgolly.flatpickr.flatpickrStrings.de
    - typingsJapgolly.flatpickr.flatpickrStrings.default
    - typingsJapgolly.flatpickr.flatpickrStrings.en
    - typingsJapgolly.flatpickr.flatpickrStrings.eo
    - typingsJapgolly.flatpickr.flatpickrStrings.es
    - typingsJapgolly.flatpickr.flatpickrStrings.et
    - typingsJapgolly.flatpickr.flatpickrStrings.fa
    - typingsJapgolly.flatpickr.flatpickrStrings.fi
    - typingsJapgolly.flatpickr.flatpickrStrings.fo
    - typingsJapgolly.flatpickr.flatpickrStrings.fr
    - typingsJapgolly.flatpickr.flatpickrStrings.gr
    - typingsJapgolly.flatpickr.flatpickrStrings.he
    - typingsJapgolly.flatpickr.flatpickrStrings.hi
    - typingsJapgolly.flatpickr.flatpickrStrings.hr
    - typingsJapgolly.flatpickr.flatpickrStrings.hu
    - typingsJapgolly.flatpickr.flatpickrStrings.hy
    - typingsJapgolly.flatpickr.flatpickrStrings.id
    - typingsJapgolly.flatpickr.flatpickrStrings.is
    - typingsJapgolly.flatpickr.flatpickrStrings.it
    - typingsJapgolly.flatpickr.flatpickrStrings.ja
    - typingsJapgolly.flatpickr.flatpickrStrings.ka
    - typingsJapgolly.flatpickr.flatpickrStrings.ko
    - typingsJapgolly.flatpickr.flatpickrStrings.km
    - typingsJapgolly.flatpickr.flatpickrStrings.kz
    - typingsJapgolly.flatpickr.flatpickrStrings.lt
    - typingsJapgolly.flatpickr.flatpickrStrings.lv
    - typingsJapgolly.flatpickr.flatpickrStrings.mk
    - typingsJapgolly.flatpickr.flatpickrStrings.mn
    - typingsJapgolly.flatpickr.flatpickrStrings.ms
    - typingsJapgolly.flatpickr.flatpickrStrings.my
    - typingsJapgolly.flatpickr.flatpickrStrings.nl
    - typingsJapgolly.flatpickr.flatpickrStrings.nn
    - typingsJapgolly.flatpickr.flatpickrStrings.no
    - typingsJapgolly.flatpickr.flatpickrStrings.pa
    - typingsJapgolly.flatpickr.flatpickrStrings.pl
    - typingsJapgolly.flatpickr.flatpickrStrings.pt
    - typingsJapgolly.flatpickr.flatpickrStrings.ro
    - typingsJapgolly.flatpickr.flatpickrStrings.ru
    - typingsJapgolly.flatpickr.flatpickrStrings.si
    - typingsJapgolly.flatpickr.flatpickrStrings.sk
    - typingsJapgolly.flatpickr.flatpickrStrings.sl
    - typingsJapgolly.flatpickr.flatpickrStrings.sq
    - typingsJapgolly.flatpickr.flatpickrStrings.sr
    - typingsJapgolly.flatpickr.flatpickrStrings.sv
    - typingsJapgolly.flatpickr.flatpickrStrings.th
    - typingsJapgolly.flatpickr.flatpickrStrings.tr
    - typingsJapgolly.flatpickr.flatpickrStrings.uk
    - typingsJapgolly.flatpickr.flatpickrStrings.vn
    - typingsJapgolly.flatpickr.flatpickrStrings.zh
    - typingsJapgolly.flatpickr.flatpickrStrings.uz
    - typingsJapgolly.flatpickr.flatpickrStrings.uz_latn
    - typingsJapgolly.flatpickr.flatpickrStrings.zh_tw
  */
  trait key extends StObject
  object key {
    
    inline def default: typingsJapgolly.flatpickr.flatpickrStrings.default = "default".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.default]
    
    inline def ar: typingsJapgolly.flatpickr.flatpickrStrings.ar = "ar".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ar]
    
    inline def at: typingsJapgolly.flatpickr.flatpickrStrings.at = "at".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.at]
    
    inline def az: typingsJapgolly.flatpickr.flatpickrStrings.az = "az".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.az]
    
    inline def be: typingsJapgolly.flatpickr.flatpickrStrings.be = "be".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.be]
    
    inline def bg: typingsJapgolly.flatpickr.flatpickrStrings.bg = "bg".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.bg]
    
    inline def bn: typingsJapgolly.flatpickr.flatpickrStrings.bn = "bn".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.bn]
    
    inline def bs: typingsJapgolly.flatpickr.flatpickrStrings.bs = "bs".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.bs]
    
    inline def ca: typingsJapgolly.flatpickr.flatpickrStrings.ca = "ca".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ca]
    
    inline def cat: typingsJapgolly.flatpickr.flatpickrStrings.cat = "cat".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.cat]
    
    inline def ckb: typingsJapgolly.flatpickr.flatpickrStrings.ckb = "ckb".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ckb]
    
    inline def cs: typingsJapgolly.flatpickr.flatpickrStrings.cs = "cs".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.cs]
    
    inline def cy: typingsJapgolly.flatpickr.flatpickrStrings.cy = "cy".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.cy]
    
    inline def da: typingsJapgolly.flatpickr.flatpickrStrings.da = "da".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.da]
    
    inline def de: typingsJapgolly.flatpickr.flatpickrStrings.de = "de".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.de]
    
    inline def en: typingsJapgolly.flatpickr.flatpickrStrings.en = "en".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.en]
    
    inline def eo: typingsJapgolly.flatpickr.flatpickrStrings.eo = "eo".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.eo]
    
    inline def es: typingsJapgolly.flatpickr.flatpickrStrings.es = "es".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.es]
    
    inline def et: typingsJapgolly.flatpickr.flatpickrStrings.et = "et".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.et]
    
    inline def fa: typingsJapgolly.flatpickr.flatpickrStrings.fa = "fa".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.fa]
    
    inline def fi: typingsJapgolly.flatpickr.flatpickrStrings.fi = "fi".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.fi]
    
    inline def fo: typingsJapgolly.flatpickr.flatpickrStrings.fo = "fo".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.fo]
    
    inline def fr: typingsJapgolly.flatpickr.flatpickrStrings.fr = "fr".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.fr]
    
    inline def gr: typingsJapgolly.flatpickr.flatpickrStrings.gr = "gr".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.gr]
    
    inline def he: typingsJapgolly.flatpickr.flatpickrStrings.he = "he".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.he]
    
    inline def hi: typingsJapgolly.flatpickr.flatpickrStrings.hi = "hi".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.hi]
    
    inline def hr: typingsJapgolly.flatpickr.flatpickrStrings.hr = "hr".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.hr]
    
    inline def hu: typingsJapgolly.flatpickr.flatpickrStrings.hu = "hu".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.hu]
    
    inline def hy: typingsJapgolly.flatpickr.flatpickrStrings.hy = "hy".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.hy]
    
    inline def id: typingsJapgolly.flatpickr.flatpickrStrings.id = "id".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.id]
    
    inline def is: typingsJapgolly.flatpickr.flatpickrStrings.is = "is".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.is]
    
    inline def it: typingsJapgolly.flatpickr.flatpickrStrings.it = "it".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.it]
    
    inline def ja: typingsJapgolly.flatpickr.flatpickrStrings.ja = "ja".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ja]
    
    inline def ka: typingsJapgolly.flatpickr.flatpickrStrings.ka = "ka".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ka]
    
    inline def km: typingsJapgolly.flatpickr.flatpickrStrings.km = "km".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.km]
    
    inline def ko: typingsJapgolly.flatpickr.flatpickrStrings.ko = "ko".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ko]
    
    inline def kz: typingsJapgolly.flatpickr.flatpickrStrings.kz = "kz".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.kz]
    
    inline def lt: typingsJapgolly.flatpickr.flatpickrStrings.lt = "lt".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.lt]
    
    inline def lv: typingsJapgolly.flatpickr.flatpickrStrings.lv = "lv".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.lv]
    
    inline def mk: typingsJapgolly.flatpickr.flatpickrStrings.mk = "mk".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.mk]
    
    inline def mn: typingsJapgolly.flatpickr.flatpickrStrings.mn = "mn".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.mn]
    
    inline def ms: typingsJapgolly.flatpickr.flatpickrStrings.ms = "ms".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ms]
    
    inline def my: typingsJapgolly.flatpickr.flatpickrStrings.my = "my".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.my]
    
    inline def nl: typingsJapgolly.flatpickr.flatpickrStrings.nl = "nl".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.nl]
    
    inline def nn: typingsJapgolly.flatpickr.flatpickrStrings.nn = "nn".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.nn]
    
    inline def no: typingsJapgolly.flatpickr.flatpickrStrings.no = "no".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.no]
    
    inline def pa: typingsJapgolly.flatpickr.flatpickrStrings.pa = "pa".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.pa]
    
    inline def pl: typingsJapgolly.flatpickr.flatpickrStrings.pl = "pl".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.pl]
    
    inline def pt: typingsJapgolly.flatpickr.flatpickrStrings.pt = "pt".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.pt]
    
    inline def ro: typingsJapgolly.flatpickr.flatpickrStrings.ro = "ro".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ro]
    
    inline def ru: typingsJapgolly.flatpickr.flatpickrStrings.ru = "ru".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.ru]
    
    inline def si: typingsJapgolly.flatpickr.flatpickrStrings.si = "si".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.si]
    
    inline def sk: typingsJapgolly.flatpickr.flatpickrStrings.sk = "sk".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.sk]
    
    inline def sl: typingsJapgolly.flatpickr.flatpickrStrings.sl = "sl".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.sl]
    
    inline def sq: typingsJapgolly.flatpickr.flatpickrStrings.sq = "sq".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.sq]
    
    inline def sr: typingsJapgolly.flatpickr.flatpickrStrings.sr = "sr".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.sr]
    
    inline def sv: typingsJapgolly.flatpickr.flatpickrStrings.sv = "sv".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.sv]
    
    inline def th: typingsJapgolly.flatpickr.flatpickrStrings.th = "th".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.th]
    
    inline def tr: typingsJapgolly.flatpickr.flatpickrStrings.tr = "tr".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.tr]
    
    inline def uk: typingsJapgolly.flatpickr.flatpickrStrings.uk = "uk".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.uk]
    
    inline def uz: typingsJapgolly.flatpickr.flatpickrStrings.uz = "uz".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.uz]
    
    inline def uz_latn: typingsJapgolly.flatpickr.flatpickrStrings.uz_latn = "uz_latn".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.uz_latn]
    
    inline def vn: typingsJapgolly.flatpickr.flatpickrStrings.vn = "vn".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.vn]
    
    inline def zh: typingsJapgolly.flatpickr.flatpickrStrings.zh = "zh".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.zh]
    
    inline def zh_tw: typingsJapgolly.flatpickr.flatpickrStrings.zh_tw = "zh_tw".asInstanceOf[typingsJapgolly.flatpickr.flatpickrStrings.zh_tw]
  }
}
