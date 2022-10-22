package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.FloatingHelperContentActionTheme
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.FloatingHelperContentDirection
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.FloatingHelperContentProps
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperAppearance
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperAppendTo
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperMoveByOffset
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperPlacement
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatingHelper {
  
  inline def apply(placement: FloatingHelperPlacement): Builder = {
    val __props = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FloatingHelperProps]))
  }
  
  object Content {
    
    @JSImport("wix-style-react", "FloatingHelper.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def actionText(value: String): this.type = set("actionText", value.asInstanceOf[js.Any])
      
      inline def actionTheme(value: FloatingHelperContentActionTheme): this.type = set("actionTheme", value.asInstanceOf[js.Any])
      
      inline def appearance(value: FloatingHelperAppearance): this.type = set("appearance", value.asInstanceOf[js.Any])
      
      inline def body(value: VdomNode): this.type = set("body", value.rawNode.asInstanceOf[js.Any])
      
      inline def bodyNull: this.type = set("body", null)
      
      inline def bodyVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("body", js.Array(value*))
      
      inline def bodyVdomElement(value: VdomElement): this.type = set("body", value.rawElement.asInstanceOf[js.Any])
      
      inline def direction(value: FloatingHelperContentDirection): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def footerNull: this.type = set("footer", null)
      
      inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
      
      inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
      
      inline def imageNull: this.type = set("image", null)
      
      inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
      
      inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
      
      inline def onActionClick(value: Callback): this.type = set("onActionClick", value.toJsFn)
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsJapgolly.wixStyleReact.components.FloatingHelper.Content.Builder = new typingsJapgolly.wixStyleReact.components.FloatingHelper.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FloatingHelperContentProps & js.Object): typingsJapgolly.wixStyleReact.components.FloatingHelper.Content.Builder = new typingsJapgolly.wixStyleReact.components.FloatingHelper.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "FloatingHelper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FloatingHelper] {
    
    inline def appearance(value: FloatingHelperAppearance): this.type = set("appearance", value.asInstanceOf[js.Any])
    
    inline def appendTo(value: FloatingHelperAppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def hideDelay(value: Double): this.type = set("hideDelay", value.asInstanceOf[js.Any])
    
    inline def initiallyOpened(value: Boolean): this.type = set("initiallyOpened", value.asInstanceOf[js.Any])
    
    inline def moveBy(value: FloatingHelperMoveByOffset): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onClose(value: js.Function): this.type = set("onClose", value.asInstanceOf[js.Any])
    
    inline def onOpen(value: js.Function): this.type = set("onOpen", value.asInstanceOf[js.Any])
    
    inline def opened(value: Boolean): this.type = set("opened", value.asInstanceOf[js.Any])
    
    inline def target(value: VdomNode): this.type = set("target", value.rawNode.asInstanceOf[js.Any])
    
    inline def targetNull: this.type = set("target", null)
    
    inline def targetVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("target", js.Array(value*))
    
    inline def targetVdomElement(value: VdomElement): this.type = set("target", value.rawElement.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FloatingHelperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
