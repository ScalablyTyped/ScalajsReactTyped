package typingsJapgolly.nivoBar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoAxes.distTypesTypesMod.CanvasAxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.GridValues
import typingsJapgolly.nivoBar.anon.ComputedDatumBarDatumcolo
import typingsJapgolly.nivoBar.anon.PartialBarCommonPropsBarD
import typingsJapgolly.nivoBar.distTypesTypesMod.BarCanvasLayer
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarLegendProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarTooltipProps
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatumWithValue
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.LabelFormatter
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendLabelDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.RenderBarProps
import typingsJapgolly.nivoBar.nivoBarStrings.auto
import typingsJapgolly.nivoBar.nivoBarStrings.grouped
import typingsJapgolly.nivoBar.nivoBarStrings.horizontal
import typingsJapgolly.nivoBar.nivoBarStrings.id
import typingsJapgolly.nivoBar.nivoBarStrings.indexValue
import typingsJapgolly.nivoBar.nivoBarStrings.stacked
import typingsJapgolly.nivoBar.nivoBarStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBandSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarCanvas {
  
  inline def apply(data: js.Array[BarDatum], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PartialBarCommonPropsBarD]))
  }
  
  @JSImport("@nivo/bar", "BarCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLCanvasElement] {
    
    inline def annotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[BarDatum]]]): this.type = set("annotations", value.asInstanceOf[js.Any])
    
    inline def annotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[BarDatum]]*): this.type = set("annotations", js.Array(value*))
    
    inline def axisBottom(value: CanvasAxisProps[Any]): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    
    inline def axisBottomNull: this.type = set("axisBottom", null)
    
    inline def axisLeft(value: CanvasAxisProps[Any]): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    
    inline def axisLeftNull: this.type = set("axisLeft", null)
    
    inline def axisRight(value: CanvasAxisProps[Any]): this.type = set("axisRight", value.asInstanceOf[js.Any])
    
    inline def axisRightNull: this.type = set("axisRight", null)
    
    inline def axisTop(value: CanvasAxisProps[Any]): this.type = set("axisTop", value.asInstanceOf[js.Any])
    
    inline def axisTopNull: this.type = set("axisTop", null)
    
    inline def borderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[BarDatum]]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colorBy(value: id | indexValue): this.type = set("colorBy", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[ComputedDatum[BarDatum]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: ComputedDatum[BarDatum] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    inline def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    inline def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    
    inline def gridXValues(value: GridValues[String | Double]): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    
    inline def gridYValues(value: GridValues[String | Double]): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    
    inline def groupMode(value: grouped | stacked): this.type = set("groupMode", value.asInstanceOf[js.Any])
    
    inline def indexBy(value: PropertyAccessor[BarDatum, String]): this.type = set("indexBy", value.asInstanceOf[js.Any])
    
    inline def indexByFunction1(value: BarDatum => String): this.type = set("indexBy", js.Any.fromFunction1(value))
    
    inline def indexScale(value: ScaleBandSpec): this.type = set("indexScale", value.asInstanceOf[js.Any])
    
    inline def initialHiddenIds(value: js.Array[String]): this.type = set("initialHiddenIds", value.asInstanceOf[js.Any])
    
    inline def initialHiddenIdsVarargs(value: String*): this.type = set("initialHiddenIds", js.Array(value*))
    
    inline def innerPadding(value: Double): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def keys(value: js.Array[String]): this.type = set("keys", value.asInstanceOf[js.Any])
    
    inline def keysVarargs(value: String*): this.type = set("keys", js.Array(value*))
    
    inline def label(value: PropertyAccessor[ComputedDatum[BarDatum], String]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFormat(value: String | LabelFormatter): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    
    inline def labelFormatFunction1(value: /* label */ String | Double => String | Double): this.type = set("labelFormat", js.Any.fromFunction1(value))
    
    inline def labelFunction1(value: ComputedDatum[BarDatum] => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelSkipHeight(value: Double): this.type = set("labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def labelSkipWidth(value: Double): this.type = set("labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def labelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[BarDatum]]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[BarCanvasLayer[BarDatum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: BarCanvasLayer[BarDatum]*): this.type = set("layers", js.Array(value*))
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def legendLabel(value: PropertyAccessor[LegendLabelDatum[BarDatum], String]): this.type = set("legendLabel", value.asInstanceOf[js.Any])
    
    inline def legendLabelFunction1(value: LegendLabelDatum[BarDatum] => String): this.type = set("legendLabel", js.Any.fromFunction1(value))
    
    inline def legends(value: js.Array[BarLegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: BarLegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: auto | Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* datum */ ComputedDatumBarDatumcolo, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatumBarDatumcolo, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ ComputedDatum[BarDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[BarDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ ComputedDatum[BarDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[BarDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def renderBar(value: (/* context */ CanvasRenderingContext2D, /* props */ RenderBarProps[BarDatum]) => Callback): this.type = set("renderBar", js.Any.fromFunction2((t0: /* context */ CanvasRenderingContext2D, t1: /* props */ RenderBarProps[BarDatum]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: FC[BarTooltipProps[BarDatum]]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipLabel(value: PropertyAccessor[ComputedDatum[BarDatum], String]): this.type = set("tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def tooltipLabelFunction1(value: ComputedDatum[BarDatum] => String): this.type = set("tooltipLabel", js.Any.fromFunction1(value))
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueScale(value: ScaleSpec): this.type = set("valueScale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialBarCommonPropsBarD): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
