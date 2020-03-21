package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceRequest extends js.Object {
  var deadline: js.Date
  def displayErrorString(errorString: String): Unit
  def getDeferral(): PlayToSourceDeferral
  def setSource(value: PlayToSource): Unit
}

object IPlayToSourceRequest {
  @scala.inline
  def apply(
    deadline: js.Date,
    displayErrorString: String => Callback,
    getDeferral: CallbackTo[PlayToSourceDeferral],
    setSource: PlayToSource => Callback
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("displayErrorString")(js.Any.fromFunction1((t0: java.lang.String) => displayErrorString(t0).runNow()))
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.updateDynamic("setSource")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.PlayTo.PlayToSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
}

