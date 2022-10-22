package typingsJapgolly.nivoAxes.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAxes.anon.Width
import typingsJapgolly.nivoScales.distTypesTypesMod.AnyScale
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import typingsJapgolly.nivoScales.distTypesTypesMod.TicksSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  inline def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasWidthHeightXScaleYScaleXValuesYValues */ Width[ScaleValue, ScaleValue]]))
  }
  
  @JSImport("@nivo/axes", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def xScale(value: AnyScale): this.type = set("xScale", value.asInstanceOf[js.Any])
    
    inline def xScaleNull: this.type = set("xScale", null)
    
    inline def xValues(value: TicksSpec[ScaleValue]): this.type = set("xValues", value.asInstanceOf[js.Any])
    
    inline def xValuesVarargs(value: ScaleValue*): this.type = set("xValues", js.Array(value*))
    
    inline def yScale(value: AnyScale): this.type = set("yScale", value.asInstanceOf[js.Any])
    
    inline def yScaleNull: this.type = set("yScale", null)
    
    inline def yValues(value: TicksSpec[ScaleValue]): this.type = set("yValues", value.asInstanceOf[js.Any])
    
    inline def yValuesVarargs(value: ScaleValue*): this.type = set("yValues", js.Array(value*))
  }
  
  def withProps(p: /* hasWidthHeightXScaleYScaleXValuesYValues */ Width[ScaleValue, ScaleValue]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
