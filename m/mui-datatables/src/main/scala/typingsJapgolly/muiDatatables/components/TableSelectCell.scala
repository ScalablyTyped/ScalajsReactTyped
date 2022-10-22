package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableSelectCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableSelectCell {
  
  inline def apply(checked: Boolean, fixedHeader: Boolean): Builder = {
    val __props = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableSelectCell]))
  }
  
  @JSImport("mui-datatables", "TableSelectCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def expandableOn(value: Boolean): this.type = set("expandableOn", value.asInstanceOf[js.Any])
    
    inline def isHeaderCell(value: Boolean): this.type = set("isHeaderCell", value.asInstanceOf[js.Any])
    
    inline def isRowExpanded(value: Boolean): this.type = set("isRowExpanded", value.asInstanceOf[js.Any])
    
    inline def isRowSelectable(value: Boolean): this.type = set("isRowSelectable", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* args */ Any => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onExpand(value: /* args */ Any => Any): this.type = set("onExpand", js.Any.fromFunction1(value))
    
    inline def otherProps(value: Any): this.type = set("otherProps", value.asInstanceOf[js.Any])
    
    inline def selectableOn(value: Boolean): this.type = set("selectableOn", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableSelectCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
