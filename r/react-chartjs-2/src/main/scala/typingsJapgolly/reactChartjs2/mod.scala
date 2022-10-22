package typingsJapgolly.reactChartjs2

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.chartJs.mod.Chart
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.DefaultDataPoint
import typingsJapgolly.chartJs.mod.InteractionItem
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactChartjs2.anon.Ref
import typingsJapgolly.reactChartjs2.anon.`0`
import typingsJapgolly.reactChartjs2.anon.`10`
import typingsJapgolly.reactChartjs2.anon.`11`
import typingsJapgolly.reactChartjs2.anon.`12`
import typingsJapgolly.reactChartjs2.anon.`13`
import typingsJapgolly.reactChartjs2.anon.`14`
import typingsJapgolly.reactChartjs2.anon.`1`
import typingsJapgolly.reactChartjs2.anon.`2`
import typingsJapgolly.reactChartjs2.anon.`3`
import typingsJapgolly.reactChartjs2.anon.`4`
import typingsJapgolly.reactChartjs2.anon.`5`
import typingsJapgolly.reactChartjs2.anon.`6`
import typingsJapgolly.reactChartjs2.anon.`7`
import typingsJapgolly.reactChartjs2.anon.`8`
import typingsJapgolly.reactChartjs2.anon.`9`
import typingsJapgolly.reactChartjs2.distTypesMod.ChartProps
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.`type`
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.bar
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.bubble
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.doughnut
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.line
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.pie
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.polarArea
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.radar
import typingsJapgolly.reactChartjs2.reactChartjs2Strings.scatter
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-chartjs-2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bar[TData, TLabel](props: (Omit[ChartProps[bar, TData, TLabel], `type`]) & (`7`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Bubble[TData, TLabel](props: (Omit[ChartProps[bubble, TData, TLabel], `type`]) & (`8`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bubble")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_bar[TData, TLabel](props: (ChartProps[bar, TData, TLabel]) & (Ref[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_bubble[TData, TLabel](props: (ChartProps[bubble, TData, TLabel]) & (`2`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_doughnut[TData, TLabel](props: (ChartProps[doughnut, TData, TLabel]) & (`4`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_line[TData, TLabel](props: (ChartProps[line, TData, TLabel]) & (`0`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_pie[TData, TLabel](props: (ChartProps[pie, TData, TLabel]) & (`3`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_polarArea[TData, TLabel](props: (ChartProps[polarArea, TData, TLabel]) & (`5`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_radar[TData, TLabel](props: (ChartProps[radar, TData, TLabel]) & (`6`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Chart_scatter[TData, TLabel](props: (ChartProps[scatter, TData, TLabel]) & (`1`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chart")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Doughnut[TData, TLabel](props: (Omit[ChartProps[doughnut, TData, TLabel], `type`]) & (`9`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Doughnut")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Line[TData, TLabel](props: (Omit[ChartProps[line, TData, TLabel], `type`]) & (`10`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Line")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Pie[TData, TLabel](props: (Omit[ChartProps[pie, TData, TLabel], `type`]) & (`11`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pie")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PolarArea[TData, TLabel](props: (Omit[ChartProps[polarArea, TData, TLabel], `type`]) & (`12`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PolarArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Radar[TData, TLabel](props: (Omit[ChartProps[radar, TData, TLabel], `type`]) & (`13`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Radar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Scatter[TData, TLabel](props: (Omit[ChartProps[scatter, TData, TLabel], `type`]) & (`14`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Scatter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
}
