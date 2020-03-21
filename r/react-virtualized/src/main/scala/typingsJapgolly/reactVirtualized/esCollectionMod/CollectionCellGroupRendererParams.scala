package typingsJapgolly.reactVirtualized.esCollectionMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCellGroupRendererParams extends js.Object {
  var cellRenderer: CollectionCellRenderer
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter
  var indices: js.Array[Double]
}

object CollectionCellGroupRendererParams {
  @scala.inline
  def apply(
    cellRenderer: /* params */ CollectionCellRendererParams => CallbackTo[Node],
    cellSizeAndPositionGetter: /* params */ Index => CallbackTo[CollectionCellSizeAndPosition],
    indices: js.Array[Double]
  ): CollectionCellGroupRendererParams = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellRendererParams) => cellRenderer(t0).runNow()))
    __obj.updateDynamic("cellSizeAndPositionGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.mod.Index) => cellSizeAndPositionGetter(t0).runNow()))
    __obj.asInstanceOf[CollectionCellGroupRendererParams]
  }
}

