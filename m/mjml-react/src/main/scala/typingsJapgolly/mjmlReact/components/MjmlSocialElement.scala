package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.mjmlReact.mjmlReactStrings.`facebook-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`google-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`linkedin-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`pinterest-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`tumblr-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`twitter-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`xing-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.dribbble
import typingsJapgolly.mjmlReact.mjmlReactStrings.facebook
import typingsJapgolly.mjmlReact.mjmlReactStrings.github
import typingsJapgolly.mjmlReact.mjmlReactStrings.google
import typingsJapgolly.mjmlReact.mjmlReactStrings.horizontal
import typingsJapgolly.mjmlReact.mjmlReactStrings.instagram
import typingsJapgolly.mjmlReact.mjmlReactStrings.linkedin
import typingsJapgolly.mjmlReact.mjmlReactStrings.ltr
import typingsJapgolly.mjmlReact.mjmlReactStrings.medium
import typingsJapgolly.mjmlReact.mjmlReactStrings.pinterest
import typingsJapgolly.mjmlReact.mjmlReactStrings.rtl
import typingsJapgolly.mjmlReact.mjmlReactStrings.snapchat
import typingsJapgolly.mjmlReact.mjmlReactStrings.soundcloud
import typingsJapgolly.mjmlReact.mjmlReactStrings.tumblr
import typingsJapgolly.mjmlReact.mjmlReactStrings.twitter
import typingsJapgolly.mjmlReact.mjmlReactStrings.vertical
import typingsJapgolly.mjmlReact.mjmlReactStrings.vimeo
import typingsJapgolly.mjmlReact.mjmlReactStrings.web
import typingsJapgolly.mjmlReact.mjmlReactStrings.xing
import typingsJapgolly.mjmlReact.mjmlReactStrings.youtube
import typingsJapgolly.mjmlReact.mod.HrefProps
import typingsJapgolly.mjmlReact.mod.MjmlSocialElementProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlSocialElement {
  
  @JSImport("mjml-react", "MjmlSocialElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlSocialElement] {
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def iconHeight(value: String): this.type = set("iconHeight", value.asInstanceOf[js.Any])
    
    inline def iconPadding(value: String): this.type = set("iconPadding", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: String): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def mode(value: vertical | horizontal): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def name(
      value: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
    ): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlSocialElement.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlSocialElementProps & HrefProps & PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
