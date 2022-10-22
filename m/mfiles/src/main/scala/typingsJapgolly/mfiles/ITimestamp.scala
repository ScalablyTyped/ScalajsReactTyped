package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimestamp extends StObject {
  
  def Clone(): ITimestamp
  
  var Day: Double
  
  var Fraction: Double
  
  def GetValue(): Any
  
  var Hour: Double
  
  def LocalTimeToUtc(): ITimestamp
  
  var Minute: Double
  
  var Month: Double
  
  var Second: Double
  
  def SetValue(Value: Any): Unit
  
  def UtcToLocalTime(): ITimestamp
  
  var Year: Double
}
object ITimestamp {
  
  inline def apply(
    Clone: CallbackTo[ITimestamp],
    Day: Double,
    Fraction: Double,
    GetValue: CallbackTo[Any],
    Hour: Double,
    LocalTimeToUtc: CallbackTo[ITimestamp],
    Minute: Double,
    Month: Double,
    Second: Double,
    SetValue: Any => Callback,
    UtcToLocalTime: CallbackTo[ITimestamp],
    Year: Double
  ): ITimestamp = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Day = Day.asInstanceOf[js.Any], Fraction = Fraction.asInstanceOf[js.Any], GetValue = GetValue.toJsFn, Hour = Hour.asInstanceOf[js.Any], LocalTimeToUtc = LocalTimeToUtc.toJsFn, Minute = Minute.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), UtcToLocalTime = UtcToLocalTime.toJsFn, Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimestamp]
  }
  
  extension [Self <: ITimestamp](x: Self) {
    
    inline def setClone(value: CallbackTo[ITimestamp]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDay(value: Double): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    inline def setFraction(value: Double): Self = StObject.set(x, "Fraction", value.asInstanceOf[js.Any])
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetValue", value.toJsFn)
    
    inline def setHour(value: Double): Self = StObject.set(x, "Hour", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeToUtc(value: CallbackTo[ITimestamp]): Self = StObject.set(x, "LocalTimeToUtc", value.toJsFn)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "Minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Double): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setUtcToLocalTime(value: CallbackTo[ITimestamp]): Self = StObject.set(x, "UtcToLocalTime", value.toJsFn)
    
    inline def setYear(value: Double): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
  }
}
