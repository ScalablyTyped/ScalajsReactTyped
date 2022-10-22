package typingsJapgolly.vueNiceDates.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocus extends StObject {
  
  def date(newValue: js.Date): Unit
  
  def isFocus(newValue: Boolean): Unit
}
object IsFocus {
  
  inline def apply(date: js.Date => Callback, isFocus: Boolean => Callback): IsFocus = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1((t0: js.Date) => date(t0).runNow()), isFocus = js.Any.fromFunction1((t0: Boolean) => isFocus(t0).runNow()))
    __obj.asInstanceOf[IsFocus]
  }
  
  extension [Self <: IsFocus](x: Self) {
    
    inline def setDate(value: js.Date => Callback): Self = StObject.set(x, "date", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setIsFocus(value: Boolean => Callback): Self = StObject.set(x, "isFocus", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
