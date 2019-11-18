package typingsJapgolly.d3DashArray.d3DashArrayMod

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramCommon[Datum, Value /* <: js.UndefOr[Double | js.Date] */] extends js.Object {
  def apply(data: ArrayLike[Datum]): js.Array[Bin[Datum, Value]] = js.native
  def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value] = js.native
  def value(valueAccessor: js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value]): this.type = js.native
}

