package typingsJapgolly.reactVis.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVis.mod.AnimationParam
import typingsJapgolly.reactVis.mod.VerticalGridLinesProps
import typingsJapgolly.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalGridLines {
  
  @JSImport("react-vis", "VerticalGridLines")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animation(value: String | AnimationParam | Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def attr(value: String): this.type = set("attr", value.asInstanceOf[js.Any])
    
    inline def direction(value: vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def innerHeight(value: Double): this.type = set("innerHeight", value.asInstanceOf[js.Any])
    
    inline def innerWidth(value: Double): this.type = set("innerWidth", value.asInstanceOf[js.Any])
    
    inline def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginLeft(value: Double): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    inline def marginRight(value: Double): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    inline def marginTop(value: Double): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tickTotal(value: Double): this.type = set("tickTotal", value.asInstanceOf[js.Any])
    
    inline def tickValues(value: js.Array[Any]): this.type = set("tickValues", value.asInstanceOf[js.Any])
    
    inline def tickValuesVarargs(value: Any*): this.type = set("tickValues", js.Array(value*))
    
    inline def top(value: Double): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalGridLines.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalGridLinesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
