package typingsJapgolly.androiduix.android.view.ViewTreeObserver

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchModeChangeListener extends js.Object {
  def onTouchModeChanged(isInTouchMode: Boolean): js.Any
}

object OnTouchModeChangeListener {
  @scala.inline
  def apply(onTouchModeChanged: Boolean => CallbackTo[js.Any]): OnTouchModeChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onTouchModeChanged")(js.Any.fromFunction1((t0: scala.Boolean) => onTouchModeChanged(t0).runNow()))
    __obj.asInstanceOf[OnTouchModeChangeListener]
  }
}

