package typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshLoadListener extends js.Object {
  def onLoadMore(prll: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout): Unit
  def onRefresh(prll: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout): Unit
}

object RefreshLoadListener {
  @scala.inline
  def apply(
    onLoadMore: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout => Callback,
    onRefresh: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout => Callback
  ): RefreshLoadListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onLoadMore")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout) => onLoadMore(t0).runNow()))
    __obj.updateDynamic("onRefresh")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout) => onRefresh(t0).runNow()))
    __obj.asInstanceOf[RefreshLoadListener]
  }
}

