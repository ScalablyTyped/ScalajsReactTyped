package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSelectorMod.SelectorImageShape
import typingsJapgolly.wixStyleReact.distTypesSelectorMod.SelectorImageSize
import typingsJapgolly.wixStyleReact.distTypesSelectorMod.SelectorProps
import typingsJapgolly.wixStyleReact.distTypesSelectorMod.SelectorToggleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Selector {
  
  inline def apply(id: String | Double, title: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProps]))
  }
  
  @JSImport("wix-style-react", "Selector")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Selector] {
    
    inline def belowNode(value: VdomNode): this.type = set("belowNode", value.rawNode.asInstanceOf[js.Any])
    
    inline def belowNodeNull: this.type = set("belowNode", null)
    
    inline def belowNodeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("belowNode", js.Array(value*))
    
    inline def belowNodeVdomElement(value: VdomElement): this.type = set("belowNode", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def extraNode(value: VdomNode): this.type = set("extraNode", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNodeNull: this.type = set("extraNode", null)
    
    inline def extraNodeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extraNode", js.Array(value*))
    
    inline def extraNodeVdomElement(value: VdomElement): this.type = set("extraNode", value.rawElement.asInstanceOf[js.Any])
    
    inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageShape(value: SelectorImageShape): this.type = set("imageShape", value.asInstanceOf[js.Any])
    
    inline def imageSize(value: SelectorImageSize): this.type = set("imageSize", value.asInstanceOf[js.Any])
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def onToggle(value: /* id */ String | Double => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: /* id */ String | Double) => value(t0).runNow()))
    
    inline def showBelowNodeOnSelect(value: Boolean): this.type = set("showBelowNodeOnSelect", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: String): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    inline def subtitleNode(value: VdomNode): this.type = set("subtitleNode", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNodeNull: this.type = set("subtitleNode", null)
    
    inline def subtitleNodeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitleNode", js.Array(value*))
    
    inline def subtitleNodeVdomElement(value: VdomElement): this.type = set("subtitleNode", value.rawElement.asInstanceOf[js.Any])
    
    inline def toggleType(value: SelectorToggleType): this.type = set("toggleType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
