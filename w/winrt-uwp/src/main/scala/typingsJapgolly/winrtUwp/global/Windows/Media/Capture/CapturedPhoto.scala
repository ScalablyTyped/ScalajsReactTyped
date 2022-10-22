package typingsJapgolly.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo taken from a capture device such as a webcam attached. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.CapturedPhoto")
@js.native
open class CapturedPhoto ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Capture.CapturedPhoto {
  
  /** Gets the photo data, represented as CapturedFrame object, associated with the CapturedPhoto object. */
  /* CompleteClass */
  var frame: typingsJapgolly.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
  
  /** Represents a thumbnail image of the capture photo. */
  /* CompleteClass */
  var thumbnail: typingsJapgolly.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}
