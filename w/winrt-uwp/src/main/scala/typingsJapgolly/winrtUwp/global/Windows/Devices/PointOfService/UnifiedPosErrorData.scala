package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error information. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorData")
@js.native
open class UnifiedPosErrorData ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorData {
  
  /** Gets the vendor specific error information. */
  /* CompleteClass */
  var extendedReason: Double = js.native
  
  /** Gets the error message. */
  /* CompleteClass */
  var message: String = js.native
  
  /** Gets the cause of the error. */
  /* CompleteClass */
  var reason: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorReason = js.native
  
  /** Gets the error severity. */
  /* CompleteClass */
  var severity: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorSeverity = js.native
}
