package typingsJapgolly.androiduix.android.view.MenuItem

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMenuItemClickListener extends js.Object {
  def onMenuItemClick(item: typingsJapgolly.androiduix.android.view.MenuItem): Boolean
}

object OnMenuItemClickListener {
  @scala.inline
  def apply(onMenuItemClick: typingsJapgolly.androiduix.android.view.MenuItem => CallbackTo[Boolean]): OnMenuItemClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMenuItemClick")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MenuItem) => onMenuItemClick(t0).runNow()))
    __obj.asInstanceOf[OnMenuItemClickListener]
  }
}

