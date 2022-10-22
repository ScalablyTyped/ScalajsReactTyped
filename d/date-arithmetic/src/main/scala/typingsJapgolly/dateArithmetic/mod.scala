package typingsJapgolly.dateArithmetic

import typingsJapgolly.dateArithmetic.dateArithmeticStrings.week
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-arithmetic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(date: js.Date, num: Double, unit: Unit): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def century(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def century(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def date(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def date(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def day(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def day(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def decade(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def decade(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def diff(date1: js.Date, date2: js.Date, unit: Unit): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def diff(date1: js.Date, date2: js.Date, unit: Unit, asFloat: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], asFloat.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def endOf_week(date: js.Date, unit: week, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def endOf_week(date: js.Date, unit: Exclude[Unit, week]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def eq_(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gte(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hours(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def hours(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def inRange(day: js.Date, min: js.Date, max: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(day.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def inRange(day: js.Date, min: js.Date, max: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(day.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lte(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def max(dates: js.Date*): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Date]
  
  inline def milliseconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def milliseconds(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def min(dates: js.Date*): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Date]
  
  inline def minutes(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def minutes(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def month(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def month(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def neq(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def seconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def seconds(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def startOf_week(date: js.Date, unit: week, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def startOf_week(date: js.Date, unit: Exclude[Unit, week]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def subtract(date: js.Date, num: Double, unit: Unit): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def weekday(date: js.Date, value: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def weekday(date: js.Date, value: js.Date, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def year(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def year(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`0`
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`1`
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`2`
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`3`
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`4`
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`5`
    - typingsJapgolly.dateArithmetic.dateArithmeticInts.`6`
  */
  trait StartOfWeek extends StObject
  object StartOfWeek {
    
    inline def `0`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`0` = 0.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`0`]
    
    inline def `1`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`1` = 1.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`1`]
    
    inline def `2`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`2` = 2.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`2`]
    
    inline def `3`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`3` = 3.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`3`]
    
    inline def `4`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`4` = 4.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`4`]
    
    inline def `5`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`5` = 5.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`5`]
    
    inline def `6`: typingsJapgolly.dateArithmetic.dateArithmeticInts.`6` = 6.asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticInts.`6`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.milliseconds
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.seconds
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.minutes
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.hours
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.day
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.week
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.month
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.year
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.decade
    - typingsJapgolly.dateArithmetic.dateArithmeticStrings.century
  */
  trait Unit extends StObject
  object Unit {
    
    inline def century: typingsJapgolly.dateArithmetic.dateArithmeticStrings.century = "century".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.century]
    
    inline def day: typingsJapgolly.dateArithmetic.dateArithmeticStrings.day = "day".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.day]
    
    inline def decade: typingsJapgolly.dateArithmetic.dateArithmeticStrings.decade = "decade".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.decade]
    
    inline def hours: typingsJapgolly.dateArithmetic.dateArithmeticStrings.hours = "hours".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.hours]
    
    inline def milliseconds: typingsJapgolly.dateArithmetic.dateArithmeticStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.milliseconds]
    
    inline def minutes: typingsJapgolly.dateArithmetic.dateArithmeticStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.minutes]
    
    inline def month: typingsJapgolly.dateArithmetic.dateArithmeticStrings.month = "month".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.month]
    
    inline def seconds: typingsJapgolly.dateArithmetic.dateArithmeticStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.seconds]
    
    inline def week: typingsJapgolly.dateArithmetic.dateArithmeticStrings.week = "week".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.week]
    
    inline def year: typingsJapgolly.dateArithmetic.dateArithmeticStrings.year = "year".asInstanceOf[typingsJapgolly.dateArithmetic.dateArithmeticStrings.year]
  }
}
