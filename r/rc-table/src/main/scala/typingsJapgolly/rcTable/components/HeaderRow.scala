package typingsJapgolly.rcTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTable.libHeaderHeaderRowMod.RowProps
import typingsJapgolly.rcTable.libInterfaceMod.CellType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.CustomizeComponent
import typingsJapgolly.rcTable.libInterfaceMod.StickyOffsets
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderRow {
  
  inline def apply[RecordType](
    cellComponent: CustomizeComponent,
    cells: js.Array[CellType[RecordType]],
    flattenColumns: js.Array[ColumnType[RecordType]],
    index: Double,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
    rowComponent: CustomizeComponent,
    stickyOffsets: StickyOffsets
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[RowProps[RecordType]]))
  }
  
  @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RecordType] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RecordType](p: RowProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
