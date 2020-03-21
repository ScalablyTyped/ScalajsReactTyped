package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Background {
  /** Represents a method that handles the cancellation of a background task. */
  type BackgroundTaskCanceledEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason with (typingsJapgolly.winrtUwp.Windows.WinRTEvent[
      typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTaskInstance
    ]), 
    scala.Unit
  ]
  /** Represents a method that handles completion events for a background task. */
  type BackgroundTaskCompletedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs with (typingsJapgolly.winrtUwp.Windows.WinRTEvent[
      typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration
    ]), 
    scala.Unit
  ]
  /** Represents a method that handles progress update events for a background task. */
  type BackgroundTaskProgressEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs with (typingsJapgolly.winrtUwp.Windows.WinRTEvent[
      typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration
    ]), 
    scala.Unit
  ]
}
