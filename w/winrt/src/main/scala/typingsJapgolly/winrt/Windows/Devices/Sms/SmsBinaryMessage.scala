package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsBinaryMessage
  extends StObject
     with ISmsBinaryMessage
object SmsBinaryMessage {
  
  inline def apply(
    format: SmsDataFormat,
    getData: CallbackTo[js.typedarray.Uint8Array],
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.typedarray.Uint8Array => Callback
  ): SmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = getData.toJsFn, id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => setData(t0).runNow()))
    __obj.asInstanceOf[SmsBinaryMessage]
  }
}
