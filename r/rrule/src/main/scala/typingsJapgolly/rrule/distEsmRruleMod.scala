package typingsJapgolly.rrule

import typingsJapgolly.rrule.anon.PartialIterArgs
import typingsJapgolly.rrule.anon.PartialOptions
import typingsJapgolly.rrule.distEsmCacheMod.Cache
import typingsJapgolly.rrule.distEsmCacheMod.CacheKeys
import typingsJapgolly.rrule.distEsmIterresultMod.default
import typingsJapgolly.rrule.distEsmNlpI18nMod.Language
import typingsJapgolly.rrule.distEsmNlpTotextMod.DateFormatter
import typingsJapgolly.rrule.distEsmNlpTotextMod.GetText
import typingsJapgolly.rrule.distEsmTypesMod.IterResultType
import typingsJapgolly.rrule.distEsmTypesMod.Options
import typingsJapgolly.rrule.distEsmTypesMod.ParsedOptions
import typingsJapgolly.rrule.distEsmTypesMod.QueryMethodTypes
import typingsJapgolly.rrule.distEsmTypesMod.QueryMethods
import typingsJapgolly.rrule.distEsmWeekdayMod.Weekday
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmRruleMod {
  
  @JSImport("rrule/dist/esm/rrule", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: Options = js.native
  
  object Days {
    
    @JSImport("rrule/dist/esm/rrule", "Days")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/rrule", "Days.FR")
    @js.native
    def FR: Weekday = js.native
    inline def FR_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FR")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "Days.MO")
    @js.native
    def MO: Weekday = js.native
    inline def MO_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MO")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "Days.SA")
    @js.native
    def SA: Weekday = js.native
    inline def SA_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SA")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "Days.SU")
    @js.native
    def SU: Weekday = js.native
    inline def SU_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SU")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "Days.TH")
    @js.native
    def TH: Weekday = js.native
    inline def TH_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TH")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "Days.TU")
    @js.native
    def TU: Weekday = js.native
    inline def TU_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TU")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "Days.WE")
    @js.native
    def WE: Weekday = js.native
    inline def WE_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rrule/dist/esm/rrule", "RRule")
  @js.native
  open class RRule ()
    extends StObject
       with QueryMethods {
    def this(options: PartialOptions) = this()
    def this(options: Unit, noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
    
    var _cache: Cache | Null = js.native
    
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date, args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
    
    /* private */ var _cacheGet: Any = js.native
    
    /* protected */ def _iter[M /* <: QueryMethodTypes */](iterResult: default[M]): IterResultType[M] = js.native
    
    /* CompleteClass */
    override def after(date: js.Date, inc: Boolean): js.Date = js.native
    /**
      * Returns the first recurrence after the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      *
      * @return Date or null
      */
    def after(dt: js.Date): js.Date = js.native
    
    /* CompleteClass */
    override def all(): js.Array[js.Date] = js.native
    def all(iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]): js.Array[js.Date] = js.native
    
    /* CompleteClass */
    override def before(date: js.Date, inc: Boolean): js.Date = js.native
    /**
      * Returns the last recurrence before the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      *
      * @return Date or null
      */
    def before(dt: js.Date): js.Date = js.native
    
    /**
      * Returns all the occurrences of the rrule between after and before.
      * The inc keyword defines what happens if after and/or before are
      * themselves occurrences. With inc == True, they will be included in the
      * list, if they are found in the recurrence set.
      *
      * @return Array
      */
    def between(after: js.Date, before: js.Date): js.Array[js.Date] = js.native
    /* CompleteClass */
    override def between(after: js.Date, before: js.Date, inc: Boolean): js.Array[js.Date] = js.native
    def between(
      after: js.Date,
      before: js.Date,
      inc: Boolean,
      iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
    ): js.Array[js.Date] = js.native
    def between(
      after: js.Date,
      before: js.Date,
      inc: Unit,
      iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
    ): js.Array[js.Date] = js.native
    
    /**
      * Returns the number of recurrences in this set. It will have go trough
      * the whole recurrence, if this hasn't been done before.
      */
    def count(): Double = js.native
    
    def isFullyConvertibleToText(): Boolean = js.native
    
    var options: ParsedOptions = js.native
    
    var origOptions: PartialOptions = js.native
    
    /**
      * Will convert all rules described in nlp:ToText
      * to text.
      */
    def toText(): String = js.native
    def toText(gettext: Unit, language: Unit, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: Unit, language: Language): String = js.native
    def toText(gettext: Unit, language: Language, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: GetText): String = js.native
    def toText(gettext: GetText, language: Unit, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: GetText, language: Language): String = js.native
    def toText(gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
  }
  /* static members */
  object RRule {
    
    @JSImport("rrule/dist/esm/rrule", "RRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.FR")
    @js.native
    val FR: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.MO")
    @js.native
    val MO: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.SA")
    @js.native
    val SA: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.SU")
    @js.native
    val SU: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.TH")
    @js.native
    val TH: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.TU")
    @js.native
    val TU: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.WE")
    @js.native
    val WE: Weekday = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/rrule", "RRule.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    inline def fromString(str: String): RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[RRule]
    
    inline def fromText(text: String): RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[RRule]
    inline def fromText(text: String, language: Language): RRule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[RRule]
    
    @JSImport("rrule/dist/esm/rrule", "RRule.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    inline def optionsToString(options: PartialOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsToString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/rrule", "RRule.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    inline def parseString(rfcString: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(rfcString.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    inline def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    inline def parseText(text: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    inline def parseText(text: String, language: Language): PartialOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions]
  }
  
  @JSImport("rrule/dist/esm/rrule", "defaultKeys")
  @js.native
  val defaultKeys: js.Array[
    freq | dtstart | interval | wkst | count | until | tzid | bysetpos | bymonth | bymonthday | bynmonthday | byyearday | byweekno | byweekday | bynweekday | byhour | byminute | bysecond | byeaster
  ] = js.native
}
