package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  /** @platform android */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  /** @platform android */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(cancelable: js.UndefOr[Boolean] = js.undefined, onDismiss: js.UndefOr[Callback] = js.undefined): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    __obj.asInstanceOf[AlertOptions]
  }
}

