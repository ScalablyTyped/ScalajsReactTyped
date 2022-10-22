package typingsJapgolly.nivoPie.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGPathElement
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelComponent
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelComponent
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.anon.Dictkey
import typingsJapgolly.nivoCore.anon.Id
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoPie.nivoPieStrings.arc
import typingsJapgolly.nivoPie.nivoPieStrings.color
import typingsJapgolly.nivoPie.nivoPieStrings.fill
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/pie.@nivo/pie/dist/types/types.DataProps<RawDatum> & @nivo/core.@nivo/core.Dimensions & std.Partial<@nivo/pie.@nivo/pie/dist/types/types.CommonPieProps<RawDatum>> & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/pie.@nivo/pie/dist/types/types.ComputedDatum<RawDatum>> & @nivo/pie.@nivo/pie/dist/types/types.PieHandlers<RawDatum, std.SVGPathElement> & {  layers :std.Array<@nivo/pie.@nivo/pie/dist/types/types.PieLayer<RawDatum>> | undefined,   animate :boolean | undefined,   motionConfig :@nivo/core.@nivo/core.ModernMotionProps['motionConfig'] | undefined,   transitionMode :@nivo/arcs.@nivo/arcs.ArcTransitionMode | undefined} & @nivo/pie.@nivo/pie/dist/types/types.PieSvgCustomComponents<RawDatum> */
trait PieSvgProps[RawDatum] extends StObject {
  
  var activeInnerRadiusOffset: js.UndefOr[Double] = js.undefined
  
