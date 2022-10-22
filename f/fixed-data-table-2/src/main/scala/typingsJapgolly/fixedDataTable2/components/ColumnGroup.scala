package typingsJapgolly.fixedDataTable2.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.center
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.left
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.right
import typingsJapgolly.fixedDataTable2.mod.ColumnGroupHeaderProps
import typingsJapgolly.fixedDataTable2.mod.ColumnGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnGroup {
  
  @JSImport("fixed-data-table-2", "ColumnGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fixedDataTable2.mod.ColumnGroup] {
    
    inline def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def cellClassName(value: String): this.type = set("cellClassName", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def header(value: String | Element | (js.Function1[/* props */ ColumnGroupHeaderProps, String | Element])): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: /* props */ ColumnGroupHeaderProps => String | Element): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ColumnGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColumnGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
