package typingsJapgolly.reactChartjs2

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.chartJs.mod.Chart
import typingsJapgolly.chartJs.mod.ChartData
import typingsJapgolly.chartJs.mod.ChartOptions
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.Plugin
import typingsJapgolly.chartJs.mod.UpdateMode
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.react.mod.CanvasHTMLAttributes
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type ChartJSOrUndefined[TType /* <: ChartType */, TData, TLabel] = js.UndefOr[Chart[TType, TData, TLabel]]
  
  trait ChartProps[TType /* <: ChartType */, TData, TLabel]
    extends StObject
       with CanvasHTMLAttributes[HTMLCanvasElement] {
    
    /**
      * The data object that is passed into the Chart.js chart
      * @see https://www.chartjs.org/docs/latest/getting-started/
      */
    var data: ChartData[TType, TData, TLabel]
    
    /**
      * Key name to identificate dataset
      * @default 'label'
      */
    var datasetIdKey: js.UndefOr[String] = js.undefined
    
    /**
      * A fallback for when the canvas cannot be rendered. Can be used for accessible chart descriptions
      * @see https://www.chartjs.org/docs/latest/general/accessibility.html
      * @default null
      * @todo Replace with `children` prop.
      */
    var fallbackContent: js.UndefOr[Node] = js.undefined
    
    /**
      * The options object that is passed into the Chart.js chart
      * @see https://www.chartjs.org/docs/latest/general/options.html
      * @default {}
      */
    var options: js.UndefOr[ChartOptions[TType]] = js.undefined
    
    /**
      * The plugins array that is passed into the Chart.js chart
      * @see https://www.chartjs.org/docs/latest/developers/plugins.html
      * @default []
      */
    var plugins: js.UndefOr[js.Array[Plugin[TType, AnyObject]]] = js.undefined
    
    /**
      * Teardown and redraw chart on every update
      * @default false
      */
    var redraw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Chart.js chart type
      */
    var `type`: TType
    
    /**
      * A mode string to indicate transition configuration should be used.
      * @see https://www.chartjs.org/docs/latest/developers/api.html#update-mode
      */
    var updateMode: js.UndefOr[UpdateMode] = js.undefined
  }
  object ChartProps {
    
    inline def apply[TType /* <: ChartType */, TData, TLabel](data: ChartData[TType, TData, TLabel], `type`: TType): ChartProps[TType, TData, TLabel] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartProps[TType, TData, TLabel]]
    }
    
    extension [Self <: ChartProps[?, ?, ?], TType /* <: ChartType */, TData, TLabel](x: Self & (ChartProps[TType, TData, TLabel])) {
      
      inline def setData(value: ChartData[TType, TData, TLabel]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDatasetIdKey(value: String): Self = StObject.set(x, "datasetIdKey", value.asInstanceOf[js.Any])
      
      inline def setDatasetIdKeyUndefined: Self = StObject.set(x, "datasetIdKey", js.undefined)
      
      inline def setFallbackContent(value: VdomNode): Self = StObject.set(x, "fallbackContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFallbackContentNull: Self = StObject.set(x, "fallbackContent", null)
      
      inline def setFallbackContentUndefined: Self = StObject.set(x, "fallbackContent", js.undefined)
      
      inline def setFallbackContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallbackContent", js.Array(value*))
      
      inline def setFallbackContentVdomElement(value: VdomElement): Self = StObject.set(x, "fallbackContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOptions(value: ChartOptions[TType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[TType, AnyObject]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin[TType, AnyObject])*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRedraw(value: Boolean): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
      
      inline def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdateMode(value: UpdateMode): Self = StObject.set(x, "updateMode", value.asInstanceOf[js.Any])
      
      inline def setUpdateModeUndefined: Self = StObject.set(x, "updateMode", js.undefined)
    }
  }
  
  type ForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TOmitType extends true ? <TData = chart.js.chart.js.DefaultDataPoint<TDefaultType>, TLabel = unknown>(props : std.Omit<react-chartjs-2.react-chartjs-2/dist/types.ChartProps<TDefaultType, TData, TLabel>, 'type'> & {  ref :react-chartjs-2.react-chartjs-2/dist/types.ForwardedRef<react-chartjs-2.react-chartjs-2/dist/types.ChartJSOrUndefined<TDefaultType, TData, TLabel>> | undefined}): react.react.<global>.JSX.Element : <TType extends chart.js.chart.js.ChartType = chart.js.chart.js.ChartType, TData = chart.js.chart.js.DefaultDataPoint<TType>, TLabel = unknown>(props : react-chartjs-2.react-chartjs-2/dist/types.ChartProps<TType, TData, TLabel> & {  ref :react-chartjs-2.react-chartjs-2/dist/types.ForwardedRef<react-chartjs-2.react-chartjs-2/dist/types.ChartJSOrUndefined<TType, TData, TLabel>> | undefined}): react.react.<global>.JSX.Element
    }}}
    */
  @js.native
  trait TypedChartComponent[TDefaultType /* <: ChartType */, TOmitType] extends StObject
}
