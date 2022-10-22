package typingsJapgolly.chartJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.anon.PartialDateAdapter
import typingsJapgolly.chartJs.chartJsStrings.isoWeek
import typingsJapgolly.chartJs.mod.ChartOptions
import typingsJapgolly.chartJs.mod.ChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAdaptersMod {
  
  object adapters {
    
    @JSImport("chart.js/types/adapters", "_adapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/types/adapters", "_adapters._date")
    @js.native
    def date: DateAdapter = js.native
    
    inline def date_=(x: DateAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_date")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DateAdapter extends StObject {
    
    /**
      * Adds the specified `amount` of `unit` to the given `timestamp`.
      * @param {number} timestamp - the input timestamp
      * @param {number} amount - the amount to add
      * @param {Unit} unit - the unit as string
      * @return {number}
      */
    def add(timestamp: Double, amount: Double, unit: TimeUnit): Double = js.native
    
    /**
      * Returns the number of `unit` between the given timestamps.
      * @param {number} a - the input timestamp (reference)
      * @param {number} b - the timestamp to subtract
      * @param {Unit} unit - the unit as string
      * @return {number}
      */
    def diff(a: Double, b: Double, unit: TimeUnit): Double = js.native
    
    /**
      * Returns end of `unit` for the given `timestamp`.
      * @param {number} timestamp - the input timestamp
      * @param {Unit|'isoWeek'} unit - the unit as string
      * @return {number}
      */
    def endOf(timestamp: Double, unit: TimeUnit): Double = js.native
    @JSName("endOf")
    def endOf_isoWeek(timestamp: Double, unit: isoWeek): Double = js.native
    
    /**
      * Returns the formatted date in the specified `format` for a given `timestamp`.
      * @param {number} timestamp - the timestamp to format
      * @param {string} format - the date/time token
      * @return {string}
      */
    def format(timestamp: Double, format: TimeUnit): String = js.native
    
    /**
      * Returns a map of time formats for the supported formatting units defined
      * in Unit as well as 'datetime' representing a detailed date/time string.
      * @returns {{string: string}}
      */
    def formats(): StringDictionary[String] = js.native
    
    /**
      * Will called with chart options after adapter creation.
      * @param {ChartOptions} chartOptions
      */
    def init(chartOptions: ChartOptions[ChartType]): Unit = js.native
    
    val options: Any = js.native
    
    // Override one or multiple of the methods to adjust to the logic of the current date library.
    def `override`(members: PartialDateAdapter): Unit = js.native
    
    /**
      * Parses the given `value` and return the associated timestamp.
      * @param {unknown} value - the value to parse (usually comes from the data)
      * @param {string} [format] - the expected data format
      */
    def parse(value: Any): Double | Null = js.native
    def parse(value: Any, format: TimeUnit): Double | Null = js.native
    
    /**
      * Returns start of `unit` for the given `timestamp`.
      * @param {number} timestamp - the input timestamp
      * @param {Unit|'isoWeek'} unit - the unit as string
      * @param {number} [weekday] - the ISO day of the week with 1 being Monday
      * and 7 being Sunday (only needed if param *unit* is `isoWeek`).
      * @return {number}
      */
    def startOf(timestamp: Double, unit: TimeUnit): Double = js.native
    def startOf(timestamp: Double, unit: TimeUnit, weekday: Double): Double = js.native
    @JSName("startOf")
    def startOf_isoWeek(timestamp: Double, unit: isoWeek): Double = js.native
    @JSName("startOf")
    def startOf_isoWeek(timestamp: Double, unit: isoWeek, weekday: Double): Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chartJs.chartJsStrings.millisecond
    - typingsJapgolly.chartJs.chartJsStrings.second
    - typingsJapgolly.chartJs.chartJsStrings.minute
    - typingsJapgolly.chartJs.chartJsStrings.hour
    - typingsJapgolly.chartJs.chartJsStrings.day
    - typingsJapgolly.chartJs.chartJsStrings.week
    - typingsJapgolly.chartJs.chartJsStrings.month
    - typingsJapgolly.chartJs.chartJsStrings.quarter
    - typingsJapgolly.chartJs.chartJsStrings.year
  */
  trait TimeUnit extends StObject
  object TimeUnit {
    
    inline def day: typingsJapgolly.chartJs.chartJsStrings.day = "day".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.day]
    
    inline def hour: typingsJapgolly.chartJs.chartJsStrings.hour = "hour".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.hour]
    
    inline def millisecond: typingsJapgolly.chartJs.chartJsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.millisecond]
    
    inline def minute: typingsJapgolly.chartJs.chartJsStrings.minute = "minute".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.minute]
    
    inline def month: typingsJapgolly.chartJs.chartJsStrings.month = "month".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.month]
    
    inline def quarter: typingsJapgolly.chartJs.chartJsStrings.quarter = "quarter".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.quarter]
    
    inline def second: typingsJapgolly.chartJs.chartJsStrings.second = "second".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.second]
    
    inline def week: typingsJapgolly.chartJs.chartJsStrings.week = "week".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.week]
    
    inline def year: typingsJapgolly.chartJs.chartJsStrings.year = "year".asInstanceOf[typingsJapgolly.chartJs.chartJsStrings.year]
  }
}
