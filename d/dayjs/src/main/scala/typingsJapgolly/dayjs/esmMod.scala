package typingsJapgolly.dayjs

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.dayjs.anon.D
import typingsJapgolly.dayjs.anon.FnCall
import typingsJapgolly.dayjs.anon.PartialILocale
import typingsJapgolly.dayjs.dayjsStrings.`[]`
import typingsJapgolly.dayjs.dayjsStrings.d_
import typingsJapgolly.dayjs.dayjsStrings.long
import typingsJapgolly.dayjs.dayjsStrings.m_
import typingsJapgolly.dayjs.dayjsStrings.short
import typingsJapgolly.dayjs.esmPluginDurationMod.CreateDurationType
import typingsJapgolly.dayjs.esmPluginDurationMod.Duration
import typingsJapgolly.dayjs.esmPluginIsoWeekMod.ISOUnitType
import typingsJapgolly.dayjs.esmPluginToObjectMod.DayjsObject
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  inline def apply(): Dayjs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: Unit, format: OptionType, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType): Dayjs = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  inline def apply(date: ConfigType, format: OptionType, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dayjs/esm", "Dayjs")
  @js.native
  open class Dayjs ()
    extends StObject
       with _ConfigType {
    def this(config: ConfigType) = this()
    
    def add(argument: js.Object): typingsJapgolly.dayjs.esmPluginObjectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def add(duration: Duration): typingsJapgolly.dayjs.esmPluginDurationMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object with a specified amount of time added.
      * ```
      * dayjs().add(7, 'day')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/add
      */
    def add(value: Double): Dayjs = js.native
    def add(value: Double, unit: ManipulateType): Dayjs = js.native
    def add(value: Double, unit: QUnitType): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def calendar(): String = js.native
    def calendar(referenceTime: Unit, formats: js.Object): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
    def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
    
    /**
      * Get the date of the month.
      * ```
      * dayjs().date()// => 1-31
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(): Double = js.native
    /**
      * Set the date of the month.
      *
      * Accepts numbers from 1 to 31. If the range is exceeded, it will bubble up to the next months.
      * ```
      * dayjs().date(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(value: Double): Dayjs = js.native
    
    def dates(): Double = js.native
    def dates(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the day of the week.
      *
      * Returns numbers from 0 (Sunday) to 6 (Saturday).
      * ```
      * dayjs().day()// 0-6
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(): Double = js.native
    /**
      * Set the day of the week.
      *
      * Accepts numbers from 0 (Sunday) to 6 (Saturday). If the range is exceeded, it will bubble up to next weeks.
      * ```
      * dayjs().day(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(value: Double): Dayjs = js.native
    
    def dayOfYear(): Double = js.native
    def dayOfYear(value: Double): typingsJapgolly.dayjs.esmPluginDayOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def days(): Double = js.native
    def days(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the number of days in the current month.
      * ```
      * dayjs('2019-01-25').daysInMonth() // 31
      * ```
      * Docs: https://day.js.org/docs/en/display/days-in-month
      */
    def daysInMonth(): Double = js.native
    
    /**
      * This indicates the difference between two date-time in the specified unit.
      *
      * To get the difference in milliseconds, use `dayjs#diff`
      * ```
      * const date1 = dayjs('2019-01-25')
      * const date2 = dayjs('2018-06-05')
      * date1.diff(date2) // 20214000000 default milliseconds
      * date1.diff() // milliseconds to current time
      * ```
      *
      * To get the difference in another unit of measurement, pass that measurement as the second argument.
      * ```
      * const date1 = dayjs('2019-01-25')
      * date1.diff('2018-06-05', 'month') // 7
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/display/difference
      */
    def diff(): Double = js.native
    def diff(date: Unit, unit: Unit, float: Boolean): Double = js.native
    def diff(date: Unit, unit: OpUnitType): Double = js.native
    def diff(date: Unit, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: Unit, unit: QUnitType): Double = js.native
    def diff(date: Unit, unit: QUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType): Double = js.native
    def diff(date: ConfigType, unit: Unit, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: QUnitType): Double = js.native
    def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
    
    def endOf(unit: OpUnitType): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def endOf(unit: QUnitType): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def endOf(unit: ISOUnitType): typingsJapgolly.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object and set it to the end of a unit of time.
      * ```
      * dayjs().endOf('month')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/end-of
      */
    @JSName("endOf")
    def endOf_Dayjs(unit: OpUnitType): Dayjs = js.native
    
    /**
      * Get the formatted date according to the string of tokens passed in.
      *
      * To escape characters, wrap them in square brackets (e.g. [MM]).
      * ```
      * dayjs().format()// => current date in ISO8601, without fraction seconds e.g. '2020-04-02T08:02:17-05:00'
      * dayjs('2019-01-25').format('[YYYYescape] YYYY-MM-DDTHH:mm:ssZ[Z]')// 'YYYYescape 2019-01-25T00:00:00-02:00Z'
      * dayjs('2019-01-25').format('DD/MM/YYYY') // '25/01/2019'
      * ```
      * Docs: https://day.js.org/docs/en/display/format
      */
    def format(): String = js.native
    def format(template: String): String = js.native
    
    def from(compared: ConfigType): String = js.native
    def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def fromNow(): String = js.native
    def fromNow(withoutSuffix: Boolean): String = js.native
    
    /**
      * String getter, returns the corresponding information getting from Day.js object.
      *
      * In general:
      * ```
      * dayjs().get(unit) === dayjs()[unit]()
      * ```
      * Units are case insensitive, and support plural and short forms.
      * ```
      * dayjs().get('year')
      * dayjs().get('month') // start 0
      * dayjs().get('date')
      * ```
      * Docs: https://day.js.org/docs/en/get-set/get
      */
    def get(unit: UnitType): Double = js.native
    
    /**
      * Get the hour.
      * ```
      * dayjs().hour()// => 0-23
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(): Double = js.native
    /**
      * Set the hour.
      *
      * Accepts numbers from 0 to 23. If the range is exceeded, it will bubble up to the next day.
      * ```
      * dayjs().hour(12)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(value: Double): Dayjs = js.native
    
    def hours(): Double = js.native
    def hours(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * This indicates whether the Day.js object is after the other supplied date-time.
      * ```
      * dayjs().isAfter(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isAfter('2011-01-01', 'year')// => boolean
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/query/is-after
      */
    def isAfter(date: ConfigType): Boolean = js.native
    def isAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    
    /**
      * This indicates whether the Day.js object is before the other supplied date-time.
      * ```
      * dayjs().isBefore(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isBefore('2011-01-01', 'year')// => boolean
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/query/is-before
      */
    def isBefore(date: ConfigType): Boolean = js.native
    def isBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    
    def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Null, d: (/* () */ String) | `[]`): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Unit, d: (/* () */ String) | `[]`): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: (/* () */ String) | `[]`): Boolean = js.native
    
    def isLeapYear(): Boolean = js.native
    
    /**
      * This indicates whether the Day.js object is the same as the other supplied date-time.
      * ```
      * dayjs().isSame(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isSame('2011-01-01', 'year')// => boolean
      * ```
      * Docs: https://day.js.org/docs/en/query/is-same
      */
    def isSame(date: ConfigType): Boolean = js.native
    def isSame(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    
    def isSameOrAfter(date: ConfigType): Boolean = js.native
    def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    
    def isSameOrBefore(date: ConfigType): Boolean = js.native
    def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    
    def isToday(): Boolean = js.native
    
    def isTomorrow(): Boolean = js.native
    
    def isUTC(): Boolean = js.native
    
    /**
      * This returns a `boolean` indicating whether the Day.js object contains a valid date or not.
      * ```
      * dayjs().isValid()// => boolean
      * ```
      * Docs: https://day.js.org/docs/en/parse/is-valid
      */
    def isValid(): Boolean = js.native
    
    def isYesterday(): Boolean = js.native
    
    def isoWeek(): Double = js.native
    def isoWeek(value: Double): typingsJapgolly.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def isoWeekYear(): Double = js.native
    
    def isoWeekday(): Double = js.native
    def isoWeekday(value: Double): typingsJapgolly.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def isoWeeksInYear(): Double = js.native
    
    def local(): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def locale(): String = js.native
    def locale(preset: String): Dayjs = js.native
    def locale(preset: String, `object`: PartialILocale): Dayjs = js.native
    def locale(preset: ILocale): Dayjs = js.native
    def locale(preset: ILocale, `object`: PartialILocale): Dayjs = js.native
    
    def localeData(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.InstanceLocaleDataReturn = js.native
    
    /**
      * Get the milliseconds.
      * ```
      * dayjs().millisecond()// => 0-999
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(): Double = js.native
    /**
      * Set the milliseconds.
      *
      * Accepts numbers from 0 to 999. If the range is exceeded, it will bubble up to the next seconds.
      * ```
      * dayjs().millisecond(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(value: Double): Dayjs = js.native
    
    def milliseconds(): Double = js.native
    def milliseconds(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the minutes.
      * ```
      * dayjs().minute()// => 0-59
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(): Double = js.native
    /**
      * Set the minutes.
      *
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the next hour.
      * ```
      * dayjs().minute(59)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(value: Double): Dayjs = js.native
    
    def minutes(): Double = js.native
    def minutes(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the month.
      *
      * Months are zero indexed, so January is month 0.
      * ```
      * dayjs().month()// => 0-11
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(): Double = js.native
    /**
      * Set the month.
      *
      * Months are zero indexed, so January is month 0.
      *
      * Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the next year.
      * ```
      * dayjs().month(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(value: Double): Dayjs = js.native
    
    def months(): Double = js.native
    def months(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def offsetName(): js.UndefOr[String] = js.native
    def offsetName(`type`: short | long): js.UndefOr[String] = js.native
    
    def quarter(): Double = js.native
    def quarter(quarter: Double): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the seconds.
      * ```
      * dayjs().second()// => 0-59
      * ```
      * Docs: https://day.js.org/docs/en/get-set/second
      */
    def second(): Double = js.native
    /**
      * Set the seconds.
      *
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the next minutes.
      * ```
      * dayjs().second(1)// Dayjs
      * ```
      */
    def second(value: Double): Dayjs = js.native
    
    def seconds(): Double = js.native
    def seconds(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def set(argument: js.Object): typingsJapgolly.dayjs.esmPluginObjectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Generic setter, accepting unit as first argument, and value as second, returns a new instance with the applied changes.
      *
      * In general:
      * ```
      * dayjs().set(unit, value) === dayjs()[unit](value)
      * ```
      * Units are case insensitive, and support plural and short forms.
      * ```
      * dayjs().set('date', 1)
      * dayjs().set('month', 3) // April
      * dayjs().set('second', 30)
      * ```
      * Docs: https://day.js.org/docs/en/get-set/set
      */
    def set(unit: UnitType, value: Double): Dayjs = js.native
    
    def startOf(unit: OpUnitType): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def startOf(unit: QUnitType): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def startOf(unit: ISOUnitType): typingsJapgolly.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object and set it to the start of a unit of time.
      * ```
      * dayjs().startOf('year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/start-of
      */
    @JSName("startOf")
    def startOf_Dayjs(unit: OpUnitType): Dayjs = js.native
    
    def subtract(argument: js.Object): typingsJapgolly.dayjs.esmPluginObjectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def subtract(duration: Duration): typingsJapgolly.dayjs.esmPluginDurationMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object with a specified amount of time subtracted.
      * ```
      * dayjs().subtract(7, 'year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/subtract
      */
    def subtract(value: Double): Dayjs = js.native
    def subtract(value: Double, unit: ManipulateType): Dayjs = js.native
    def subtract(value: Double, unit: QUnitType): typingsJapgolly.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def to(compared: ConfigType): String = js.native
    def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    /**
      * To get a copy of the native `Date` object parsed from the Day.js object use `dayjs#toDate`.
      * ```
      * dayjs('2019-01-25').toDate()// => Date
      * ```
      */
    def toDate(): js.Date = js.native
    
    /**
      * To format as an ISO 8601 string.
      * ```
      * dayjs('2019-01-25').toISOString() // '2019-01-25T02:00:00.000Z'
      * ```
      * Docs: https://day.js.org/docs/en/display/as-iso-string
      */
    def toISOString(): String = js.native
    
    /**
      * To serialize as an ISO 8601 string.
      * ```
      * dayjs('2019-01-25').toJSON() // '2019-01-25T02:00:00.000Z'
      * ```
      * Docs: https://day.js.org/docs/en/display/as-json
      */
    def toJSON(): String = js.native
    
    def toNow(): String = js.native
    def toNow(withoutSuffix: Boolean): String = js.native
    
    def toObject(): DayjsObject = js.native
    
    def tz(): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: String): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: String, keepLocalTime: Boolean): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: Unit, keepLocalTime: Boolean): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * This returns the Unix timestamp (the number of **seconds** since the Unix Epoch) of the Day.js object.
      * ```
      * dayjs('2019-01-25').unix() // 1548381600
      * ```
      * This value is floored to the nearest second, and does not include a milliseconds component.
      *
      * Docs: https://day.js.org/docs/en/display/unix-timestamp
      */
    def unix(): Double = js.native
    
    def utc(): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utc(keepLocalTime: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the UTC offset in minutes.
      * ```
      * dayjs().utcOffset()
      * ```
      * Docs: https://day.js.org/docs/en/manipulate/utc-offset
      */
    def utcOffset(): Double = js.native
    def utcOffset(offset: String): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: String, keepLocalTime: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double, keepLocalTime: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def week(): Double = js.native
    def week(value: Double): typingsJapgolly.dayjs.esmPluginWeekOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def weekYear(): Double = js.native
    
    def weekday(): Double = js.native
    def weekday(value: Double): typingsJapgolly.dayjs.esmPluginWeekdayMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def weeks(): Double = js.native
    def weeks(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the year.
      * ```
      * dayjs().year()// => 2020
      * ```
      * Docs: https://day.js.org/docs/en/get-set/year
      */
    def year(): Double = js.native
    /**
      * Set the year.
      * ```
      * dayjs().year(2000)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/year
      */
    def year(value: Double): Dayjs = js.native
    
    def years(): Double = js.native
    def years(value: Double): typingsJapgolly.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  }
  
  @JSImport("dayjs/esm", "duration")
  @js.native
  val duration: CreateDurationType = js.native
  
  inline def extend[T](plugin: PluginFunc[T]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  inline def extend[T](plugin: PluginFunc[T], option: T): Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  
  inline def isDayjs(d: Any): /* is dayjs.dayjs/esm.Dayjs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayjs")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs/esm.Dayjs */ Boolean]
  
  inline def isDuration(d: Any): /* is dayjs.dayjs/esm/plugin/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs/esm/plugin/duration.Duration */ Boolean]
  
  inline def isMoment(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  inline def locale(preset: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(preset: String, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: String, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: String, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: Unit, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: Unit, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: Unit, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: ILocale): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def locale(preset: ILocale, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: ILocale, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def locale(preset: ILocale, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localeData(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.GlobalLocaleDataReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.GlobalLocaleDataReturn]
  
  inline def max(dayjs: Dayjs*): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Dayjs]
  inline def max(dayjs: js.Array[Dayjs]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def min(dayjs: Dayjs*): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Dayjs]
  inline def min(dayjs: js.Array[Dayjs]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def months(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames]
  
  inline def monthsShort(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames]
  
  inline def unix(t: Double): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(t.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def updateLocale(localeName: String, customConfig: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(localeName.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def utc(): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: String): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: String, strict: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: Unit, strict: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: ConfigType): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: String): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: String, strict: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: Unit, strict: Boolean): typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  
  inline def weekdays(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  inline def weekdays(localOrder: Boolean): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localOrder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  
  inline def weekdaysMin(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  inline def weekdaysMin(localOrder: Boolean): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localOrder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  
  inline def weekdaysShort(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  inline def weekdaysShort(localOrder: Boolean): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localOrder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Date
    - typingsJapgolly.dayjs.esmMod.Dayjs
    - scala.Null
    - scala.Unit
    - js.Tuple7[
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double]]
    - typingsJapgolly.dayjs.anon.D
  */
  type ConfigType = js.UndefOr[
    _ConfigType | (js.Tuple7[
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double]
    ]) | String | Double | js.Date | Null
  ]
  
  trait ConfigTypeMap extends StObject {
    
    var default: js.UndefOr[String | Double | js.Date | Dayjs | Null] = js.undefined
    
    var arraySupport: js.Tuple7[
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double]
      ]
    
    var objectSupport: D
  }
  object ConfigTypeMap {
    
    inline def apply(
      arraySupport: js.Tuple7[
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double]
        ],
      objectSupport: D
    ): ConfigTypeMap = {
      val __obj = js.Dynamic.literal(arraySupport = arraySupport.asInstanceOf[js.Any], objectSupport = objectSupport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigTypeMap]
    }
    
    extension [Self <: ConfigTypeMap](x: Self) {
      
      inline def setArraySupport(
        value: js.Tuple7[
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double]
            ]
      ): Self = StObject.set(x, "arraySupport", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: String | Double | js.Date | Dayjs): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setObjectSupport(value: D): Self = StObject.set(x, "objectSupport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DayjsTimezone extends StObject {
    
    def apply(date: ConfigType): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, format: String, timezone: String): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, timezone: String): typingsJapgolly.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def guess(): String = js.native
    
    def setDefault(): Unit = js.native
    def setDefault(timezone: String): Unit = js.native
  }
  
  trait FormatObject extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object FormatObject {
    
    inline def apply(): FormatObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatObject]
    }
    
    extension [Self <: FormatObject](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  @js.native
  trait GlobalLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Double): String = js.native
    def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
    
    def months(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def monthsShort(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def ordinal(n: Double): String = js.native
    
    def weekdays(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  }
  
  @js.native
  trait InstanceLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Double): String = js.native
    def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
    
    def months(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    def months(instance: typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def monthsShort(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    def monthsShort(instance: typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def ordinal(n: Double): String = js.native
    
    def weekdays(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdays(instance: typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdaysMin(instance: typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdaysShort(instance: typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): typingsJapgolly.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  }
  
  /* Inlined std.Exclude<dayjs.dayjs/esm.OpUnitType, 'date' | 'dates'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.hours
    - typingsJapgolly.dayjs.dayjsStrings.d_
    - typingsJapgolly.dayjs.dayjsStrings.w
    - typingsJapgolly.dayjs.dayjsStrings.y
    - typingsJapgolly.dayjs.dayjsStrings.M
    - typingsJapgolly.dayjs.dayjsStrings.years
    - typingsJapgolly.dayjs.dayjsStrings.seconds
    - typingsJapgolly.dayjs.dayjsStrings.m_
    - typingsJapgolly.dayjs.dayjsStrings.second
    - typingsJapgolly.dayjs.dayjsStrings.day
    - typingsJapgolly.dayjs.dayjsStrings.s
    - typingsJapgolly.dayjs.dayjsStrings.hour
    - typingsJapgolly.dayjs.dayjsStrings.days
    - typingsJapgolly.dayjs.dayjsStrings.week
    - typingsJapgolly.dayjs.dayjsStrings.minutes
    - typingsJapgolly.dayjs.dayjsStrings.minute
    - typingsJapgolly.dayjs.dayjsStrings.year
    - typingsJapgolly.dayjs.dayjsStrings.months
    - typingsJapgolly.dayjs.dayjsStrings.month
    - typingsJapgolly.dayjs.dayjsStrings.weeks
    - typingsJapgolly.dayjs.dayjsStrings.D
    - typingsJapgolly.dayjs.dayjsStrings.ms
    - typingsJapgolly.dayjs.dayjsStrings.milliseconds
    - typingsJapgolly.dayjs.dayjsStrings.h
    - typingsJapgolly.dayjs.dayjsStrings.millisecond
  */
  trait ManipulateType extends StObject
  object ManipulateType {
    
    inline def D: typingsJapgolly.dayjs.dayjsStrings.D = "D".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.D]
    
    inline def M: typingsJapgolly.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def day: typingsJapgolly.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.day]
    
    inline def days: typingsJapgolly.dayjs.dayjsStrings.days = "days".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.days]
    
    inline def h: typingsJapgolly.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.h]
    
    inline def hour: typingsJapgolly.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hour]
    
    inline def hours: typingsJapgolly.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typingsJapgolly.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typingsJapgolly.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typingsJapgolly.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minute]
    
    inline def minutes: typingsJapgolly.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minutes]
    
    inline def month: typingsJapgolly.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.month]
    
    inline def months: typingsJapgolly.dayjs.dayjsStrings.months = "months".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.months]
    
    inline def ms: typingsJapgolly.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.ms]
    
    inline def s: typingsJapgolly.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.s]
    
    inline def second: typingsJapgolly.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.second]
    
    inline def seconds: typingsJapgolly.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.seconds]
    
    inline def w: typingsJapgolly.dayjs.dayjsStrings.w = "w".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.w]
    
    inline def week: typingsJapgolly.dayjs.dayjsStrings.week = "week".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.week]
    
    inline def weeks: typingsJapgolly.dayjs.dayjsStrings.weeks = "weeks".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.weeks]
    
    inline def y: typingsJapgolly.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.y]
    
    inline def year: typingsJapgolly.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.year]
    
    inline def years: typingsJapgolly.dayjs.dayjsStrings.years = "years".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.years]
  }
  
  type MonthNames = js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.week
    - typingsJapgolly.dayjs.dayjsStrings.weeks
    - typingsJapgolly.dayjs.dayjsStrings.w
    - typingsJapgolly.dayjs.dayjsStrings.millisecond
    - typingsJapgolly.dayjs.dayjsStrings.second
    - typingsJapgolly.dayjs.dayjsStrings.minute
    - typingsJapgolly.dayjs.dayjsStrings.hour
    - typingsJapgolly.dayjs.dayjsStrings.day
    - typingsJapgolly.dayjs.dayjsStrings.month
    - typingsJapgolly.dayjs.dayjsStrings.year
    - typingsJapgolly.dayjs.dayjsStrings.date
    - typingsJapgolly.dayjs.dayjsStrings.milliseconds
    - typingsJapgolly.dayjs.dayjsStrings.seconds
    - typingsJapgolly.dayjs.dayjsStrings.minutes
    - typingsJapgolly.dayjs.dayjsStrings.hours
    - typingsJapgolly.dayjs.dayjsStrings.days
    - typingsJapgolly.dayjs.dayjsStrings.months
    - typingsJapgolly.dayjs.dayjsStrings.years
    - typingsJapgolly.dayjs.dayjsStrings.dates
    - typingsJapgolly.dayjs.dayjsStrings.d_
    - typingsJapgolly.dayjs.dayjsStrings.D
    - typingsJapgolly.dayjs.dayjsStrings.M
    - typingsJapgolly.dayjs.dayjsStrings.y
    - typingsJapgolly.dayjs.dayjsStrings.h
    - typingsJapgolly.dayjs.dayjsStrings.m_
    - typingsJapgolly.dayjs.dayjsStrings.s
    - typingsJapgolly.dayjs.dayjsStrings.ms
  */
  trait OpUnitType extends StObject
  object OpUnitType {
    
    inline def D: typingsJapgolly.dayjs.dayjsStrings.D = "D".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.D]
    
    inline def M: typingsJapgolly.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def date: typingsJapgolly.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.date]
    
    inline def dates: typingsJapgolly.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.dates]
    
    inline def day: typingsJapgolly.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.day]
    
    inline def days: typingsJapgolly.dayjs.dayjsStrings.days = "days".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.days]
    
    inline def h: typingsJapgolly.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.h]
    
    inline def hour: typingsJapgolly.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hour]
    
    inline def hours: typingsJapgolly.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typingsJapgolly.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typingsJapgolly.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typingsJapgolly.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minute]
    
    inline def minutes: typingsJapgolly.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minutes]
    
    inline def month: typingsJapgolly.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.month]
    
    inline def months: typingsJapgolly.dayjs.dayjsStrings.months = "months".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.months]
    
    inline def ms: typingsJapgolly.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.ms]
    
    inline def s: typingsJapgolly.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.s]
    
    inline def second: typingsJapgolly.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.second]
    
    inline def seconds: typingsJapgolly.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.seconds]
    
    inline def w: typingsJapgolly.dayjs.dayjsStrings.w = "w".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.w]
    
    inline def week: typingsJapgolly.dayjs.dayjsStrings.week = "week".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.week]
    
    inline def weeks: typingsJapgolly.dayjs.dayjsStrings.weeks = "weeks".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.weeks]
    
    inline def y: typingsJapgolly.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.y]
    
    inline def year: typingsJapgolly.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.year]
    
    inline def years: typingsJapgolly.dayjs.dayjsStrings.years = "years".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.years]
  }
  
  type OptionType = FormatObject | String | js.Array[String]
  
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ Instantiable1[/* config */ js.UndefOr[ConfigType], Dayjs], 
    /* d */ FnCall, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.quarter
    - typingsJapgolly.dayjs.dayjsStrings.quarters
    - typingsJapgolly.dayjs.dayjsStrings.Q
    - typingsJapgolly.dayjs.dayjsStrings.millisecond
    - typingsJapgolly.dayjs.dayjsStrings.second
    - typingsJapgolly.dayjs.dayjsStrings.minute
    - typingsJapgolly.dayjs.dayjsStrings.hour
    - typingsJapgolly.dayjs.dayjsStrings.day
    - typingsJapgolly.dayjs.dayjsStrings.month
    - typingsJapgolly.dayjs.dayjsStrings.year
    - typingsJapgolly.dayjs.dayjsStrings.date
    - typingsJapgolly.dayjs.dayjsStrings.milliseconds
    - typingsJapgolly.dayjs.dayjsStrings.seconds
    - typingsJapgolly.dayjs.dayjsStrings.minutes
    - typingsJapgolly.dayjs.dayjsStrings.hours
    - typingsJapgolly.dayjs.dayjsStrings.days
    - typingsJapgolly.dayjs.dayjsStrings.months
    - typingsJapgolly.dayjs.dayjsStrings.years
    - typingsJapgolly.dayjs.dayjsStrings.dates
    - typingsJapgolly.dayjs.dayjsStrings.d_
    - typingsJapgolly.dayjs.dayjsStrings.D
    - typingsJapgolly.dayjs.dayjsStrings.M
    - typingsJapgolly.dayjs.dayjsStrings.y
    - typingsJapgolly.dayjs.dayjsStrings.h
    - typingsJapgolly.dayjs.dayjsStrings.m_
    - typingsJapgolly.dayjs.dayjsStrings.s
    - typingsJapgolly.dayjs.dayjsStrings.ms
  */
  trait QUnitType extends StObject
  object QUnitType {
    
    inline def D: typingsJapgolly.dayjs.dayjsStrings.D = "D".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.D]
    
    inline def M: typingsJapgolly.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.M]
    
    inline def Q: typingsJapgolly.dayjs.dayjsStrings.Q = "Q".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.Q]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def date: typingsJapgolly.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.date]
    
    inline def dates: typingsJapgolly.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.dates]
    
    inline def day: typingsJapgolly.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.day]
    
    inline def days: typingsJapgolly.dayjs.dayjsStrings.days = "days".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.days]
    
    inline def h: typingsJapgolly.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.h]
    
    inline def hour: typingsJapgolly.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hour]
    
    inline def hours: typingsJapgolly.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typingsJapgolly.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typingsJapgolly.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typingsJapgolly.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minute]
    
    inline def minutes: typingsJapgolly.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minutes]
    
    inline def month: typingsJapgolly.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.month]
    
    inline def months: typingsJapgolly.dayjs.dayjsStrings.months = "months".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.months]
    
    inline def ms: typingsJapgolly.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.ms]
    
    inline def quarter: typingsJapgolly.dayjs.dayjsStrings.quarter = "quarter".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.quarter]
    
    inline def quarters: typingsJapgolly.dayjs.dayjsStrings.quarters = "quarters".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.quarters]
    
    inline def s: typingsJapgolly.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.s]
    
    inline def second: typingsJapgolly.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.second]
    
    inline def seconds: typingsJapgolly.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.seconds]
    
    inline def y: typingsJapgolly.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.y]
    
    inline def year: typingsJapgolly.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.year]
    
    inline def years: typingsJapgolly.dayjs.dayjsStrings.years = "years".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.millisecond
    - typingsJapgolly.dayjs.dayjsStrings.second
    - typingsJapgolly.dayjs.dayjsStrings.minute
    - typingsJapgolly.dayjs.dayjsStrings.hour
    - typingsJapgolly.dayjs.dayjsStrings.day
    - typingsJapgolly.dayjs.dayjsStrings.month
    - typingsJapgolly.dayjs.dayjsStrings.year
    - typingsJapgolly.dayjs.dayjsStrings.date
    - typingsJapgolly.dayjs.dayjsStrings.milliseconds
    - typingsJapgolly.dayjs.dayjsStrings.seconds
    - typingsJapgolly.dayjs.dayjsStrings.minutes
    - typingsJapgolly.dayjs.dayjsStrings.hours
    - typingsJapgolly.dayjs.dayjsStrings.days
    - typingsJapgolly.dayjs.dayjsStrings.months
    - typingsJapgolly.dayjs.dayjsStrings.years
    - typingsJapgolly.dayjs.dayjsStrings.dates
    - typingsJapgolly.dayjs.dayjsStrings.d_
    - typingsJapgolly.dayjs.dayjsStrings.D
    - typingsJapgolly.dayjs.dayjsStrings.M
    - typingsJapgolly.dayjs.dayjsStrings.y
    - typingsJapgolly.dayjs.dayjsStrings.h
    - typingsJapgolly.dayjs.dayjsStrings.m_
    - typingsJapgolly.dayjs.dayjsStrings.s
    - typingsJapgolly.dayjs.dayjsStrings.ms
  */
  trait UnitType extends StObject
  object UnitType {
    
    inline def D: typingsJapgolly.dayjs.dayjsStrings.D = "D".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.D]
    
    inline def M: typingsJapgolly.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def date: typingsJapgolly.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.date]
    
    inline def dates: typingsJapgolly.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.dates]
    
    inline def day: typingsJapgolly.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.day]
    
    inline def days: typingsJapgolly.dayjs.dayjsStrings.days = "days".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.days]
    
    inline def h: typingsJapgolly.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.h]
    
    inline def hour: typingsJapgolly.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hour]
    
    inline def hours: typingsJapgolly.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hours]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def millisecond: typingsJapgolly.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.millisecond]
    
    inline def milliseconds: typingsJapgolly.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.milliseconds]
    
    inline def minute: typingsJapgolly.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minute]
    
    inline def minutes: typingsJapgolly.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minutes]
    
    inline def month: typingsJapgolly.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.month]
    
    inline def months: typingsJapgolly.dayjs.dayjsStrings.months = "months".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.months]
    
    inline def ms: typingsJapgolly.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.ms]
    
    inline def s: typingsJapgolly.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.s]
    
    inline def second: typingsJapgolly.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.second]
    
    inline def seconds: typingsJapgolly.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.seconds]
    
    inline def y: typingsJapgolly.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.y]
    
    inline def year: typingsJapgolly.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.year]
    
    inline def years: typingsJapgolly.dayjs.dayjsStrings.years = "years".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.millisecond
    - typingsJapgolly.dayjs.dayjsStrings.second
    - typingsJapgolly.dayjs.dayjsStrings.minute
    - typingsJapgolly.dayjs.dayjsStrings.hour
    - typingsJapgolly.dayjs.dayjsStrings.day
    - typingsJapgolly.dayjs.dayjsStrings.month
    - typingsJapgolly.dayjs.dayjsStrings.year
    - typingsJapgolly.dayjs.dayjsStrings.date
  */
  trait UnitTypeLong extends StObject
  object UnitTypeLong {
    
    inline def date: typingsJapgolly.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.date]
    
    inline def day: typingsJapgolly.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.day]
    
    inline def hour: typingsJapgolly.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hour]
    
    inline def millisecond: typingsJapgolly.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.millisecond]
    
    inline def minute: typingsJapgolly.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minute]
    
    inline def month: typingsJapgolly.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.month]
    
    inline def second: typingsJapgolly.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.second]
    
    inline def year: typingsJapgolly.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.milliseconds
    - typingsJapgolly.dayjs.dayjsStrings.seconds
    - typingsJapgolly.dayjs.dayjsStrings.minutes
    - typingsJapgolly.dayjs.dayjsStrings.hours
    - typingsJapgolly.dayjs.dayjsStrings.days
    - typingsJapgolly.dayjs.dayjsStrings.months
    - typingsJapgolly.dayjs.dayjsStrings.years
    - typingsJapgolly.dayjs.dayjsStrings.dates
  */
  trait UnitTypeLongPlural extends StObject
  object UnitTypeLongPlural {
    
    inline def dates: typingsJapgolly.dayjs.dayjsStrings.dates = "dates".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.dates]
    
    inline def days: typingsJapgolly.dayjs.dayjsStrings.days = "days".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.days]
    
    inline def hours: typingsJapgolly.dayjs.dayjsStrings.hours = "hours".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.hours]
    
    inline def milliseconds: typingsJapgolly.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.milliseconds]
    
    inline def minutes: typingsJapgolly.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.minutes]
    
    inline def months: typingsJapgolly.dayjs.dayjsStrings.months = "months".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.months]
    
    inline def seconds: typingsJapgolly.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.seconds]
    
    inline def years: typingsJapgolly.dayjs.dayjsStrings.years = "years".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dayjs.dayjsStrings.d_
    - typingsJapgolly.dayjs.dayjsStrings.D
    - typingsJapgolly.dayjs.dayjsStrings.M
    - typingsJapgolly.dayjs.dayjsStrings.y
    - typingsJapgolly.dayjs.dayjsStrings.h
    - typingsJapgolly.dayjs.dayjsStrings.m_
    - typingsJapgolly.dayjs.dayjsStrings.s
    - typingsJapgolly.dayjs.dayjsStrings.ms
  */
  trait UnitTypeShort extends StObject
  object UnitTypeShort {
    
    inline def D: typingsJapgolly.dayjs.dayjsStrings.D = "D".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.D]
    
    inline def M: typingsJapgolly.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.M]
    
    inline def d: d_ = "d".asInstanceOf[d_]
    
    inline def h: typingsJapgolly.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.h]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def ms: typingsJapgolly.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.ms]
    
    inline def s: typingsJapgolly.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.s]
    
    inline def y: typingsJapgolly.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsJapgolly.dayjs.dayjsStrings.y]
  }
  
  type WeekdayNames = js.Tuple7[String, String, String, String, String, String, String]
  
  trait _ConfigType extends StObject
}
