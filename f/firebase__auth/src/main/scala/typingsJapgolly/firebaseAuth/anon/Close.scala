package typingsJapgolly.firebaseAuth.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(): Unit
  
  def isAvailable(cb: js.Function1[/* available */ Boolean, Unit]): Unit
  
  def openUrl(url: String): Unit
}
object Close {
  
  inline def apply(
    close: Callback,
    isAvailable: js.Function1[/* available */ Boolean, Unit] => Callback,
    openUrl: String => Callback
  ): Close = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, isAvailable = js.Any.fromFunction1((t0: js.Function1[/* available */ Boolean, Unit]) => isAvailable(t0).runNow()), openUrl = js.Any.fromFunction1((t0: String) => openUrl(t0).runNow()))
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsAvailable(value: js.Function1[/* available */ Boolean, Unit] => Callback): Self = StObject.set(x, "isAvailable", js.Any.fromFunction1((t0: js.Function1[/* available */ Boolean, Unit]) => value(t0).runNow()))
    
    inline def setOpenUrl(value: String => Callback): Self = StObject.set(x, "openUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
