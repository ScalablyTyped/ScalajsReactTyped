package typingsJapgolly.androiduix.androidui.image.NetDrawable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadListener extends js.Object {
  def onError(drawable: typingsJapgolly.androiduix.androidui.image.NetDrawable): js.Any
  def onLoad(drawable: typingsJapgolly.androiduix.androidui.image.NetDrawable): js.Any
}

object LoadListener {
  @scala.inline
  def apply(
    onError: typingsJapgolly.androiduix.androidui.image.NetDrawable => CallbackTo[js.Any],
    onLoad: typingsJapgolly.androiduix.androidui.image.NetDrawable => CallbackTo[js.Any]
  ): LoadListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.androidui.image.NetDrawable) => onError(t0).runNow()))
    __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.androidui.image.NetDrawable) => onLoad(t0).runNow()))
    __obj.asInstanceOf[LoadListener]
  }
}

