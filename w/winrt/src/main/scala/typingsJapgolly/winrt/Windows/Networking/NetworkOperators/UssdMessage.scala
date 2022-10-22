package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UssdMessage
  extends StObject
     with IUssdMessage
object UssdMessage {
  
  inline def apply(
    dataCodingScheme: Double,
    getPayload: CallbackTo[js.typedarray.Uint8Array],
    payloadAsText: String,
    setPayload: js.typedarray.Uint8Array => Callback
  ): UssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = getPayload.toJsFn, payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => setPayload(t0).runNow()))
    __obj.asInstanceOf[UssdMessage]
  }
}
