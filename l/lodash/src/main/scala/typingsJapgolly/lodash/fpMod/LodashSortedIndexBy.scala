package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortedIndexBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashSortedIndexBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], value: T): LodashSortedIndexBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], value: T, array: List[T]): Double = js.native
  def apply[T](iteratee: ValueIteratee[T], value: __): LodashSortedIndexBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], value: __, array: List[T]): LodashSortedIndexBy1x5[T] = js.native
  def apply[T](iteratee: __, value: T): LodashSortedIndexBy1x2[T] = js.native
  def apply[T](iteratee: __, value: T, array: List[T]): LodashSortedIndexBy1x6[T] = js.native
  def apply[T](iteratee: __, value: __): LodashSortedIndexBy1x4[T] = js.native
  def apply[T](iteratee: __, value: __, array: List[T]): LodashSortedIndexBy1x4[T] = js.native
}

