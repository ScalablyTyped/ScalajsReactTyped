package typingsJapgolly.isotopeLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packery extends js.Object {
  var columnWidth: js.UndefOr[Double | String] = js.undefined
  var gutter: js.UndefOr[Double | String] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
}

object Packery {
  @scala.inline
  def apply(
    columnWidth: Double | String = null,
    gutter: Double | String = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null
  ): Packery = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packery]
  }
}

