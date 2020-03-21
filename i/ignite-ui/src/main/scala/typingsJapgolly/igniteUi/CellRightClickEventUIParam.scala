package typingsJapgolly.igniteUi

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellRightClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to cell DOM element.
  	 */
  var cellElement: js.UndefOr[Element] = js.undefined
  /**
  	 * Gets the column index of the DOM element.
  	 */
  var colIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the column key.
  	 */
  var colKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the row DOM element.
  	 */
  var row: js.UndefOr[Element] = js.undefined
  /**
  	 * Gets the row index.
  	 */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the row key.
  	 */
  var rowKey: js.UndefOr[js.Any] = js.undefined
}

object CellRightClickEventUIParam {
  @scala.inline
  def apply(
    cellElement: Element = null,
    colIndex: Int | Double = null,
    colKey: String = null,
    owner: js.Any = null,
    row: Element = null,
    rowIndex: Int | Double = null,
    rowKey: js.Any = null
  ): CellRightClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (colKey != null) __obj.updateDynamic("colKey")(colKey.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRightClickEventUIParam]
  }
}

