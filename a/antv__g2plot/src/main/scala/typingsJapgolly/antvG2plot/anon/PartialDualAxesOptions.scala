package typingsJapgolly.antvG2plot.anon

import org.scalajs.dom.CanvasPattern
import typingsJapgolly.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.antvG2.libInterfaceMod.SyncViewPaddingFn
import typingsJapgolly.antvG2plot.antvG2plotStrings.auto
import typingsJapgolly.antvG2plot.antvG2plotStrings.canvas
import typingsJapgolly.antvG2plot.antvG2plotStrings.svg
import typingsJapgolly.antvG2plot.libTypesAnimationMod.Animation
import typingsJapgolly.antvG2plot.libTypesAnnotationMod.Annotation
import typingsJapgolly.antvG2plot.libTypesAttrMod.PatternAttr
import typingsJapgolly.antvG2plot.libTypesAxisMod.Axis
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.antvG2plot.libTypesInteractionMod.Interaction
import typingsJapgolly.antvG2plot.libTypesMetaMod.Meta
import typingsJapgolly.antvG2plot.libTypesScrollbarMod.Scrollbar
import typingsJapgolly.antvG2plot.libTypesSliderMod.Slider
import typingsJapgolly.antvG2plot.libTypesTooltipMod.Tooltip
import typingsJapgolly.antvG2plot.libUtilsPatternMod.PatternOption
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.DualAxesOptions> */
trait PartialDualAxesOptions extends StObject {
  
  var animation: js.UndefOr[Animation] = js.undefined
  
  var annotations: js.UndefOr[
    js.Array[js.UndefOr[js.Array[Annotation]]] | (Record[String, js.UndefOr[js.Array[Annotation]]])
  ] = js.undefined
  
  var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var autoFit: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Array[Record[String, Any]]]] = js.undefined
  
  var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
  
  var geometryOptions: js.UndefOr[js.Array[typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
  
  var label: js.UndefOr[typingsJapgolly.antvG2plot.libTypesLabelMod.Label] = js.undefined
  
  var legend: js.UndefOr[typingsJapgolly.antvG2plot.libTypesLegendMod.Legend] = js.undefined
  
  var limitInPlot: js.UndefOr[Boolean] = js.undefined
  
  var localRefresh: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Record[String, Meta]] = js.undefined
  
  var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
  
  var pattern: js.UndefOr[PatternAttr] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var renderer: js.UndefOr[svg | canvas] = js.undefined
  
  var scrollbar: js.UndefOr[Scrollbar] = js.undefined
  
  var slider: js.UndefOr[Slider] = js.undefined
  
  var state: js.UndefOr[typingsJapgolly.antvG2plot.libTypesStateMod.State] = js.undefined
  
  var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
  
  var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
  
  var theme: js.UndefOr[String | js.Object] = js.undefined
  
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  
  var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xAxis: js.UndefOr[Axis] = js.undefined
  
  var xField: js.UndefOr[String] = js.undefined
  
  var yAxis: js.UndefOr[js.Array[js.UndefOr[Axis]] | (Record[String, js.UndefOr[Axis]])] = js.undefined
  
  var yField: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialDualAxesOptions {
  
  inline def apply(): PartialDualAxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDualAxesOptions]
  }
  
  extension [Self <: PartialDualAxesOptions](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnnotations(
      value: js.Array[js.UndefOr[js.Array[Annotation]]] | (Record[String, js.UndefOr[js.Array[Annotation]]])
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: js.UndefOr[js.Array[Annotation]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
    
    inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
    
    inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
    
    inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
    
    inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
    
    inline def setData(value: js.Array[js.Array[Record[String, Any]]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: (js.Array[Record[String, Any]])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
    
    inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
    
    inline def setGeometryOptions(value: js.Array[typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption]): Self = StObject.set(x, "geometryOptions", value.asInstanceOf[js.Any])
    
    inline def setGeometryOptionsUndefined: Self = StObject.set(x, "geometryOptions", js.undefined)
    
    inline def setGeometryOptionsVarargs(value: typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption*): Self = StObject.set(x, "geometryOptions", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
    
    inline def setLabel(value: typingsJapgolly.antvG2plot.libTypesLabelMod.Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLegend(value: typingsJapgolly.antvG2plot.libTypesLegendMod.Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
    
    inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
    
    inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
    
    inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
    
    inline def setState(value: typingsJapgolly.antvG2plot.libTypesStateMod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
    
    inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
    
    inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPaddingFunction3(
      value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3((t0: /* chart */ View, t1: /* views */ js.Array[View], t2: /* PC */ PaddingCalCtor) => (value(t0, t1, t2)).runNow()))
    
    inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
    
    inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
    
    inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXAxis(value: Axis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    
    inline def setYAxis(value: js.Array[js.UndefOr[Axis]] | (Record[String, js.UndefOr[Axis]])): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setYAxisVarargs(value: js.UndefOr[Axis]*): Self = StObject.set(x, "yAxis", js.Array(value*))
    
    inline def setYField(value: js.Array[String]): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    
    inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    
    inline def setYFieldVarargs(value: String*): Self = StObject.set(x, "yField", js.Array(value*))
  }
}
