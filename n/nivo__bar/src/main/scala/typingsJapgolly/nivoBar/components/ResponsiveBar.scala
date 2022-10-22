package typingsJapgolly.nivoBar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.GridValues
import typingsJapgolly.nivoBar.anon.Color
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarItemProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarLayer
import typingsJapgolly.nivoBar.distTypesTypesMod.BarLegendProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarSvgProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarTooltipProps
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatumWithValue
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.LabelFormatter
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendLabelDatum
import typingsJapgolly.nivoBar.nivoBarStrings.auto
import typingsJapgolly.nivoBar.nivoBarStrings.grouped
import typingsJapgolly.nivoBar.nivoBarStrings.horizontal
import typingsJapgolly.nivoBar.nivoBarStrings.id
import typingsJapgolly.nivoBar.nivoBarStrings.indexValue
import typingsJapgolly.nivoBar.nivoBarStrings.stacked
import typingsJapgolly.nivoBar.nivoBarStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.anon.Dictkey
import typingsJapgolly.nivoCore.anon.Id
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.DatumValue
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBandSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveBar {
  
  inline def apply[RawDatum /* <: BarDatum */](data: js.Array[RawDatum], height: Double, width: Double): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[BarSvgProps[RawDatum]]))
  }
  
  @JSImport("@nivo/bar", "ResponsiveBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: BarDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def annotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]): this.type = set("annotations", value.asInstanceOf[js.Any])
    
    inline def annotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[RawDatum]]*): this.type = set("annotations", js.Array(value*))
    
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
    
    inline def barAriaDescribedBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): this.type = set("barAriaDescribedBy", js.Any.fromFunction1(value))
    
    inline def barAriaLabel(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): this.type = set("barAriaLabel", js.Any.fromFunction1(value))
    
    inline def barAriaLabelledBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): this.type = set("barAriaLabelledBy", js.Any.fromFunction1(value))
    
    inline def barComponent(value: FC[BarItemProps[RawDatum]]): this.type = set("barComponent", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colorBy(value: id | indexValue): this.type = set("colorBy", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[ComputedDatum[RawDatum]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    inline def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value*))
    
    inline def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    inline def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    inline def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    
    inline def fill(value: js.Array[Id[ComputedBarDatum[RawDatum]]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillVarargs(value: Id[ComputedBarDatum[RawDatum]]*): this.type = set("fill", js.Array(value*))
    
    inline def gridXValues(value: GridValues[String | Double]): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    
    inline def gridYValues(value: GridValues[String | Double]): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    
    inline def groupMode(value: grouped | stacked): this.type = set("groupMode", value.asInstanceOf[js.Any])
    
    inline def indexBy(value: PropertyAccessor[RawDatum, String]): this.type = set("indexBy", value.asInstanceOf[js.Any])
    
    inline def indexByFunction1(value: RawDatum => String): this.type = set("indexBy", js.Any.fromFunction1(value))
    
    inline def indexScale(value: ScaleBandSpec): this.type = set("indexScale", value.asInstanceOf[js.Any])
    
    inline def initialHiddenIds(value: js.Array[String]): this.type = set("initialHiddenIds", value.asInstanceOf[js.Any])
    
    inline def initialHiddenIdsVarargs(value: String*): this.type = set("initialHiddenIds", js.Array(value*))
    
    inline def innerPadding(value: Double): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    
    inline def isFocusable(value: Boolean): this.type = set("isFocusable", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def keys(value: js.Array[String]): this.type = set("keys", value.asInstanceOf[js.Any])
    
    inline def keysVarargs(value: String*): this.type = set("keys", js.Array(value*))
    
    inline def label(value: PropertyAccessor[ComputedDatum[RawDatum], String]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFormat(value: String | LabelFormatter): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    
    inline def labelFormatFunction1(value: /* label */ String | Double => String | Double): this.type = set("labelFormat", js.Any.fromFunction1(value))
    
    inline def labelFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelSkipHeight(value: Double): this.type = set("labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def labelSkipWidth(value: Double): this.type = set("labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def labelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[BarLayer[RawDatum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: BarLayer[RawDatum]*): this.type = set("layers", js.Array(value*))
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def legendLabel(value: PropertyAccessor[LegendLabelDatum[RawDatum], String]): this.type = set("legendLabel", value.asInstanceOf[js.Any])
    
    inline def legendLabelFunction1(value: LegendLabelDatum[RawDatum] => String): this.type = set("legendLabel", js.Any.fromFunction1(value))
    
    inline def legends(value: js.Array[BarLegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: BarLegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def markers(value: js.Array[CartesianMarkerProps[DatumValue]]): this.type = set("markers", value.asInstanceOf[js.Any])
    
    inline def markersVarargs(value: CartesianMarkerProps[DatumValue]*): this.type = set("markers", js.Array(value*))
    
    inline def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: auto | Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum] & Color, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: FC[BarTooltipProps[RawDatum]]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): this.type = set("tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def tooltipLabelFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("tooltipLabel", js.Any.fromFunction1(value))
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueScale(value: ScaleSpec): this.type = set("valueScale", value.asInstanceOf[js.Any])
  }
  
  def withProps[RawDatum /* <: BarDatum */](p: BarSvgProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
