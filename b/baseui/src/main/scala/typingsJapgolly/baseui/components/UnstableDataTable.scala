package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.DataTableProps
import typingsJapgolly.baseui.dataTableTypesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableDataTable {
  
  inline def apply(columns: js.Array[ColumnOptions[Any, Any]], rows: js.Array[Row]): SharedBuilder_DataTableProps1145654009 = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new SharedBuilder_DataTableProps1145654009(js.Array(this.component, __props.asInstanceOf[DataTableProps]))
  }
  
  @JSImport("baseui/data-table", "UnstableDataTable")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DataTableProps): SharedBuilder_DataTableProps1145654009 = new SharedBuilder_DataTableProps1145654009(js.Array(this.component, p.asInstanceOf[js.Any]))
}
