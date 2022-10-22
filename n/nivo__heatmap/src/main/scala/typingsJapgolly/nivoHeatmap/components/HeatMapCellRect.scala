package typingsJapgolly.nivoHeatmap.components

import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellComponentProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeatMapCellRect {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<CellAnimatedProps> */ Any,
    borderRadius: Double,
    borderWidth: Double,
    cell: ComputedCell[Datum],
    enableLabels: Boolean
  ): SharedBuilder_CellComponentProps_720076715[Datum] = {
    val __props = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any])
    new SharedBuilder_CellComponentProps_720076715[Datum](js.Array(this.component, __props.asInstanceOf[CellComponentProps[Datum]]))
  }
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCellRect", "HeatMapCellRect")
  @js.native
  val component: js.Object = js.native
  
  def withProps[Datum /* <: HeatMapDatum */](p: CellComponentProps[Datum]): SharedBuilder_CellComponentProps_720076715[Datum] = new SharedBuilder_CellComponentProps_720076715[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
