package typingsJapgolly.prex.cancellationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prex.AnonDispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VSCodeCancellationTokenLike extends js.Object {
  val isCancellationRequested: Boolean
  def onCancellationRequested(listener: js.Function0[_]): AnonDispose
}

object VSCodeCancellationTokenLike {
  @scala.inline
  def apply(
    isCancellationRequested: Boolean,
    onCancellationRequested: js.Function0[js.Any] => CallbackTo[AnonDispose]
  ): VSCodeCancellationTokenLike = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.asInstanceOf[js.Any])
    __obj.updateDynamic("onCancellationRequested")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => onCancellationRequested(t0).runNow()))
    __obj.asInstanceOf[VSCodeCancellationTokenLike]
  }
}

