package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesMarketingLayoutMod.MarketingLayoutProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.stretch
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarketingLayout {
  
  @JSImport("wix-style-react", "MarketingLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.MarketingLayout] {
    
    inline def actions(value: VdomNode): this.type = set("actions", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionsNull: this.type = set("actions", null)
    
    inline def actionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("actions", js.Array(value*))
    
    inline def actionsVdomElement(value: VdomElement): this.type = set("actions", value.rawElement.asInstanceOf[js.Any])
    
    inline def alignItems(value: center | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def badge(value: VdomNode): this.type = set("badge", value.rawNode.asInstanceOf[js.Any])
    
    inline def badgeNull: this.type = set("badge", null)
    
    inline def badgeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("badge", js.Array(value*))
    
    inline def badgeVdomElement(value: VdomElement): this.type = set("badge", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def description(value: VdomNode): this.type = set("description", value.rawNode.asInstanceOf[js.Any])
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def hiddenBadge(value: Boolean): this.type = set("hiddenBadge", value.asInstanceOf[js.Any])
    
    inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageBackgroundColor(value: String): this.type = set("imageBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def size(value: tiny | small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MarketingLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarketingLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
