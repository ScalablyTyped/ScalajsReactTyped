package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.CanvasPattern
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typingsJapgolly.antvG2.libInterfaceMod.CoordinateOption
import typingsJapgolly.antvG2.libInterfaceMod.SyncViewPaddingFn
import typingsJapgolly.antvG2plot.antvG2plotStrings.auto
import typingsJapgolly.antvG2plot.antvG2plotStrings.canvas
import typingsJapgolly.antvG2plot.antvG2plotStrings.density
import typingsJapgolly.antvG2plot.antvG2plotStrings.polygon
import typingsJapgolly.antvG2plot.antvG2plotStrings.svg
import typingsJapgolly.antvG2plot.antvG2plotStrings.x
import typingsJapgolly.antvG2plot.antvG2plotStrings.y
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libTypesAnimationMod.Animation
import typingsJapgolly.antvG2plot.libTypesAnnotationMod.Annotation
import typingsJapgolly.antvG2plot.libTypesAttrMod.ColorAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.PatternAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.ShapeStyle
import typingsJapgolly.antvG2plot.libTypesAttrMod.StyleAttr
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.antvG2plot.libTypesMetaMod.Meta
import typingsJapgolly.antvG2plot.libTypesScrollbarMod.Scrollbar
import typingsJapgolly.antvG2plot.libTypesStateMod.State
import typingsJapgolly.antvG2plot.libUtilsPatternMod.PatternOption
import typingsJapgolly.bizcharts.libCreatePlotMod.VisibleText
import typingsJapgolly.bizcharts.libPlotsHeatmapChartMod.HeatmapOptions
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeatmapChart {
  
  inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HeatmapOptions & RefAttributes[Any]]))
  }
  
  @JSImport("bizcharts", "HeatmapChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animation(value: Animation): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def annotations(value: js.Array[Annotation]): this.type = set("annotations", value.asInstanceOf[js.Any])
    
    inline def annotationsVarargs(value: Annotation*): this.type = set("annotations", js.Array(value*))
    
    inline def appendPadding(value: js.Array[Double] | Double): this.type = set("appendPadding", value.asInstanceOf[js.Any])
    
    inline def appendPaddingVarargs(value: Double*): this.type = set("appendPadding", js.Array(value*))
    
    inline def autoFit(value: Boolean): this.type = set("autoFit", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorAttr): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorField(value: String): this.type = set("colorField", value.asInstanceOf[js.Any])
    
    inline def colorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): this.type = set("color", js.Any.fromFunction2(value))
    
    inline def colorVarargs(value: String*): this.type = set("color", js.Array(value*))
    
    inline def coordinate(value: CoordinateOption): this.type = set("coordinate", value.asInstanceOf[js.Any])
    
    inline def defaultInteractions(value: js.Array[String]): this.type = set("defaultInteractions", value.asInstanceOf[js.Any])
    
    inline def defaultInteractionsVarargs(value: String*): this.type = set("defaultInteractions", js.Array(value*))
    
    inline def description(value: Node | VisibleText): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def errorContent(value: VdomNode): this.type = set("errorContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorContentNull: this.type = set("errorContent", null)
    
    inline def errorContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorContent", js.Array(value*))
    
    inline def errorContentVdomElement(value: VdomElement): this.type = set("errorContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def events(value: Record[String, js.Function]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def forceFit(value: Boolean): this.type = set("forceFit", value.asInstanceOf[js.Any])
    
    inline def heatmapStyle(value: StyleAttr): this.type = set("heatmapStyle", value.asInstanceOf[js.Any])
    
    inline def heatmapStyleFunction1(value: /* datum */ Datum => ShapeStyle): this.type = set("heatmapStyle", js.Any.fromFunction1(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def interactions(value: js.Array[typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction]): this.type = set("interactions", value.asInstanceOf[js.Any])
    
    inline def interactionsVarargs(value: typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction*): this.type = set("interactions", js.Array(value*))
    
    inline def isMaterial(value: Boolean): this.type = set("isMaterial", value.asInstanceOf[js.Any])
    
    inline def label(value: typingsJapgolly.antvG2plot.libTypesLabelMod.Label): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def legend(value: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def limitInPlot(value: Boolean): this.type = set("limitInPlot", value.asInstanceOf[js.Any])
    
    inline def localRefresh(value: Boolean): this.type = set("localRefresh", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def meta(value: Record[String, Meta]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    inline def onGetG2Instance(value: /* chart */ Plot[Any] => Callback): this.type = set("onGetG2Instance", js.Any.fromFunction1((t0: /* chart */ Plot[Any]) => value(t0).runNow()))
    
    inline def padding(value: js.Array[Double] | Double | auto): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def pattern(value: PatternAttr): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def patternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): this.type = set("pattern", js.Any.fromFunction2(value))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def reflect(value: x | y): this.type = set("reflect", value.asInstanceOf[js.Any])
    
    inline def renderer(value: svg | canvas): this.type = set("renderer", value.asInstanceOf[js.Any])
    
    inline def scrollbar(value: Scrollbar): this.type = set("scrollbar", value.asInstanceOf[js.Any])
    
    inline def shape(value: String): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def shapeType(value: Any): this.type = set("shapeType", value.asInstanceOf[js.Any])
    
    inline def sizeField(value: String): this.type = set("sizeField", value.asInstanceOf[js.Any])
    
    inline def sizeLegend(value: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend): this.type = set("sizeLegend", value.asInstanceOf[js.Any])
    
    inline def sizeRatio(value: Double): this.type = set("sizeRatio", value.asInstanceOf[js.Any])
    
    inline def slider(value: typingsJapgolly.antvG2plot.libTypesSliderMod.Slider): this.type = set("slider", value.asInstanceOf[js.Any])
    
    inline def state(value: State): this.type = set("state", value.asInstanceOf[js.Any])
    
    inline def supportCSSTransform(value: Boolean): this.type = set("supportCSSTransform", value.asInstanceOf[js.Any])
    
    inline def syncViewPadding(value: Boolean | SyncViewPaddingFn): this.type = set("syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def syncViewPaddingFunction3(
      value: (/* chart */ typingsJapgolly.antvG2.libChartViewMod.View, /* views */ js.Array[typingsJapgolly.antvG2.libChartViewMod.View], /* PC */ PaddingCalCtor) => Callback
    ): this.type = set("syncViewPadding", js.Any.fromFunction3((t0: /* chart */ typingsJapgolly.antvG2.libChartViewMod.View, t1: /* views */ js.Array[typingsJapgolly.antvG2.libChartViewMod.View], t2: /* PC */ PaddingCalCtor) => (value(t0, t1, t2)).runNow()))
    
    inline def theme(value: String | js.Object): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: Node | VisibleText): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltip(value: typingsJapgolly.antvG2plot.libTypesTooltipMod.Tooltip): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def `type`(value: polygon | density): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def useDeferredLabel(value: Boolean | Double): this.type = set("useDeferredLabel", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xAxis(value: typingsJapgolly.antvG2plot.libTypesAxisMod.Axis): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    inline def yAxis(value: typingsJapgolly.antvG2plot.libTypesAxisMod.Axis): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeatmapOptions & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
