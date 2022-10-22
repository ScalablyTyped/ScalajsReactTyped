package typingsJapgolly.nivoHeatmap.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoHeatmap.distTypesHeatMapCellAnnotationsMod.HeatMapCellAnnotationsProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeatMapCellAnnotations {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    annotations: NonNullable[js.Array[AnnotationMatcher[ComputedCell[Datum]]]],
    cells: js.Array[ComputedCell[Datum]]
  ): Builder[Datum] = {
    val __props = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[HeatMapCellAnnotationsProps[Datum]]))
  }
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCellAnnotations", "HeatMapCellAnnotations")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: HeatMapDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[Datum /* <: HeatMapDatum */](p: HeatMapCellAnnotationsProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
