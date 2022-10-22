package typingsJapgolly.nivoAxes.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAxes.anon.Left
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoScales.distTypesTypesMod.AnyScale
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axes {
  
  inline def apply(height: Double, width: Double, xScale: AnyScale, yScale: AnyScale): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasXScaleYScaleWidthHeightTopRightBottomLeft */ Left[ScaleValue, ScaleValue]]))
  }
  
  @JSImport("@nivo/axes", "Axes")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bottom(value: AxisProps[ScaleValue]): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def bottomNull: this.type = set("bottom", null)
    
    inline def left(value: AxisProps[ScaleValue]): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def leftNull: this.type = set("left", null)
    
    inline def right(value: AxisProps[ScaleValue]): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def rightNull: this.type = set("right", null)
    
    inline def top(value: AxisProps[ScaleValue]): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def topNull: this.type = set("top", null)
  }
  
  def withProps(p: /* hasXScaleYScaleWidthHeightTopRightBottomLeft */ Left[ScaleValue, ScaleValue]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
