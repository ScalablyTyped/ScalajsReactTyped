package typingsJapgolly.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Element positions and sizes are available on all QElement instances.
trait ElementDescriptor extends js.Object {
  // The bottom edge of the element
  var bottom: js.UndefOr[PositionDescriptor] = js.undefined
  // Horizontal center: midway between the right and left edges.
  var center: js.UndefOr[PositionDescriptor] = js.undefined
  // Height of the element.
  var height: js.UndefOr[SizeDescriptor] = js.undefined
  // The left edge of the element
  var left: js.UndefOr[PositionDescriptor] = js.undefined
  // Vertical middle: midway between the top and bottom edges.
  var middle: js.UndefOr[PositionDescriptor] = js.undefined
  // The right edge of the element
  var right: js.UndefOr[PositionDescriptor] = js.undefined
  // The top edge of the element
  var top: js.UndefOr[PositionDescriptor] = js.undefined
  // Width of the element.
  var width: js.UndefOr[SizeDescriptor] = js.undefined
}

object ElementDescriptor {
  @scala.inline
  def apply(
    bottom: PositionDescriptor = null,
    center: PositionDescriptor = null,
    height: SizeDescriptor = null,
    left: PositionDescriptor = null,
    middle: PositionDescriptor = null,
    right: PositionDescriptor = null,
    top: PositionDescriptor = null,
    width: SizeDescriptor = null
  ): ElementDescriptor = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDescriptor]
  }
}

