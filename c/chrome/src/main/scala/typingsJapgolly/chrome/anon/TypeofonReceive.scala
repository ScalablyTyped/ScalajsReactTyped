package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.serial.onReceive.OnReceiveInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofonReceive extends StObject {
  
  def addListener(callback: js.Function1[/* info */ OnReceiveInfo, Unit]): Unit
}
object TypeofonReceive {
  
  inline def apply(addListener: js.Function1[/* info */ OnReceiveInfo, Unit] => Callback): TypeofonReceive = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: js.Function1[/* info */ OnReceiveInfo, Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[TypeofonReceive]
  }
  
  extension [Self <: TypeofonReceive](x: Self) {
    
    inline def setAddListener(value: js.Function1[/* info */ OnReceiveInfo, Unit] => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: js.Function1[/* info */ OnReceiveInfo, Unit]) => value(t0).runNow()))
  }
}
