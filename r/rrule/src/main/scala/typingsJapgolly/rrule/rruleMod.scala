package typingsJapgolly.rrule

import typingsJapgolly.rrule.cacheMod.Cache
import typingsJapgolly.rrule.cacheMod.CacheKeys
import typingsJapgolly.rrule.i18nMod.Language
import typingsJapgolly.rrule.rruleStrings.all
import typingsJapgolly.rrule.rruleStrings.byeaster
import typingsJapgolly.rrule.rruleStrings.byhour
import typingsJapgolly.rrule.rruleStrings.byminute
import typingsJapgolly.rrule.rruleStrings.bymonth
import typingsJapgolly.rrule.rruleStrings.bymonthday
import typingsJapgolly.rrule.rruleStrings.bynmonthday
import typingsJapgolly.rrule.rruleStrings.bynweekday
import typingsJapgolly.rrule.rruleStrings.bysecond
import typingsJapgolly.rrule.rruleStrings.bysetpos
import typingsJapgolly.rrule.rruleStrings.byweekday
import typingsJapgolly.rrule.rruleStrings.byweekno
import typingsJapgolly.rrule.rruleStrings.byyearday
import typingsJapgolly.rrule.rruleStrings.count
import typingsJapgolly.rrule.rruleStrings.dtstart
import typingsJapgolly.rrule.rruleStrings.freq
import typingsJapgolly.rrule.rruleStrings.interval
import typingsJapgolly.rrule.rruleStrings.tzid
import typingsJapgolly.rrule.rruleStrings.until
import typingsJapgolly.rrule.rruleStrings.wkst
import typingsJapgolly.rrule.totextMod.DateFormatter
import typingsJapgolly.rrule.totextMod.GetText
import typingsJapgolly.rrule.typesMod.IterResultType
import typingsJapgolly.rrule.typesMod.Options
import typingsJapgolly.rrule.typesMod.ParsedOptions
import typingsJapgolly.rrule.typesMod.QueryMethodTypes
import typingsJapgolly.rrule.typesMod.QueryMethods
import typingsJapgolly.rrule.weekdayMod.Weekday
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/rrule", JSImport.Namespace)
@js.native
object rruleMod extends js.Object {
  @js.native
  trait RRule extends QueryMethods {
    var _cache: Cache | Null = js.native
    var _cacheGet: js.Any = js.native
    var options: ParsedOptions = js.native
    var origOptions: PartialOptions = js.native
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[Date], args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Date, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[Date], args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Date, args: PartialIterArgs): Unit = js.native
    /* protected */ def _iter[M /* <: QueryMethodTypes */](iterResult: typingsJapgolly.rrule.iterresultMod.default[M]): IterResultType[M] = js.native
    /**
      * Returns the first recurrence after the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      * @return Date or null
      */
    def after(dt: js.Date): js.Date = js.native
    def all(iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]): js.Array[js.Date] = js.native
    /**
      * Returns the last recurrence before the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      * @return Date or null
      */
    def before(dt: js.Date): js.Date = js.native
    /**
      * Returns all the occurrences of the rrule between after and before.
      * The inc keyword defines what happens if after and/or before are
      * themselves occurrences. With inc == True, they will be included in the
      * list, if they are found in the recurrence set.
      * @return Array
      */
    def between(after: js.Date, before: js.Date): js.Array[js.Date] = js.native
    def between(
      after: js.Date,
      before: js.Date,
      inc: Boolean,
      iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
    ): js.Array[js.Date] = js.native
    /**
      * Returns the number of recurrences in this set. It will have go trough
      * the whole recurrence, if this hasn't been done before.
      */
    def count(): Double = js.native
    def isFullyConvertibleToText(): Boolean = js.native
    /**
      * Will convert all rules described in nlp:ToText
      * to text.
      */
    def toText(): String = js.native
    def toText(gettext: GetText): String = js.native
    def toText(gettext: GetText, language: Language): String = js.native
    def toText(gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
  }
  
  @js.native
  class default () extends RRule {
    def this(options: PartialOptions) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
    /* CompleteClass */
    override def after(date: js.Date, inc: Boolean): js.Date = js.native
    /* CompleteClass */
    override def all(): js.Array[js.Date] = js.native
    /* CompleteClass */
    override def before(date: js.Date, inc: Boolean): js.Date = js.native
    /* CompleteClass */
    override def between(after: js.Date, before: js.Date, inc: Boolean): js.Array[js.Date] = js.native
  }
  
  val DEFAULT_OPTIONS: Options = js.native
  val defaultKeys: js.Array[
    freq | dtstart | interval | wkst | count | until | tzid | bysetpos | bymonth | bymonthday | bynmonthday | byyearday | byweekno | byweekday | bynweekday | byhour | byminute | bysecond | byeaster
  ] = js.native
  @js.native
  object Days extends js.Object {
    var FR: Weekday = js.native
    var MO: Weekday = js.native
    var SA: Weekday = js.native
    var SU: Weekday = js.native
    var TH: Weekday = js.native
    var TU: Weekday = js.native
    var WE: Weekday = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DAILY: String | Double = js.native
    val FR: Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: Weekday = js.native
    val TH: Weekday = js.native
    val TU: Weekday = js.native
    val WE: Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    def fromString(str: String): RRule = js.native
    def fromText(text: String): RRule = js.native
    def fromText(text: String, language: Language): RRule = js.native
    def optionsToString(options: PartialOptions): String = js.native
    def parseString(rfcString: String): PartialOptions = js.native
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
}

