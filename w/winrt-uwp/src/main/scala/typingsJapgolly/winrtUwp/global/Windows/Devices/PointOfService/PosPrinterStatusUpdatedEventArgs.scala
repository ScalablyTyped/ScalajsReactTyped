package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the PosPrinter.StatusUpdated event that occurs when the status of a point-of-service printer changes. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.PosPrinterStatusUpdatedEventArgs")
@js.native
open class PosPrinterStatusUpdatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterStatusUpdatedEventArgs {
  
  /** Gets the new status of the point-of-service printer after the status of the printer changes. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterStatus = js.native
}
