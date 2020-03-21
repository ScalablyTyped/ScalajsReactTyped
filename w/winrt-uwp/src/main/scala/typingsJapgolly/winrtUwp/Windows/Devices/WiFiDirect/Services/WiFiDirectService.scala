package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect.Services

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.sessiondeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Wi-Fi Direct service. This class is used by code on a device that seeks to use a Wi-Fi Direct Service, to establish a Wi-Fi Direct Service session with the service provider. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService")
@js.native
abstract class WiFiDirectService () extends js.Object {
  /** Event raised when a session request has been deferred. Note that this does not mean that the request has failed or been denied. It is a notification that the server is performing a long operation, such as waiting for a user to enter a PIN. The seeker that receives this message should begin a 120-second wait before it times out the session request, to give the server time to complete its operation. The event arguments include a buffer supplied by the server in the deferral notification with additional information. */
  @JSName("onsessiondeferred")
  var onsessiondeferred_Original: TypedEventHandler[WiFiDirectService, WiFiDirectServiceSessionDeferredEventArgs] = js.native
  /** Gets or sets a value specifying whether the service instance should choose Wi-Fi Direct Point to Point (P2P) Group Owner (GO) mode. */
  var preferGroupOwnerMode: Boolean = js.native
  /** Gets the service information blob from this service instance. */
  var remoteServiceInfo: IBuffer = js.native
  /** Error information about the latest attempt to connect to the service. */
  var serviceError: WiFiDirectServiceError = js.native
  /** Gets or sets app-specific session information passed to the server when initiating a session. */
  var sessionInfo: IBuffer = js.native
  /** Gets a list of supported configuration methods, ordered by preference. Your code uses IVector operations to modify the contents of the list. */
  var supportedConfigurationMethods: IVectorView[WiFiDirectServiceConfigurationMethod] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessiondeferred(
    `type`: sessiondeferred,
    listener: TypedEventHandler[WiFiDirectService, WiFiDirectServiceSessionDeferredEventArgs]
  ): Unit = js.native
  /**
    * Initiates the establishment of a service session with the Wi-Fi Direct Service represented by this instance.
    * @return An asynchronous connection operation. When successfully completed, returns an object that represents the session that has been established.
    */
  def connectAsync(): IPromiseWithIAsyncOperation[WiFiDirectServiceSession] = js.native
  /**
    * Initiates the establishment of a service session with the Wi-Fi Direct Service represented by this instance, using a PIN to configure the session.
    * @param pin The PIN to be used to configure the connection.
    * @return An asynchronous connection operation. When successfully completed, returns an object that represents the session that has been established.
    */
  def connectAsync(pin: String): IPromiseWithIAsyncOperation[WiFiDirectServiceSession] = js.native
  /**
    * Asynchronously retrieves Wi-Fi Direct Service session provisioning information.
    * @param selectedConfigurationMethod The preferred method of configuring the session.
    * @return An asynchronous retrieval operation. On successful completion, returns provisioning information.
    */
  def getProvisioningInfoAsync(selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod): IPromiseWithIAsyncOperation[WiFiDirectServiceProvisioningInfo] = js.native
  /** Event raised when a session request has been deferred. Note that this does not mean that the request has failed or been denied. It is a notification that the server is performing a long operation, such as waiting for a user to enter a PIN. The seeker that receives this message should begin a 120-second wait before it times out the session request, to give the server time to complete its operation. The event arguments include a buffer supplied by the server in the deferral notification with additional information. */
  def onsessiondeferred(ev: WiFiDirectServiceSessionDeferredEventArgs with WinRTEvent[WiFiDirectService]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessiondeferred(
    `type`: sessiondeferred,
    listener: TypedEventHandler[WiFiDirectService, WiFiDirectServiceSessionDeferredEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectService")
@js.native
object WiFiDirectService extends js.Object {
  /**
    * Static method that retrieves a WiFiDirectService instance for a Wi-Fi Direct Service offered by the device with a given device ID.
    * @param deviceId Device ID of the device that advertises the desired Wi-Fi Direct Service.
    * @return An asynchronous retrieval operation. On successful completion, returns an instance of WiFiDirectService specific to the desired service instance, advertised by the indicated device.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[WiFiDirectService] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service.
    * @param serviceName The service name to be found.
    * @return The AQS string for the requested advertiser query.
    */
  def getSelector(serviceName: String): String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string to be used to find Wi-Fi Direct Service advertisers for a particular service, where a given byte sequence appears in the advertiser's service information blob.
    * @param serviceName The service name to be found.
    * @param serviceInfoFilter A byte sequence that must be found in the advertiser's service information blob.
    * @return The AQS string for the requested advertiser query.
    */
  def getSelector(serviceName: String, serviceInfoFilter: IBuffer): String = js.native
}

