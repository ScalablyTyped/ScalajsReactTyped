package typingsJapgolly.reduxInfiniteScroll.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollerProps extends js.Object {
  var children: js.UndefOr[js.Array[Element]] = js.undefined
  var containerHeight: js.UndefOr[Double | String] = js.undefined
  var elementIsScrollable: js.UndefOr[Boolean] = js.undefined
  var hasMore: js.UndefOr[Boolean] = js.undefined
  var holderType: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Element]] = js.undefined
  var loader: js.UndefOr[js.Any] = js.undefined
  var loadingMore: js.UndefOr[Boolean] = js.undefined
  var showLoader: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  def loadMore(): Unit
}

object InfiniteScrollerProps {
  @scala.inline
  def apply(
    loadMore: Callback,
    children: js.Array[Element] = null,
    containerHeight: Double | String = null,
    elementIsScrollable: js.UndefOr[Boolean] = js.undefined,
    hasMore: js.UndefOr[Boolean] = js.undefined,
    holderType: String = null,
    items: js.Array[Element] = null,
    loader: js.Any = null,
    loadingMore: js.UndefOr[Boolean] = js.undefined,
    showLoader: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null
  ): InfiniteScrollerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadMore")(loadMore.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(elementIsScrollable)) __obj.updateDynamic("elementIsScrollable")(elementIsScrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore.asInstanceOf[js.Any])
    if (holderType != null) __obj.updateDynamic("holderType")(holderType.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingMore)) __obj.updateDynamic("loadingMore")(loadingMore.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoader)) __obj.updateDynamic("showLoader")(showLoader.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteScrollerProps]
  }
}

