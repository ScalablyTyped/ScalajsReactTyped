package typingsJapgolly.rmcPullToRefresh.propsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typingsJapgolly.rmcPullToRefresh.rmcPullToRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var damping: Double
  var direction: down | up
  var distanceToRefresh: Double
  var indicator: Indicator
  var prefixCls: js.UndefOr[String] = js.undefined
  var refreshing: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  def getScrollContainer(): Node
  def onRefresh(): Unit
}

object PropsType {
  @scala.inline
  def apply(
    damping: Double,
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: CallbackTo[Node],
    indicator: Indicator,
    onRefresh: Callback,
    className: String = null,
    prefixCls: String = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any])
    __obj.updateDynamic("getScrollContainer")(getScrollContainer.toJsFn)
    __obj.updateDynamic("onRefresh")(onRefresh.toJsFn)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

