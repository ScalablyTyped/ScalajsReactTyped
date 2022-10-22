package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.d3Shape.mod.CurveFactory
import typingsJapgolly.recharts.anon.ErrorVal
import typingsJapgolly.recharts.anon.Height
import typingsJapgolly.recharts.anon.Offset
import typingsJapgolly.recharts.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsJapgolly.recharts.mod.ContentRenderer[scala.Any]
  - typingsJapgolly.recharts.rechartsStrings.auto
  - typingsJapgolly.recharts.rechartsStrings.dataMin
  - typingsJapgolly.recharts.rechartsStrings.dataMax
*/
type AxisDomain = _AxisDomain | ContentRenderer[Any] | String | Double

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsJapgolly.recharts.rechartsStrings.preserveStart
  - typingsJapgolly.recharts.rechartsStrings.preserveEnd
  - typingsJapgolly.recharts.rechartsStrings.preserveStartEnd
*/
type AxisInterval = _AxisInterval | Double

type BBoxUpdateCallback = js.Function1[/* box */ Height, Unit]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsJapgolly.recharts.rechartsStrings.auto
  - typingsJapgolly.recharts.rechartsStrings.dataMin
  - typingsJapgolly.recharts.rechartsStrings.dataMax
*/
type BaseValueType = _BaseValueType | Double

type ContentRenderer[P] = js.Function1[/* props */ P, Node]

type DataKey = String | Double | (js.Function1[/* dataObject */ Any, String | Double | (js.Tuple2[Double, Double]) | Null])

type DataPointFormatter = js.Function2[/* entry */ Any, /* dataKey */ DataKey, ErrorVal]

type HorizontalCoordinatesGenerator = js.Function1[/* arg */ Offset, js.Array[Double]]

type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, Double]

type LabelFormatter = js.Function1[/* label */ String | Double, Node]

type LegendValueFormatter = js.Function3[
/* value */ js.UndefOr[
  /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
], 
/* entry */ js.UndefOr[LegendPayload], 
/* i */ js.UndefOr[Double], 
Any]

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
type LineType = _LineType | CurveFactory

type Percentage = String

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsJapgolly.recharts.rechartsStrings.auto
  - typingsJapgolly.recharts.rechartsStrings.dataMin
  - typingsJapgolly.recharts.rechartsStrings.dataMax
*/
type PolarRadiusAxisDomain = _PolarRadiusAxisDomain | Double

type ScaleCalculator = js.Function1[/* x */ Double | String, Double]

type TickFormatterFunction = js.Function1[/* value */ Any, Any]

type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[Any]]

type TooltipFormatter = js.Function4[
/* value */ String | Double | (js.Array[String | Double]), 
/* name */ String, 
/* entry */ TooltipPayload, 
/* index */ Double, 
Node]

type VerticalCoordinatesGenerator = js.Function1[/* arg */ Width, js.Array[Double]]