  var activeOuterRadiusOffset: js.UndefOr[Double] = js.undefined
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var arcLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var arcLabelsComponent: js.UndefOr[ArcLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLabelsRadiusOffset: js.UndefOr[Double] = js.undefined
  
  var arcLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  
  var arcLabelsTextColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var arcLinkLabelComponent: js.UndefOr[ArcLinkLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabelsColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabelsDiagonalLength: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsOffset: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsSkipAngle: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsStraightLength: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsTextColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var arcLinkLabelsTextOffset: js.UndefOr[Double] = js.undefined
  
  var arcLinkLabelsThickness: js.UndefOr[Double] = js.undefined
  
  var borderColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]]] = js.undefined
  
  var component: js.UndefOr[ArcLinkLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var data: js.Array[RawDatum]
  
  var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
  
  var enableArcLabels: js.UndefOr[Boolean] = js.undefined
  
  var enableArcLinkLabels: js.UndefOr[Boolean] = js.undefined
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[js.Array[Id[ComputedDatum[RawDatum]]]] = js.undefined
  
  var fit: js.UndefOr[Boolean] = js.undefined
  
  var height: Double
  
  var id: js.UndefOr[PropertyAccessor[RawDatum, DatumId]] = js.undefined
  
  var innerRadius: js.UndefOr[Double] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var layers: js.UndefOr[js.Array[PieLayer[RawDatum]]] = js.undefined
  
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.undefined
  
  var padAngle: js.UndefOr[Double] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var sortByValue: js.UndefOr[Boolean] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[FC[PieTooltipProps[RawDatum]]] = js.undefined
  
  var transitionMode: js.UndefOr[ArcTransitionMode] = js.undefined
  
  var value: js.UndefOr[PropertyAccessor[RawDatum, Double]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var width: Double
}
object PieSvgProps {
  
  inline def apply[RawDatum](data: js.Array[RawDatum], height: Double, width: Double): PieSvgProps[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieSvgProps[RawDatum]]
  }
  
  extension [Self <: PieSvgProps[?], RawDatum](x: Self & PieSvgProps[RawDatum]) {
    
    inline def setActiveInnerRadiusOffset(value: Double): Self = StObject.set(x, "activeInnerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setActiveInnerRadiusOffsetUndefined: Self = StObject.set(x, "activeInnerRadiusOffset", js.undefined)
    
    inline def setActiveOuterRadiusOffset(value: Double): Self = StObject.set(x, "activeOuterRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setActiveOuterRadiusOffsetUndefined: Self = StObject.set(x, "activeOuterRadiusOffset", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setArcLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "arcLabel", value.asInstanceOf[js.Any])
    
    inline def setArcLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "arcLabel", js.Any.fromFunction1(value))
    
    inline def setArcLabelUndefined: Self = StObject.set(x, "arcLabel", js.undefined)
    
    inline def setArcLabelsComponent(value: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "arcLabelsComponent", js.Any.fromFunction1(value))
    
    inline def setArcLabelsComponentUndefined: Self = StObject.set(x, "arcLabelsComponent", js.undefined)
    
    inline def setArcLabelsRadiusOffset(value: Double): Self = StObject.set(x, "arcLabelsRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLabelsRadiusOffsetUndefined: Self = StObject.set(x, "arcLabelsRadiusOffset", js.undefined)
    
    inline def setArcLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def setArcLabelsSkipAngleUndefined: Self = StObject.set(x, "arcLabelsSkipAngle", js.undefined)
    
    inline def setArcLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def setArcLabelsTextColorUndefined: Self = StObject.set(x, "arcLabelsTextColor", js.undefined)
    
    inline def setArcLinkLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "arcLinkLabel", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelComponent(value: /* props */ ArcLinkLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "arcLinkLabelComponent", js.Any.fromFunction1(value))
    
    inline def setArcLinkLabelComponentUndefined: Self = StObject.set(x, "arcLinkLabelComponent", js.undefined)
    
    inline def setArcLinkLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "arcLinkLabel", js.Any.fromFunction1(value))
    
    inline def setArcLinkLabelUndefined: Self = StObject.set(x, "arcLinkLabel", js.undefined)
    
    inline def setArcLinkLabelsColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLinkLabelsColor", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsColorUndefined: Self = StObject.set(x, "arcLinkLabelsColor", js.undefined)
    
    inline def setArcLinkLabelsDiagonalLength(value: Double): Self = StObject.set(x, "arcLinkLabelsDiagonalLength", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsDiagonalLengthUndefined: Self = StObject.set(x, "arcLinkLabelsDiagonalLength", js.undefined)
    
    inline def setArcLinkLabelsOffset(value: Double): Self = StObject.set(x, "arcLinkLabelsOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsOffsetUndefined: Self = StObject.set(x, "arcLinkLabelsOffset", js.undefined)
    
    inline def setArcLinkLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLinkLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsSkipAngleUndefined: Self = StObject.set(x, "arcLinkLabelsSkipAngle", js.undefined)
    
    inline def setArcLinkLabelsStraightLength(value: Double): Self = StObject.set(x, "arcLinkLabelsStraightLength", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsStraightLengthUndefined: Self = StObject.set(x, "arcLinkLabelsStraightLength", js.undefined)
    
    inline def setArcLinkLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "arcLinkLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsTextColorUndefined: Self = StObject.set(x, "arcLinkLabelsTextColor", js.undefined)
    
    inline def setArcLinkLabelsTextOffset(value: Double): Self = StObject.set(x, "arcLinkLabelsTextOffset", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsTextOffsetUndefined: Self = StObject.set(x, "arcLinkLabelsTextOffset", js.undefined)
    
    inline def setArcLinkLabelsThickness(value: Double): Self = StObject.set(x, "arcLinkLabelsThickness", value.asInstanceOf[js.Any])
    
    inline def setArcLinkLabelsThicknessUndefined: Self = StObject.set(x, "arcLinkLabelsThickness", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill | arc] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setComponent(value: /* props */ ArcLinkLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
    
    inline def setEnableArcLabels(value: Boolean): Self = StObject.set(x, "enableArcLabels", value.asInstanceOf[js.Any])
    
    inline def setEnableArcLabelsUndefined: Self = StObject.set(x, "enableArcLabels", js.undefined)
    
    inline def setEnableArcLinkLabels(value: Boolean): Self = StObject.set(x, "enableArcLinkLabels", value.asInstanceOf[js.Any])
    
    inline def setEnableArcLinkLabelsUndefined: Self = StObject.set(x, "enableArcLinkLabels", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setFill(value: js.Array[Id[ComputedDatum[RawDatum]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: Id[ComputedDatum[RawDatum]]*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLayers(value: js.Array[PieLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: PieLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGPathElement & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSortByValue(value: Boolean): Self = StObject.set(x, "sortByValue", value.asInstanceOf[js.Any])
    
    inline def setSortByValueUndefined: Self = StObject.set(x, "sortByValue", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: FC[PieTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    
    inline def setTransitionModeUndefined: Self = StObject.set(x, "transitionMode", js.undefined)
    
    inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
