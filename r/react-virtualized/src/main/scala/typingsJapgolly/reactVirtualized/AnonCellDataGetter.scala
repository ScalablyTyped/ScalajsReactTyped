package typingsJapgolly.reactVirtualized

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Requireable
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetter
import typingsJapgolly.reactVirtualized.esTableMod.TableCellRenderer
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellDataGetter extends js.Object {
  var `aria-label`: Requireable[String]
  var cellDataGetter: Requireable[TableCellDataGetter]
  var cellRenderer: Requireable[TableCellRenderer]
  var className: Requireable[String]
  var columnData: Requireable[js.Object]
  var dataKey: Validator[String]
  var disableSort: Requireable[Boolean]
  var flexGrow: Requireable[Double]
  var flexShrink: Requireable[Double]
  var headerClassName: Requireable[String]
  var headerRenderer: Validator[TableHeaderRowRenderer]
  var id: Requireable[String]
  var label: Requireable[String]
  var maxWidth: Requireable[Double]
  var minWidth: Requireable[Double]
  var style: Requireable[CSSProperties]
  var width: Validator[Double]
}

object AnonCellDataGetter {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellDataGetter: Requireable[TableCellDataGetter],
    cellRenderer: Requireable[TableCellRenderer],
    className: Requireable[String],
    columnData: Requireable[js.Object],
    dataKey: Validator[String],
    disableSort: Requireable[Boolean],
    flexGrow: Requireable[Double],
    flexShrink: Requireable[Double],
    headerClassName: Requireable[String],
    headerRenderer: Validator[TableHeaderRowRenderer],
    id: Requireable[String],
    label: Requireable[String],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    style: Requireable[CSSProperties],
    width: Validator[Double]
  ): AnonCellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], disableSort = disableSort.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerRenderer = headerRenderer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellDataGetter]
  }
}

