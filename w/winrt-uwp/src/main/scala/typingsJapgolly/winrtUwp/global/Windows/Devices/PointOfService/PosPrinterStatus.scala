package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the status of a point-of-service printer, such as the power state of the printer. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.PosPrinterStatus")
@js.native
open class PosPrinterStatus ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterStatus {
  
  /** Gets extended information about the power state of the point-of-service printer that the original equipment manufacturer (OEM) defines. Value is only valid if the PosPrinterStatus.StatusKind property is PosPrinterStatusKind.Extended. */
  /* CompleteClass */
  var extendedStatus: Double = js.native
  
  /** Gets the power state of a point-of-service printer. */
  /* CompleteClass */
  var statusKind: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterStatusKind = js.native
}
