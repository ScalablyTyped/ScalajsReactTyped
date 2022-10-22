package typingsJapgolly.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  /** 上午 */
  var am: String
  
  /** 日 */
  var day: String
  
  /** 时 */
  var hour: String
  
  /** 分 */
  var minute: String
  
  /** 月 */
  var month: String
  
  /** 下午 */
  var pm: String
  
  /** 年 */
  var year: String
}
object Day {
  
  inline def apply(am: String, day: String, hour: String, minute: String, month: String, pm: String, year: String): Day = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
  
  extension [Self <: Day](x: Self) {
    
    inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
