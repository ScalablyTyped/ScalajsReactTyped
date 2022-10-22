package typingsJapgolly.reactChartjs2

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.chartJs.mod.Chart
import typingsJapgolly.chartJs.mod.ChartData
import typingsJapgolly.chartJs.mod.ChartDataset
import typingsJapgolly.chartJs.mod.ChartOptions
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.DefaultDataPoint
import typingsJapgolly.chartJs.mod.InteractionItem
import typingsJapgolly.reactChartjs2.distTypesMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("react-chartjs-2/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneData[TType /* <: ChartType */, TData, TLabel](data: ChartData[TType, TData, TLabel]): ChartData[TType, TData, TLabel] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneData")(data.asInstanceOf[js.Any]).asInstanceOf[ChartData[TType, TData, TLabel]]
  inline def cloneData[TType /* <: ChartType */, TData, TLabel](data: ChartData[TType, TData, TLabel], datasetIdKey: String): ChartData[TType, TData, TLabel] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneData")(data.asInstanceOf[js.Any], datasetIdKey.asInstanceOf[js.Any])).asInstanceOf[ChartData[TType, TData, TLabel]]
  
  inline def getDatasetAtEvent(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    event: ReactMouseEventFrom[HTMLCanvasElement]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatasetAtEvent")(chart.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  inline def getElementAtEvent(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    event: ReactMouseEventFrom[HTMLCanvasElement]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementAtEvent")(chart.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  inline def getElementsAtEvent(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    event: ReactMouseEventFrom[HTMLCanvasElement]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsAtEvent")(chart.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  inline def reforwardRef[T](ref: ForwardedRef[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reforwardRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDatasets[TType /* <: ChartType */, TData, TLabel](currentData: ChartData[TType, TData, TLabel], nextDatasets: js.Array[ChartDataset[TType, TData]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDatasets")(currentData.asInstanceOf[js.Any], nextDatasets.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setDatasets[TType /* <: ChartType */, TData, TLabel](
    currentData: ChartData[TType, TData, TLabel],
    nextDatasets: js.Array[ChartDataset[TType, TData]],
    datasetIdKey: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDatasets")(currentData.asInstanceOf[js.Any], nextDatasets.asInstanceOf[js.Any], datasetIdKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLabels[TType /* <: ChartType */, TData, TLabel](currentData: ChartData[TType, TData, TLabel]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLabels")(currentData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setLabels[TType /* <: ChartType */, TData, TLabel](currentData: ChartData[TType, TData, TLabel], nextLabels: js.Array[TLabel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLabels")(currentData.asInstanceOf[js.Any], nextLabels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOptions[TType /* <: ChartType */, TData, TLabel](chart: Chart[TType, TData, TLabel], nextOptions: ChartOptions[TType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(chart.asInstanceOf[js.Any], nextOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
