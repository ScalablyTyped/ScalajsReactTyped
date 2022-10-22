package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device service command session which allows the caller to submit predefined commands to the modem on a mobile broadband device service. */
trait MobileBroadbandDeviceServiceCommandSession extends StObject {
  
  /** Closes the command session on a mobile broadband device service. */
  def closeSession(): Unit
  
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a query command to the command session.
    * @param commandId The command identifier for the query command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  def sendQueryCommandAsync(commandId: Double, data: IBuffer): IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]
  
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a set command to the command session.
    * @param commandId The command identifier for the set command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  def sendSetCommandAsync(commandId: Double, data: IBuffer): IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]
}
object MobileBroadbandDeviceServiceCommandSession {
  
  inline def apply(
    closeSession: Callback,
    sendQueryCommandAsync: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult],
    sendSetCommandAsync: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]
  ): MobileBroadbandDeviceServiceCommandSession = {
    val __obj = js.Dynamic.literal(closeSession = closeSession.toJsFn, sendQueryCommandAsync = js.Any.fromFunction2(sendQueryCommandAsync), sendSetCommandAsync = js.Any.fromFunction2(sendSetCommandAsync))
    __obj.asInstanceOf[MobileBroadbandDeviceServiceCommandSession]
  }
  
  extension [Self <: MobileBroadbandDeviceServiceCommandSession](x: Self) {
    
    inline def setCloseSession(value: Callback): Self = StObject.set(x, "closeSession", value.toJsFn)
    
    inline def setSendQueryCommandAsync(value: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]): Self = StObject.set(x, "sendQueryCommandAsync", js.Any.fromFunction2(value))
    
    inline def setSendSetCommandAsync(value: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]): Self = StObject.set(x, "sendSetCommandAsync", js.Any.fromFunction2(value))
  }
}
