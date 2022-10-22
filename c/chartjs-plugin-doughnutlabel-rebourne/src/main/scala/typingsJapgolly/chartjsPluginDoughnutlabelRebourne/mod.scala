package typingsJapgolly.chartjsPluginDoughnutlabelRebourne

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import typingsJapgolly.chartJs.mod.Chart
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.DefaultDataPoint
import typingsJapgolly.chartJs.mod.Plugin
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterBuildTicks
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDataLimits
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetsDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDatasetsUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDestroy
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterEvent
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterInit
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterLayout
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterRender
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterTooltipDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.afterUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeBuildTicks
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDataLimits
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetsDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDatasetsUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDestroy
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeElementsUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeEvent
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeInit
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeLayout
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeRender
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeTooltipDraw
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.beforeUpdate
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.destroy
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.doughnut
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.id
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.inherit
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.initial
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.install
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.italic
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.normal
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.oblique
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.reset
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.resize
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.start
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.stop
import typingsJapgolly.chartjsPluginDoughnutlabelRebourne.chartjsPluginDoughnutlabelRebourneStrings.uninstall
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chartjs-plugin-doughnutlabel-rebourne", JSImport.Namespace)
  @js.native
  val ^ : Plugin[doughnut, AnyObject] = js.native
  
  trait Font extends StObject {
    
    /** Defaults to `Chart.defaults.global.defaultFontFamily` */
    var family: js.UndefOr[String] = js.undefined
    
    /** Defaults to 1.2 */
    var lineHeight: js.UndefOr[Double | (/* template literal string: ${number} */ String)] = js.undefined
    
    /** Defaults to `Chart.defaults.global.defaultFontSize` */
    var size: js.UndefOr[Double | (/* template literal string: ${number} */ String)] = js.undefined
    
    /** Defaults to `Chart.defaults.global.defaultFontStyle` */
    var style: js.UndefOr[normal | italic | oblique | initial | inherit] = js.undefined
    
    /** Defaults to `'normal'` */
    var weight: js.UndefOr[String] = js.undefined
  }
  object Font {
    
    inline def apply(): Font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setLineHeight(value: Double | (/* template literal string: ${number} */ String)): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setSize(value: Double | (/* template literal string: ${number} */ String)): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: normal | italic | oblique | initial | inherit): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    /** Color of the labels (single label scope) */
    var color: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
    
    /** Show the label or not (single label scope) */
    var display: js.UndefOr[Boolean] = js.undefined
    
    /** The font options used to draw the label text (single label scope) */
    var font: js.UndefOr[Font] = js.undefined
    
    /** The text to display */
    var text: String | Double | (js.Function1[/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], String | Double])
  }
  object Label {
    
    inline def apply(
      text: String | Double | (js.Function1[/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], String | Double])
    ): Label = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setColor(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setText(
        value: String | Double | (js.Function1[/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], String | Double])
      ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextFunction1(value: /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any] => String | Double): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /** Which plugin core api to use to draw labels */
    var api: js.UndefOr[
        Exclude[
          /* keyof chart.js.chart.js.Plugin<chart.js.chart.js.ChartType, chart.js.chart.js/types/basic.AnyObject> */ id | install | start | stop | beforeInit | afterInit | beforeUpdate | afterUpdate | beforeElementsUpdate | reset | beforeDatasetsUpdate | afterDatasetsUpdate | beforeDatasetUpdate | afterDatasetUpdate | beforeLayout | beforeDataLimits | afterDataLimits | beforeBuildTicks | afterBuildTicks | afterLayout | beforeRender | afterRender | beforeDraw | afterDraw | beforeDatasetsDraw | afterDatasetsDraw | beforeDatasetDraw | afterDatasetDraw | beforeEvent | afterEvent | resize | beforeDestroy | destroy | afterDestroy | uninstall | beforeTooltipDraw | afterTooltipDraw, 
          id
        ]
      ] = js.undefined
    
    /** Color of the labels (plugin scope) */
    var color: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
    
    /** Show labels or not (plugin scope) */
    var display: js.UndefOr[Boolean] = js.undefined
    
    /** The font options used to draw the label text (plugin scope) */
    var font: js.UndefOr[Font] = js.undefined
    
    var labels: js.UndefOr[js.Array[Label]] = js.undefined
    
    /** How much padding to add when scaling very large text (value in percentage of 100) */
    var paddingPercentage: js.UndefOr[Double | (/* template literal string: ${number} */ String)] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApi(
        value: Exclude[
              /* keyof chart.js.chart.js.Plugin<chart.js.chart.js.ChartType, chart.js.chart.js/types/basic.AnyObject> */ id | install | start | stop | beforeInit | afterInit | beforeUpdate | afterUpdate | beforeElementsUpdate | reset | beforeDatasetsUpdate | afterDatasetsUpdate | beforeDatasetUpdate | afterDatasetUpdate | beforeLayout | beforeDataLimits | afterDataLimits | beforeBuildTicks | afterBuildTicks | afterLayout | beforeRender | afterRender | beforeDraw | afterDraw | beforeDatasetsDraw | afterDatasetsDraw | beforeDatasetDraw | afterDatasetDraw | beforeEvent | afterEvent | resize | beforeDestroy | destroy | afterDestroy | uninstall | beforeTooltipDraw | afterTooltipDraw, 
              id
            ]
      ): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setColor(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setPaddingPercentage(value: Double | (/* template literal string: ${number} */ String)): Self = StObject.set(x, "paddingPercentage", value.asInstanceOf[js.Any])
      
      inline def setPaddingPercentageUndefined: Self = StObject.set(x, "paddingPercentage", js.undefined)
    }
  }
  
  type _To = Plugin[doughnut, AnyObject]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[doughnut, AnyObject] = ^
  
  /* augmented module */
  object chartJsAugmentingMod {
    
    trait PluginOptionsByType[TType /* <: ChartType */] extends StObject {
      
      var doughnutlabel: js.UndefOr[Options] = js.undefined
    }
    object PluginOptionsByType {
      
      inline def apply[TType /* <: ChartType */](): PluginOptionsByType[TType] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PluginOptionsByType[TType]]
      }
      
      extension [Self <: PluginOptionsByType[?], TType /* <: ChartType */](x: Self & PluginOptionsByType[TType]) {
        
        inline def setDoughnutlabel(value: Options): Self = StObject.set(x, "doughnutlabel", value.asInstanceOf[js.Any])
        
        inline def setDoughnutlabelUndefined: Self = StObject.set(x, "doughnutlabel", js.undefined)
      }
    }
  }
}
