package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides access to the raw binary format of an SMS message. The message is stored in the industry standard protocol description unit (PDU) format (see the SMS specification GSM 03.40). */
trait ISmsBinaryMessage
  extends StObject
     with ISmsMessage {
  
  /** Retrieves the detected protocol description unit (PDU) format of this message. */
  var format: SmsDataFormat
  
  /**
    * Returns the raw buffer of the message in binary protocol description unit (PDU) format as a byte array.
    * @return A byte array representing message data. If there is no message data, the returned array is empty.
    */
  def getData(): js.Array[Double]
  
  /**
    * Specifies the raw binary payload of the SMS message. It should be formatted according to the protocol description unit (PDU) standard.
    * @param value A byte array representing message data, formatted according to the protocol description unit (PDU) standard.
    */
  def setData(value: js.Array[Double]): Unit
}
object ISmsBinaryMessage {
  
  inline def apply(
    format: SmsDataFormat,
    getData: CallbackTo[js.Array[Double]],
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.Array[Double] => Callback
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = getData.toJsFn, id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1((t0: js.Array[Double]) => setData(t0).runNow()))
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
  
  extension [Self <: ISmsBinaryMessage](x: Self) {
    
    inline def setFormat(value: SmsDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setSetData(value: js.Array[Double] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
  }
}
