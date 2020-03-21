package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderChildProps
import typingsJapgolly.reactVirtualized.mod.Index
import typingsJapgolly.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsRowLoaded extends js.Object {
  var children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, Node]]
  var isRowLoaded: Validator[js.Function1[/* params */ Index, Boolean]]
  var loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]]
  var minimumBatchSize: Validator[Double]
  var rowCount: Validator[Double]
  var threshold: Validator[Double]
}

object AnonIsRowLoaded {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, Node]],
    isRowLoaded: Validator[js.Function1[/* params */ Index, Boolean]],
    loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]],
    minimumBatchSize: Validator[Double],
    rowCount: Validator[Double],
    threshold: Validator[Double]
  ): AnonIsRowLoaded = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isRowLoaded = isRowLoaded.asInstanceOf[js.Any], loadMoreRows = loadMoreRows.asInstanceOf[js.Any], minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsRowLoaded]
  }
}

