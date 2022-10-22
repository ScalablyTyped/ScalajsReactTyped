package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesMediaOverlayMod.MediaOverlayContentPlacement
import typingsJapgolly.wixStyleReact.distTypesMediaOverlayMod.MediaOverlayContentProps
import typingsJapgolly.wixStyleReact.distTypesMediaOverlayMod.MediaOverlayContentVisible
import typingsJapgolly.wixStyleReact.distTypesMediaOverlayMod.MediaOverlayProps
import typingsJapgolly.wixStyleReact.distTypesMediaOverlayMod.MediaOverlaySkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaOverlay {
  
  object Content {
    
    @JSImport("wix-style-react", "MediaOverlay.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def placement(value: MediaOverlayContentPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
      
      inline def visible(value: MediaOverlayContentVisible): this.type = set("visible", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsJapgolly.wixStyleReact.components.MediaOverlay.Content.Builder = new typingsJapgolly.wixStyleReact.components.MediaOverlay.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MediaOverlayContentProps): typingsJapgolly.wixStyleReact.components.MediaOverlay.Content.Builder = new typingsJapgolly.wixStyleReact.components.MediaOverlay.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DragHandle {
    
    @JSImport("wix-style-react", "MediaOverlay.DragHandle")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: DragHandle.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "MediaOverlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.MediaOverlay] {
    
    inline def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def hoverSkin(value: MediaOverlaySkin): this.type = set("hoverSkin", value.asInstanceOf[js.Any])
    
    inline def hovered(value: Boolean): this.type = set("hovered", value.asInstanceOf[js.Any])
    
    inline def media(value: VdomNode): this.type = set("media", value.rawNode.asInstanceOf[js.Any])
    
    inline def mediaNull: this.type = set("media", null)
    
    inline def mediaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("media", js.Array(value*))
    
    inline def mediaVdomElement(value: VdomElement): this.type = set("media", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def removeRoundedBorders(value: Boolean): this.type = set("removeRoundedBorders", value.asInstanceOf[js.Any])
    
    inline def skin(value: MediaOverlaySkin): this.type = set("skin", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MediaOverlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
