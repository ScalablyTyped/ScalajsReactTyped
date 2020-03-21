package typingsJapgolly.knuddelsUserappsApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnError extends js.Object {
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transferReason: js.UndefOr[String] = js.undefined
}

object AnonOnError {
  @scala.inline
  def apply(
    onError: /* message */ String => Callback = null,
    onSuccess: js.UndefOr[Callback] = js.undefined,
    transferReason: String = null
  ): AnonOnError = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onError(t0).runNow()))
    onSuccess.foreach(p => __obj.updateDynamic("onSuccess")(p.toJsFn))
    if (transferReason != null) __obj.updateDynamic("transferReason")(transferReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnError]
  }
}

