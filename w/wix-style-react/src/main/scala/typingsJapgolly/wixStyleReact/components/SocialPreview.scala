package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSocialPreviewMod.SocialPreviewProps
import typingsJapgolly.wixStyleReact.distTypesSocialPreviewMod.SocialPreviewSize
import typingsJapgolly.wixStyleReact.distTypesSocialPreviewMod.SocialPreviewSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SocialPreview {
  
  @JSImport("wix-style-react", "SocialPreview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SocialPreview] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def media(value: VdomNode): this.type = set("media", value.rawNode.asInstanceOf[js.Any])
    
    inline def mediaNull: this.type = set("media", null)
    
    inline def mediaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("media", js.Array(value*))
    
    inline def mediaVdomElement(value: VdomElement): this.type = set("media", value.rawElement.asInstanceOf[js.Any])
    
    inline def previewUrl(value: String): this.type = set("previewUrl", value.asInstanceOf[js.Any])
    
    inline def size(value: SocialPreviewSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: SocialPreviewSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SocialPreview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SocialPreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
