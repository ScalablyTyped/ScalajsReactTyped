package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.mjmlReact.mod.HrefProps
import typingsJapgolly.mjmlReact.mod.MjmlNavbarLinkProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlNavbarLink {
  
  @JSImport("mjml-react", "MjmlNavbarLink")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlNavbarLink] {
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontWeight(value: Double): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    inline def textTransform(value: String): this.type = set("textTransform", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlNavbarLink.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlNavbarLinkProps & HrefProps & PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
