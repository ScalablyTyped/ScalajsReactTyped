package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsBinaryMessage
  extends StObject
     with ISmsMessage {
  
  var format: SmsDataFormat
  
  def getData(): js.typedarray.Uint8Array
  
  def setData(value: js.typedarray.Uint8Array): Unit
}
object ISmsBinaryMessage {
  
  inline def apply(
    format: SmsDataFormat,
    getData: CallbackTo[js.typedarray.Uint8Array],
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.typedarray.Uint8Array => Callback
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = getData.toJsFn, id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => setData(t0).runNow()))
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
  
  extension [Self <: ISmsBinaryMessage](x: Self) {
    
    inline def setFormat(value: SmsDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setSetData(value: js.typedarray.Uint8Array => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => value(t0).runNow()))
  }
}
