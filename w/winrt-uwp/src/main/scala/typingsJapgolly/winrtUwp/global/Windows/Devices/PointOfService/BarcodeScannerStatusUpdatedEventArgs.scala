package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an operation status change. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs")
@js.native
open class BarcodeScannerStatusUpdatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs {
  
  /** Gets the vendor specific status code. */
  /* CompleteClass */
  var extendedStatus: Double = js.native
  
  /** Gets the status change information. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerStatus = js.native
}
