package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.ASC
import typingsJapgolly.baseui.baseuiStrings.DESC
import typingsJapgolly.baseui.tableSemanticTypesMod.BuilderOverrides
import typingsJapgolly.baseui.tableSemanticTypesMod.Divider
import typingsJapgolly.baseui.tableSemanticTypesMod.Size
import typingsJapgolly.baseui.tableSemanticTypesMod.TableBuilderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBuilder {
  
  inline def apply[T](data: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TableBuilderProps[T]]))
  }
  
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.tableSemanticMod.TableBuilder[T]] {
    
    inline def divider(value: Divider): this.type = set("divider", value.asInstanceOf[js.Any])
    
    inline def emptyMessage(value: Node | js.Function0[Node]): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    inline def emptyMessageCallbackTo(value: CallbackTo[Node]): this.type = set("emptyMessage", value.toJsFn)
    
    inline def emptyMessageNull: this.type = set("emptyMessage", null)
    
    inline def emptyMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyMessage", js.Array(value*))
    
    inline def emptyMessageVdomElement(value: VdomElement): this.type = set("emptyMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def horizontalScrollWidth(value: String): this.type = set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def loadingMessage(value: Node | js.Function0[Node]): this.type = set("loadingMessage", value.asInstanceOf[js.Any])
    
    inline def loadingMessageCallbackTo(value: CallbackTo[Node]): this.type = set("loadingMessage", value.toJsFn)
    
    inline def loadingMessageNull: this.type = set("loadingMessage", null)
    
    inline def loadingMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loadingMessage", js.Array(value*))
    
    inline def loadingMessageVdomElement(value: VdomElement): this.type = set("loadingMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def onSort(value: /* columnId */ String => Callback): this.type = set("onSort", js.Any.fromFunction1((t0: /* columnId */ String) => value(t0).runNow()))
    
    inline def overrides(value: BuilderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sortColumn(value: String): this.type = set("sortColumn", value.asInstanceOf[js.Any])
    
    inline def sortColumnNull: this.type = set("sortColumn", null)
    
    inline def sortOrder(value: ASC | DESC): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    inline def sortOrderNull: this.type = set("sortOrder", null)
  }
  
  def withProps[T](p: TableBuilderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
