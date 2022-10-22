package typingsJapgolly.nivoLegends.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Scale.mod.ScaleDiverging_
import typingsJapgolly.d3Scale.mod.ScaleQuantize_
import typingsJapgolly.d3Scale.mod.ScaleSequential_
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.AnchoredContinuousColorsLegendProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendAnchor
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendDirection
import typingsJapgolly.nivoLegends.nivoLegendsStrings.after
import typingsJapgolly.nivoLegends.nivoLegendsStrings.before
import typingsJapgolly.nivoLegends.nivoLegendsStrings.end
import typingsJapgolly.nivoLegends.nivoLegendsStrings.middle
import typingsJapgolly.nivoLegends.nivoLegendsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnchoredContinuousColorsLegendSvg {
  
  inline def apply(
    anchor: LegendAnchor,
    containerHeight: Double,
    containerWidth: Double,
    scale: (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])
  ): Builder = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnchoredContinuousColorsLegendProps]))
  }
  
  @JSImport("@nivo/legends", "AnchoredContinuousColorsLegendSvg")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def direction(value: LegendDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    
    inline def thickness(value: Double): this.type = set("thickness", value.asInstanceOf[js.Any])
    
    inline def tickFormat(value: ValueFormat[Double, Unit]): this.type = set("tickFormat", value.asInstanceOf[js.Any])
    
    inline def tickOverlap(value: Boolean): this.type = set("tickOverlap", value.asInstanceOf[js.Any])
    
    inline def tickPosition(value: before | after): this.type = set("tickPosition", value.asInstanceOf[js.Any])
    
    inline def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    inline def tickSpacing(value: Double): this.type = set("tickSpacing", value.asInstanceOf[js.Any])
    
    inline def ticks(value: Double | js.Array[Double]): this.type = set("ticks", value.asInstanceOf[js.Any])
    
    inline def ticksVarargs(value: Double*): this.type = set("ticks", js.Array(value*))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleAlign(value: start | middle | end): this.type = set("titleAlign", value.asInstanceOf[js.Any])
    
    inline def titleOffset(value: Double): this.type = set("titleOffset", value.asInstanceOf[js.Any])
    
    inline def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    inline def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnchoredContinuousColorsLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
