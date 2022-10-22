package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.mjmlReact.mjmlReactStrings.horizontal
import typingsJapgolly.mjmlReact.mjmlReactStrings.vertical
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlSocialProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlSocial {
  
  @JSImport("mjml-react", "MjmlSocial")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlSocial] {
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def containerBackgroundColor(value: BackgroundColor): this.type = set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def iconHeight(value: String): this.type = set("iconHeight", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: String): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def innerPadding(value: String): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def mjClass(value: String): this.type = set("mjClass", value.asInstanceOf[js.Any])
    
    inline def mode(value: vertical | horizontal): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlSocial.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlSocialProps & PaddingProps & ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
