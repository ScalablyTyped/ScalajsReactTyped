package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersectionBy1x4[T2] extends js.Object {
  def apply[T1](iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  def apply[T1](iteratee: ValueIteratee[T1 | T2], array: List[T1]): js.Array[T1] = js.native
  def apply[T1](iteratee: __): LodashIntersectionBy1x6[T1, T2] = js.native
  def apply[T1](iteratee: __, array: List[T1]): LodashIntersectionBy1x6[T1, T2] = js.native
}

