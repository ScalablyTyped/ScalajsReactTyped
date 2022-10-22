package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmColumnMod.IColumnProps
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.ColumnLoadingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  @JSImport("@blueprintjs/table", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.Column] {
    
    inline def cellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.UndefOr[Element]): this.type = set("cellRenderer", js.Any.fromFunction2(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnHeaderCellRenderer(value: /* columnIndex */ Double => Element | Null): this.type = set("columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    inline def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loadingOptions(value: js.Array[ColumnLoadingOption]): this.type = set("loadingOptions", value.asInstanceOf[js.Any])
    
    inline def loadingOptionsVarargs(value: ColumnLoadingOption*): this.type = set("loadingOptions", js.Array(value*))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => Element): this.type = set("nameRenderer", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: Column.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
