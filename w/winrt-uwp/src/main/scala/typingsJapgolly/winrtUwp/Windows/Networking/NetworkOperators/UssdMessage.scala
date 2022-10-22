package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
trait UssdMessage extends StObject {
  
  /** Gets or sets the encoding scheme of the payload of this UssdMessage . */
  var dataCodingScheme: Double
  
  /**
    * Gets the raw payload of this UssdMessage .
    * @return The raw payload of this UssdMessage .
    */
  def getPayload(): js.Array[Double]
  
  /** Gets or sets the payload of this UssdMessage as text. */
  var payloadAsText: String
  
  /**
    * Sets the raw payload of this UssdMessage .
    * @param value The raw payload of this UssdMessage .
    */
  def setPayload(value: js.Array[Double]): Unit
}
object UssdMessage {
  
  inline def apply(
    dataCodingScheme: Double,
    getPayload: CallbackTo[js.Array[Double]],
    payloadAsText: String,
    setPayload: js.Array[Double] => Callback
  ): UssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = getPayload.toJsFn, payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1((t0: js.Array[Double]) => setPayload(t0).runNow()))
    __obj.asInstanceOf[UssdMessage]
  }
  
  extension [Self <: UssdMessage](x: Self) {
    
    inline def setDataCodingScheme(value: Double): Self = StObject.set(x, "dataCodingScheme", value.asInstanceOf[js.Any])
    
    inline def setGetPayload(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getPayload", value.toJsFn)
    
    inline def setPayloadAsText(value: String): Self = StObject.set(x, "payloadAsText", value.asInstanceOf[js.Any])
    
    inline def setSetPayload(value: js.Array[Double] => Callback): Self = StObject.set(x, "setPayload", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
  }
}
