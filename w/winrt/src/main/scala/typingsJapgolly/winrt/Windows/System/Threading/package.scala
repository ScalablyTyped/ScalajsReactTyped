package typingsJapgolly.winrt.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Threading {
  type TimerDestroyedHandler = js.Function1[
    /* timer */ typingsJapgolly.winrt.Windows.System.Threading.ThreadPoolTimer, 
    scala.Unit
  ]
  type TimerElapsedHandler = js.Function1[
    /* timer */ typingsJapgolly.winrt.Windows.System.Threading.ThreadPoolTimer, 
    scala.Unit
  ]
  type WorkItemHandler = js.Function1[/* operation */ typingsJapgolly.winrt.Windows.Foundation.IAsyncAction, scala.Unit]
}
