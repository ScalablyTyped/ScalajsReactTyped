package typingsJapgolly.microsoftteams.microsoftTeams

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait IAppWindow extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function0[Unit]): Unit
  
  def postMessage(message: Any): Unit
}
object IAppWindow {
  
  inline def apply(addEventListener: (String, js.Function0[Unit]) => Callback, postMessage: Any => Callback): IAppWindow = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (addEventListener(t0, t1)).runNow()), postMessage = js.Any.fromFunction1((t0: Any) => postMessage(t0).runNow()))
    __obj.asInstanceOf[IAppWindow]
  }
  
  extension [Self <: IAppWindow](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setPostMessage(value: Any => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
