package typingsJapgolly.d3DashArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashArrayMod {
  import typingsJapgolly.std.ArrayLike
  import typingsJapgolly.std.Date

  type Primitive = Double | String | Boolean | Date
  type ThresholdCountGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, Double]
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[js.Date] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Date, /* max */ Date, js.Array[Value]]
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, js.Array[Value]]
}
