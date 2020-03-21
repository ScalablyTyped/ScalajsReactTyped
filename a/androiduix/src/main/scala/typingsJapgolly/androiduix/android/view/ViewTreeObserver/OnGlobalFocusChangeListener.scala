package typingsJapgolly.androiduix.android.view.ViewTreeObserver

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGlobalFocusChangeListener extends js.Object {
  def onGlobalFocusChanged(oldFocus: View, newFocus: View): js.Any
}

object OnGlobalFocusChangeListener {
  @scala.inline
  def apply(onGlobalFocusChanged: (View, View) => CallbackTo[js.Any]): OnGlobalFocusChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGlobalFocusChanged")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.view.View) => onGlobalFocusChanged(t0, t1).runNow()))
    __obj.asInstanceOf[OnGlobalFocusChangeListener]
  }
}

