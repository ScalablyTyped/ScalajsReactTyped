package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the current power and availability status of the cash drawer. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.CashDrawerStatus")
@js.native
open class CashDrawerStatus ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.CashDrawerStatus {
  
  /** ExtendedStatus provides a way for a Point of Service driver or provider to send custom notifications to the app. */
  /* CompleteClass */
  var extendedStatus: Double = js.native
  
  /** Gets the status kind for the cash drawer status. */
  /* CompleteClass */
  var statusKind: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.CashDrawerStatusKind = js.native
}
