package typingsJapgolly.vueNiceDates.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLastValidDate extends StObject {
  
  def changeLastValidDate(date: String): Unit
  
  def handleClickDate(date: js.Date, `type`: String): Unit
  
  def handleFocusIn(e: MouseEvent): Unit
  
  def handleOutsideClick(e: MouseEvent): Unit
}
object ChangeLastValidDate {
  
  inline def apply(
    changeLastValidDate: String => Callback,
    handleClickDate: (js.Date, String) => Callback,
    handleFocusIn: MouseEvent => Callback,
    handleOutsideClick: MouseEvent => Callback
  ): ChangeLastValidDate = {
    val __obj = js.Dynamic.literal(changeLastValidDate = js.Any.fromFunction1((t0: String) => changeLastValidDate(t0).runNow()), handleClickDate = js.Any.fromFunction2((t0: js.Date, t1: String) => (handleClickDate(t0, t1)).runNow()), handleFocusIn = js.Any.fromFunction1((t0: MouseEvent) => handleFocusIn(t0).runNow()), handleOutsideClick = js.Any.fromFunction1((t0: MouseEvent) => handleOutsideClick(t0).runNow()))
    __obj.asInstanceOf[ChangeLastValidDate]
  }
  
  extension [Self <: ChangeLastValidDate](x: Self) {
    
    inline def setChangeLastValidDate(value: String => Callback): Self = StObject.set(x, "changeLastValidDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setHandleClickDate(value: (js.Date, String) => Callback): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2((t0: js.Date, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setHandleFocusIn(value: MouseEvent => Callback): Self = StObject.set(x, "handleFocusIn", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setHandleOutsideClick(value: MouseEvent => Callback): Self = StObject.set(x, "handleOutsideClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
  }
}
