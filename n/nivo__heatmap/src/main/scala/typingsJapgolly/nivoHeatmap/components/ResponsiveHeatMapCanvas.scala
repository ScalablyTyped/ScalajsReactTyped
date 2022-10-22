package typingsJapgolly.nivoHeatmap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoAxes.distTypesTypesMod.CanvasAxisProps
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoHeatmap.anon.OmitAnchoredContinuousCol
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellCanvasRenderer
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellCanvasRendererProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellShape
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CustomCanvasLayer
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapCanvasProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapSerie
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.LayerId
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.SizeVariationConfig
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.TooltipComponent
import typingsJapgolly.nivoHeatmap.nivoHeatmapBooleans.`false`
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.borderColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.cell
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.color
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.column
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.label
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.labelTextColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.opacity
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.row
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveHeatMapCanvas {
  
  inline def apply[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](data: js.Array[HeatMapSerie[Datum, ExtraProps]], height: Double, width: Double): Builder[Datum, ExtraProps] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[Datum, ExtraProps](js.Array(this.component, __props.asInstanceOf[HeatMapCanvasProps[Datum, ExtraProps]]))
  }
  
  @JSImport("@nivo/heatmap", "ResponsiveHeatMapCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def annotations(value: js.Array[AnnotationMatcher[ComputedCell[Datum]]]): this.type = set("annotations", value.asInstanceOf[js.Any])
    
    inline def annotationsVarargs(value: AnnotationMatcher[ComputedCell[Datum]]*): this.type = set("annotations", js.Array(value*))
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def axisBottom(
      value: CanvasAxisProps[
          /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
        ]
    ): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    
    inline def axisBottomNull: this.type = set("axisBottom", null)
    
    inline def axisLeft(value: CanvasAxisProps[String]): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    
    inline def axisLeftNull: this.type = set("axisLeft", null)
    
    inline def axisRight(value: CanvasAxisProps[String]): this.type = set("axisRight", value.asInstanceOf[js.Any])
    
    inline def axisRightNull: this.type = set("axisRight", null)
    
    inline def axisTop(
      value: CanvasAxisProps[
          /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
        ]
    ): this.type = set("axisTop", value.asInstanceOf[js.Any])
    
    inline def axisTopNull: this.type = set("axisTop", null)
    
    inline def borderColor(
      value: InheritedColorConfig[
          Omit[ComputedCell[Datum], typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.borderColor]
        ]
    ): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colors(
      value: ContinuousColorScaleConfig | (js.Function1[
          /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor], 
          String
        ])
    ): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(
      value: /* cell */ Omit[ComputedCell[Datum], color | opacity | borderColor | labelTextColor] => String
    ): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
    
    inline def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    inline def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    inline def enableLabels(value: Boolean): this.type = set("enableLabels", value.asInstanceOf[js.Any])
    
    inline def forceSquare(value: Boolean): this.type = set("forceSquare", value.asInstanceOf[js.Any])
    
    inline def hoverTarget(value: cell | row | column | rowColumn): this.type = set("hoverTarget", value.asInstanceOf[js.Any])
    
    inline def inactiveOpacity(value: Double): this.type = set("inactiveOpacity", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(
      value: PropertyAccessor[
          Omit[
            ComputedCell[Datum], 
            typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.label | color | opacity | borderColor | labelTextColor
          ], 
          String
        ]
    ): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: Omit[ComputedCell[Datum], label | color | opacity | borderColor | labelTextColor] => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelTextColor(
      value: InheritedColorConfig[
          Omit[ComputedCell[Datum], typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.labelTextColor]
        ]
    ): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[LayerId | CustomCanvasLayer[Datum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: (LayerId | CustomCanvasLayer[Datum])*): this.type = set("layers", js.Array(value*))
    
    inline def legends(value: js.Array[OmitAnchoredContinuousCol]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: OmitAnchoredContinuousCol*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* cell */ ComputedCell[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* cell */ ComputedCell[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def renderCell(value: CellShape | CellCanvasRenderer[Datum]): this.type = set("renderCell", value.asInstanceOf[js.Any])
    
    inline def renderCellFunction2(
      value: (/* ctx */ CanvasRenderingContext2D, /* props */ CellCanvasRendererProps[Datum]) => Callback
    ): this.type = set("renderCell", js.Any.fromFunction2((t0: /* ctx */ CanvasRenderingContext2D, t1: /* props */ CellCanvasRendererProps[Datum]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def sizeVariation(value: `false` | SizeVariationConfig): this.type = set("sizeVariation", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: TooltipComponent[Datum]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def xInnerPadding(value: Double): this.type = set("xInnerPadding", value.asInstanceOf[js.Any])
    
    inline def xOuterPadding(value: Double): this.type = set("xOuterPadding", value.asInstanceOf[js.Any])
    
    inline def yInnerPadding(value: Double): this.type = set("yInnerPadding", value.asInstanceOf[js.Any])
    
    inline def yOuterPadding(value: Double): this.type = set("yOuterPadding", value.asInstanceOf[js.Any])
  }
  
  def withProps[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](p: HeatMapCanvasProps[Datum, ExtraProps]): Builder[Datum, ExtraProps] = new Builder[Datum, ExtraProps](js.Array(this.component, p.asInstanceOf[js.Any]))
}
