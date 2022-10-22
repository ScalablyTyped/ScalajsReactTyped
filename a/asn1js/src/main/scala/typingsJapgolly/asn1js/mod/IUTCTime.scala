package typingsJapgolly.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUTCTime extends StObject {
  
  var day: Double
  
  var hour: Double
  
  var minute: Double
  
  var month: Double
  
  var second: Double
  
  var year: Double
}
object IUTCTime {
  
  inline def apply(day: Double, hour: Double, minute: Double, month: Double, second: Double, year: Double): IUTCTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUTCTime]
  }
  
  extension [Self <: IUTCTime](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
