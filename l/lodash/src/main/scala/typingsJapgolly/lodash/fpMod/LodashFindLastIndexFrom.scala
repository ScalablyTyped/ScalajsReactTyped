package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIterateeCustom
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastIndexFrom extends js.Object {
  def apply(predicate: __, fromIndex: Double): LodashFindLastIndexFrom1x2 = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastIndexFrom1x1[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindLastIndexFrom1x3[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, array: List[T]): Double = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindLastIndexFrom1x5 = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, array: List[T]): LodashFindLastIndexFrom1x5 = js.native
  def apply[T](predicate: __, fromIndex: Double, array: List[T]): LodashFindLastIndexFrom1x6[T] = js.native
  def apply[T](predicate: __, fromIndex: __): LodashFindLastIndexFrom1x4[T] = js.native
  def apply[T](predicate: __, fromIndex: __, array: List[T]): LodashFindLastIndexFrom1x4[T] = js.native
}

