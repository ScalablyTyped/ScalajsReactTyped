package typingsJapgolly.winrt.Windows.UI.WebUI

import typingsJapgolly.winrt.Windows.ApplicationModel.ISuspendingOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
class SuspendingOperation () extends ISuspendingOperation {
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /* CompleteClass */
  override def getDeferral(): typingsJapgolly.winrt.Windows.ApplicationModel.SuspendingDeferral = js.native
}

