package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error information for the ErrorOccurred event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderErrorOccurredEventArgs")
@js.native
open class MagneticStripeReaderErrorOccurredEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderErrorOccurredEventArgs {
  
  /** Gets the error information, such as cause of error, severity, error message, and any available vendor specific error information. */
  /* CompleteClass */
  var errorData: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorData = js.native
  
  /** Gets the track data for tracks the did not have errors. */
  /* CompleteClass */
  var partialInputData: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport = js.native
  
  /** Gets the Track 1 error information. */
  /* CompleteClass */
  var track1Status: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
  
  /** Gets the Track 2 error information. */
  /* CompleteClass */
  var track2Status: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
  
  /** Gets the Track 3 error information. */
  /* CompleteClass */
  var track3Status: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
  
  /** Gets the Track 4 error information. */
  /* CompleteClass */
  var track4Status: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType = js.native
}
