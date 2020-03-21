package typingsJapgolly.winrt.Windows.Media.Capture

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraOptionsUIStatics extends js.Object {
  def show(mediaCapture: MediaCapture): Unit
}

object ICameraOptionsUIStatics {
  @scala.inline
  def apply(show: MediaCapture => Callback): ICameraOptionsUIStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaCapture) => show(t0).runNow()))
    __obj.asInstanceOf[ICameraOptionsUIStatics]
  }
}

