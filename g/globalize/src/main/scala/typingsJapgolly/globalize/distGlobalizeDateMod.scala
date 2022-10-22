package typingsJapgolly.globalize

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cldrjs.mod.CldrStatic
import typingsJapgolly.globalize.distGlobalizeMod.Shared
import typingsJapgolly.globalize.distGlobalizeMod.Static
import typingsJapgolly.globalize.globalizeStrings.full
import typingsJapgolly.globalize.globalizeStrings.long
import typingsJapgolly.globalize.globalizeStrings.medium
import typingsJapgolly.globalize.globalizeStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlobalizeDateMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/date", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/date", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `distGlobalizeDateMod.foo` */
  override def _to: js.Object & Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    trait DateFormatPart extends StObject {
      
      var `type`: DateFormatPartTypes
      
      var value: String
    }
    object DateFormatPart {
      
      inline def apply(`type`: DateFormatPartTypes, value: String): DateFormatPart = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DateFormatPart]
      }
      
      extension [Self <: DateFormatPart](x: Self) {
        
        inline def setType(value: DateFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.globalize.globalizeStrings.day
      - typingsJapgolly.globalize.globalizeStrings.dayperiod
      - typingsJapgolly.globalize.globalizeStrings.era
      - typingsJapgolly.globalize.globalizeStrings.hour
      - typingsJapgolly.globalize.globalizeStrings.literal
      - typingsJapgolly.globalize.globalizeStrings.minute
      - typingsJapgolly.globalize.globalizeStrings.month
      - typingsJapgolly.globalize.globalizeStrings.second
      - typingsJapgolly.globalize.globalizeStrings.zone
      - typingsJapgolly.globalize.globalizeStrings.weekday
      - typingsJapgolly.globalize.globalizeStrings.year
    */
    trait DateFormatPartTypes extends StObject
    object DateFormatPartTypes {
      
      inline def day: typingsJapgolly.globalize.globalizeStrings.day = "day".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.day]
      
      inline def dayperiod: typingsJapgolly.globalize.globalizeStrings.dayperiod = "dayperiod".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.dayperiod]
      
      inline def era: typingsJapgolly.globalize.globalizeStrings.era = "era".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.era]
      
      inline def hour: typingsJapgolly.globalize.globalizeStrings.hour = "hour".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.hour]
      
      inline def literal: typingsJapgolly.globalize.globalizeStrings.literal = "literal".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.literal]
      
      inline def minute: typingsJapgolly.globalize.globalizeStrings.minute = "minute".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.minute]
      
      inline def month: typingsJapgolly.globalize.globalizeStrings.month = "month".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.month]
      
      inline def second: typingsJapgolly.globalize.globalizeStrings.second = "second".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.second]
      
      inline def weekday: typingsJapgolly.globalize.globalizeStrings.weekday = "weekday".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.weekday]
      
      inline def year: typingsJapgolly.globalize.globalizeStrings.year = "year".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.year]
      
      inline def zone: typingsJapgolly.globalize.globalizeStrings.zone = "zone".asInstanceOf[typingsJapgolly.globalize.globalizeStrings.zone]
    }
    
    trait DateFormatterOptions extends StObject {
      
      /**
        * One of the following String values: full, long, medium, or short, eg. { date: "full" }.
        */
      var date: js.UndefOr[full | long | medium | short] = js.undefined
      
      /**
        * One of the following String values: full, long, medium, or short, eg. { datetime: "full" }
        */
      var datetime: js.UndefOr[full | long | medium | short] = js.undefined
      
      /**
        * String value indicating a machine raw pattern (anything in the "Sym." column) eg. { raw: "dd/mm" }.
        * Note this is NOT recommended for i18n in general. Use skeleton instead.
        */
      var raw: js.UndefOr[String] = js.undefined
      
      /**
        * String value indicating a skeleton (see description above), eg. { skeleton: "GyMMMd" }.
        * Skeleton provides a more flexible formatting mechanism than the predefined list full, long, medium, or short represented by date, time, or datetime.
        * Instead, they are an open-ended list of patterns containing only date field information, and in a canonical order.
        */
      var skeleton: js.UndefOr[String] = js.undefined
      
      /**
        * One of the following String values: full, long, medium, or short, eg. { time: "full" }.
        */
      var time: js.UndefOr[full | long | medium | short] = js.undefined
      
      /**
        * String based on the time zone names of the IANA time zone database,
        * such as "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
        */
      var timeZone: js.UndefOr[String] = js.undefined
    }
    object DateFormatterOptions {
      
      inline def apply(): DateFormatterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DateFormatterOptions]
      }
      
      extension [Self <: DateFormatterOptions](x: Self) {
        
        inline def setDate(value: full | long | medium | short): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setDatetime(value: full | long | medium | short): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
        
        inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
        
        inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
        
        inline def setSkeleton(value: String): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
        
        inline def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
        
        inline def setTime(value: full | long | medium | short): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * .dateFormatter( options )
        * @param {DateFormatterOptions} options see date/expand_pattern for more info.
        * @returns {Function} Return a function that formats a date according to the given `options` and the default/instance locale.
        */
      def dateFormatter(): js.Function1[/* value */ js.Date, String] = js.native
      def dateFormatter(options: DateFormatterOptions): js.Function1[/* value */ js.Date, String] = js.native
      
      //Return a function that parses a string representing a date into a JavaScript Date object according to the given options. The default parsing assumes numeric year, month, and day (i.e., { skeleton: "yMd" }).
      def dateParser(): js.Function1[/* value */ String, js.Date] = js.native
      def dateParser(options: DateFormatterOptions): js.Function1[/* value */ String, js.Date] = js.native
      
      /**
        * .dateToPartsFormatter( options )
        * @param {DateFormatterOptions} options see date/expand_pattern for more info.
        * @returns {Function} Return a function that formats a date into parts tokens according to the given options. The default formatting is numeric year, month, and day (i.e., `{ skeleton: "yMd" }`).
        */
      def dateToPartsFormatter(): js.Function1[/* value */ js.Date, js.Array[DateFormatPart]] = js.native
      def dateToPartsFormatter(options: DateFormatterOptions): js.Function1[/* value */ js.Date, js.Array[DateFormatPart]] = js.native
      
      //Alias for .dateFormatter( [options] )( value ).
      def formatDate(value: js.Date): String = js.native
      def formatDate(value: js.Date, options: DateFormatterOptions): String = js.native
      
      //Alias for .dateToPartsFormatter( [options] )( value ).
      def formatDateToParts(value: js.Date): js.Array[DateFormatPart] = js.native
      def formatDateToParts(value: js.Date, options: DateFormatterOptions): js.Array[DateFormatPart] = js.native
      
      /**
        * Alias for .dateParser( [options] )( value ).
        * @param {string} value The object whose module id you wish to determine.
        * @param {DateFormatterOptions} options The object whose module id you wish to determine.
        * @returns {Date} Return the value as a Date.
        */
      def parseDate(value: String): js.Date = js.native
      def parseDate(value: String, options: DateFormatterOptions): js.Date = js.native
    }
    
    trait Static extends StObject {
      
      /**
        * Globalize.loadTimeZone ( ianaTzData, ... )
        * This method allows you to load IANA time zone data to enable options.timeZone feature on date formatters and parsers.
        * @param {Object} ianaTzData A JSON object with zdumped IANA timezone data. Get the data via https://github.com/rxaviers/iana-tz-data
        */
      def loadTimeZone(ianaTzData: js.Object): Unit
    }
    object Static {
      
      inline def apply(loadTimeZone: js.Object => Callback): typingsJapgolly.globalize.distGlobalizeDateMod.globalizeDistGlobalizeAugmentingMod.Static = {
        val __obj = js.Dynamic.literal(loadTimeZone = js.Any.fromFunction1((t0: js.Object) => loadTimeZone(t0).runNow()))
        __obj.asInstanceOf[typingsJapgolly.globalize.distGlobalizeDateMod.globalizeDistGlobalizeAugmentingMod.Static]
      }
      
      extension [Self <: typingsJapgolly.globalize.distGlobalizeDateMod.globalizeDistGlobalizeAugmentingMod.Static](x: Self) {
        
        inline def setLoadTimeZone(value: js.Object => Callback): Self = StObject.set(x, "loadTimeZone", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      }
    }
  }
}
