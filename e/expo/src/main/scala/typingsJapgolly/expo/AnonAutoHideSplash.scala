package typingsJapgolly.expo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHideSplash extends Props {
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}

object AnonAutoHideSplash {
  @scala.inline
  def apply(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ js.Error => Callback = null,
    onFinish: js.UndefOr[Callback] = js.undefined,
    startAsync: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined
  ): AnonAutoHideSplash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    onFinish.foreach(p => __obj.updateDynamic("onFinish")(p.toJsFn))
    startAsync.foreach(p => __obj.updateDynamic("startAsync")(p.toJsFn))
    __obj.asInstanceOf[AnonAutoHideSplash]
  }
}

