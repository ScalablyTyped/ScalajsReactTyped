package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnionBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashUnionBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: Null, arrays2: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: List[T]): LodashUnionBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: List[T], arrays2: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: __): LodashUnionBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: __, arrays2: List[T]): LodashUnionBy1x5[T] = js.native
  def apply[T](iteratee: __): LodashUnionBy1x2[T] = js.native
  def apply[T](iteratee: __, arrays1: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def apply[T](iteratee: __, arrays1: Null, arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def apply[T](iteratee: __, arrays1: List[T]): LodashUnionBy1x2[T] = js.native
  def apply[T](iteratee: __, arrays1: List[T], arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def apply[T](iteratee: __, arrays1: __): LodashUnionBy1x4[T] = js.native
  def apply[T](iteratee: __, arrays1: __, arrays2: List[T]): LodashUnionBy1x4[T] = js.native
}

