package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayOfWeek extends StObject {
  
  var day: Null
  
  var dayOfWeek: Null
}
object DayOfWeek {
  
  inline def apply(day: Null, dayOfWeek: Null): DayOfWeek = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], dayOfWeek = dayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayOfWeek]
  }
  
  extension [Self <: DayOfWeek](x: Self) {
    
    inline def setDay(value: Null): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeek(value: Null): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
  }
}
