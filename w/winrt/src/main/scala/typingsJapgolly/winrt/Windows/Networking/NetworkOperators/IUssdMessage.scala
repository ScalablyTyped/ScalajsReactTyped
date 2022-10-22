package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdMessage extends StObject {
  
  var dataCodingScheme: Double
  
  def getPayload(): js.typedarray.Uint8Array
  
  var payloadAsText: String
  
  def setPayload(value: js.typedarray.Uint8Array): Unit
}
object IUssdMessage {
  
  inline def apply(
    dataCodingScheme: Double,
    getPayload: CallbackTo[js.typedarray.Uint8Array],
    payloadAsText: String,
    setPayload: js.typedarray.Uint8Array => Callback
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = getPayload.toJsFn, payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => setPayload(t0).runNow()))
    __obj.asInstanceOf[IUssdMessage]
  }
  
  extension [Self <: IUssdMessage](x: Self) {
    
    inline def setDataCodingScheme(value: Double): Self = StObject.set(x, "dataCodingScheme", value.asInstanceOf[js.Any])
    
    inline def setGetPayload(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getPayload", value.toJsFn)
    
    inline def setPayloadAsText(value: String): Self = StObject.set(x, "payloadAsText", value.asInstanceOf[js.Any])
    
    inline def setSetPayload(value: js.typedarray.Uint8Array => Callback): Self = StObject.set(x, "setPayload", js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => value(t0).runNow()))
  }
}
