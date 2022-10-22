package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.mod.GriddleComponent
import typingsJapgolly.griddleReact.mod.components.CellProps
import typingsJapgolly.griddleReact.mod.components.ColumnDefinitionProps
import typingsJapgolly.griddleReact.mod.components.TableHeadingCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnDefinition {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnDefinitionProps]))
  }
  
  @JSImport("griddle-react", "components.ColumnDefinition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.griddleReact.mod.components.ColumnDefinition] {
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def cssClassName(value: String | (js.Function1[/* props */ Any, String])): this.type = set("cssClassName", value.asInstanceOf[js.Any])
    
    inline def cssClassNameFunction1(value: /* props */ Any => String): this.type = set("cssClassName", js.Any.fromFunction1(value))
    
    inline def customComponent(value: GriddleComponent[CellProps & Any]): this.type = set("customComponent", value.asInstanceOf[js.Any])
    
    inline def customHeadingComponent(value: GriddleComponent[TableHeadingCellProps & Any]): this.type = set("customHeadingComponent", value.asInstanceOf[js.Any])
    
    inline def extraData(value: Any): this.type = set("extraData", value.asInstanceOf[js.Any])
    
    inline def filterable(value: Boolean): this.type = set("filterable", value.asInstanceOf[js.Any])
    
    inline def headerCssClassName(value: String | (js.Function1[/* props */ Any, String])): this.type = set("headerCssClassName", value.asInstanceOf[js.Any])
    
    inline def headerCssClassNameFunction1(value: /* props */ Any => String): this.type = set("headerCssClassName", js.Any.fromFunction1(value))
    
    inline def isMetadata(value: Boolean): this.type = set("isMetadata", value.asInstanceOf[js.Any])
    
    inline def locked(value: Boolean): this.type = set("locked", value.asInstanceOf[js.Any])
    
    inline def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def sortMethod(
      value: (/* data */ js.Array[Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): this.type = set("sortMethod", js.Any.fromFunction3(value))
    
    inline def sortType(value: String): this.type = set("sortType", value.asInstanceOf[js.Any])
    
    inline def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnDefinitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
