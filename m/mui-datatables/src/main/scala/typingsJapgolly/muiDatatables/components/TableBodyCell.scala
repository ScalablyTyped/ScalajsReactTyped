package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableBodyCell
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBodyCell {
  
  @JSImport("mui-datatables", "TableBodyCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def colIndex(value: Double): this.type = set("colIndex", value.asInstanceOf[js.Any])
    
    inline def columnHeader(value: Any): this.type = set("columnHeader", value.asInstanceOf[js.Any])
    
    inline def dataIndex(value: Double): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    
    inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def otherProps(value: Any): this.type = set("otherProps", value.asInstanceOf[js.Any])
    
    inline def rowIndex(value: Double): this.type = set("rowIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableBodyCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableBodyCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
