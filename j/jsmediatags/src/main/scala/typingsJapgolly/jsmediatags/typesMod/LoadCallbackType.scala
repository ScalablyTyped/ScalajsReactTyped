package typingsJapgolly.jsmediatags.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadCallbackType extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  def onSuccess(): Unit
}

object LoadCallbackType {
  @scala.inline
  def apply(onSuccess: Callback, onError: /* error */ jsmediatagsError => Callback = null): LoadCallbackType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSuccess")(onSuccess.toJsFn)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.jsmediatags.typesMod.jsmediatagsError) => onError(t0).runNow()))
    __obj.asInstanceOf[LoadCallbackType]
  }
}

