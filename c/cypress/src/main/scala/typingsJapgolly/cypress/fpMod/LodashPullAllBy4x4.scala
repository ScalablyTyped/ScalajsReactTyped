package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.ValueIteratee
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy4x4[T1] extends js.Object {
  def apply[T2](iteratee: ValueIteratee[T1 | T2]): LodashPullAllBy4x5[T1, T2] = js.native
  def apply[T2](iteratee: ValueIteratee[T1 | T2], values: List[T2]): List[T1] = js.native
  def apply[T2](iteratee: __, values: List[T2]): LodashPullAllBy4x6[T1, T2] = js.native
}

