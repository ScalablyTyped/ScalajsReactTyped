package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed suspension for an app. GetDeferral */
@JSGlobal("Windows.UI.WebUI.SuspendingDeferral")
@js.native
abstract class SuspendingDeferral () extends js.Object {
  /** Notifies the system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit = js.native
}

