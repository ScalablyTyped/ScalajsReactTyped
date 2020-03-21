package typingsJapgolly.rrule

import typingsJapgolly.rrule.i18nMod.Language
import typingsJapgolly.rrule.weekdayMod.WeekdayStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RRule ()
    extends typingsJapgolly.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class RRuleSet ()
    extends typingsJapgolly.rrule.rrulesetMod.default {
    def this(noCache: Boolean) = this()
  }
  
  @js.native
  class Weekday protected ()
    extends typingsJapgolly.rrule.weekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  
  @js.native
  class default ()
    extends typingsJapgolly.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  
  def rrulestr(s: String): typingsJapgolly.rrule.rruleMod.default | typingsJapgolly.rrule.rrulesetMod.default = js.native
  def rrulestr(s: String, options: PartialRRuleStrOptions): typingsJapgolly.rrule.rruleMod.default | typingsJapgolly.rrule.rrulesetMod.default = js.native
  @js.native
  object Frequency extends js.Object {
    /* 3 */ val DAILY: typingsJapgolly.rrule.typesMod.Frequency.DAILY with Double = js.native
    /* 4 */ val HOURLY: typingsJapgolly.rrule.typesMod.Frequency.HOURLY with Double = js.native
    /* 5 */ val MINUTELY: typingsJapgolly.rrule.typesMod.Frequency.MINUTELY with Double = js.native
    /* 1 */ val MONTHLY: typingsJapgolly.rrule.typesMod.Frequency.MONTHLY with Double = js.native
    /* 6 */ val SECONDLY: typingsJapgolly.rrule.typesMod.Frequency.SECONDLY with Double = js.native
    /* 2 */ val WEEKLY: typingsJapgolly.rrule.typesMod.Frequency.WEEKLY with Double = js.native
    /* 0 */ val YEARLY: typingsJapgolly.rrule.typesMod.Frequency.YEARLY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rrule.typesMod.Frequency with Double] = js.native
  }
  
  /* static members */
  @js.native
  object RRule extends js.Object {
    val DAILY: String | Double = js.native
    val FR: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val TH: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val TU: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val WE: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    def fromString(str: String): typingsJapgolly.rrule.rruleMod.RRule = js.native
    def fromText(text: String): typingsJapgolly.rrule.rruleMod.RRule = js.native
    def fromText(text: String, language: Language): typingsJapgolly.rrule.rruleMod.RRule = js.native
    def optionsToString(options: PartialOptions): String = js.native
    def parseString(rfcString: String): PartialOptions = js.native
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
  /* static members */
  @js.native
  object Weekday extends js.Object {
    def fromStr(str: WeekdayStr): typingsJapgolly.rrule.weekdayMod.Weekday = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DAILY: String | Double = js.native
    val FR: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val TH: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val TU: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val WE: typingsJapgolly.rrule.weekdayMod.Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    def fromString(str: String): typingsJapgolly.rrule.rruleMod.RRule = js.native
    def fromText(text: String): typingsJapgolly.rrule.rruleMod.RRule = js.native
    def fromText(text: String, language: Language): typingsJapgolly.rrule.rruleMod.RRule = js.native
    def optionsToString(options: PartialOptions): String = js.native
    def parseString(rfcString: String): PartialOptions = js.native
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
}

