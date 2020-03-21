package typingsJapgolly.rcTable.headerMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.interfaceMod.ColumnType
import typingsJapgolly.rcTable.interfaceMod.ColumnsType
import typingsJapgolly.rcTable.interfaceMod.GetComponentProps
import typingsJapgolly.rcTable.interfaceMod.StickyOffsets
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]]
  var stickyOffsets: StickyOffsets
}

object HeaderProps {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    flattenColumns: js.Array[ColumnType[RecordType]],
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]],
    stickyOffsets: StickyOffsets
  ): HeaderProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.rcTable.interfaceMod.ColumnType[RecordType]], t1: /* index */ js.UndefOr[scala.Double]) => onHeaderRow(t0, t1).runNow()))
    __obj.asInstanceOf[HeaderProps[RecordType]]
  }
}

