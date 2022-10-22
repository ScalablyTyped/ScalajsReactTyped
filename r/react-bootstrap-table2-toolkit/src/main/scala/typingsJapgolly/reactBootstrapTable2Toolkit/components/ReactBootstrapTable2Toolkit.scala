package typingsJapgolly.reactBootstrapTable2Toolkit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.CSVProps
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.TableSearchProps
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.TableToolkitProps
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.ToolkitContextType
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapTable2Toolkit {
  
  inline def apply(
    children: ToolkitContextType => Element,
    columns: js.Array[ColumnDescription[Any, Any]],
    data: js.Array[Any],
    keyField: /* keyof T */ String
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableToolkitProps[Any]]))
  }
  
  @JSImport("react-bootstrap-table2-toolkit", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bootstrap4(value: Boolean): this.type = set("bootstrap4", value.asInstanceOf[js.Any])
    
    inline def columnToggle(value: Boolean): this.type = set("columnToggle", value.asInstanceOf[js.Any])
    
    inline def exportCSV(value: Boolean | CSVProps): this.type = set("exportCSV", value.asInstanceOf[js.Any])
    
    inline def ref(value: Any): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def search(value: TableSearchProps[Any] | Boolean): this.type = set("search", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableToolkitProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
