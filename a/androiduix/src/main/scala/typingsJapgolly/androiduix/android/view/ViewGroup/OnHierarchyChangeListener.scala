package typingsJapgolly.androiduix.android.view.ViewGroup

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHierarchyChangeListener extends js.Object {
  def onChildViewAdded(parent: View, child: View): js.Any
  def onChildViewRemoved(parent: View, child: View): js.Any
}

object OnHierarchyChangeListener {
  @scala.inline
  def apply(
    onChildViewAdded: (View, View) => CallbackTo[js.Any],
    onChildViewRemoved: (View, View) => CallbackTo[js.Any]
  ): OnHierarchyChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChildViewAdded")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.view.View) => onChildViewAdded(t0, t1).runNow()))
    __obj.updateDynamic("onChildViewRemoved")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.view.View) => onChildViewRemoved(t0, t1).runNow()))
    __obj.asInstanceOf[OnHierarchyChangeListener]
  }
}

