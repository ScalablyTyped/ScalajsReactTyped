package typingsJapgolly.vueNiceDates.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  def endDate(date: String): Unit
  
  def isFocus(isFocus: Boolean): Unit
  
  def receivedFocusName(focusName: String): Unit
  
  def startDate(date: String): Unit
}
object EndDate {
  
  inline def apply(
    endDate: String => Callback,
    isFocus: Boolean => Callback,
    receivedFocusName: String => Callback,
    startDate: String => Callback
  ): EndDate = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1((t0: String) => endDate(t0).runNow()), isFocus = js.Any.fromFunction1((t0: Boolean) => isFocus(t0).runNow()), receivedFocusName = js.Any.fromFunction1((t0: String) => receivedFocusName(t0).runNow()), startDate = js.Any.fromFunction1((t0: String) => startDate(t0).runNow()))
    __obj.asInstanceOf[EndDate]
  }
  
  extension [Self <: EndDate](x: Self) {
    
    inline def setEndDate(value: String => Callback): Self = StObject.set(x, "endDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIsFocus(value: Boolean => Callback): Self = StObject.set(x, "isFocus", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setReceivedFocusName(value: String => Callback): Self = StObject.set(x, "receivedFocusName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartDate(value: String => Callback): Self = StObject.set(x, "startDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
