package typingsJapgolly.nivoScatterplot.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoScatterplot.distTypesScatterPlotAnnotationsMod.ScatterPlotAnnotationsProps
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScatterPlotAnnotations {
  
  inline def apply[RawDatum /* <: ScatterPlotDatum */](
    annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]],
    nodes: js.Array[ScatterPlotNodeData[RawDatum]]
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ScatterPlotAnnotationsProps[RawDatum]]))
  }
  
  @JSImport("@nivo/scatterplot/dist/types/ScatterPlotAnnotations", "ScatterPlotAnnotations")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: ScatterPlotDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: ScatterPlotDatum */](p: ScatterPlotAnnotationsProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
