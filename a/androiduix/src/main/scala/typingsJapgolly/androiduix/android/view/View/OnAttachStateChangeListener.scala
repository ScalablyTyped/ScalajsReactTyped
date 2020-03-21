package typingsJapgolly.androiduix.android.view.View

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAttachStateChangeListener extends js.Object {
  def onViewAttachedToWindow(v: typingsJapgolly.androiduix.android.view.View): js.Any
  def onViewDetachedFromWindow(v: typingsJapgolly.androiduix.android.view.View): js.Any
}

object OnAttachStateChangeListener {
  @scala.inline
  def apply(
    onViewAttachedToWindow: typingsJapgolly.androiduix.android.view.View => CallbackTo[js.Any],
    onViewDetachedFromWindow: typingsJapgolly.androiduix.android.view.View => CallbackTo[js.Any]
  ): OnAttachStateChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onViewAttachedToWindow")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => onViewAttachedToWindow(t0).runNow()))
    __obj.updateDynamic("onViewDetachedFromWindow")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => onViewDetachedFromWindow(t0).runNow()))
    __obj.asInstanceOf[OnAttachStateChangeListener]
  }
}

