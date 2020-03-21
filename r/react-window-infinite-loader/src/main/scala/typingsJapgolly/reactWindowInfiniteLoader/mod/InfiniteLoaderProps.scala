package typingsJapgolly.reactWindowInfiniteLoader.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactWindowInfiniteLoader.AnonOnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderProps extends js.Object {
  var itemCount: Double
  var minimumBatchSize: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  def children(props: AnonOnItemsRendered): Node
  def isItemLoaded(index: Double): Boolean
  def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_] | Null
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: AnonOnItemsRendered => CallbackTo[Node],
    isItemLoaded: Double => CallbackTo[Boolean],
    itemCount: Double,
    loadMoreItems: (Double, Double) => CallbackTo[js.Promise[js.Any] | Null],
    minimumBatchSize: Int | Double = null,
    threshold: Int | Double = null
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactWindowInfiniteLoader.AnonOnItemsRendered) => children(t0).runNow()))
    __obj.updateDynamic("isItemLoaded")(js.Any.fromFunction1((t0: scala.Double) => isItemLoaded(t0).runNow()))
    __obj.updateDynamic("loadMoreItems")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => loadMoreItems(t0, t1).runNow()))
    if (minimumBatchSize != null) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
}

