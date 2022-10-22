package typingsJapgolly.reactMdl.components

import typingsJapgolly.reactMdl.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTable {
  
  inline def apply(rows: js.Array[Any]): SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.DataTable] = {
    val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    new SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.DataTable](js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("react-mdl", "DataTable")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TableProps): SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.DataTable] = new SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.DataTable](js.Array(this.component, p.asInstanceOf[js.Any]))
}
