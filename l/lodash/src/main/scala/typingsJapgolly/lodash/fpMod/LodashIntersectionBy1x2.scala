package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersectionBy1x2[T1] extends js.Object {
  def apply[T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x3[T1, T2] = js.native
  def apply[T2](iteratee: ValueIteratee[T1 | T2], values: List[T2]): js.Array[T1] = js.native
  def apply[T2](iteratee: __, values: List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
}

