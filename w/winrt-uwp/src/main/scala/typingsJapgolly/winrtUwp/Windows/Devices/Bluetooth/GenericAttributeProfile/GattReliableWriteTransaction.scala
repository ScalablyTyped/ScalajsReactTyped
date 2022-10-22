package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs GATT reliable writes on the Bluetooth LE device, in the form of a transaction write operation. */
trait GattReliableWriteTransaction extends StObject {
  
  /**
    * Performs all the queued writes, in sequence, writing the data to the device. Once a transaction object has been committed, no further operations are possible on the GattReliableWriteTransaction object.
    * @return The object used to manage the asynchronous operation, which, upon completion, will return the status of the asynchronous operation.
    */
  def commitAsync(): IPromiseWithIAsyncOperation[GattCommunicationStatus]
  
  /**
    * Adds a new write operation to the transaction object.
    * @param characteristic The GattCharacteristic object on which to perform the write operation.
    * @param value The Characteristic Value to be written to characteristic.
    */
  def writeValue(characteristic: GattCharacteristic, value: IBuffer): Unit
}
object GattReliableWriteTransaction {
  
  inline def apply(
    commitAsync: CallbackTo[IPromiseWithIAsyncOperation[GattCommunicationStatus]],
    writeValue: (GattCharacteristic, IBuffer) => Callback
  ): GattReliableWriteTransaction = {
    val __obj = js.Dynamic.literal(commitAsync = commitAsync.toJsFn, writeValue = js.Any.fromFunction2((t0: GattCharacteristic, t1: IBuffer) => (writeValue(t0, t1)).runNow()))
    __obj.asInstanceOf[GattReliableWriteTransaction]
  }
  
  extension [Self <: GattReliableWriteTransaction](x: Self) {
    
    inline def setCommitAsync(value: CallbackTo[IPromiseWithIAsyncOperation[GattCommunicationStatus]]): Self = StObject.set(x, "commitAsync", value.toJsFn)
    
    inline def setWriteValue(value: (GattCharacteristic, IBuffer) => Callback): Self = StObject.set(x, "writeValue", js.Any.fromFunction2((t0: GattCharacteristic, t1: IBuffer) => (value(t0, t1)).runNow()))
  }
}
