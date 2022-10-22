package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.BackgroundPosition
import typingsJapgolly.csstype.mod.Property.BackgroundPositionX
import typingsJapgolly.csstype.mod.Property.BackgroundPositionY
import typingsJapgolly.csstype.mod.Property.BackgroundRepeat
import typingsJapgolly.csstype.mod.Property.BackgroundSize
import typingsJapgolly.csstype.mod.Property.TextAlign
import typingsJapgolly.csstype.mod.Property.VerticalAlign
import typingsJapgolly.mjmlReact.mod.BorderProps
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlWrapperProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlWrapper {
  
  @JSImport("mjml-react", "MjmlWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlWrapper] {
    
    inline def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def backgroundPosition(value: BackgroundPosition[String | Double]): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def backgroundPositionX(value: BackgroundPositionX[String | Double]): this.type = set("backgroundPositionX", value.asInstanceOf[js.Any])
    
    inline def backgroundPositionY(value: BackgroundPositionY[String | Double]): this.type = set("backgroundPositionY", value.asInstanceOf[js.Any])
    
    inline def backgroundRepeat(value: BackgroundRepeat): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def backgroundSize(value: BackgroundSize[String | Double]): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    
    inline def backgroundUrl(value: String): this.type = set("backgroundUrl", value.asInstanceOf[js.Any])
    
    inline def border(value: String): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderBottom(value: String): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    inline def borderLeft(value: String): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderRight(value: String): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    inline def borderTop(value: String): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    inline def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def mjClass(value: String): this.type = set("mjClass", value.asInstanceOf[js.Any])
    
    inline def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: TextAlign): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: VerticalAlign[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlWrapperProps & BorderProps & PaddingProps & ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
