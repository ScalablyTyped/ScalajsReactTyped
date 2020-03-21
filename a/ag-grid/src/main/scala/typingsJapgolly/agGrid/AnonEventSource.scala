package typingsJapgolly.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventSource extends js.Object {
  var column: js.UndefOr[Column] = js.undefined
  var ePopup: HTMLElement
  var eventSource: HTMLElement
  var keepWithinBounds: js.UndefOr[Boolean] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var nudgeX: js.UndefOr[Double] = js.undefined
  var nudgeY: js.UndefOr[Double] = js.undefined
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var `type`: String
}

object AnonEventSource {
  @scala.inline
  def apply(
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    `type`: String,
    column: Column = null,
    keepWithinBounds: js.UndefOr[Boolean] = js.undefined,
    minWidth: Int | Double = null,
    nudgeX: Int | Double = null,
    nudgeY: Int | Double = null,
    rowNode: RowNode = null
  ): AnonEventSource = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWithinBounds)) __obj.updateDynamic("keepWithinBounds")(keepWithinBounds.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (nudgeX != null) __obj.updateDynamic("nudgeX")(nudgeX.asInstanceOf[js.Any])
    if (nudgeY != null) __obj.updateDynamic("nudgeY")(nudgeY.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventSource]
  }
}

