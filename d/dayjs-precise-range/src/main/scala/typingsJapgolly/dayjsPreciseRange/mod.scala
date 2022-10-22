package typingsJapgolly.dayjsPreciseRange

import typingsJapgolly.dayjs.ILocale
import typingsJapgolly.dayjs.anon.PartialILocale
import typingsJapgolly.dayjs.mod.ConfigType
import typingsJapgolly.dayjs.mod.OptionType
import typingsJapgolly.dayjs.mod.PluginFunc
import typingsJapgolly.dayjs.pluginDurationMod.CreateDurationType
import typingsJapgolly.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.GlobalLocaleDataReturn
import typingsJapgolly.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.MonthNames
import typingsJapgolly.dayjs.pluginLocaleDataMod.dayjsAugmentingMod.WeekdayNames
import typingsJapgolly.dayjsPreciseRange.dayjsPreciseRangeBooleans.`false`
import typingsJapgolly.dayjsPreciseRange.dayjsPreciseRangeBooleans.`true`
import typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.PreciseRangeValueObject
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: Unit, locale: String): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: Unit, locale: String, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: Unit, locale: Unit, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: Unit, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: OptionType): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: String): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: String, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: OptionType, locale: Unit, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: Unit, format: OptionType, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: String): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: String, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: Unit, locale: Unit, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: Unit, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: OptionType): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: String): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: String, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: OptionType, locale: Unit, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def apply(date: ConfigType, format: OptionType, strict: Boolean): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  
  @JSImport("dayjs-precise-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dayjs-precise-range", "Dayjs")
  @js.native
  open class Dayjs ()
    extends typingsJapgolly.dayjs.mod.Dayjs {
    def this(config: ConfigType) = this()
  }
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @JSImport("dayjs", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def preciseDiff_false(
      d1: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
      d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
      returnValueObject: js.UndefOr[`false`]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preciseDiff")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any], returnValueObject.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def preciseDiff_true(
      d1: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
      d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
      returnValueObject: `true`
    ): PreciseRangeValueObject = (^.asInstanceOf[js.Dynamic].applyDynamic("preciseDiff")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any], returnValueObject.asInstanceOf[js.Any])).asInstanceOf[PreciseRangeValueObject]
    
    @js.native
    trait Dayjs extends StObject {
      
      def preciseDiff(d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs): String = js.native
      @JSName("preciseDiff")
      def preciseDiff_false(d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs, returnValueObject: `false`): String = js.native
      @JSName("preciseDiff")
      def preciseDiff_true(d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs, returnValueObject: `true`): PreciseRangeValueObject = js.native
    }
    
    trait PreciseRangeValueObject extends StObject {
      
      var days: Double
      
      var firstDateWasLater: Boolean
      
      var hours: Double
      
      var minutes: Double
      
      var months: Double
      
      var seconds: Double
      
      var years: Double
    }
    object PreciseRangeValueObject {
      
      inline def apply(
        days: Double,
        firstDateWasLater: Boolean,
        hours: Double,
        minutes: Double,
        months: Double,
        seconds: Double,
        years: Double
      ): PreciseRangeValueObject = {
        val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], firstDateWasLater = firstDateWasLater.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
        __obj.asInstanceOf[PreciseRangeValueObject]
      }
      
      extension [Self <: PreciseRangeValueObject](x: Self) {
        
        inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
        
        inline def setFirstDateWasLater(value: Boolean): Self = StObject.set(x, "firstDateWasLater", value.asInstanceOf[js.Any])
        
        inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
        
        inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("dayjs-precise-range", "duration")
  @js.native
  val duration: CreateDurationType = js.native
  
  inline def extend[T](plugin: PluginFunc[T]): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def extend[T](plugin: PluginFunc[T], option: T): typingsJapgolly.dayjs.mod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  
  inline def isDayjs(d: Any): /* is dayjs.dayjs.Dayjs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayjs")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs.Dayjs */ Boolean]
  
  inline def isDuration(d: Any): /* is dayjs.dayjs/plugin/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs/plugin/duration.Duration */ Boolean]
  
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
  
  inline def localeData(): GlobalLocaleDataReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[GlobalLocaleDataReturn]
  
  inline def max(dayjs: typingsJapgolly.dayjs.mod.Dayjs*): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def max(dayjs: js.Array[typingsJapgolly.dayjs.mod.Dayjs]): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  
  inline def min(dayjs: typingsJapgolly.dayjs.mod.Dayjs*): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  inline def min(dayjs: js.Array[typingsJapgolly.dayjs.mod.Dayjs]): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  
  inline def months(): MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[MonthNames]
  
  inline def monthsShort(): MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[MonthNames]
  
  inline def preciseDiff(
    d1: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
    d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preciseDiff")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def preciseDiff_false(
    d1: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
    d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
    returnValueObject: `false`
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preciseDiff")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any], returnValueObject.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def preciseDiff_true(
    d1: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
    d2: typingsJapgolly.dayjsPreciseRange.mod.dayjsAugmentingMod.Dayjs,
    returnValueObject: `true`
  ): PreciseRangeValueObject = (^.asInstanceOf[js.Dynamic].applyDynamic("preciseDiff")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any], returnValueObject.asInstanceOf[js.Any])).asInstanceOf[PreciseRangeValueObject]
  
  inline def unix(t: Double): typingsJapgolly.dayjs.mod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(t.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.mod.Dayjs]
  
  inline def updateLocale(localeName: String, customConfig: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(localeName.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def utc(): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: String): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: String, strict: Boolean): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: Unit, format: Unit, strict: Boolean): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: String): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: String, strict: Boolean): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  inline def utc(config: ConfigType, format: Unit, strict: Boolean): typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dayjs.pluginUtcMod.dayjsAugmentingMod.Dayjs]
  
  inline def weekdays(): WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[WeekdayNames]
  inline def weekdays(localOrder: Boolean): WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localOrder.asInstanceOf[js.Any]).asInstanceOf[WeekdayNames]
  
  inline def weekdaysMin(): WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[WeekdayNames]
  inline def weekdaysMin(localOrder: Boolean): WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localOrder.asInstanceOf[js.Any]).asInstanceOf[WeekdayNames]
  
  inline def weekdaysShort(): WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[WeekdayNames]
  inline def weekdaysShort(localOrder: Boolean): WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localOrder.asInstanceOf[js.Any]).asInstanceOf[WeekdayNames]
}
