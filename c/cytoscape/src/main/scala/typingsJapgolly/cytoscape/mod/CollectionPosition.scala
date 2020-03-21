package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
trait CollectionPosition extends js.Object {
  /**
    * Get the bounding box of the elements in model coordinates.
    * @param options An object containing options for the function.
    * http://js.cytoscape.org/#eles.boundingBox
    */
  def boundingBox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
  def boundingbox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
  /**
    * Get the bounding box of the elements in rendered coordinates.
    * @param options An object containing options for the function.
    */
  def renderedBoundingBox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
  def renderedBoundingbox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
}

object CollectionPosition {
  @scala.inline
  def apply(
    boundingBox: BoundingBoxOptions => CallbackTo[BoundingBox12 with BoundingBoxWH],
    boundingbox: BoundingBoxOptions => CallbackTo[BoundingBox12 with BoundingBoxWH],
    renderedBoundingBox: BoundingBoxOptions => CallbackTo[BoundingBox12 with BoundingBoxWH],
    renderedBoundingbox: BoundingBoxOptions => CallbackTo[BoundingBox12 with BoundingBoxWH]
  ): CollectionPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingBox")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.BoundingBoxOptions) => boundingBox(t0).runNow()))
    __obj.updateDynamic("boundingbox")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.BoundingBoxOptions) => boundingbox(t0).runNow()))
    __obj.updateDynamic("renderedBoundingBox")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.BoundingBoxOptions) => renderedBoundingBox(t0).runNow()))
    __obj.updateDynamic("renderedBoundingbox")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.BoundingBoxOptions) => renderedBoundingbox(t0).runNow()))
    __obj.asInstanceOf[CollectionPosition]
  }
}

