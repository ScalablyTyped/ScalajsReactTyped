package typingsJapgolly.humanizeDuration

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("humanize-duration", JSImport.Namespace)
  @js.native
  val ^ : Humanizer = js.native
  
  @js.native
  trait Humanizer extends StObject {
    
    def apply(ms: Double): String = js.native
    def apply(ms: Double, options: Options): String = js.native
    
    /**
      * This function won't return any new languages you define; it will only return the defaults supported by the library.
      */
    def getSupportedLanguages(): js.Array[SupportedLanguage] = js.native
    
    def humanizer(): Humanizer = js.native
    def humanizer(options: HumanizerOptions): Humanizer = js.native
    
    var languages: Record[String, UnitTranslationOptions] = js.native
  }
  
  trait HumanizerOptions
    extends StObject
       with Options {
    
    var languages: js.UndefOr[Record[String, UnitTranslationOptions]] = js.undefined
  }
  object HumanizerOptions {
    
    inline def apply(): HumanizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumanizerOptions]
    }
    
    extension [Self <: HumanizerOptions](x: Self) {
      
      inline def setLanguages(value: Record[String, UnitTranslationOptions]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.af
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ar
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.bg
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.bn
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ca
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.cs
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.cy
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.da
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.de
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.el
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.en
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.eo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.es
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.et
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.eu
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fa
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fi
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.gr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.he
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.hi
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.hr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.hu
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.id
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.is
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.it
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ja
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.km
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.kn
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ko
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ku
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.lo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.lt
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.lv
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.mk
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.mr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.nl
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.no
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.pl
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.pt
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ro
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ru
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sk
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sl
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sq
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sv
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sw
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ta
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.te
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.th
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.tr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.uk
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ur
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.vi
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_CN
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_TW
  */
  trait LanguageCode extends StObject
  object LanguageCode {
    
    inline def af: typingsJapgolly.humanizeDuration.humanizeDurationStrings.af = "af".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.af]
    
    inline def ar: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ar = "ar".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ar]
    
    inline def bg: typingsJapgolly.humanizeDuration.humanizeDurationStrings.bg = "bg".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.bg]
    
    inline def bn: typingsJapgolly.humanizeDuration.humanizeDurationStrings.bn = "bn".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.bn]
    
    inline def ca: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ca = "ca".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ca]
    
    inline def cs: typingsJapgolly.humanizeDuration.humanizeDurationStrings.cs = "cs".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.cs]
    
    inline def cy: typingsJapgolly.humanizeDuration.humanizeDurationStrings.cy = "cy".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.cy]
    
    inline def da: typingsJapgolly.humanizeDuration.humanizeDurationStrings.da = "da".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.da]
    
    inline def de: typingsJapgolly.humanizeDuration.humanizeDurationStrings.de = "de".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.de]
    
    inline def el: typingsJapgolly.humanizeDuration.humanizeDurationStrings.el = "el".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.el]
    
    inline def en: typingsJapgolly.humanizeDuration.humanizeDurationStrings.en = "en".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.en]
    
    inline def eo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.eo = "eo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.eo]
    
    inline def es: typingsJapgolly.humanizeDuration.humanizeDurationStrings.es = "es".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.es]
    
    inline def et: typingsJapgolly.humanizeDuration.humanizeDurationStrings.et = "et".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.et]
    
    inline def eu: typingsJapgolly.humanizeDuration.humanizeDurationStrings.eu = "eu".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.eu]
    
    inline def fa: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fa = "fa".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fa]
    
    inline def fi: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fi = "fi".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fi]
    
    inline def fo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fo = "fo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fo]
    
    inline def fr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fr = "fr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fr]
    
    inline def gr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.gr = "gr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.gr]
    
    inline def he: typingsJapgolly.humanizeDuration.humanizeDurationStrings.he = "he".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.he]
    
    inline def hi: typingsJapgolly.humanizeDuration.humanizeDurationStrings.hi = "hi".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.hi]
    
    inline def hr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.hr = "hr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.hr]
    
    inline def hu: typingsJapgolly.humanizeDuration.humanizeDurationStrings.hu = "hu".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.hu]
    
    inline def id: typingsJapgolly.humanizeDuration.humanizeDurationStrings.id = "id".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.id]
    
    inline def is: typingsJapgolly.humanizeDuration.humanizeDurationStrings.is = "is".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.is]
    
    inline def it: typingsJapgolly.humanizeDuration.humanizeDurationStrings.it = "it".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.it]
    
    inline def ja: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ja = "ja".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ja]
    
    inline def km: typingsJapgolly.humanizeDuration.humanizeDurationStrings.km = "km".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.km]
    
    inline def kn: typingsJapgolly.humanizeDuration.humanizeDurationStrings.kn = "kn".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.kn]
    
    inline def ko: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ko = "ko".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ko]
    
    inline def ku: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ku = "ku".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ku]
    
    inline def lo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.lo = "lo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.lo]
    
    inline def lt: typingsJapgolly.humanizeDuration.humanizeDurationStrings.lt = "lt".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.lt]
    
    inline def lv: typingsJapgolly.humanizeDuration.humanizeDurationStrings.lv = "lv".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.lv]
    
    inline def mk: typingsJapgolly.humanizeDuration.humanizeDurationStrings.mk = "mk".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.mk]
    
    inline def mr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.mr = "mr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.mr]
    
    inline def ms: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms]
    
    inline def nl: typingsJapgolly.humanizeDuration.humanizeDurationStrings.nl = "nl".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.nl]
    
    inline def no: typingsJapgolly.humanizeDuration.humanizeDurationStrings.no = "no".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.no]
    
    inline def pl: typingsJapgolly.humanizeDuration.humanizeDurationStrings.pl = "pl".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.pl]
    
    inline def pt: typingsJapgolly.humanizeDuration.humanizeDurationStrings.pt = "pt".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.pt]
    
    inline def ro: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ro = "ro".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ro]
    
    inline def ru: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ru = "ru".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ru]
    
    inline def sk: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sk = "sk".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sk]
    
    inline def sl: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sl = "sl".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sl]
    
    inline def sq: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sq = "sq".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sq]
    
    inline def sr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sr = "sr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sr]
    
    inline def sv: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sv = "sv".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sv]
    
    inline def sw: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sw = "sw".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sw]
    
    inline def ta: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ta = "ta".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ta]
    
    inline def te: typingsJapgolly.humanizeDuration.humanizeDurationStrings.te = "te".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.te]
    
    inline def th: typingsJapgolly.humanizeDuration.humanizeDurationStrings.th = "th".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.th]
    
    inline def tr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.tr = "tr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.tr]
    
    inline def uk: typingsJapgolly.humanizeDuration.humanizeDurationStrings.uk = "uk".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.uk]
    
    inline def ur: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ur = "ur".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ur]
    
    inline def vi: typingsJapgolly.humanizeDuration.humanizeDurationStrings.vi = "vi".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.vi]
    
    inline def zh_CN: typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_CN = "zh_CN".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_CN]
    
    inline def zh_TW: typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_TW = "zh_TW".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_TW]
  }
  
  trait Options extends StObject {
    
    /**
      * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
      * @default ""
      */
    var conjunction: js.UndefOr[String] = js.undefined
    
    /**
      * String to substitute for the decimal point in a decimal fraction.
      */
    var decimal: js.UndefOr[String] = js.undefined
    
    /**
      * String to display between the previous unit and the next value.
      * @default ','
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
      */
    var fallbacks: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
      * @default 'en'
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Number representing the maximum number of units to display for the duration.
      */
    var largest: js.UndefOr[Double] = js.undefined
    
    /**
      * Number that defines a maximal decimal points for float values.
      */
    var maxDecimalPoints: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
      * @default false
      */
    var round: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var serialComma: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String to display between each value and unit.
      * @default " "
      */
    var spacer: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the value used to calculate each unit of time.
      */
    var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.undefined
    
    /**
      * Array of strings to define which units are used to display the duration (if needed).
      */
    var units: js.UndefOr[js.Array[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setFallbacks(value: js.Array[String]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      inline def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      inline def setFallbacksVarargs(value: String*): Self = StObject.set(x, "fallbacks", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLargest(value: Double): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
      
      inline def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
      
      inline def setMaxDecimalPoints(value: Double): Self = StObject.set(x, "maxDecimalPoints", value.asInstanceOf[js.Any])
      
      inline def setMaxDecimalPointsUndefined: Self = StObject.set(x, "maxDecimalPoints", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSerialComma(value: Boolean): Self = StObject.set(x, "serialComma", value.asInstanceOf[js.Any])
      
      inline def setSerialCommaUndefined: Self = StObject.set(x, "serialComma", js.undefined)
      
      inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
      
      inline def setUnitMeasures(value: UnitMeasuresOptions): Self = StObject.set(x, "unitMeasures", value.asInstanceOf[js.Any])
      
      inline def setUnitMeasuresUndefined: Self = StObject.set(x, "unitMeasures", js.undefined)
      
      inline def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value*))
    }
  }
  
  /* Inlined std.Exclude<humanize-duration.humanize-duration.LanguageCode, 'gr'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.da
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.hi
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.bn
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.he
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.pt
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.uk
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.tr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.vi
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fi
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.th
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ru
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ur
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.et
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ca
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.no
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sq
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.pl
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.af
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sk
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.hu
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.te
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.is
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ja
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.cs
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.el
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.it
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.de
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ro
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.km
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_CN
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ar
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sl
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ko
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.nl
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.eu
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.eo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fa
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sv
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.bg
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ku
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.lo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ta
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_TW
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.lv
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.mk
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.sw
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.kn
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.mr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.lt
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.hr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.cy
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.id
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.en
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.fr
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.es
  */
  trait SupportedLanguage extends StObject
  object SupportedLanguage {
    
    inline def af: typingsJapgolly.humanizeDuration.humanizeDurationStrings.af = "af".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.af]
    
    inline def ar: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ar = "ar".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ar]
    
    inline def bg: typingsJapgolly.humanizeDuration.humanizeDurationStrings.bg = "bg".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.bg]
    
    inline def bn: typingsJapgolly.humanizeDuration.humanizeDurationStrings.bn = "bn".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.bn]
    
    inline def ca: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ca = "ca".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ca]
    
    inline def cs: typingsJapgolly.humanizeDuration.humanizeDurationStrings.cs = "cs".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.cs]
    
    inline def cy: typingsJapgolly.humanizeDuration.humanizeDurationStrings.cy = "cy".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.cy]
    
    inline def da: typingsJapgolly.humanizeDuration.humanizeDurationStrings.da = "da".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.da]
    
    inline def de: typingsJapgolly.humanizeDuration.humanizeDurationStrings.de = "de".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.de]
    
    inline def el: typingsJapgolly.humanizeDuration.humanizeDurationStrings.el = "el".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.el]
    
    inline def en: typingsJapgolly.humanizeDuration.humanizeDurationStrings.en = "en".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.en]
    
    inline def eo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.eo = "eo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.eo]
    
    inline def es: typingsJapgolly.humanizeDuration.humanizeDurationStrings.es = "es".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.es]
    
    inline def et: typingsJapgolly.humanizeDuration.humanizeDurationStrings.et = "et".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.et]
    
    inline def eu: typingsJapgolly.humanizeDuration.humanizeDurationStrings.eu = "eu".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.eu]
    
    inline def fa: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fa = "fa".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fa]
    
    inline def fi: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fi = "fi".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fi]
    
    inline def fo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fo = "fo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fo]
    
    inline def fr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.fr = "fr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.fr]
    
    inline def he: typingsJapgolly.humanizeDuration.humanizeDurationStrings.he = "he".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.he]
    
    inline def hi: typingsJapgolly.humanizeDuration.humanizeDurationStrings.hi = "hi".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.hi]
    
    inline def hr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.hr = "hr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.hr]
    
    inline def hu: typingsJapgolly.humanizeDuration.humanizeDurationStrings.hu = "hu".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.hu]
    
    inline def id: typingsJapgolly.humanizeDuration.humanizeDurationStrings.id = "id".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.id]
    
    inline def is: typingsJapgolly.humanizeDuration.humanizeDurationStrings.is = "is".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.is]
    
    inline def it: typingsJapgolly.humanizeDuration.humanizeDurationStrings.it = "it".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.it]
    
    inline def ja: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ja = "ja".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ja]
    
    inline def km: typingsJapgolly.humanizeDuration.humanizeDurationStrings.km = "km".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.km]
    
    inline def kn: typingsJapgolly.humanizeDuration.humanizeDurationStrings.kn = "kn".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.kn]
    
    inline def ko: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ko = "ko".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ko]
    
    inline def ku: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ku = "ku".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ku]
    
    inline def lo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.lo = "lo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.lo]
    
    inline def lt: typingsJapgolly.humanizeDuration.humanizeDurationStrings.lt = "lt".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.lt]
    
    inline def lv: typingsJapgolly.humanizeDuration.humanizeDurationStrings.lv = "lv".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.lv]
    
    inline def mk: typingsJapgolly.humanizeDuration.humanizeDurationStrings.mk = "mk".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.mk]
    
    inline def mr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.mr = "mr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.mr]
    
    inline def ms: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms]
    
    inline def nl: typingsJapgolly.humanizeDuration.humanizeDurationStrings.nl = "nl".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.nl]
    
    inline def no: typingsJapgolly.humanizeDuration.humanizeDurationStrings.no = "no".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.no]
    
    inline def pl: typingsJapgolly.humanizeDuration.humanizeDurationStrings.pl = "pl".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.pl]
    
    inline def pt: typingsJapgolly.humanizeDuration.humanizeDurationStrings.pt = "pt".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.pt]
    
    inline def ro: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ro = "ro".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ro]
    
    inline def ru: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ru = "ru".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ru]
    
    inline def sk: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sk = "sk".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sk]
    
    inline def sl: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sl = "sl".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sl]
    
    inline def sq: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sq = "sq".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sq]
    
    inline def sr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sr = "sr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sr]
    
    inline def sv: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sv = "sv".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sv]
    
    inline def sw: typingsJapgolly.humanizeDuration.humanizeDurationStrings.sw = "sw".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.sw]
    
    inline def ta: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ta = "ta".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ta]
    
    inline def te: typingsJapgolly.humanizeDuration.humanizeDurationStrings.te = "te".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.te]
    
    inline def th: typingsJapgolly.humanizeDuration.humanizeDurationStrings.th = "th".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.th]
    
    inline def tr: typingsJapgolly.humanizeDuration.humanizeDurationStrings.tr = "tr".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.tr]
    
    inline def uk: typingsJapgolly.humanizeDuration.humanizeDurationStrings.uk = "uk".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.uk]
    
    inline def ur: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ur = "ur".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ur]
    
    inline def vi: typingsJapgolly.humanizeDuration.humanizeDurationStrings.vi = "vi".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.vi]
    
    inline def zh_CN: typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_CN = "zh_CN".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_CN]
    
    inline def zh_TW: typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_TW = "zh_TW".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.zh_TW]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.y
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.mo
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.w
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.d
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.h
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.m
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.s
    - typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms
  */
  trait Unit extends StObject
  object Unit {
    
    inline def d: typingsJapgolly.humanizeDuration.humanizeDurationStrings.d = "d".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.d]
    
    inline def h: typingsJapgolly.humanizeDuration.humanizeDurationStrings.h = "h".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.h]
    
    inline def m: typingsJapgolly.humanizeDuration.humanizeDurationStrings.m = "m".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.m]
    
    inline def mo: typingsJapgolly.humanizeDuration.humanizeDurationStrings.mo = "mo".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.mo]
    
    inline def ms: typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.ms]
    
    inline def s: typingsJapgolly.humanizeDuration.humanizeDurationStrings.s = "s".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.s]
    
    inline def w: typingsJapgolly.humanizeDuration.humanizeDurationStrings.w = "w".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.w]
    
    inline def y: typingsJapgolly.humanizeDuration.humanizeDurationStrings.y = "y".asInstanceOf[typingsJapgolly.humanizeDuration.humanizeDurationStrings.y]
  }
  
  trait UnitMeasuresOptions extends StObject {
    
    var d: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var m: js.UndefOr[Double] = js.undefined
    
    var mo: js.UndefOr[Double] = js.undefined
    
    var ms: js.UndefOr[Double] = js.undefined
    
    var s: js.UndefOr[Double] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object UnitMeasuresOptions {
    
    inline def apply(): UnitMeasuresOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitMeasuresOptions]
    }
    
    extension [Self <: UnitMeasuresOptions](x: Self) {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMo(value: Double): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
      
      inline def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait UnitTranslationOptions extends StObject {
    
    var d: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var h: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var m: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var mo: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var ms: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var s: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var w: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
    
    var y: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.undefined
  }
  object UnitTranslationOptions {
    
    inline def apply(): UnitTranslationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitTranslationOptions]
    }
    
    extension [Self <: UnitTranslationOptions](x: Self) {
      
      inline def setD(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "d", js.Any.fromFunction1(value))
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setH(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "h", js.Any.fromFunction1(value))
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setM(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "m", js.Any.fromFunction1(value))
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMo(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "mo", js.Any.fromFunction1(value))
      
      inline def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      inline def setMs(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "ms", js.Any.fromFunction1(value))
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setS(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "s", js.Any.fromFunction1(value))
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setW(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "w", js.Any.fromFunction1(value))
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setY(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type _To = Humanizer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Humanizer = ^
}
