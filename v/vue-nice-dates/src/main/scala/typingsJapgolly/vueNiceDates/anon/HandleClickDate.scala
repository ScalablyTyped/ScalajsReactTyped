package typingsJapgolly.vueNiceDates.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleClickDate extends StObject {
  
  def changeLastValidDate(date: String): Unit
  
  def handleClickDate(date: js.Date, `type`: String): Unit
  
  def initDate(): Unit
  
  def isValidAndSelectable(date: js.Date): Boolean
}
object HandleClickDate {
  
  inline def apply(
    changeLastValidDate: String => Callback,
    handleClickDate: (js.Date, String) => Callback,
    initDate: Callback,
    isValidAndSelectable: js.Date => Boolean
  ): HandleClickDate = {
    val __obj = js.Dynamic.literal(changeLastValidDate = js.Any.fromFunction1((t0: String) => changeLastValidDate(t0).runNow()), handleClickDate = js.Any.fromFunction2((t0: js.Date, t1: String) => (handleClickDate(t0, t1)).runNow()), initDate = initDate.toJsFn, isValidAndSelectable = js.Any.fromFunction1(isValidAndSelectable))
    __obj.asInstanceOf[HandleClickDate]
  }
  
  extension [Self <: HandleClickDate](x: Self) {
    
    inline def setChangeLastValidDate(value: String => Callback): Self = StObject.set(x, "changeLastValidDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setHandleClickDate(value: (js.Date, String) => Callback): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2((t0: js.Date, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setInitDate(value: Callback): Self = StObject.set(x, "initDate", value.toJsFn)
    
    inline def setIsValidAndSelectable(value: js.Date => Boolean): Self = StObject.set(x, "isValidAndSelectable", js.Any.fromFunction1(value))
  }
}
