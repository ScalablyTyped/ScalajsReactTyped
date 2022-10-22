package typingsJapgolly.fixedDataTable2.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.center
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.left
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.right
import typingsJapgolly.fixedDataTable2.mod.ColumnCellProps
import typingsJapgolly.fixedDataTable2.mod.ColumnHeaderProps
import typingsJapgolly.fixedDataTable2.mod.ColumnProps
import typingsJapgolly.fixedDataTable2.mod.ElementOrFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  inline def apply(width: Double): Builder = {
    val __props = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnProps]))
  }
  
  @JSImport("fixed-data-table-2", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fixedDataTable2.mod.Column] {
    
    inline def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def allowCellsRecycling(value: Boolean): this.type = set("allowCellsRecycling", value.asInstanceOf[js.Any])
    
    inline def cell(value: ElementOrFunc[ColumnCellProps]): this.type = set("cell", value.asInstanceOf[js.Any])
    
    inline def cellClassName(value: String): this.type = set("cellClassName", value.asInstanceOf[js.Any])
    
    inline def cellFunction1(value: ColumnCellProps => String | Element): this.type = set("cell", js.Any.fromFunction1(value))
    
    inline def cellVdomElement(value: VdomElement): this.type = set("cell", value.rawElement.asInstanceOf[js.Any])
    
    inline def columnKey(value: String | Double): this.type = set("columnKey", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def fixedRight(value: Boolean): this.type = set("fixedRight", value.asInstanceOf[js.Any])
    
    inline def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    inline def footer(value: ElementOrFunc[ColumnHeaderProps]): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: ColumnHeaderProps => String | Element): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def header(value: ElementOrFunc[ColumnHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: ColumnHeaderProps => String | Element): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def isReorderable(value: Boolean): this.type = set("isReorderable", value.asInstanceOf[js.Any])
    
    inline def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def pureRendering(value: Boolean): this.type = set("pureRendering", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
