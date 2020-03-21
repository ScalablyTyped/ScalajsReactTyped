package typingsJapgolly.androiduix.android.view.Menu_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onMenuItemSelected(menu: typingsJapgolly.androiduix.android.view.Menu_, item: MenuItem): Boolean
}

object Callback {
  @scala.inline
  def apply(
    onMenuItemSelected: (typingsJapgolly.androiduix.android.view.Menu_, MenuItem) => CallbackTo[Boolean]
  ): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMenuItemSelected")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.Menu_, t1: typingsJapgolly.androiduix.android.view.MenuItem) => onMenuItemSelected(t0, t1).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

