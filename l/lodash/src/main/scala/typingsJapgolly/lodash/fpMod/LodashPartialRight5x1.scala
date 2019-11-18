package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.Function1
import typingsJapgolly.lodash.lodashMod.Function2
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartialRight5x1[T1, T2, T3, R] extends js.Object {
  def apply(arg1: js.Tuple3[T1, T2 | __, T3 | __]): Function1[T3, R] = js.native
  def apply(arg2: js.Tuple2[T2, T3]): Function1[T1, R] = js.native
  def apply(arg3: js.Array[T3]): Function2[T1, T2, R] = js.native
}

