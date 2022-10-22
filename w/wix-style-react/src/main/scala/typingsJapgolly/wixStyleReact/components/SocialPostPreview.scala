package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSocialPostPreviewSocialPostPreviewDottypesMod.SocialPostPreviewProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.facebook
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.instagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SocialPostPreview {
  
  @JSImport("wix-style-react", "SocialPostPreview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def caption(value: VdomNode): this.type = set("caption", value.rawNode.asInstanceOf[js.Any])
    
    inline def captionNull: this.type = set("caption", null)
    
    inline def captionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("caption", js.Array(value*))
    
    inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def media(value: VdomNode): this.type = set("media", value.rawNode.asInstanceOf[js.Any])
    
    inline def mediaNull: this.type = set("media", null)
    
    inline def mediaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("media", js.Array(value*))
    
    inline def mediaVdomElement(value: VdomElement): this.type = set("media", value.rawElement.asInstanceOf[js.Any])
    
    inline def profileImageSrc(value: String): this.type = set("profileImageSrc", value.asInstanceOf[js.Any])
    
    inline def profileName(value: VdomNode): this.type = set("profileName", value.rawNode.asInstanceOf[js.Any])
    
    inline def profileNameNull: this.type = set("profileName", null)
    
    inline def profileNameVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("profileName", js.Array(value*))
    
    inline def profileNameVdomElement(value: VdomElement): this.type = set("profileName", value.rawElement.asInstanceOf[js.Any])
    
    inline def skin(value: facebook | instagram): this.type = set("skin", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SocialPostPreview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SocialPostPreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
