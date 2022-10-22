package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.VerticalAlign
import typingsJapgolly.mjmlReact.mod.BorderProps
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.InnerBorderProps
import typingsJapgolly.mjmlReact.mod.MjmlColumnProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlColumn {
  
  @JSImport("mjml-react", "MjmlColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlColumn] {
    
    inline def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def border(value: String): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderBottom(value: String): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    inline def borderLeft(value: String): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderRight(value: String): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    inline def borderTop(value: String): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def innerBackgroundColor(value: BackgroundColor): this.type = set("innerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def innerBorder(value: String): this.type = set("innerBorder", value.asInstanceOf[js.Any])
    
    inline def innerBorderBottom(value: String): this.type = set("innerBorderBottom", value.asInstanceOf[js.Any])
    
    inline def innerBorderLeft(value: String): this.type = set("innerBorderLeft", value.asInstanceOf[js.Any])
    
    inline def innerBorderRadius(value: String | Double): this.type = set("innerBorderRadius", value.asInstanceOf[js.Any])
    
    inline def innerBorderRight(value: String): this.type = set("innerBorderRight", value.asInstanceOf[js.Any])
    
    inline def innerBorderTop(value: String): this.type = set("innerBorderTop", value.asInstanceOf[js.Any])
    
    inline def mjClass(value: String): this.type = set("mjClass", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: VerticalAlign[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlColumnProps & PaddingProps & ClassNameProps & BorderProps & InnerBorderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
