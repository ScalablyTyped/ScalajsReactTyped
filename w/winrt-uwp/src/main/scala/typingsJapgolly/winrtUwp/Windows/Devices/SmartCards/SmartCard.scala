package typingsJapgolly.winrtUwp.Windows.Devices.SmartCards

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about a smart card. */
trait SmartCard extends StObject {
  
  /**
    * Establishes a connection to the smart card and returns a SmartCardConnection object representing the connection.
    * @return Asynchronous operation that, when complete, returns the SmartCardConnection object representing the connection.
    */
  def connectAsync(): IPromiseWithIAsyncOperation[SmartCardConnection]
  
  /**
    * Returns the smart card's Answer to Reset (ATR), a standard series of bytes that contains info about the smart card's characteristics, behaviors, and state.
    * @return The smart card's ATR byte set.
    */
  def getAnswerToResetAsync(): IPromiseWithIAsyncOperation[IBuffer]
  
  /**
    * Returns the smart card's status.
    * @return One of the SmartCardStatus enumeration values, representing the smart card's status.
    */
  def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardStatus]
  
  /** Gets info about the smart card reader into which the smart card is inserted. */
  var reader: SmartCardReader
}
object SmartCard {
  
  inline def apply(
    connectAsync: CallbackTo[IPromiseWithIAsyncOperation[SmartCardConnection]],
    getAnswerToResetAsync: CallbackTo[IPromiseWithIAsyncOperation[IBuffer]],
    getStatusAsync: CallbackTo[IPromiseWithIAsyncOperation[SmartCardStatus]],
    reader: SmartCardReader
  ): SmartCard = {
    val __obj = js.Dynamic.literal(connectAsync = connectAsync.toJsFn, getAnswerToResetAsync = getAnswerToResetAsync.toJsFn, getStatusAsync = getStatusAsync.toJsFn, reader = reader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCard]
  }
  
  extension [Self <: SmartCard](x: Self) {
    
    inline def setConnectAsync(value: CallbackTo[IPromiseWithIAsyncOperation[SmartCardConnection]]): Self = StObject.set(x, "connectAsync", value.toJsFn)
    
    inline def setGetAnswerToResetAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IBuffer]]): Self = StObject.set(x, "getAnswerToResetAsync", value.toJsFn)
    
    inline def setGetStatusAsync(value: CallbackTo[IPromiseWithIAsyncOperation[SmartCardStatus]]): Self = StObject.set(x, "getStatusAsync", value.toJsFn)
    
    inline def setReader(value: SmartCardReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
  }
}
