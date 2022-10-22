package typingsJapgolly.winrtUwp.global.Windows.Media.Capture

import typingsJapgolly.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.AdvancedCapturedPhoto")
@js.native
open class AdvancedCapturedPhoto ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Capture.AdvancedCapturedPhoto {
  
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  /* CompleteClass */
  var context: Any = js.native
  
  /** Gets the captured frame containing the result of the advanced photo capture. */
  /* CompleteClass */
  var frame: typingsJapgolly.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
  
  /** Gets a value indicating the advanced capture mode with which the photo was captured. */
  /* CompleteClass */
  var mode: AdvancedPhotoMode = js.native
}
