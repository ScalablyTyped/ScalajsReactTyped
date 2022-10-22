package typingsJapgolly.reactMdl.components

import typingsJapgolly.reactMdl.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply(rows: js.Array[Any]): SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.Table] = {
    val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    new SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.Table](js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("react-mdl", "Table")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TableProps): SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.Table] = new SharedBuilder_TableProps_836680503[typingsJapgolly.reactMdl.mod.Table](js.Array(this.component, p.asInstanceOf[js.Any]))
}
