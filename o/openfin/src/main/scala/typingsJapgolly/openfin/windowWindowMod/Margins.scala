package typingsJapgolly.openfin.windowWindowMod

import typingsJapgolly.openfin.openfinStrings.custom
import typingsJapgolly.openfin.openfinStrings.none
import typingsJapgolly.openfin.openfinStrings.printableArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margins extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var marginType: js.UndefOr[typingsJapgolly.openfin.openfinStrings.default | none | printableArea | custom] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Margins {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    marginType: typingsJapgolly.openfin.openfinStrings.default | none | printableArea | custom = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): Margins = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (marginType != null) __obj.updateDynamic("marginType")(marginType.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margins]
  }
}

