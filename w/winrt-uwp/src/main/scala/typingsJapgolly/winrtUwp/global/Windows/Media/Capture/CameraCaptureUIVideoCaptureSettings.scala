package typingsJapgolly.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings")
@js.native
open class CameraCaptureUIVideoCaptureSettings ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings {
  
  /** Determines whether or not the video trimming user interface will be enabled. */
  /* CompleteClass */
  var allowTrimming: Boolean = js.native
  
  /** Determines the format for storing captured videos. */
  /* CompleteClass */
  var format: typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraCaptureUIVideoFormat = js.native
  
  /** Determines the maximum duration of a video. */
  /* CompleteClass */
  var maxDurationInSeconds: Double = js.native
  
  /** Determines the maximum resolution that the user can select. */
  /* CompleteClass */
  var maxResolution: typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution = js.native
}
