package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.Row
import typingsJapgolly.baseui.dataTableTypesMod.StatefulDataTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableStatefulDataTable {
  
  inline def apply(columns: js.Array[ColumnOptions[Any, Any]], rows: js.Array[Row]): SharedBuilder_StatefulDataTableProps553779719 = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new SharedBuilder_StatefulDataTableProps553779719(js.Array(this.component, __props.asInstanceOf[StatefulDataTableProps]))
  }
  
  @JSImport("baseui/data-table", "UnstableStatefulDataTable")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StatefulDataTableProps): SharedBuilder_StatefulDataTableProps553779719 = new SharedBuilder_StatefulDataTableProps553779719(js.Array(this.component, p.asInstanceOf[js.Any]))
}
