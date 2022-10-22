package typingsJapgolly.winrt.Windows.Media.Capture

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICameraOptionsUIStatics extends StObject {
  
  def show(mediaCapture: MediaCapture): Unit
}
object ICameraOptionsUIStatics {
  
  inline def apply(show: MediaCapture => Callback): ICameraOptionsUIStatics = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1((t0: MediaCapture) => show(t0).runNow()))
    __obj.asInstanceOf[ICameraOptionsUIStatics]
  }
  
  extension [Self <: ICameraOptionsUIStatics](x: Self) {
    
    inline def setShow(value: MediaCapture => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: MediaCapture) => value(t0).runNow()))
  }
}
