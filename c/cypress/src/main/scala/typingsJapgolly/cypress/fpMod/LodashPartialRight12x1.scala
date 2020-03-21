package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.Function2
import typingsJapgolly.cypress.lodashMod.Function3
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartialRight12x1[T1, T2, T3, T4, R] extends js.Object {
  def apply(arg1: js.Tuple4[T1, T2 | __, T3 | __, T4 | __]): Function2[T3, T4, R] = js.native
  def apply(arg2: js.Tuple3[T2, T3 | __, T4 | __]): Function2[T1, T4, R] = js.native
  def apply(arg3: js.Tuple2[T3, T4]): Function2[T1, T2, R] = js.native
  def apply(arg4: js.Array[T4]): Function3[T1, T2, T3, R] = js.native
}

