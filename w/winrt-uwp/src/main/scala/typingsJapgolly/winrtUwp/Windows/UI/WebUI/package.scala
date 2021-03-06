package typingsJapgolly.winrtUwp.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUI {
  /** Represents a method that handles the app activation event. */
  type ActivatedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.IActivatedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[_], 
    scala.Unit
  ]
  /** Represents a method that handles the app navigation event. */
  type NavigatedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.UI.WebUI.IWebUINavigatedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[_], 
    scala.Unit
  ]
  /** Represents a method that handles the app resumption event. */
  type ResumingEventHandler = js.Function1[/* ev */ typingsJapgolly.winrtUwp.Windows.WinRTEvent[js.Any], scala.Unit]
  /** Represents a method that handles the app suspension event. */
  type SuspendingEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.ApplicationModel.ISuspendingEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[_], 
    scala.Unit
  ]
}
