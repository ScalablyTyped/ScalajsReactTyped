package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.tableTypesMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply(columns: js.Array[String | Node], data: js.Array[js.Array[Node]]): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("baseui/table", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.tableMod.Table] {
    
    inline def horizontalScrollWidth(value: String): this.type = set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
