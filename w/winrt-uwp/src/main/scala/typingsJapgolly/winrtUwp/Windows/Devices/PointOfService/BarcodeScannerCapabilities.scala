package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the barcode scanner capabilities. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerCapabilities")
@js.native
abstract class BarcodeScannerCapabilities () extends js.Object {
  /** Indicates whether the barcode scanner supports image preview. */
  var isImagePreviewSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports the software trigger functionality. */
  var isSoftwareTriggerSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports reporting of usage statistics. */
  var isStatisticsReportingSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports updating or resetting of usage statistics. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  /** Gets the power reporting type for the barcode scanner. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
}

