package typingsJapgolly.reactDates.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVisible extends StObject {
  
  var isVisible: Boolean
  
  var month: Moment
  
  def onMonthSelect(currentMonth: Moment, newMonthVal: String): Unit
  
  def onYearSelect(currentMonth: Moment, newMonthVal: String): Unit
}
object IsVisible {
  
  inline def apply(
    isVisible: Boolean,
    month: Moment,
    onMonthSelect: (Moment, String) => Callback,
    onYearSelect: (Moment, String) => Callback
  ): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], onMonthSelect = js.Any.fromFunction2((t0: Moment, t1: String) => (onMonthSelect(t0, t1)).runNow()), onYearSelect = js.Any.fromFunction2((t0: Moment, t1: String) => (onYearSelect(t0, t1)).runNow()))
    __obj.asInstanceOf[IsVisible]
  }
  
  extension [Self <: IsVisible](x: Self) {
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setOnMonthSelect(value: (Moment, String) => Callback): Self = StObject.set(x, "onMonthSelect", js.Any.fromFunction2((t0: Moment, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setOnYearSelect(value: (Moment, String) => Callback): Self = StObject.set(x, "onYearSelect", js.Any.fromFunction2((t0: Moment, t1: String) => (value(t0, t1)).runNow()))
  }
}
