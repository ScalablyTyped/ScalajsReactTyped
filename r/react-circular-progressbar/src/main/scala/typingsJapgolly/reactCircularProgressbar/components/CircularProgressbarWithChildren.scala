package typingsJapgolly.reactCircularProgressbar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCircularProgressbar.anon.Background
import typingsJapgolly.reactCircularProgressbar.distCircularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsJapgolly.reactCircularProgressbar.distTypesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircularProgressbarWithChildren {
  
  inline def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CircularProgressbarWithChildrenProps]))
  }
  
  @JSImport("react-circular-progressbar", "CircularProgressbarWithChildren")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: Boolean): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def backgroundPadding(value: Double): this.type = set("backgroundPadding", value.asInstanceOf[js.Any])
    
    inline def circleRatio(value: Double): this.type = set("circleRatio", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Background): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def counterClockwise(value: Boolean): this.type = set("counterClockwise", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def styles(value: CircularProgressbarStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CircularProgressbarWithChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
