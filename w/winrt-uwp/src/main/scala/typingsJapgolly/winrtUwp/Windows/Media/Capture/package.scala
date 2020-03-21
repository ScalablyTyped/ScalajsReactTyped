package typingsJapgolly.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Capture {
  /** Represents the method that will handle the MediaCapture.Failed event. */
  type MediaCaptureFailedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCaptureFailedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCapture], 
    scala.Unit
  ]
  /** Represents the method that will handle RecordLimitationExceeded and related events. */
  type RecordLimitationExceededEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCapture], 
    scala.Unit
  ]
}
