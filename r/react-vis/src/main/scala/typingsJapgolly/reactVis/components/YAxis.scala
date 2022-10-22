package typingsJapgolly.reactVis.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVis.anon.CSSPropertieslineCSSPrope
import typingsJapgolly.reactVis.mod.YAxisProps
import typingsJapgolly.reactVis.reactVisStrings.left
import typingsJapgolly.reactVis.reactVisStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object YAxis {
  
  @JSImport("react-vis", "YAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def attr(value: String): this.type = set("attr", value.asInstanceOf[js.Any])
    
    inline def attrAxis(value: String): this.type = set("attrAxis", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hideLine(value: Boolean): this.type = set("hideLine", value.asInstanceOf[js.Any])
    
    inline def hideTicks(value: Boolean): this.type = set("hideTicks", value.asInstanceOf[js.Any])
    
    inline def innerHeight(value: Double): this.type = set("innerHeight", value.asInstanceOf[js.Any])
    
    inline def innerWidth(value: Double): this.type = set("innerWidth", value.asInstanceOf[js.Any])
    
    inline def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginLeft(value: Double): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    inline def marginRight(value: Double): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    inline def marginTop(value: Double): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    inline def on0(value: Boolean): this.type = set("on0", value.asInstanceOf[js.Any])
    
    inline def orientation(value: left | right): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSPropertieslineCSSPrope): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tickFormat(value: /* tick */ Any => String): this.type = set("tickFormat", js.Any.fromFunction1(value))
    
    inline def tickLabelAngle(value: Double): this.type = set("tickLabelAngle", value.asInstanceOf[js.Any])
    
    inline def tickPadding(value: Double): this.type = set("tickPadding", value.asInstanceOf[js.Any])
    
    inline def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    inline def tickSizeInner(value: Double): this.type = set("tickSizeInner", value.asInstanceOf[js.Any])
    
    inline def tickSizeOuter(value: Double): this.type = set("tickSizeOuter", value.asInstanceOf[js.Any])
    
    inline def tickTotal(value: Double): this.type = set("tickTotal", value.asInstanceOf[js.Any])
    
    inline def tickValues(value: js.Array[Any]): this.type = set("tickValues", value.asInstanceOf[js.Any])
    
    inline def tickValuesVarargs(value: Any*): this.type = set("tickValues", js.Array(value*))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def top(value: Double): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: YAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: YAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
