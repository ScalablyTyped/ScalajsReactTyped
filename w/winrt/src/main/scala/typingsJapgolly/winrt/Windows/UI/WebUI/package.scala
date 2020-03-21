package typingsJapgolly.winrt.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUI {
  type ActivatedEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* eventArgs */ typingsJapgolly.winrt.Windows.ApplicationModel.Activation.IActivatedEventArgs, 
    scala.Unit
  ]
  type NavigatedEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* e */ typingsJapgolly.winrt.Windows.UI.WebUI.IWebUINavigatedEventArgs, 
    scala.Unit
  ]
  type ResumingEventHandler = js.Function1[/* sender */ js.Any, scala.Unit]
  type SuspendingEventHandler = js.Function2[
    /* sender */ js.Any, 
    /* e */ typingsJapgolly.winrt.Windows.ApplicationModel.ISuspendingEventArgs, 
    scala.Unit
  ]
}
