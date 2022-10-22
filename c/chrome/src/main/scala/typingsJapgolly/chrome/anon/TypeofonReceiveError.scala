package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofonReceiveError extends StObject {
  
  val OnReceiveErrorEnum: Break
  
  def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit
}
object TypeofonReceiveError {
  
  inline def apply(
    OnReceiveErrorEnum: Break,
    addListener: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Callback
  ): TypeofonReceiveError = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum.asInstanceOf[js.Any], addListener = js.Any.fromFunction1((t0: js.Function1[/* info */ OnReceiveErrorInfo, Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[TypeofonReceiveError]
  }
  
  extension [Self <: TypeofonReceiveError](x: Self) {
    
    inline def setAddListener(value: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: js.Function1[/* info */ OnReceiveErrorInfo, Unit]) => value(t0).runNow()))
    
    inline def setOnReceiveErrorEnum(value: Break): Self = StObject.set(x, "OnReceiveErrorEnum", value.asInstanceOf[js.Any])
  }
}
