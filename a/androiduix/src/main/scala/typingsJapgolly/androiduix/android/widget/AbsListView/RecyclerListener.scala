package typingsJapgolly.androiduix.android.widget.AbsListView

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecyclerListener extends js.Object {
  def onMovedToScrapHeap(view: View): Unit
}

object RecyclerListener {
  @scala.inline
  def apply(onMovedToScrapHeap: View => Callback): RecyclerListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMovedToScrapHeap")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => onMovedToScrapHeap(t0).runNow()))
    __obj.asInstanceOf[RecyclerListener]
  }
}

