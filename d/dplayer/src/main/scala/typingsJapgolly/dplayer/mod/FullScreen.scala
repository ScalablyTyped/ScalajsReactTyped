package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreen extends StObject {
  
  def cancel(`type`: FullScreenType): Unit
  
  def request(`type`: FullScreenType): Unit
}
object FullScreen {
  
  inline def apply(cancel: FullScreenType => Callback, request: FullScreenType => Callback): FullScreen = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1((t0: FullScreenType) => cancel(t0).runNow()), request = js.Any.fromFunction1((t0: FullScreenType) => request(t0).runNow()))
    __obj.asInstanceOf[FullScreen]
  }
  
  extension [Self <: FullScreen](x: Self) {
    
    inline def setCancel(value: FullScreenType => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction1((t0: FullScreenType) => value(t0).runNow()))
    
    inline def setRequest(value: FullScreenType => Callback): Self = StObject.set(x, "request", js.Any.fromFunction1((t0: FullScreenType) => value(t0).runNow()))
  }
}
