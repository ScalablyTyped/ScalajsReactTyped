package typingsJapgolly.bizcharts.mod

import typingsJapgolly.antvG2.libAnimateAnimationMod.Animation
import typingsJapgolly.antvG2.libChartControllerBaseMod.ControllerCtor
import typingsJapgolly.antvG2.libDependentsMod.IG
import typingsJapgolly.antvG2.libGeometryLabelBaseMod.GeometryLabelConstructor
import typingsJapgolly.antvG2.libGeometryLabelMod.GeometryLabelsLayoutFn
import typingsJapgolly.antvG2.libInteractionActionRegisterMod.ActionConstructor
import typingsJapgolly.antvG2.libInteractionGrammarInteractionMod.InteractionSteps
import typingsJapgolly.antvG2.libInteractionInteractionMod.InteractionConstructor
import typingsJapgolly.antvG2.libInterfaceMod.FacetCtor
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.libInterfaceMod.RegisterShape
import typingsJapgolly.antvG2.libInterfaceMod.RegisterShapeFactory
import typingsJapgolly.antvG2.libInterfaceMod.Shape
import typingsJapgolly.antvG2.libInterfaceMod.ShapeFactory
import typingsJapgolly.antvG2.libInterfaceMod.StyleSheet
import typingsJapgolly.bizcharts.libComponentsAxisMod.IAxis
import typingsJapgolly.bizcharts.libComponentsEffectsMod.IEffectsProps
import typingsJapgolly.bizcharts.libComponentsInteractionMod.IInteractionProps
import typingsJapgolly.bizcharts.libComponentsLegendMod.ILegend
import typingsJapgolly.bizcharts.libComponentsSliderMod.ISliderProps
import typingsJapgolly.bizcharts.libConnectorCreateTooltipConnectorMod.Connector
import typingsJapgolly.bizcharts.libGeometryLineAdvanceMod.ILineAdvanceGemoProps
import typingsJapgolly.bizcharts.libGeometryMod.IGemo
import typingsJapgolly.bizcharts.libInterfaceMod.IChartProps
import typingsJapgolly.bizcharts.libPlotsAreaChartMod.AreaOptions
import typingsJapgolly.bizcharts.libPlotsBarChartMod.BarOptions
import typingsJapgolly.bizcharts.libPlotsBubbleChartMod.BubbleOptions
import typingsJapgolly.bizcharts.libPlotsBulletChartMod.BulletOptions
import typingsJapgolly.bizcharts.libPlotsCalendarChartMod.CalendarOptions
import typingsJapgolly.bizcharts.libPlotsColumnChartMod.ColumnOptions
import typingsJapgolly.bizcharts.libPlotsDensityHeatmapChartMod.DensityHeatmapOptions
import typingsJapgolly.bizcharts.libPlotsDonutChartMod.DonutOptions
import typingsJapgolly.bizcharts.libPlotsDualAxesChartMod.DualAxesOptions
import typingsJapgolly.bizcharts.libPlotsFunnelChartMod.FunnelOptions
import typingsJapgolly.bizcharts.libPlotsGaugeChartMod.GaugeOptions
import typingsJapgolly.bizcharts.libPlotsGroupedBarChartMod.GroupedBarOptions
import typingsJapgolly.bizcharts.libPlotsGroupedColumnChartMod.GroupedColumnOptions
import typingsJapgolly.bizcharts.libPlotsGroupedRoseChartMod.GroupedRoseOptions
import typingsJapgolly.bizcharts.libPlotsHeatmapChartMod.HeatmapOptions
import typingsJapgolly.bizcharts.libPlotsHistogramChartMod.HistogramOptions
import typingsJapgolly.bizcharts.libPlotsLineChartMod.LineOptions
import typingsJapgolly.bizcharts.libPlotsLiquidChartMod.LiquidOptions
import typingsJapgolly.bizcharts.libPlotsPercentStackedAreaChartMod.PercentStackedAreaOptions
import typingsJapgolly.bizcharts.libPlotsPercentStackedBarChartMod.PercentStackedBarOptions
import typingsJapgolly.bizcharts.libPlotsPercentStackedColumnChartMod.PercentStackedColumnOptions
import typingsJapgolly.bizcharts.libPlotsPieChartMod.PieOptions
import typingsJapgolly.bizcharts.libPlotsPlotAdapterMod.IAdapterProps
import typingsJapgolly.bizcharts.libPlotsProgressChartMod.ProgressOptions
import typingsJapgolly.bizcharts.libPlotsRadarChartMod.RadarOptions
import typingsJapgolly.bizcharts.libPlotsRangeBarChartMod.RangeBarOptions
import typingsJapgolly.bizcharts.libPlotsRangeColumnChartMod.RangeColumnOptions
import typingsJapgolly.bizcharts.libPlotsRingProgressChartMod.RingProgressOptions
import typingsJapgolly.bizcharts.libPlotsRoseChartMod.RoseOptions
import typingsJapgolly.bizcharts.libPlotsScatterChartMod.ScatterOptions
import typingsJapgolly.bizcharts.libPlotsStackedAreaChartMod.StackedAreaOptions
import typingsJapgolly.bizcharts.libPlotsStackedBarChartMod.StackedBarOptions
import typingsJapgolly.bizcharts.libPlotsStackedColumnChartMod.StackedColumnOptions
import typingsJapgolly.bizcharts.libPlotsStackedRoseChartMod.StackedRoseOptions
import typingsJapgolly.bizcharts.libPlotsStepLineChartMod.StepLineOptions
import typingsJapgolly.bizcharts.libPlotsTinyAreaChartMod.TinyAreaOptions
import typingsJapgolly.bizcharts.libPlotsTinyColumnChartMod.TinyColumnOptions
import typingsJapgolly.bizcharts.libPlotsTinyLineChartMod.TinyLineOptions
import typingsJapgolly.bizcharts.libPlotsTreemapChartMod.TreemapOptions
import typingsJapgolly.bizcharts.libPlotsWaterfallChartMod.WaterfallOptions
import typingsJapgolly.bizcharts.libPlotsWordCloudChartMod.WordCloudCfg
import typingsJapgolly.bizcharts.mod.^
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AreaChart: ForwardRefExoticComponent[AreaOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("AreaChart").asInstanceOf[ForwardRefExoticComponent[AreaOptions & RefAttributes[Any]]]

inline def Axis(props: IAxis): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Axis")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def BarChart: ForwardRefExoticComponent[BarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("BarChart").asInstanceOf[ForwardRefExoticComponent[BarOptions & RefAttributes[Any]]]

inline def BubbleChart: ForwardRefExoticComponent[BubbleOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("BubbleChart").asInstanceOf[ForwardRefExoticComponent[BubbleOptions & RefAttributes[Any]]]

inline def BulletChart: ForwardRefExoticComponent[BulletOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("BulletChart").asInstanceOf[ForwardRefExoticComponent[BulletOptions & RefAttributes[Any]]]

inline def CalendarChart: ForwardRefExoticComponent[CalendarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarChart").asInstanceOf[ForwardRefExoticComponent[CalendarOptions & RefAttributes[Any]]]

inline def Chart: ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Chart").asInstanceOf[ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]]]

inline def ColumnChart: ForwardRefExoticComponent[ColumnOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ColumnChart").asInstanceOf[ForwardRefExoticComponent[ColumnOptions & RefAttributes[Any]]]

inline def Coord(props: Any): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Coord")(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]

inline def DensityHeatmapChart: ForwardRefExoticComponent[DensityHeatmapOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("DensityHeatmapChart").asInstanceOf[ForwardRefExoticComponent[DensityHeatmapOptions & RefAttributes[Any]]]

inline def DonutChart: ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("DonutChart").asInstanceOf[ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]]]

inline def DualAxesChart: ForwardRefExoticComponent[DualAxesOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("DualAxesChart").asInstanceOf[ForwardRefExoticComponent[DualAxesOptions & RefAttributes[Any]]]

inline def Effects(props: IEffectsProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Effects")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]

inline def FunnelChart: ForwardRefExoticComponent[FunnelOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("FunnelChart").asInstanceOf[ForwardRefExoticComponent[FunnelOptions & RefAttributes[Any]]]

inline def GaugeChart: ForwardRefExoticComponent[GaugeOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("GaugeChart").asInstanceOf[ForwardRefExoticComponent[GaugeOptions & RefAttributes[Any]]]

inline def Geom(props: IGemo): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Geom")(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]

inline def GroupedBarChart: ForwardRefExoticComponent[GroupedBarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("GroupedBarChart").asInstanceOf[ForwardRefExoticComponent[GroupedBarOptions & RefAttributes[Any]]]

inline def GroupedColumnChart: ForwardRefExoticComponent[GroupedColumnOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("GroupedColumnChart").asInstanceOf[ForwardRefExoticComponent[GroupedColumnOptions & RefAttributes[Any]]]

inline def GroupedRoseChart: ForwardRefExoticComponent[GroupedRoseOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("GroupedRoseChart").asInstanceOf[ForwardRefExoticComponent[GroupedRoseOptions & RefAttributes[Any]]]

inline def HeatmapChart: ForwardRefExoticComponent[HeatmapOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("HeatmapChart").asInstanceOf[ForwardRefExoticComponent[HeatmapOptions & RefAttributes[Any]]]

inline def HistogramChart: ForwardRefExoticComponent[HistogramOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("HistogramChart").asInstanceOf[ForwardRefExoticComponent[HistogramOptions & RefAttributes[Any]]]

inline def Interaction(props: IInteractionProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Interaction")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def Label(props: Any): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Label")(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]

inline def Legend(props: ILegend): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Legend")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def LineAdvance(props: ILineAdvanceGemoProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LineAdvance")(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]

inline def LineChart: ForwardRefExoticComponent[LineOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("LineChart").asInstanceOf[ForwardRefExoticComponent[LineOptions & RefAttributes[Any]]]

inline def LiquidChart: ForwardRefExoticComponent[LiquidOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("LiquidChart").asInstanceOf[ForwardRefExoticComponent[LiquidOptions & RefAttributes[Any]]]

inline def PercentStackedAreaChart: ForwardRefExoticComponent[PercentStackedAreaOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PercentStackedAreaChart").asInstanceOf[ForwardRefExoticComponent[PercentStackedAreaOptions & RefAttributes[Any]]]

inline def PercentStackedBarChart: ForwardRefExoticComponent[PercentStackedBarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PercentStackedBarChart").asInstanceOf[ForwardRefExoticComponent[PercentStackedBarOptions & RefAttributes[Any]]]

inline def PercentStackedColumnChart: ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PercentStackedColumnChart").asInstanceOf[ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]]]

inline def PieChart: ForwardRefExoticComponent[PieOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PieChart").asInstanceOf[ForwardRefExoticComponent[PieOptions & RefAttributes[Any]]]

inline def PlotAdapter: FC[IAdapterProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("PlotAdapter").asInstanceOf[FC[IAdapterProps]]

inline def ProgressChart: ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ProgressChart").asInstanceOf[ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]]]

inline def RadarChart: ForwardRefExoticComponent[RadarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("RadarChart").asInstanceOf[ForwardRefExoticComponent[RadarOptions & RefAttributes[Any]]]

inline def RangeBarChart: ForwardRefExoticComponent[RangeBarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("RangeBarChart").asInstanceOf[ForwardRefExoticComponent[RangeBarOptions & RefAttributes[Any]]]

inline def RangeColumnChart: ForwardRefExoticComponent[RangeColumnOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("RangeColumnChart").asInstanceOf[ForwardRefExoticComponent[RangeColumnOptions & RefAttributes[Any]]]

inline def RingProgressChart: ForwardRefExoticComponent[RingProgressOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("RingProgressChart").asInstanceOf[ForwardRefExoticComponent[RingProgressOptions & RefAttributes[Any]]]

inline def RoseChart: ForwardRefExoticComponent[RoseOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("RoseChart").asInstanceOf[ForwardRefExoticComponent[RoseOptions & RefAttributes[Any]]]

inline def ScatterChart: ForwardRefExoticComponent[ScatterOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ScatterChart").asInstanceOf[ForwardRefExoticComponent[ScatterOptions & RefAttributes[Any]]]

inline def Slider(props: ISliderProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Slider")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def StackedAreaChart: ForwardRefExoticComponent[StackedAreaOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("StackedAreaChart").asInstanceOf[ForwardRefExoticComponent[StackedAreaOptions & RefAttributes[Any]]]

inline def StackedBarChart: ForwardRefExoticComponent[StackedBarOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("StackedBarChart").asInstanceOf[ForwardRefExoticComponent[StackedBarOptions & RefAttributes[Any]]]

inline def StackedColumnChart: ForwardRefExoticComponent[StackedColumnOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("StackedColumnChart").asInstanceOf[ForwardRefExoticComponent[StackedColumnOptions & RefAttributes[Any]]]

inline def StackedRoseChart: ForwardRefExoticComponent[StackedRoseOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("StackedRoseChart").asInstanceOf[ForwardRefExoticComponent[StackedRoseOptions & RefAttributes[Any]]]

inline def StepLineChart: ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("StepLineChart").asInstanceOf[ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]]]

inline def TinyAreaChart: ForwardRefExoticComponent[TinyAreaOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("TinyAreaChart").asInstanceOf[ForwardRefExoticComponent[TinyAreaOptions & RefAttributes[Any]]]

inline def TinyColumnChart: ForwardRefExoticComponent[TinyColumnOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("TinyColumnChart").asInstanceOf[ForwardRefExoticComponent[TinyColumnOptions & RefAttributes[Any]]]

inline def TinyLineChart: ForwardRefExoticComponent[TinyLineOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("TinyLineChart").asInstanceOf[ForwardRefExoticComponent[TinyLineOptions & RefAttributes[Any]]]

inline def TreemapChart: ForwardRefExoticComponent[TreemapOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("TreemapChart").asInstanceOf[ForwardRefExoticComponent[TreemapOptions & RefAttributes[Any]]]

inline def VERSION: /* "4.2.8" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[/* "4.2.8" */ String]

inline def WaterfallChart: ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("WaterfallChart").asInstanceOf[ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]]]

inline def WordCloudChart: ForwardRefExoticComponent[WordCloudCfg & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("WordCloudChart").asInstanceOf[ForwardRefExoticComponent[WordCloudCfg & RefAttributes[Any]]]

inline def createPlot[IPlotConfig /* <: Record[String, Any] */](PlotClass: Any, name: String): ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlot")(PlotClass.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]]]
inline def createPlot[IPlotConfig /* <: Record[String, Any] */](PlotClass: Any, name: String, transCfg: js.Function): ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlot")(PlotClass.asInstanceOf[js.Any], name.asInstanceOf[js.Any], transCfg.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]]]

inline def createThemeByStyleSheet(styleSheet: StyleSheet): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemeByStyleSheet")(styleSheet.asInstanceOf[js.Any]).asInstanceOf[LooseObject]

inline def createTooltipConnector(): Connector = ^.asInstanceOf[js.Dynamic].applyDynamic("createTooltipConnector")().asInstanceOf[Connector]

inline def getActionClass(actionName: String): ActionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionClass")(actionName.asInstanceOf[js.Any]).asInstanceOf[ActionConstructor]

inline def getAnimation(`type`: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimation")(`type`.asInstanceOf[js.Any]).asInstanceOf[Animation]

inline def getEngine(name: String): IG = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")(name.asInstanceOf[js.Any]).asInstanceOf[IG]

inline def getFacet(`type`: String): FacetCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacet")(`type`.asInstanceOf[js.Any]).asInstanceOf[FacetCtor]

inline def getGeometryLabel(`type`: String): GeometryLabelConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabel")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelConstructor]

inline def getGeometryLabelLayout(`type`: String): GeometryLabelsLayoutFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabelLayout")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelsLayoutFn]

inline def getInteraction(name: String): InteractionSteps | InteractionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteraction")(name.asInstanceOf[js.Any]).asInstanceOf[InteractionSteps | InteractionConstructor]

inline def getShapeFactory(factoryName: String): ShapeFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getShapeFactory")(factoryName.asInstanceOf[js.Any]).asInstanceOf[ShapeFactory]

inline def getTheme(): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[LooseObject]
inline def getTheme(theme: String): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[LooseObject]

inline def registerAction(actionName: String, ActionClass: ActionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerAction(actionName: String, ActionClass: ActionConstructor, cfg: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerAnimation(`type`: String, animation: Animation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(`type`.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerComponentController(name: String, plugin: ControllerCtor[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponentController")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerEngine(name: String, engine: IG): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEngine")(name.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerFacet(`type`: String, ctor: FacetCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFacet")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerGeometry(name: String, Ctor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometry")(name.asInstanceOf[js.Any], Ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerGeometryLabel(`type`: String, ctor: GeometryLabelConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabel")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerGeometryLabelLayout(`type`: String, layoutFn: GeometryLabelsLayoutFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabelLayout")(`type`.asInstanceOf[js.Any], layoutFn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerInteraction(name: String, interaction: InteractionSteps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerInteraction(name: String, interaction: InteractionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerShape(factoryName: String, shapeType: String, cfg: RegisterShape): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShape")(factoryName.asInstanceOf[js.Any], shapeType.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Shape]

inline def registerShapeFactory(factoryName: String, cfg: RegisterShapeFactory): ShapeFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShapeFactory")(factoryName.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[ShapeFactory]

inline def registerTheme(theme: String, value: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setDefaultErrorFallback(CustComponents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultErrorFallback")(CustComponents.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setGlobal(datum: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(datum.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useChartInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useChartInstance")().asInstanceOf[Any]

inline def useRootChart(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRootChart")().asInstanceOf[Any]

inline def useTheme(): js.Array[LooseObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.Array[LooseObject]]
inline def useTheme(defaultThemeName: String): js.Array[LooseObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")(defaultThemeName.asInstanceOf[js.Any]).asInstanceOf[js.Array[LooseObject]]

inline def useView(): typingsJapgolly.antvG2.libChartMod.Chart = ^.asInstanceOf[js.Dynamic].applyDynamic("useView")().asInstanceOf[typingsJapgolly.antvG2.libChartMod.Chart]

inline def withChartInstance[T](Component: Any): ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withChartInstance")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]]]

inline def withView[T](Component: Any): js.Function1[/* props */ T, typingsJapgolly.react.mod.global.JSX.Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withView")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ T, typingsJapgolly.react.mod.global.JSX.Element]]
