package typingsJapgolly.androiduix.android.app.AlertController.AlertParams

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.widget.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPrepareListViewListener extends js.Object {
  def onPrepareListView(listView: ListView): Unit
}

object OnPrepareListViewListener {
  @scala.inline
  def apply(onPrepareListView: ListView => Callback): OnPrepareListViewListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPrepareListView")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.widget.ListView) => onPrepareListView(t0).runNow()))
    __obj.asInstanceOf[OnPrepareListViewListener]
  }
}

