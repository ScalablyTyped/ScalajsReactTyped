package typingsJapgolly.fixedDataTable.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fixedDataTable.mod.CellProps
import typingsJapgolly.fixedDataTable.mod.ColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  inline def apply(width: Double): Builder = {
    val __props = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnProps]))
  }
  
  @JSImport("fixed-data-table", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fixedDataTable.mod.Column] {
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def allowCellsRecycling(value: Boolean): this.type = set("allowCellsRecycling", value.asInstanceOf[js.Any])
    
    inline def cell(value: String | Element | (js.Function1[/* props */ CellProps, String | Element])): this.type = set("cell", value.asInstanceOf[js.Any])
    
    inline def cellFunction1(value: /* props */ CellProps => String | Element): this.type = set("cell", js.Any.fromFunction1(value))
    
    inline def cellVdomElement(value: VdomElement): this.type = set("cell", value.rawElement.asInstanceOf[js.Any])
    
    inline def columnKey(value: String | Double): this.type = set("columnKey", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    inline def footer(value: String | Element | (js.Function1[/* props */ CellProps, String | Element])): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: /* props */ CellProps => String | Element): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def header(value: String | Element | (js.Function1[/* props */ CellProps, String | Element])): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: /* props */ CellProps => String | Element): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
