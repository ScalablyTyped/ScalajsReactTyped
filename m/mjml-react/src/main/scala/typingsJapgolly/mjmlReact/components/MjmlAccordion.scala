package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.mjmlReact.mjmlReactStrings.left
import typingsJapgolly.mjmlReact.mjmlReactStrings.right
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlAccordionProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlAccordion {
  
  @JSImport("mjml-react", "MjmlAccordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlAccordion] {
    
    inline def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def border(value: String): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def containerBackgroundColor(value: BackgroundColor): this.type = set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def iconAlign(value: String): this.type = set("iconAlign", value.asInstanceOf[js.Any])
    
    inline def iconHeight(value: String): this.type = set("iconHeight", value.asInstanceOf[js.Any])
    
    inline def iconPosition(value: left | right): this.type = set("iconPosition", value.asInstanceOf[js.Any])
    
    inline def iconUnwrappedAlt(value: String): this.type = set("iconUnwrappedAlt", value.asInstanceOf[js.Any])
    
    inline def iconUnwrappedUrl(value: String): this.type = set("iconUnwrappedUrl", value.asInstanceOf[js.Any])
    
    inline def iconWidth(value: String): this.type = set("iconWidth", value.asInstanceOf[js.Any])
    
    inline def iconWrappedAlt(value: String): this.type = set("iconWrappedAlt", value.asInstanceOf[js.Any])
    
    inline def iconWrappedUrl(value: String): this.type = set("iconWrappedUrl", value.asInstanceOf[js.Any])
    
    inline def mjClass(value: String): this.type = set("mjClass", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlAccordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlAccordionProps & PaddingProps & ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
