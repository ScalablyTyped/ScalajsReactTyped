package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.statusupdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner device. */
@js.native
trait BarcodeScanner extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs]
  ): Unit = js.native
  
  /** Gets the capabilities of the specified barcode scanner. */
  var capabilities: BarcodeScannerCapabilities = js.native
  
  /**
    * Tests the state of the barcode scanner.
    * @param level The specified health check level.
    * @return A text description of the test result. Returns an error if the specified check level is not supported by the device.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Attempts to get an exclusive access to the barcode scanner.
    * @return When the method completes, it returns a ClaimedBarcodeScanner .
    */
  def claimScannerAsync(): IPromiseWithIAsyncOperation[ClaimedBarcodeScanner] = js.native
  
  /** Gets the DeviceInformation.Id of the barcode scanner. */
  var deviceId: String = js.native
  
  /**
    * Gets the list of profiles supported by the barcode scanner.
    * @return As array of strings representing the supported profiles. Returns an empty list if the scanner does not support profiles.
    */
  def getSupportedProfiles(): IVectorView[String] = js.native
  
  /**
    * Gets the symbologies supported by the claimed barcode scanner.
    * @return When the method completes successfully, it returns a list of values that represent the symbologies supported by the device.
    */
  def getSupportedSymbologiesAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Determines whether the profile is supported.
    * @param profile Barcode scanner profile.
    * @return True if the barcode scanner supports the profile; otherwise false.
    */
  def isProfileSupported(profile: String): Boolean = js.native
  
  /**
    * Determines whether the specified symbology is supported by the barcode scanner.
    * @param barcodeSymbology The specific barcode symbology.
    * @return True if the device supports the specified symbology; otherwise, false.
    */
  def isSymbologySupportedAsync(barcodeSymbology: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Occurs when the barcode scanner detects an operation status change. */
  def onstatusupdated(ev: BarcodeScannerStatusUpdatedEventArgs & WinRTEvent[BarcodeScanner]): Unit = js.native
  /** Occurs when the barcode scanner detects an operation status change. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs]
  ): Unit = js.native
  
  /**
    * Retrieves the requested statistics from the barcode scanner.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return IBuffer representing the requested statistics.
    */
  def retrieveStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[IBuffer] = js.native
}
