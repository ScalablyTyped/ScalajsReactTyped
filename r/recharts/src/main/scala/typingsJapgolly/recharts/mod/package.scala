package typingsJapgolly.recharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AreaChartProps = typingsJapgolly.recharts.mod.CategoricalChartWrapper[typingsJapgolly.recharts.mod.LayoutType] with typingsJapgolly.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typingsJapgolly.recharts.mod.ContentRenderer[js.Any]
    - typingsJapgolly.recharts.rechartsStrings.auto
    - typingsJapgolly.recharts.rechartsStrings.dataMin
    - typingsJapgolly.recharts.rechartsStrings.dataMax
  */
  type AxisDomain = typingsJapgolly.recharts.mod._AxisDomain | typingsJapgolly.recharts.mod.ContentRenderer[js.Any] | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.recharts.rechartsStrings.preserveStart
    - typingsJapgolly.recharts.rechartsStrings.preserveEnd
    - typingsJapgolly.recharts.rechartsStrings.preserveStartEnd
  */
  type AxisInterval = typingsJapgolly.recharts.mod._AxisInterval | scala.Double
  type BBoxUpdateCallback = js.Function1[/* box */ typingsJapgolly.recharts.AnonWidth, scala.Unit]
  type BarChartProps = typingsJapgolly.recharts.mod.CategoricalChartWrapper[typingsJapgolly.recharts.mod.LayoutType] with typingsJapgolly.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.recharts.rechartsStrings.auto
    - typingsJapgolly.recharts.rechartsStrings.dataMin
    - typingsJapgolly.recharts.rechartsStrings.dataMax
  */
  type BaseValueType = typingsJapgolly.recharts.mod._BaseValueType | scala.Double
  type ComposedChartProps = typingsJapgolly.recharts.mod.CategoricalChartWrapper[typingsJapgolly.recharts.mod.LayoutType] with typingsJapgolly.recharts.mod.EventAttributes
  type ContentRenderer[P] = js.Function1[/* props */ P, japgolly.scalajs.react.raw.React.Node]
  type CoordinatesGenerator = js.Function1[/* arg */ typingsJapgolly.recharts.AnonHeight, js.Array[scala.Double]]
  type DataKey = java.lang.String | scala.Double | (js.Function1[
    /* dataObject */ js.Any, 
    java.lang.String | scala.Double | (js.Tuple2[scala.Double, scala.Double]) | scala.Null
  ])
  type DataPointFormatter = js.Function2[
    /* entry */ js.Any, 
    /* dataKey */ typingsJapgolly.recharts.mod.DataKey, 
    typingsJapgolly.recharts.AnonErrorVal
  ]
  type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, japgolly.scalajs.react.raw.React.Node]
  type LegendValueFormatter = js.Function3[
    /* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], 
    /* entry */ js.UndefOr[typingsJapgolly.recharts.mod.LegendPayload], 
    /* i */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type LineChartProps = typingsJapgolly.recharts.mod.CategoricalChartWrapper[typingsJapgolly.recharts.mod.LayoutType] with typingsJapgolly.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.recharts.rechartsStrings.basis
    - typingsJapgolly.recharts.rechartsStrings.basisClosed
    - typingsJapgolly.recharts.rechartsStrings.basisOpen
    - typingsJapgolly.recharts.rechartsStrings.linear
    - typingsJapgolly.recharts.rechartsStrings.linearClosed
    - typingsJapgolly.recharts.rechartsStrings.natural
    - typingsJapgolly.recharts.rechartsStrings.monotoneX
    - typingsJapgolly.recharts.rechartsStrings.monotoneY
    - typingsJapgolly.recharts.rechartsStrings.monotone
    - typingsJapgolly.recharts.rechartsStrings.step
    - typingsJapgolly.recharts.rechartsStrings.stepBefore
    - typingsJapgolly.recharts.rechartsStrings.stepAfter
    - typingsJapgolly.d3Shape.mod.CurveFactory
  */
  type LineType = typingsJapgolly.recharts.mod._LineType | typingsJapgolly.d3Shape.mod.CurveFactory
  type Percentage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.recharts.rechartsStrings.auto
    - typingsJapgolly.recharts.rechartsStrings.dataMin
    - typingsJapgolly.recharts.rechartsStrings.dataMax
  */
  type PolarRadiusAxisDomain = typingsJapgolly.recharts.mod._PolarRadiusAxisDomain | scala.Double
  type RechartsFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ScaleCalculator = js.Function1[/* x */ scala.Double | java.lang.String, scala.Double]
  type ScatterChartProps = typingsJapgolly.recharts.mod.CategoricalChartWrapper[typingsJapgolly.recharts.mod.LayoutType] with typingsJapgolly.recharts.mod.EventAttributes
  type TickFormatterFunction = js.Function1[/* value */ js.Any, js.Any]
  type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[js.Any]]
  type TooltipFormatter = js.Function4[
    /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), 
    /* name */ java.lang.String, 
    /* entry */ typingsJapgolly.recharts.mod.TooltipPayload, 
    /* index */ scala.Double, 
    japgolly.scalajs.react.raw.React.Node
  ]
}
