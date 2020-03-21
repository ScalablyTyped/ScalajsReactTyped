package typingsJapgolly.rcTable.interfaceMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellType[RecordType] extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colEnd: js.UndefOr[Double] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var colStart: js.UndefOr[Double] = js.undefined
  var column: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
  ] = js.undefined
  /** Only used for table header */
  var hasSubColumns: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CellType {
  @scala.inline
  def apply[RecordType](
    children: VdomNode = null,
    className: String = null,
    colEnd: Int | Double = null,
    colSpan: Int | Double = null,
    colStart: Int | Double = null,
    column: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any = null,
    hasSubColumns: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    rowSpan: Int | Double = null,
    style: CSSProperties = null
  ): CellType[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colEnd != null) __obj.updateDynamic("colEnd")(colEnd.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (colStart != null) __obj.updateDynamic("colStart")(colStart.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSubColumns)) __obj.updateDynamic("hasSubColumns")(hasSubColumns.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellType[RecordType]]
  }
}

