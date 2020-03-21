package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.MemoIteratorCapped
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce2x4[T] extends js.Object {
  def apply[TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce2x5[TResult] = js.native
  def apply[TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce2x6[T, TResult] = js.native
}

