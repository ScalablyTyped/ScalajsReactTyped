package typingsJapgolly.reactNativeCalendars.mod

import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsBooleans.`false`
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings._empty
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.disabled
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.selected
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.today
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayComponentProps extends StObject {
  
  var date: DateObject
  
  var marking: `false` | js.Array[Marking]
  
  def onLongPress(date: DateObject): Any
  
  def onPress(date: DateObject): Any
  
  var state: _empty | selected | disabled | today
  
  var theme: CalendarTheme
}
object DayComponentProps {
  
  inline def apply(
    date: DateObject,
    marking: `false` | js.Array[Marking],
    onLongPress: DateObject => Any,
    onPress: DateObject => Any,
    state: _empty | selected | disabled | today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], marking = marking.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction1(onLongPress), onPress = js.Any.fromFunction1(onPress), state = state.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayComponentProps]
  }
  
  extension [Self <: DayComponentProps](x: Self) {
    
    inline def setDate(value: DateObject): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMarking(value: `false` | js.Array[Marking]): Self = StObject.set(x, "marking", value.asInstanceOf[js.Any])
    
    inline def setMarkingVarargs(value: Marking*): Self = StObject.set(x, "marking", js.Array(value*))
    
    inline def setOnLongPress(value: DateObject => Any): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnPress(value: DateObject => Any): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setState(value: _empty | selected | disabled | today): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
