package typingsJapgolly.winrtUwp.global.Windows.Media.Capture

import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings")
@js.native
open class CameraCaptureUIPhotoCaptureSettings ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings {
  
  /** Determines whether photo cropping will be enabled in the user interface for capture a photo. */
  /* CompleteClass */
  var allowCropping: Boolean = js.native
  
  /** The aspect ratio of the captured photo. */
  /* CompleteClass */
  var croppedAspectRatio: Size = js.native
  
  /** The exact size in pixels of the captured photo. */
  /* CompleteClass */
  var croppedSizeInPixels: Size = js.native
  
  /** Determines the format that captured photos will be stored in. */
  /* CompleteClass */
  var format: typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraCaptureUIPhotoFormat = js.native
  
  /** Determines the maximum resolution the user will be able to select. */
  /* CompleteClass */
  var maxResolution: typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution = js.native
}
