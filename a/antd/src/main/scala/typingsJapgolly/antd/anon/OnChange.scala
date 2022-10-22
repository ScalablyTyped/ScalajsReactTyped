package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libCalendarGenerateCalendarMod.CalendarMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[DateType] extends StObject {
  
  def onChange(date: DateType): Unit
  
  def onTypeChange(`type`: CalendarMode): Unit
  
  var `type`: CalendarMode
  
  var value: DateType
}
object OnChange {
  
  inline def apply[DateType](
    onChange: DateType => Callback,
    onTypeChange: CalendarMode => Callback,
    `type`: CalendarMode,
    value: DateType
  ): OnChange[DateType] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: DateType) => onChange(t0).runNow()), onTypeChange = js.Any.fromFunction1((t0: CalendarMode) => onTypeChange(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange[DateType]]
  }
  
  extension [Self <: OnChange[?], DateType](x: Self & OnChange[DateType]) {
    
    inline def setOnChange(value: DateType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: DateType) => value(t0).runNow()))
    
    inline def setOnTypeChange(value: CalendarMode => Callback): Self = StObject.set(x, "onTypeChange", js.Any.fromFunction1((t0: CalendarMode) => value(t0).runNow()))
    
    inline def setType(value: CalendarMode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
