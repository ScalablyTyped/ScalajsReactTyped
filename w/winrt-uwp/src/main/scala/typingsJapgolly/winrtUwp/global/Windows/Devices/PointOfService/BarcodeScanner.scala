package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner device. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
open class BarcodeScanner ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner
object BarcodeScanner {
  
  @JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates BarcodeScanner object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific barcode scanner, which can be retrieved from the DeviceId property.
    * @return The barcode scanner specified by the unique device identifier. Returns a null object in the following cases:
    */
  /* static member */
  inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner]]
  
  /**
    * Returns the first available barcode scanner.
    * @return The first available barcode scanner. Returns a null object in the following cases:
    */
  /* static member */
  inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner]]
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available barcode scanners.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available barcode scanners.
    */
  /* static member */
  inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
}
