package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy3x4[T1] extends js.Object {
  def apply[T2](iteratee: ValueIteratee[T1 | T2]): LodashPullAllBy3x5[T1, T2] = js.native
  def apply[T2](iteratee: ValueIteratee[T1 | T2], values: List[T2]): js.Array[T1] = js.native
  def apply[T2](iteratee: __, values: List[T2]): LodashPullAllBy3x6[T1, T2] = js.native
}

