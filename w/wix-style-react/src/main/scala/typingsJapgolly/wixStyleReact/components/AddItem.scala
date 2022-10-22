package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.wixStyleReact.distTypesAddItemMod.AddItemAlignItems
import typingsJapgolly.wixStyleReact.distTypesAddItemMod.AddItemProps
import typingsJapgolly.wixStyleReact.distTypesAddItemMod.AddItemSize
import typingsJapgolly.wixStyleReact.distTypesAddItemMod.AddItemTheme
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddItem {
  
  @JSImport("wix-style-react", "AddItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AddItem] {
    
    inline def alignItems(value: AddItemAlignItems): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: BorderRadius[String | Double]): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | js.Function0[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenCallbackTo(value: CallbackTo[Node]): this.type = set("children", value.toJsFn)
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def removePadding(value: Boolean): this.type = set("removePadding", value.asInstanceOf[js.Any])
    
    inline def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    inline def size(value: AddItemSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def theme(value: AddItemTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltipContent(value: VdomNode): this.type = set("tooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def tooltipContentNull: this.type = set("tooltipContent", null)
    
    inline def tooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tooltipContent", js.Array(value*))
    
    inline def tooltipContentVdomElement(value: VdomElement): this.type = set("tooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltipProps(value: TooltipCommonProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AddItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AddItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
