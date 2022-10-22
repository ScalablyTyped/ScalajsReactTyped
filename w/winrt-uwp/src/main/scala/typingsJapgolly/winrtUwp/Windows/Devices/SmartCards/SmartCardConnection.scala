package typingsJapgolly.winrtUwp.Windows.Devices.SmartCards

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection to a smart card. */
trait SmartCardConnection extends StObject {
  
  /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
  def close(): Unit
  
  /**
    * Asynchronously transmits the supplied application protocol data unit (APDU) command and returns the response.
    * @param command The APDU command to transmit to the smart card.
    * @return An asynchronous operation that, when completed, returns the response to the command that was transmitted.
    */
  def transmitAsync(command: IBuffer): IPromiseWithIAsyncOperation[IBuffer]
}
object SmartCardConnection {
  
  inline def apply(close: Callback, transmitAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): SmartCardConnection = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, transmitAsync = js.Any.fromFunction1(transmitAsync))
    __obj.asInstanceOf[SmartCardConnection]
  }
  
  extension [Self <: SmartCardConnection](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setTransmitAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "transmitAsync", js.Any.fromFunction1(value))
  }
}
