package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.tableSemanticTypesMod.ColumnOverrides
import typingsJapgolly.baseui.tableSemanticTypesMod.TableBuilderColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBuilderColumn {
  
  inline def apply[T](children: (T, js.UndefOr[Double]) => Node): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TableBuilderColumnProps[T]]))
  }
  
  @JSImport("baseui/table-semantic", "TableBuilderColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.tableSemanticMod.TableBuilderColumn[T]] {
    
    inline def header(value: VdomNode): this.type = set("header", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def numeric(value: Boolean): this.type = set("numeric", value.asInstanceOf[js.Any])
    
    inline def overrides(value: ColumnOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    
    inline def tableHeadAriaLabel(value: String): this.type = set("tableHeadAriaLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: TableBuilderColumnProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
