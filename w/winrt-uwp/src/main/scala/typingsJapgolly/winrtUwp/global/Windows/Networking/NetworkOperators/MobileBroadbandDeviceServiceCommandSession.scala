package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device service command session which allows the caller to submit predefined commands to the modem on a mobile broadband device service. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandSession")
@js.native
open class MobileBroadbandDeviceServiceCommandSession ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandSession {
  
  /** Closes the command session on a mobile broadband device service. */
  /* CompleteClass */
  override def closeSession(): Unit = js.native
  
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a query command to the command session.
    * @param commandId The command identifier for the query command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  /* CompleteClass */
  override def sendQueryCommandAsync(commandId: Double, data: IBuffer): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult
  ] = js.native
  
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a set command to the command session.
    * @param commandId The command identifier for the set command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  /* CompleteClass */
  override def sendSetCommandAsync(commandId: Double, data: IBuffer): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult
  ] = js.native
}
