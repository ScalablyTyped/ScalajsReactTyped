package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeBorderCollection object, for use in `conditionalRangeBorderCollection.set({ ... })`. */
trait ConditionalRangeBorderCollectionUpdateData extends js.Object {
  /**
    *
    * Gets the bottom border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bottom: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
  /**
    *
    * Gets the left border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var left: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
  /**
    *
    * Gets the right border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var right: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
  /**
    *
    * Gets the top border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var top: js.UndefOr[ConditionalRangeBorderUpdateData] = js.undefined
}

object ConditionalRangeBorderCollectionUpdateData {
  @scala.inline
  def apply(
    bottom: ConditionalRangeBorderUpdateData = null,
    items: js.Array[ConditionalRangeBorderData] = null,
    left: ConditionalRangeBorderUpdateData = null,
    right: ConditionalRangeBorderUpdateData = null,
    top: ConditionalRangeBorderUpdateData = null
  ): ConditionalRangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeBorderCollectionUpdateData]
  }
}

