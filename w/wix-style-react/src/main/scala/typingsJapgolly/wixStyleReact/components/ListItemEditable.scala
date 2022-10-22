package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import typingsJapgolly.wixStyleReact.distTypesListItemEditableMod.ListItemEditableMargins
import typingsJapgolly.wixStyleReact.distTypesListItemEditableMod.ListItemEditableProps
import typingsJapgolly.wixStyleReact.distTypesListItemEditableMod.ListItemEditableSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemEditable {
  
  inline def apply(onApprove: String => Callback, onCancel: Callback): Builder = {
    val __props = js.Dynamic.literal(onApprove = js.Any.fromFunction1((t0: String) => onApprove(t0).runNow()), onCancel = onCancel.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ListItemEditableProps]))
  }
  
  @JSImport("wix-style-react", "ListItemEditable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ListItemEditable] {
    
    inline def approveButtonTooltipContent(value: VdomNode): this.type = set("approveButtonTooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def approveButtonTooltipContentNull: this.type = set("approveButtonTooltipContent", null)
    
    inline def approveButtonTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("approveButtonTooltipContent", js.Array(value*))
    
    inline def approveButtonTooltipContentVdomElement(value: VdomElement): this.type = set("approveButtonTooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def approveButtonTooltipProps(value: TooltipCommonProps): this.type = set("approveButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def cancelButtonTooltipContent(value: VdomNode): this.type = set("cancelButtonTooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelButtonTooltipContentNull: this.type = set("cancelButtonTooltipContent", null)
    
    inline def cancelButtonTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelButtonTooltipContent", js.Array(value*))
    
    inline def cancelButtonTooltipContentVdomElement(value: VdomElement): this.type = set("cancelButtonTooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def cancelButtonTooltipProps(value: TooltipCommonProps): this.type = set("cancelButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def margins(value: ListItemEditableMargins): this.type = set("margins", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def size(value: ListItemEditableSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemEditableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
