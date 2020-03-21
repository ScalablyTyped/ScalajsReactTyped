package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband modem. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
@js.native
abstract class MobileBroadbandModem () extends js.Object {
  /** Gets the MobileBroadbandAccount associated currently with the mobile broadband modem. */
  var currentAccount: MobileBroadbandAccount = js.native
  /** Gets an object that describes the mobile broadband network that this modem us currently attached to. */
  var currentNetwork: MobileBroadbandNetwork = js.native
  /** Gets the MobileBroadbandDeviceInformation for the mobile broadband modem. */
  var deviceInformation: MobileBroadbandDeviceInformation = js.native
  /** Gets a list of the device services available for the mobile broadband modem. */
  var deviceServices: IVectorView[MobileBroadbandDeviceServiceInformation] = js.native
  /** Gets a value indicating whether the mobile broadband modem allows a reset operation. */
  var isResetSupported: Boolean = js.native
  /** Gets the maximum device service command size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceCommandSizeInBytes: Double = js.native
  /** Gets the maximum device service data size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceDataSizeInBytes: Double = js.native
  /**
    * Asynchronously retrieves mobile broadband modem configuration information.
    * @return An asynchronous retrieval operation. On successful completion, contains a MobileBroadbandModemConfiguration object representing the current configuration.
    */
  def getCurrentConfigurationAsync(): IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration] = js.native
  /**
    * Gets a specific device service for the mobile broadband modem.
    * @param deviceServiceId The unique device service identifier for the device service to be retrieved.
    * @return The mobile broadband device service retrieved.
    */
  def getDeviceService(deviceServiceId: String): MobileBroadbandDeviceService = js.native
  /**
    * Asynchronously performs a reset operation on the mobile broadband modem.
    * @return An asynchronous reset operation.
    */
  def resetAsync(): IPromiseWithIAsyncAction = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
@js.native
object MobileBroadbandModem extends js.Object {
  /**
    * Determine if a mobile broadband device is a Wireless WAN device.
    * @param deviceId The mobile broadband device ID
    * @return The mobile broadband modem.
    */
  def fromId(deviceId: String): MobileBroadbandModem = js.native
  /**
    * Determines the default mobile broadband modem.
    * @return The mobile broadband modem.
    */
  def getDefault(): MobileBroadbandModem = js.native
  /**
    * Gets a device selector for the mobile broadband modem.
    * @return A device selector for the mobile broadband modem.
    */
  def getDeviceSelector(): String = js.native
}

