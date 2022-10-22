package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.DisabledDisabledMessage
import typingsJapgolly.wixStyleReact.anon.HTMLAttributesHTMLDivElem
import typingsJapgolly.wixStyleReact.anon.`3`
import typingsJapgolly.wixStyleReact.distTypesCardGalleryItemMod.CardGalleryItemProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardGalleryItem {
  
  inline def apply(primaryActionProps: DisabledDisabledMessage): Builder = {
    val __props = js.Dynamic.literal(primaryActionProps = primaryActionProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CardGalleryItemProps]))
  }
  
  @JSImport("wix-style-react", "CardGalleryItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CardGalleryItem] {
    
    inline def aspectRatio(value: Double | String): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    inline def backgroundImageNode(value: VdomNode): this.type = set("backgroundImageNode", value.rawNode.asInstanceOf[js.Any])
    
    inline def backgroundImageNodeNull: this.type = set("backgroundImageNode", null)
    
    inline def backgroundImageNodeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backgroundImageNode", js.Array(value*))
    
    inline def backgroundImageNodeVdomElement(value: VdomElement): this.type = set("backgroundImageNode", value.rawElement.asInstanceOf[js.Any])
    
    inline def backgroundImageUrl(value: String): this.type = set("backgroundImageUrl", value.asInstanceOf[js.Any])
    
    inline def badge(value: VdomNode): this.type = set("badge", value.rawNode.asInstanceOf[js.Any])
    
    inline def badgeNull: this.type = set("badge", null)
    
    inline def badgeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("badge", js.Array(value*))
    
    inline def badgeVdomElement(value: VdomElement): this.type = set("badge", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dragDisabled(value: Boolean): this.type = set("dragDisabled", value.asInstanceOf[js.Any])
    
    inline def dragHandleProps(value: HTMLAttributesHTMLDivElem): this.type = set("dragHandleProps", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def dragging(value: Boolean): this.type = set("dragging", value.asInstanceOf[js.Any])
    
    inline def droppable(value: Boolean): this.type = set("droppable", value.asInstanceOf[js.Any])
    
    inline def secondaryActionProps(value: `3`): this.type = set("secondaryActionProps", value.asInstanceOf[js.Any])
    
    inline def settingsMenu(value: VdomNode): this.type = set("settingsMenu", value.rawNode.asInstanceOf[js.Any])
    
    inline def settingsMenuNull: this.type = set("settingsMenu", null)
    
    inline def settingsMenuVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("settingsMenu", js.Array(value*))
    
    inline def settingsMenuVdomElement(value: VdomElement): this.type = set("settingsMenu", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardGalleryItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
