package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typingsJapgolly.antvG2.libInterfaceMod.SyncViewPaddingFn
import typingsJapgolly.antvG2plot.anon.PartialTagxnumberynumber
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsWordCloudTypesMod.Word
import typingsJapgolly.antvG2plot.libTypesAnimationMod.Animation
import typingsJapgolly.antvG2plot.libTypesAnnotationMod.Annotation
import typingsJapgolly.antvG2plot.libTypesAttrMod.ColorAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.PatternAttr
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.antvG2plot.libTypesMetaMod.Meta
import typingsJapgolly.antvG2plot.libTypesScrollbarMod.Scrollbar
import typingsJapgolly.antvG2plot.libTypesStateMod.State
import typingsJapgolly.antvG2plot.libUtilsPatternMod.PatternOption
import typingsJapgolly.bizcharts.anon.OnWordCloudClick
import typingsJapgolly.bizcharts.bizchartsStrings.archimedean
import typingsJapgolly.bizcharts.bizchartsStrings.auto
import typingsJapgolly.bizcharts.bizchartsStrings.canvas
import typingsJapgolly.bizcharts.bizchartsStrings.rectangular
import typingsJapgolly.bizcharts.bizchartsStrings.svg
import typingsJapgolly.bizcharts.libCreatePlotMod.VisibleText
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.TooltipAPIOptions
import typingsJapgolly.bizcharts.libPlotsWordCloudChartMod.WordCloudCfg
import typingsJapgolly.bizcharts.libPlotsWordCloudChartMod.WordStylePolyfill
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WordCloudChart {
  
  @JSImport("bizcharts", "WordCloudChart")
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
    
    inline def data(value: js.Array[Record[String, Any]]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: (Record[String, Any])*): this.type = set("data", js.Array(value*))
    
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
    
    inline def events(value: OnWordCloudClick): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def forceFit(value: Boolean): this.type = set("forceFit", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def imageMask(value: HTMLImageElement | String): this.type = set("imageMask", value.asInstanceOf[js.Any])
    
    inline def interactions(value: js.Array[typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction]): this.type = set("interactions", value.asInstanceOf[js.Any])
    
    inline def interactionsVarargs(value: typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction*): this.type = set("interactions", js.Array(value*))
    
    inline def isMaterial(value: Boolean): this.type = set("isMaterial", value.asInstanceOf[js.Any])
    
    inline def label(value: typingsJapgolly.antvG2plot.libTypesLabelMod.Label): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def legend(value: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def limitInPlot(value: Boolean): this.type = set("limitInPlot", value.asInstanceOf[js.Any])
    
    inline def localRefresh(value: Boolean): this.type = set("localRefresh", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maskImage(value: String): this.type = set("maskImage", value.asInstanceOf[js.Any])
    
    inline def meta(value: Record[String, Meta]): this.type = set("meta", value.asInstanceOf[js.Any])
    
    inline def onGetG2Instance(value: /* chart */ Plot[Any] => Callback): this.type = set("onGetG2Instance", js.Any.fromFunction1((t0: /* chart */ Plot[Any]) => value(t0).runNow()))
    
    inline def padding(value: js.Array[Double] | Double | auto): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def pattern(value: PatternAttr): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def patternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): this.type = set("pattern", js.Any.fromFunction2(value))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def placementStrategy(
      value: (/* word */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => PartialTagxnumberynumber
    ): this.type = set("placementStrategy", js.Any.fromFunction3(value))
    
    inline def random(value: Double | js.Function0[Double]): this.type = set("random", value.asInstanceOf[js.Any])
    
    inline def randomCallbackTo(value: CallbackTo[Double]): this.type = set("random", value.toJsFn)
    
    inline def renderer(value: svg | canvas): this.type = set("renderer", value.asInstanceOf[js.Any])
    
    inline def scrollbar(value: Scrollbar): this.type = set("scrollbar", value.asInstanceOf[js.Any])
    
    inline def selected(value: Double): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def shuffle(value: Boolean): this.type = set("shuffle", value.asInstanceOf[js.Any])
    
    inline def slider(value: typingsJapgolly.antvG2plot.libTypesSliderMod.Slider): this.type = set("slider", value.asInstanceOf[js.Any])
    
    inline def spiral(value: archimedean | rectangular): this.type = set("spiral", value.asInstanceOf[js.Any])
    
    inline def state(value: State): this.type = set("state", value.asInstanceOf[js.Any])
    
    inline def supportCSSTransform(value: Boolean): this.type = set("supportCSSTransform", value.asInstanceOf[js.Any])
    
    inline def syncViewPadding(value: Boolean | SyncViewPaddingFn): this.type = set("syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def syncViewPaddingFunction3(
      value: (/* chart */ typingsJapgolly.antvG2.libChartViewMod.View, /* views */ js.Array[typingsJapgolly.antvG2.libChartViewMod.View], /* PC */ PaddingCalCtor) => Callback
    ): this.type = set("syncViewPadding", js.Any.fromFunction3((t0: /* chart */ typingsJapgolly.antvG2.libChartViewMod.View, t1: /* views */ js.Array[typingsJapgolly.antvG2.libChartViewMod.View], t2: /* PC */ PaddingCalCtor) => (value(t0, t1, t2)).runNow()))
    
    inline def theme(value: String | js.Object): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def timeInterval(value: Double): this.type = set("timeInterval", value.asInstanceOf[js.Any])
    
    inline def title(value: Node | VisibleText): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltip(value: TooltipAPIOptions): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def useDeferredLabel(value: Boolean | Double): this.type = set("useDeferredLabel", value.asInstanceOf[js.Any])
    
    inline def weightField(value: String): this.type = set("weightField", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wordField(value: String): this.type = set("wordField", value.asInstanceOf[js.Any])
    
    inline def wordStyle(value: WordStylePolyfill): this.type = set("wordStyle", value.asInstanceOf[js.Any])
    
    inline def xAxis(value: typingsJapgolly.antvG2plot.libTypesAxisMod.Axis): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    inline def yAxis(value: typingsJapgolly.antvG2plot.libTypesAxisMod.Axis): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: WordCloudChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WordCloudCfg & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
