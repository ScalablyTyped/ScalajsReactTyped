package typingsJapgolly.rcTable.fixedHeaderMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.headerMod.HeaderProps
import typingsJapgolly.rcTable.interfaceMod.ColumnType
import typingsJapgolly.rcTable.interfaceMod.ColumnsType
import typingsJapgolly.rcTable.interfaceMod.StickyOffsets
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedHeaderProps[RecordType] extends HeaderProps[RecordType] {
  var colWidths: js.Array[Double]
  var columCount: Double
}

object FixedHeaderProps {
  @scala.inline
  def apply[RecordType](
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[RecordType],
    flattenColumns: js.Array[ColumnType[RecordType]],
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]],
    stickyOffsets: StickyOffsets
  ): FixedHeaderProps[RecordType] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.rcTable.interfaceMod.ColumnType[RecordType]], t1: /* index */ js.UndefOr[scala.Double]) => onHeaderRow(t0, t1).runNow()))
    __obj.asInstanceOf[FixedHeaderProps[RecordType]]
  }
}

