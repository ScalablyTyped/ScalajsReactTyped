package typingsJapgolly.reactChartjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChartData[T /* <: typingsJapgolly.chartJs.mod.ChartData */] = typingsJapgolly.reactChartjs2.mod.ChartDataFunction[T] | T
  type ChartDataFunction[T /* <: typingsJapgolly.chartJs.mod.ChartData */] = js.Function1[/* element */ org.scalajs.dom.raw.HTMLElement, T]
}
