package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.Border
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.mjmlReact.mjmlReactStrings.hidden
import typingsJapgolly.mjmlReact.mjmlReactStrings.visible
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlCarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlCarousel {
  
  @JSImport("mjml-react", "MjmlCarousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlCarousel] {
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def iconWidth(value: String): this.type = set("iconWidth", value.asInstanceOf[js.Any])
    
    inline def leftIcon(value: String): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    inline def mjClass(value: String): this.type = set("mjClass", value.asInstanceOf[js.Any])
    
    inline def rightIcon(value: String): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    inline def tbBorder(value: Border[String | Double]): this.type = set("tbBorder", value.asInstanceOf[js.Any])
    
    inline def tbBorderRadius(value: BorderRadius[String | Double]): this.type = set("tbBorderRadius", value.asInstanceOf[js.Any])
    
    inline def tbHoverBorderColor(value: String): this.type = set("tbHoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def tbSelectedBorderColor(value: String): this.type = set("tbSelectedBorderColor", value.asInstanceOf[js.Any])
    
    inline def tbWidth(value: String): this.type = set("tbWidth", value.asInstanceOf[js.Any])
    
    inline def thumbnails(value: hidden | visible): this.type = set("thumbnails", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlCarouselProps & ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
