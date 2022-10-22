package typingsJapgolly.nivoRadar.components

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleLinear_
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoRadar.anon.Color
import typingsJapgolly.nivoRadar.distTypesRadarLayerMod.RadarLayerProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarLayer {
  
  inline def apply[D /* <: Record[String, Any] */](
    angleStep: Double,
    blendMode: CssMixBlendMode,
    borderColor: InheritedColorConfig[Color],
    borderWidth: Double,
    colorByKey: Record[String | Double, String],
    curveFactory: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator,
    data: js.Array[D],
    fillByKey: Record[String, String | Null],
    fillOpacity: Double,
    item: String,
    radiusScale: ScaleLinear_[Double, Double, scala.Nothing],
    rotation: Double
  ): Builder[D] = {
    val __props = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], curveFactory = js.Any.fromFunction1(curveFactory), data = data.asInstanceOf[js.Any], fillByKey = fillByKey.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarLayerProps[D]]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarLayer", "RadarLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[D /* <: Record[String, Any] */](p: RadarLayerProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
