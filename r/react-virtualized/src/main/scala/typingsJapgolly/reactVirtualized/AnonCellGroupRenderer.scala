package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellGroupRenderer extends js.Object {
  var `aria-label`: grid
  var cellGroupRenderer: CollectionCellGroupRenderer
}

object AnonCellGroupRenderer {
  @scala.inline
  def apply(
    `aria-label`: grid,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => CallbackTo[js.Array[Node]]
  ): AnonCellGroupRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("cellGroupRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams) => cellGroupRenderer(t0).runNow()))
    __obj.asInstanceOf[AnonCellGroupRenderer]
  }
}

