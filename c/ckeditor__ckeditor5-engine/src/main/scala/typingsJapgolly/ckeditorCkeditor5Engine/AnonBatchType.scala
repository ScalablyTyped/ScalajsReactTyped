package typingsJapgolly.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchType extends js.Object {
  var batchType: js.UndefOr[String] = js.undefined
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  var rootName: js.UndefOr[String] = js.undefined
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object AnonBatchType {
  @scala.inline
  def apply(
    batchType: String = null,
    lastRangeBackward: js.UndefOr[Boolean] = js.undefined,
    rootName: String = null,
    selectionAttributes: js.Array[js.Object] = null
  ): AnonBatchType = {
    val __obj = js.Dynamic.literal()
    if (batchType != null) __obj.updateDynamic("batchType")(batchType.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward.asInstanceOf[js.Any])
    if (rootName != null) __obj.updateDynamic("rootName")(rootName.asInstanceOf[js.Any])
    if (selectionAttributes != null) __obj.updateDynamic("selectionAttributes")(selectionAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatchType]
  }
}

