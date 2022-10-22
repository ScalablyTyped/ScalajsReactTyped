package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Scale.mod.ScaleLinear_
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.DotsItemSymbolComponent
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoRadar.distTypesRadarDotsMod.RadarDotsProps
import typingsJapgolly.nivoRadar.distTypesTypesMod.PointData
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarColorMapping
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarDots {
  
  inline def apply[D /* <: Record[String, Any] */](
    angleStep: Double,
    borderColor: InheritedColorConfig[PointData],
    borderWidth: Double,
    color: InheritedColorConfig[PointData],
    colorByKey: RadarColorMapping,
    data: js.Array[D],
    enableLabel: Boolean,
    formatValue: (Double, String) => String,
    getIndex: D => String,
    keys: js.Array[String],
    label: PropertyAccessor[PointData, String | Double],
    labelYOffset: Double,
    radiusScale: ScaleLinear_[Double, Double, scala.Nothing],
    rotation: Double,
    size: Double
  ): Builder[D] = {
    val __props = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), getIndex = js.Any.fromFunction1(getIndex), keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelYOffset = labelYOffset.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarDotsProps[D]]))
  }
  
  @JSImport("@nivo/radar", "RadarDots")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def symbol(value: DotsItemSymbolComponent): this.type = set("symbol", value.asInstanceOf[js.Any])
  }
  
  def withProps[D /* <: Record[String, Any] */](p: RadarDotsProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
