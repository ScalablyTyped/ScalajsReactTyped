package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerRecurrenceInfo extends StObject {
  
  def getDayNumber(): Double
  
  def getDuration(): Double
  
  def getEnd(): js.Date
  
  def getMonth(): Double
  
  def getOccurrenceCount(): Double
  
  def getPeriodicity(): Double
  
  def getRange(): BootstrapSchedulerRecurrenceRange
  
  def getRecurrenceType(): BootstrapSchedulerRecurrenceType
  
  def getStart(): js.Date
  
  def getWeekDays(): WeekDays
  
  def getWeekOfMonth(): WeekOfMonth
  
  /* protected */ val instance: Any
  
  def setDayNumber(dayNumber: Double): Unit
  
  def setDuration(duration: Double): Unit
  
  def setEnd(end: js.Date): Unit
  
  def setMonth(month: Double): Unit
  
  def setOccurrenceCount(occurrenceCount: Double): Unit
  
  def setPeriodicity(periodicity: Double): Unit
  
  def setRange(range: BootstrapSchedulerRecurrenceRange): Unit
  
  def setRecurrenceType(`type`: BootstrapSchedulerRecurrenceType): Unit
  
  def setStart(start: js.Date): Unit
  
  def setWeekDays(weekDays: WeekDays): Unit
  
  def setWeekOfMonth(weekOfMonth: WeekOfMonth): Unit
}
object BootstrapSchedulerRecurrenceInfo {
  
  inline def apply(
    getDayNumber: CallbackTo[Double],
    getDuration: CallbackTo[Double],
    getEnd: CallbackTo[js.Date],
    getMonth: CallbackTo[Double],
    getOccurrenceCount: CallbackTo[Double],
    getPeriodicity: CallbackTo[Double],
    getRange: CallbackTo[BootstrapSchedulerRecurrenceRange],
    getRecurrenceType: CallbackTo[BootstrapSchedulerRecurrenceType],
    getStart: CallbackTo[js.Date],
    getWeekDays: CallbackTo[WeekDays],
    getWeekOfMonth: CallbackTo[WeekOfMonth],
    instance: Any,
    setDayNumber: Double => Callback,
    setDuration: Double => Callback,
    setEnd: js.Date => Callback,
    setMonth: Double => Callback,
    setOccurrenceCount: Double => Callback,
    setPeriodicity: Double => Callback,
    setRange: BootstrapSchedulerRecurrenceRange => Callback,
    setRecurrenceType: BootstrapSchedulerRecurrenceType => Callback,
    setStart: js.Date => Callback,
    setWeekDays: WeekDays => Callback,
    setWeekOfMonth: WeekOfMonth => Callback
  ): BootstrapSchedulerRecurrenceInfo = {
    val __obj = js.Dynamic.literal(getDayNumber = getDayNumber.toJsFn, getDuration = getDuration.toJsFn, getEnd = getEnd.toJsFn, getMonth = getMonth.toJsFn, getOccurrenceCount = getOccurrenceCount.toJsFn, getPeriodicity = getPeriodicity.toJsFn, getRange = getRange.toJsFn, getRecurrenceType = getRecurrenceType.toJsFn, getStart = getStart.toJsFn, getWeekDays = getWeekDays.toJsFn, getWeekOfMonth = getWeekOfMonth.toJsFn, instance = instance.asInstanceOf[js.Any], setDayNumber = js.Any.fromFunction1((t0: Double) => setDayNumber(t0).runNow()), setDuration = js.Any.fromFunction1((t0: Double) => setDuration(t0).runNow()), setEnd = js.Any.fromFunction1((t0: js.Date) => setEnd(t0).runNow()), setMonth = js.Any.fromFunction1((t0: Double) => setMonth(t0).runNow()), setOccurrenceCount = js.Any.fromFunction1((t0: Double) => setOccurrenceCount(t0).runNow()), setPeriodicity = js.Any.fromFunction1((t0: Double) => setPeriodicity(t0).runNow()), setRange = js.Any.fromFunction1((t0: BootstrapSchedulerRecurrenceRange) => setRange(t0).runNow()), setRecurrenceType = js.Any.fromFunction1((t0: BootstrapSchedulerRecurrenceType) => setRecurrenceType(t0).runNow()), setStart = js.Any.fromFunction1((t0: js.Date) => setStart(t0).runNow()), setWeekDays = js.Any.fromFunction1((t0: WeekDays) => setWeekDays(t0).runNow()), setWeekOfMonth = js.Any.fromFunction1((t0: WeekOfMonth) => setWeekOfMonth(t0).runNow()))
    __obj.asInstanceOf[BootstrapSchedulerRecurrenceInfo]
  }
  
  extension [Self <: BootstrapSchedulerRecurrenceInfo](x: Self) {
    
    inline def setGetDayNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getDayNumber", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setGetEnd(value: CallbackTo[js.Date]): Self = StObject.set(x, "getEnd", value.toJsFn)
    
    inline def setGetMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getMonth", value.toJsFn)
    
    inline def setGetOccurrenceCount(value: CallbackTo[Double]): Self = StObject.set(x, "getOccurrenceCount", value.toJsFn)
    
    inline def setGetPeriodicity(value: CallbackTo[Double]): Self = StObject.set(x, "getPeriodicity", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[BootstrapSchedulerRecurrenceRange]): Self = StObject.set(x, "getRange", value.toJsFn)
    
    inline def setGetRecurrenceType(value: CallbackTo[BootstrapSchedulerRecurrenceType]): Self = StObject.set(x, "getRecurrenceType", value.toJsFn)
    
    inline def setGetStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "getStart", value.toJsFn)
    
    inline def setGetWeekDays(value: CallbackTo[WeekDays]): Self = StObject.set(x, "getWeekDays", value.toJsFn)
    
    inline def setGetWeekOfMonth(value: CallbackTo[WeekOfMonth]): Self = StObject.set(x, "getWeekOfMonth", value.toJsFn)
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setSetDayNumber(value: Double => Callback): Self = StObject.set(x, "setDayNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDuration(value: Double => Callback): Self = StObject.set(x, "setDuration", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetEnd(value: js.Date => Callback): Self = StObject.set(x, "setEnd", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetMonth(value: Double => Callback): Self = StObject.set(x, "setMonth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOccurrenceCount(value: Double => Callback): Self = StObject.set(x, "setOccurrenceCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPeriodicity(value: Double => Callback): Self = StObject.set(x, "setPeriodicity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRange(value: BootstrapSchedulerRecurrenceRange => Callback): Self = StObject.set(x, "setRange", js.Any.fromFunction1((t0: BootstrapSchedulerRecurrenceRange) => value(t0).runNow()))
    
    inline def setSetRecurrenceType(value: BootstrapSchedulerRecurrenceType => Callback): Self = StObject.set(x, "setRecurrenceType", js.Any.fromFunction1((t0: BootstrapSchedulerRecurrenceType) => value(t0).runNow()))
    
    inline def setSetStart(value: js.Date => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetWeekDays(value: WeekDays => Callback): Self = StObject.set(x, "setWeekDays", js.Any.fromFunction1((t0: WeekDays) => value(t0).runNow()))
    
    inline def setSetWeekOfMonth(value: WeekOfMonth => Callback): Self = StObject.set(x, "setWeekOfMonth", js.Any.fromFunction1((t0: WeekOfMonth) => value(t0).runNow()))
  }
}
