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
import typingsJapgolly.antvG2.libInterfaceMod.SyncViewPaddingFn
import typingsJapgolly.antvG2plot.antvG2plotBooleans.`false`
import typingsJapgolly.antvG2plot.antvG2plotStrings.auto
import typingsJapgolly.antvG2plot.antvG2plotStrings.canvas
import typingsJapgolly.antvG2plot.antvG2plotStrings.horizontal
import typingsJapgolly.antvG2plot.antvG2plotStrings.svg
import typingsJapgolly.antvG2plot.antvG2plotStrings.vertical
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsBulletTypesMod.BulletAttr
import typingsJapgolly.antvG2plot.libPlotsBulletTypesMod.GeometryLabelAttr
import typingsJapgolly.antvG2plot.libTypesAnimationMod.Animation
import typingsJapgolly.antvG2plot.libTypesAnnotationMod.Annotation
import typingsJapgolly.antvG2plot.libTypesAttrMod.ColorAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.PatternAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.SizeAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.StyleAttr
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.antvG2plot.libTypesMetaMod.Meta
import typingsJapgolly.antvG2plot.libTypesScrollbarMod.Scrollbar
import typingsJapgolly.antvG2plot.libTypesStateMod.State
import typingsJapgolly.antvG2plot.libUtilsPatternMod.PatternOption
import typingsJapgolly.bizcharts.libCreatePlotMod.VisibleText
import typingsJapgolly.bizcharts.libPlotsBulletChartMod.BulletOptions
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletChart {
  
  inline def apply(data: js.Array[Record[String, Any]], measureField: String, rangeField: String, targetField: String): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], measureField = measureField.asInstanceOf[js.Any], rangeField = rangeField.asInstanceOf[js.Any], targetField = targetField.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BulletOptions & RefAttributes[Any]]))
  }
  
  @JSImport("bizcharts", "BulletChart")
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
    
    inline def bulletStyle(value: BulletAttr[StyleAttr]): this.type = set("bulletStyle", value.asInstanceOf[js.Any])
    
    inline def color(value: BulletAttr[ColorAttr]): this.type = set("color", value.asInstanceOf[js.Any])
    
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
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def interactions(value: js.Array[typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction]): this.type = set("interactions", value.asInstanceOf[js.Any])
    
    inline def interactionsVarargs(value: typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction*): this.type = set("interactions", js.Array(value*))
    
    inline def isMaterial(value: Boolean): this.type = set("isMaterial", value.asInstanceOf[js.Any])
    
    inline def label(value: BulletAttr[GeometryLabelAttr | `false`]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def legend(value: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def limitInPlot(value: Boolean): this.type = set("limitInPlot", value.asInstanceOf[js.Any])
    
    inline def localRefresh(value: Boolean): this.type = set("localRefresh", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def markerColors(value: Any): this.type = set("markerColors", value.asInstanceOf[js.Any])
    
    inline def markerSize(value: Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])): this.type = set("markerSize", value.asInstanceOf[js.Any])
    
    inline def markerSizeFunction1(value: /* datum */ Any => Double): this.type = set("markerSize", js.Any.fromFunction1(value))
    
    inline def markerStyle(value: Any): this.type = set("markerStyle", value.asInstanceOf[js.Any])
    
    inline def measureColors(value: Any): this.type = set("measureColors", value.asInstanceOf[js.Any])
    
    inline def measureSize(value: Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])): this.type = set("measureSize", value.asInstanceOf[js.Any])
    
    inline def measureSizeFunction1(value: /* datum */ Any => Double): this.type = set("measureSize", js.Any.fromFunction1(value))
    
    inline def meta(value: Record[String, Meta]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    inline def onGetG2Instance(value: /* chart */ Plot[Any] => Callback): this.type = set("onGetG2Instance", js.Any.fromFunction1((t0: /* chart */ Plot[Any]) => value(t0).runNow()))
    
    inline def padding(value: js.Array[Double] | Double | auto): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def pattern(value: PatternAttr): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def patternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): this.type = set("pattern", js.Any.fromFunction2(value))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def rangeColors(value: Any): this.type = set("rangeColors", value.asInstanceOf[js.Any])
    
    inline def rangeMax(value: Double): this.type = set("rangeMax", value.asInstanceOf[js.Any])
    
    inline def rangeSize(value: Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])): this.type = set("rangeSize", value.asInstanceOf[js.Any])
    
    inline def rangeSizeFunction1(value: /* datum */ Any => Double): this.type = set("rangeSize", js.Any.fromFunction1(value))
    
    inline def renderer(value: svg | canvas): this.type = set("renderer", value.asInstanceOf[js.Any])
    
    inline def scrollbar(value: Scrollbar): this.type = set("scrollbar", value.asInstanceOf[js.Any])
    
    inline def size(value: BulletAttr[SizeAttr]): this.type = set("size", value.asInstanceOf[js.Any])
    
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
    
    inline def useDeferredLabel(value: Boolean | Double): this.type = set("useDeferredLabel", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xAxis(value: typingsJapgolly.antvG2plot.libTypesAxisMod.Axis): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    inline def xField(value: String): this.type = set("xField", value.asInstanceOf[js.Any])
    
    inline def yAxis(value: typingsJapgolly.antvG2plot.libTypesAxisMod.Axis): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BulletOptions & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
