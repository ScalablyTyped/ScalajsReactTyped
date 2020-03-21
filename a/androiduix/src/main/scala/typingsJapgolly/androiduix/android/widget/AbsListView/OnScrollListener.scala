package typingsJapgolly.androiduix.android.widget.AbsListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollListener extends js.Object {
  def onScroll(
    view: typingsJapgolly.androiduix.android.widget.AbsListView,
    firstVisibleItem: Double,
    visibleItemCount: Double,
    totalItemCount: Double
  ): Unit
  def onScrollStateChanged(view: typingsJapgolly.androiduix.android.widget.AbsListView, scrollState: Double): Unit
}

@JSGlobal("android.widget.AbsListView.OnScrollListener")
@js.native
object OnScrollListener extends js.Object {
  var SCROLL_STATE_FLING: Double = js.native
  var SCROLL_STATE_IDLE: Double = js.native
  var SCROLL_STATE_TOUCH_SCROLL: Double = js.native
}

