package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDropWhile extends js.Object {
  def apply[T](predicate: ValueIteratee[T]): LodashDropWhile1x1[T] = js.native
  def apply[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashDropWhile1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashDropWhile1x2[T] = js.native
}

