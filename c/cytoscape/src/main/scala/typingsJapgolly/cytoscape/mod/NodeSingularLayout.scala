package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSingularLayout extends js.Object {
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): AnonX
}

object NodeSingularLayout {
  @scala.inline
  def apply(layoutDimensions: LayoutDimensionOptions => CallbackTo[AnonX]): NodeSingularLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layoutDimensions")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.LayoutDimensionOptions) => layoutDimensions(t0).runNow()))
    __obj.asInstanceOf[NodeSingularLayout]
  }
}

