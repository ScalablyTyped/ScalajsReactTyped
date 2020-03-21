package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight1x1[T, TResult] extends js.Object {
  def apply(accumulator: TResult): TResult = js.native
  def apply(accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, collection: List[T]): TResult = js.native
  def apply(accumulator: __): LodashReduceRight1x5[TResult] = js.native
  def apply(accumulator: __, collection: js.Array[T]): LodashReduceRight1x5[TResult] = js.native
  def apply(accumulator: __, collection: List[T]): LodashReduceRight2x5[TResult] = js.native
}

