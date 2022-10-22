package typingsJapgolly.rrule

import typingsJapgolly.rrule.anon.PartialOptions
import typingsJapgolly.rrule.anon.PartialRRuleStrOptions
import typingsJapgolly.rrule.distEsmNlpI18nMod.Language
import typingsJapgolly.rrule.distEsmWeekdayMod.WeekdayStr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rrule", "Frequency")
  @js.native
  object Frequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rrule.distEsmTypesMod.Frequency & Double] = js.native
    
    /* 3 */ val DAILY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.DAILY & Double = js.native
    
    /* 4 */ val HOURLY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.HOURLY & Double = js.native
    
    /* 5 */ val MINUTELY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.MINUTELY & Double = js.native
    
    /* 1 */ val MONTHLY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.MONTHLY & Double = js.native
    
    /* 6 */ val SECONDLY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.SECONDLY & Double = js.native
    
    /* 2 */ val WEEKLY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.WEEKLY & Double = js.native
    
    /* 0 */ val YEARLY: typingsJapgolly.rrule.distEsmTypesMod.Frequency.YEARLY & Double = js.native
  }
  
  @JSImport("rrule", "RRule")
  @js.native
  open class RRule ()
    extends typingsJapgolly.rrule.distEsmRruleMod.RRule {
    def this(options: PartialOptions) = this()
    def this(options: Unit, noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  object RRule {
    
    @JSImport("rrule", "RRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule", "RRule.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule", "RRule.FR")
    @js.native
    val FR: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule", "RRule.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule", "RRule.MO")
    @js.native
    val MO: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.SA")
    @js.native
    val SA: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.SU")
    @js.native
    val SU: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.TH")
    @js.native
    val TH: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.TU")
    @js.native
    val TU: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.WE")
    @js.native
    val WE: typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    inline def fromString(str: String): typingsJapgolly.rrule.distEsmRruleMod.RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rrule.distEsmRruleMod.RRule]
    
    inline def fromText(text: String): typingsJapgolly.rrule.distEsmRruleMod.RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rrule.distEsmRruleMod.RRule]
    inline def fromText(text: String, language: Language): typingsJapgolly.rrule.distEsmRruleMod.RRule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rrule.distEsmRruleMod.RRule]
    
    @JSImport("rrule", "RRule.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    inline def optionsToString(options: PartialOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsToString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "RRule.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    inline def parseString(rfcString: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(rfcString.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    inline def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    inline def parseText(text: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    inline def parseText(text: String, language: Language): PartialOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions]
  }
  
  @JSImport("rrule", "RRuleSet")
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    * The same stratagy as RRule on cache, default to false
    * @constructor
    */
  open class RRuleSet ()
    extends typingsJapgolly.rrule.distEsmRrulesetMod.RRuleSet {
    def this(noCache: Boolean) = this()
  }
  
  @JSImport("rrule", "Weekday")
  @js.native
  open class Weekday protected ()
    extends typingsJapgolly.rrule.distEsmWeekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  /* static members */
  object Weekday {
    
    @JSImport("rrule", "Weekday")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStr(str: WeekdayStr): typingsJapgolly.rrule.distEsmWeekdayMod.Weekday = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStr")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rrule.distEsmWeekdayMod.Weekday]
  }
  
  inline def rrulestr(s: String): typingsJapgolly.rrule.distEsmRruleMod.RRule | typingsJapgolly.rrule.distEsmRrulesetMod.RRuleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rrule.distEsmRruleMod.RRule | typingsJapgolly.rrule.distEsmRrulesetMod.RRuleSet]
  inline def rrulestr(s: String, options: PartialRRuleStrOptions): typingsJapgolly.rrule.distEsmRruleMod.RRule | typingsJapgolly.rrule.distEsmRrulesetMod.RRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.rrule.distEsmRruleMod.RRule | typingsJapgolly.rrule.distEsmRrulesetMod.RRuleSet]
}
