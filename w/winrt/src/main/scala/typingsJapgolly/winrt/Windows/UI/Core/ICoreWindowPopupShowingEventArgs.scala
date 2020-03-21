package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowPopupShowingEventArgs extends js.Object {
  def setDesiredSize(value: Size): Unit
}

object ICoreWindowPopupShowingEventArgs {
  @scala.inline
  def apply(setDesiredSize: Size => Callback): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDesiredSize")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Size) => setDesiredSize(t0).runNow()))
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
}

