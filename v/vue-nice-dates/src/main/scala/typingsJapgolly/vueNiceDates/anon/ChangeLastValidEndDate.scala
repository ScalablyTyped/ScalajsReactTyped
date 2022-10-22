package typingsJapgolly.vueNiceDates.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLastValidEndDate extends StObject {
  
  def changeLastValidEndDate(date: String): Unit
  
  def changeLastValidStartDate(date: String): Unit
  
  def handleClickDate(date: js.Date, `type`: String): Unit
  
  def handleFocusIn(e: MouseEvent): Unit
  
  def handleOutsideClick(e: MouseEvent): Unit
  
  def triggerFocusEvent(focusName: String): Unit
  
  def updateReceivedEndDate(date: String): Unit
  
  def updateReceivedStartDate(date: String): Unit
}
object ChangeLastValidEndDate {
  
  inline def apply(
    changeLastValidEndDate: String => Callback,
    changeLastValidStartDate: String => Callback,
    handleClickDate: (js.Date, String) => Callback,
    handleFocusIn: MouseEvent => Callback,
    handleOutsideClick: MouseEvent => Callback,
    triggerFocusEvent: String => Callback,
    updateReceivedEndDate: String => Callback,
    updateReceivedStartDate: String => Callback
  ): ChangeLastValidEndDate = {
    val __obj = js.Dynamic.literal(changeLastValidEndDate = js.Any.fromFunction1((t0: String) => changeLastValidEndDate(t0).runNow()), changeLastValidStartDate = js.Any.fromFunction1((t0: String) => changeLastValidStartDate(t0).runNow()), handleClickDate = js.Any.fromFunction2((t0: js.Date, t1: String) => (handleClickDate(t0, t1)).runNow()), handleFocusIn = js.Any.fromFunction1((t0: MouseEvent) => handleFocusIn(t0).runNow()), handleOutsideClick = js.Any.fromFunction1((t0: MouseEvent) => handleOutsideClick(t0).runNow()), triggerFocusEvent = js.Any.fromFunction1((t0: String) => triggerFocusEvent(t0).runNow()), updateReceivedEndDate = js.Any.fromFunction1((t0: String) => updateReceivedEndDate(t0).runNow()), updateReceivedStartDate = js.Any.fromFunction1((t0: String) => updateReceivedStartDate(t0).runNow()))
    __obj.asInstanceOf[ChangeLastValidEndDate]
  }
  
  extension [Self <: ChangeLastValidEndDate](x: Self) {
    
    inline def setChangeLastValidEndDate(value: String => Callback): Self = StObject.set(x, "changeLastValidEndDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setChangeLastValidStartDate(value: String => Callback): Self = StObject.set(x, "changeLastValidStartDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setHandleClickDate(value: (js.Date, String) => Callback): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2((t0: js.Date, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setHandleFocusIn(value: MouseEvent => Callback): Self = StObject.set(x, "handleFocusIn", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setHandleOutsideClick(value: MouseEvent => Callback): Self = StObject.set(x, "handleOutsideClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setTriggerFocusEvent(value: String => Callback): Self = StObject.set(x, "triggerFocusEvent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateReceivedEndDate(value: String => Callback): Self = StObject.set(x, "updateReceivedEndDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateReceivedStartDate(value: String => Callback): Self = StObject.set(x, "updateReceivedStartDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
