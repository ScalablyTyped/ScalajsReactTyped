package typingsJapgolly.nivoScatterplot.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.GridValues
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.nivoScatterplot.anon.SerieId
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotCustomSvgLayer
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotLayerId
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNode
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeDynamicSizeSpec
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotRawSerie
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotSvgProps
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltip
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.color
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.id
import typingsJapgolly.nivoScatterplot.nivoScatterplotStrings.size
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveScatterPlot {
  
  inline def apply[RawDatum /* <: ScatterPlotDatum */](data: js.Array[ScatterPlotRawSerie[RawDatum]], height: Double, width: Double): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ScatterPlotSvgProps[RawDatum]]))
  }
  
  @JSImport("@nivo/scatterplot", "ResponsiveScatterPlot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: ScatterPlotDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def annotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]): this.type = set("annotations", value.asInstanceOf[js.Any])
    
    inline def annotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[RawDatum]]*): this.type = set("annotations", js.Array(value*))
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def axisBottom(value: AxisProps[Any]): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    
    inline def axisBottomNull: this.type = set("axisBottom", null)
    
    inline def axisLeft(value: AxisProps[Any]): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    
    inline def axisLeftNull: this.type = set("axisLeft", null)
    
    inline def axisRight(value: AxisProps[Any]): this.type = set("axisRight", value.asInstanceOf[js.Any])
    
    inline def axisRightNull: this.type = set("axisRight", null)
    
    inline def axisTop(value: AxisProps[Any]): this.type = set("axisTop", value.asInstanceOf[js.Any])
    
    inline def axisTopNull: this.type = set("axisTop", null)
    
    inline def blendMode(value: CssMixBlendMode): this.type = set("blendMode", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[SerieId]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: SerieId => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def debugMesh(value: Boolean): this.type = set("debugMesh", value.asInstanceOf[js.Any])
    
    inline def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    inline def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    inline def gridXValues(
      value: GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ]
    ): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    
    inline def gridYValues(
      value: GridValues[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any
        ]
    ): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[ScatterPlotLayerId | ScatterPlotCustomSvgLayer[RawDatum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: (ScatterPlotLayerId | ScatterPlotCustomSvgLayer[RawDatum])*): this.type = set("layers", js.Array(value*))
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def markers(
      value: js.Array[
          CartesianMarkerProps[
            /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
          ]
        ]
    ): this.type = set("markers", value.asInstanceOf[js.Any])
    
    inline def markersVarargs(
      value: (CartesianMarkerProps[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any
        ])*
    ): this.type = set("markers", js.Array(value*))
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def nodeComponent(value: ScatterPlotNode[RawDatum]): this.type = set("nodeComponent", value.asInstanceOf[js.Any])
    
    inline def nodeId(value: PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], id | size | color], String]): this.type = set("nodeId", value.asInstanceOf[js.Any])
    
    inline def nodeIdFunction1(value: Omit[ScatterPlotNodeData[RawDatum], id | size | color] => String): this.type = set("nodeId", js.Any.fromFunction1(value))
    
    inline def nodeSize(
      value: Double | ScatterPlotNodeDynamicSizeSpec | (PropertyAccessor[Omit[ScatterPlotNodeData[RawDatum], size | color], Double])
    ): this.type = set("nodeSize", value.asInstanceOf[js.Any])
    
    inline def nodeSizeFunction1(value: Omit[ScatterPlotNodeData[RawDatum], size | color] => Double): this.type = set("nodeSize", js.Any.fromFunction1(value))
    
    inline def onClick(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: ScatterPlotTooltip[RawDatum]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def useMesh(value: Boolean): this.type = set("useMesh", value.asInstanceOf[js.Any])
    
    inline def xFormat(
      value: ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['x'] */ js.Any, 
          Unit
        ]
    ): this.type = set("xFormat", value.asInstanceOf[js.Any])
    
    inline def xScale(value: ScaleSpec): this.type = set("xScale", value.asInstanceOf[js.Any])
    
    inline def yFormat(
      value: ValueFormat[
          /* import warning: importer.ImportType#apply Failed type conversion: RawDatum['y'] */ js.Any, 
          Unit
        ]
    ): this.type = set("yFormat", value.asInstanceOf[js.Any])
    
    inline def yScale(value: ScaleSpec): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps[RawDatum /* <: ScatterPlotDatum */](p: ScatterPlotSvgProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
