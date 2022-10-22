package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband modem. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
@js.native
open class MobileBroadbandModem ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem {
  
  /** Gets the MobileBroadbandAccount associated currently with the mobile broadband modem. */
  /* CompleteClass */
  var currentAccount: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount = js.native
  
  /** Gets an object that describes the mobile broadband network that this modem us currently attached to. */
  /* CompleteClass */
  var currentNetwork: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
  
  /** Gets the MobileBroadbandDeviceInformation for the mobile broadband modem. */
  /* CompleteClass */
  var deviceInformation: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation = js.native
  
  /** Gets a list of the device services available for the mobile broadband modem. */
  /* CompleteClass */
  var deviceServices: IVectorView[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation
  ] = js.native
  
  /**
    * Asynchronously retrieves mobile broadband modem configuration information.
    * @return An asynchronous retrieval operation. On successful completion, contains a MobileBroadbandModemConfiguration object representing the current configuration.
    */
  /* CompleteClass */
  override def getCurrentConfigurationAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration
  ] = js.native
  
  /**
    * Gets a specific device service for the mobile broadband modem.
    * @param deviceServiceId The unique device service identifier for the device service to be retrieved.
    * @return The mobile broadband device service retrieved.
    */
  /* CompleteClass */
  override def getDeviceService(deviceServiceId: String): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceService = js.native
  
  /** Gets a value indicating whether the mobile broadband modem allows a reset operation. */
  /* CompleteClass */
  var isResetSupported: Boolean = js.native
  
  /** Gets the maximum device service command size, in bytes, for the mobile broadband modem. */
  /* CompleteClass */
  var maxDeviceServiceCommandSizeInBytes: Double = js.native
  
  /** Gets the maximum device service data size, in bytes, for the mobile broadband modem. */
  /* CompleteClass */
  var maxDeviceServiceDataSizeInBytes: Double = js.native
  
  /**
    * Asynchronously performs a reset operation on the mobile broadband modem.
    * @return An asynchronous reset operation.
    */
  /* CompleteClass */
  override def resetAsync(): IPromiseWithIAsyncAction = js.native
}
object MobileBroadbandModem {
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determine if a mobile broadband device is a Wireless WAN device.
    * @param deviceId The mobile broadband device ID
    * @return The mobile broadband modem.
    */
  /* static member */
  inline def fromId(deviceId: String): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem]
  
  /**
    * Determines the default mobile broadband modem.
    * @return The mobile broadband modem.
    */
  /* static member */
  inline def getDefault(): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem]
  
  /**
    * Gets a device selector for the mobile broadband modem.
    * @return A device selector for the mobile broadband modem.
    */
  /* static member */
  inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
}
