package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.BackgroundPosition
import typingsJapgolly.csstype.mod.Property.VerticalAlign
import typingsJapgolly.mjmlReact.mjmlReactStrings.`fixed-height`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`fluid-height`
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlHeroProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlHero {
  
  @JSImport("mjml-react", "MjmlHero")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlHero] {
    
    inline def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def backgroundHeight(value: String): this.type = set("backgroundHeight", value.asInstanceOf[js.Any])
    
    inline def backgroundPosition(value: BackgroundPosition[String | Double]): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def backgroundUrl(value: String): this.type = set("backgroundUrl", value.asInstanceOf[js.Any])
    
    inline def backgroundWidth(value: String): this.type = set("backgroundWidth", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def mjClass(value: String): this.type = set("mjClass", value.asInstanceOf[js.Any])
    
    inline def mode(value: `fluid-height` | `fixed-height`): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: VerticalAlign[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlHero.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlHeroProps & ClassNameProps & PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
