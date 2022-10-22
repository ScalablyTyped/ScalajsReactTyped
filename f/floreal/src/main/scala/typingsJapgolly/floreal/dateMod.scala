package typingsJapgolly.floreal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("floreal/date", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FlorealDate {
    def this(value: String) = this()
    def this(value: js.Date) = this()
    def this(value: Double) = this()
    
    /* CompleteClass */
    override def day(): Double = js.native
    
    /* CompleteClass */
    override def dayName(): String = js.native
    
    /* CompleteClass */
    override def dayOfDecade(): Double = js.native
    
    /* CompleteClass */
    override def dayOfMonth(): Double = js.native
    
    /* CompleteClass */
    override def dayOfWeek(): Double = js.native
    
    /* CompleteClass */
    override def dayOfYear(): Double = js.native
    
    /* CompleteClass */
    override def dayTitle(): String = js.native
    
    /* CompleteClass */
    override def decade(): Double = js.native
    
    /* CompleteClass */
    override def firstDayOfYear(): js.Date = js.native
    
    /* CompleteClass */
    override def isComplementaryDay(): Boolean = js.native
    
    /* CompleteClass */
    override def isYearSextile(): Boolean = js.native
    
    /* CompleteClass */
    override def month(): Double = js.native
    
    /* CompleteClass */
    override def monthName(): String = js.native
    
    /* CompleteClass */
    override def setDate(year: Double, month: Double, day: Double): Unit = js.native
    
    /* CompleteClass */
    override def setDay(day: Double): Unit = js.native
    
    /* CompleteClass */
    override def setMonth(month: Double): Unit = js.native
    
    /* CompleteClass */
    override def setYear(year: String): Unit = js.native
    
    /* CompleteClass */
    override def setYearDecimal(year: Double): Unit = js.native
    
    /* CompleteClass */
    override def toDateString(): String = js.native
    /* CompleteClass */
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def toFullDateString(): String = js.native
    
    /* CompleteClass */
    override def toShortDateString(): String = js.native
    
    /* CompleteClass */
    @JSName("toString")
    var toString_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def year(): String = js.native
    
    /* CompleteClass */
    override def yearDecimal(): Double = js.native
  }
  @JSImport("floreal/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("floreal/date", "day_names")
  @js.native
  def dayNames: js.Array[String] = js.native
  
  inline def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_names")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def firstDayOfYear(year: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first_day_of_year")(year.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait FlorealDate extends StObject {
    
    def day(): Double
    
    def dayName(): String
    
    def dayOfDecade(): Double
    
    def dayOfMonth(): Double
    
    def dayOfWeek(): Double
    
    def dayOfYear(): Double
    
    def dayTitle(): String
    
    def decade(): Double
    
    def firstDayOfYear(): js.Date
    
    def isComplementaryDay(): Boolean
    
    def isYearSextile(): Boolean
    
    def month(): Double
    
    def monthName(): String
    
    def setDate(year: Double, month: Double, day: Double): Unit
    
    def setDay(day: Double): Unit
    
    def setMonth(month: Double): Unit
    
    def setYear(year: String): Unit
    
    def setYearDecimal(year: Double): Unit
    
    def toDateString(): String
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String]
    
    def toFullDateString(): String
    
    def toShortDateString(): String
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    def year(): String
    
    def yearDecimal(): Double
  }
  object FlorealDate {
    
    inline def apply(
      day: CallbackTo[Double],
      dayName: CallbackTo[String],
      dayOfDecade: CallbackTo[Double],
      dayOfMonth: CallbackTo[Double],
      dayOfWeek: CallbackTo[Double],
      dayOfYear: CallbackTo[Double],
      dayTitle: CallbackTo[String],
      decade: CallbackTo[Double],
      firstDayOfYear: CallbackTo[js.Date],
      isComplementaryDay: CallbackTo[Boolean],
      isYearSextile: CallbackTo[Boolean],
      month: CallbackTo[Double],
      monthName: CallbackTo[String],
      setDate: (Double, Double, Double) => Callback,
      setDay: Double => Callback,
      setMonth: Double => Callback,
      setYear: String => Callback,
      setYearDecimal: Double => Callback,
      toDateString: CallbackTo[String],
      toFullDateString: CallbackTo[String],
      toShortDateString: CallbackTo[String],
      toString_ : CallbackTo[String],
      year: CallbackTo[String],
      yearDecimal: CallbackTo[Double]
    ): FlorealDate = {
      val __obj = js.Dynamic.literal(day = day.toJsFn, dayName = dayName.toJsFn, dayOfDecade = dayOfDecade.toJsFn, dayOfMonth = dayOfMonth.toJsFn, dayOfWeek = dayOfWeek.toJsFn, dayOfYear = dayOfYear.toJsFn, dayTitle = dayTitle.toJsFn, decade = decade.toJsFn, firstDayOfYear = firstDayOfYear.toJsFn, isComplementaryDay = isComplementaryDay.toJsFn, isYearSextile = isYearSextile.toJsFn, month = month.toJsFn, monthName = monthName.toJsFn, setDate = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setDate(t0, t1, t2)).runNow()), setDay = js.Any.fromFunction1((t0: Double) => setDay(t0).runNow()), setMonth = js.Any.fromFunction1((t0: Double) => setMonth(t0).runNow()), setYear = js.Any.fromFunction1((t0: String) => setYear(t0).runNow()), setYearDecimal = js.Any.fromFunction1((t0: Double) => setYearDecimal(t0).runNow()), toDateString = toDateString.toJsFn, toFullDateString = toFullDateString.toJsFn, toShortDateString = toShortDateString.toJsFn, year = year.toJsFn, yearDecimal = yearDecimal.toJsFn)
      __obj.updateDynamic("toString")(toString_.toJsFn)
      __obj.asInstanceOf[FlorealDate]
    }
    
    extension [Self <: FlorealDate](x: Self) {
      
      inline def setDay(value: CallbackTo[Double]): Self = StObject.set(x, "day", value.toJsFn)
      
      inline def setDayName(value: CallbackTo[String]): Self = StObject.set(x, "dayName", value.toJsFn)
      
      inline def setDayOfDecade(value: CallbackTo[Double]): Self = StObject.set(x, "dayOfDecade", value.toJsFn)
      
      inline def setDayOfMonth(value: CallbackTo[Double]): Self = StObject.set(x, "dayOfMonth", value.toJsFn)
      
      inline def setDayOfWeek(value: CallbackTo[Double]): Self = StObject.set(x, "dayOfWeek", value.toJsFn)
      
      inline def setDayOfYear(value: CallbackTo[Double]): Self = StObject.set(x, "dayOfYear", value.toJsFn)
      
      inline def setDayTitle(value: CallbackTo[String]): Self = StObject.set(x, "dayTitle", value.toJsFn)
      
      inline def setDecade(value: CallbackTo[Double]): Self = StObject.set(x, "decade", value.toJsFn)
      
      inline def setFirstDayOfYear(value: CallbackTo[js.Date]): Self = StObject.set(x, "firstDayOfYear", value.toJsFn)
      
      inline def setIsComplementaryDay(value: CallbackTo[Boolean]): Self = StObject.set(x, "isComplementaryDay", value.toJsFn)
      
      inline def setIsYearSextile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isYearSextile", value.toJsFn)
      
      inline def setMonth(value: CallbackTo[Double]): Self = StObject.set(x, "month", value.toJsFn)
      
      inline def setMonthName(value: CallbackTo[String]): Self = StObject.set(x, "monthName", value.toJsFn)
      
      inline def setSetDate(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetDay(value: Double => Callback): Self = StObject.set(x, "setDay", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMonth(value: Double => Callback): Self = StObject.set(x, "setMonth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetYear(value: String => Callback): Self = StObject.set(x, "setYear", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetYearDecimal(value: Double => Callback): Self = StObject.set(x, "setYearDecimal", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setToDateString(value: CallbackTo[String]): Self = StObject.set(x, "toDateString", value.toJsFn)
      
      inline def setToFullDateString(value: CallbackTo[String]): Self = StObject.set(x, "toFullDateString", value.toJsFn)
      
      inline def setToShortDateString(value: CallbackTo[String]): Self = StObject.set(x, "toShortDateString", value.toJsFn)
      
      inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
      
      inline def setYear(value: CallbackTo[String]): Self = StObject.set(x, "year", value.toJsFn)
      
      inline def setYearDecimal(value: CallbackTo[Double]): Self = StObject.set(x, "yearDecimal", value.toJsFn)
    }
  }
}
