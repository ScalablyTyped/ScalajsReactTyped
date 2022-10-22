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
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.default
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatingHelperContent {
  
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
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
  
  implicit def make(companion: FloatingHelperContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FloatingHelperContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
