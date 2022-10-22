package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononPageEventObject extends StObject {
  
  def addEvent(event: String, callback: js.Function1[/* parameter */ js.UndefOr[Any], Unit]): Unit
}
object PhononPageEventObject {
  
  inline def apply(addEvent: (String, js.Function1[/* parameter */ js.UndefOr[Any], Unit]) => Callback): PhononPageEventObject = {
    val __obj = js.Dynamic.literal(addEvent = js.Any.fromFunction2((t0: String, t1: js.Function1[/* parameter */ js.UndefOr[Any], Unit]) => (addEvent(t0, t1)).runNow()))
    __obj.asInstanceOf[PhononPageEventObject]
  }
  
  extension [Self <: PhononPageEventObject](x: Self) {
    
    inline def setAddEvent(value: (String, js.Function1[/* parameter */ js.UndefOr[Any], Unit]) => Callback): Self = StObject.set(x, "addEvent", js.Any.fromFunction2((t0: String, t1: js.Function1[/* parameter */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
  }
}
