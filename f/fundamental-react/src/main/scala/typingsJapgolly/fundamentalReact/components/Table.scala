package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.RowData
import typingsJapgolly.fundamentalReact.libTableTableMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply(headers: js.Array[String | Node]): Builder = {
    val __props = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("fundamental-react", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def tableBodyClassName(value: String): this.type = set("tableBodyClassName", value.asInstanceOf[js.Any])
    
    inline def tableBodyProps(value: Any): this.type = set("tableBodyProps", value.asInstanceOf[js.Any])
    
    inline def tableBodyRowProps(
      value: StringDictionary[Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
    ): this.type = set("tableBodyRowProps", value.asInstanceOf[js.Any])
    
    inline def tableBodyRowPropsFunction2(value: (/* rowData */ js.Array[String], /* index */ Double) => Callback): this.type = set("tableBodyRowProps", js.Any.fromFunction2((t0: /* rowData */ js.Array[String], t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def tableCellClassName(value: String): this.type = set("tableCellClassName", value.asInstanceOf[js.Any])
    
    inline def tableData(value: js.Array[RowData]): this.type = set("tableData", value.asInstanceOf[js.Any])
    
    inline def tableDataVarargs(value: RowData*): this.type = set("tableData", js.Array(value*))
    
    inline def tableHeaderClassName(value: String): this.type = set("tableHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def tableHeaderProps(value: Any): this.type = set("tableHeaderProps", value.asInstanceOf[js.Any])
    
    inline def tableHeaderRowClassName(value: String): this.type = set("tableHeaderRowClassName", value.asInstanceOf[js.Any])
    
    inline def tableHeaderRowProps(value: Any): this.type = set("tableHeaderRowProps", value.asInstanceOf[js.Any])
    
    inline def tableRowClassName(value: String): this.type = set("tableRowClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
