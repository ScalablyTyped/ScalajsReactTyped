package typingsJapgolly.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeRowDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the dragged record details
    */
  var draggedRecords: js.UndefOr[js.Any] = js.undefined
  /** Returns the drop details
    */
  var dropDetails: js.UndefOr[js.Any] = js.undefined
  /** Returns the targeted row.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the targeted row index.
    */
  var targetIndex: js.UndefOr[js.Any] = js.undefined
}

object BeforeRowDropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedRecords: js.Any = null,
    dropDetails: js.Any = null,
    target: js.Any = null,
    targetIndex: js.Any = null
  ): BeforeRowDropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (draggedRecords != null) __obj.updateDynamic("draggedRecords")(draggedRecords.asInstanceOf[js.Any])
    if (dropDetails != null) __obj.updateDynamic("dropDetails")(dropDetails.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetIndex != null) __obj.updateDynamic("targetIndex")(targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeRowDropEventArgs]
  }
}

