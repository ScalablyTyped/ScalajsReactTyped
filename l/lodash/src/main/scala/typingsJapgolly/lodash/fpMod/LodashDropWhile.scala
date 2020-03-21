package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDropWhile extends js.Object {
  def apply[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  def apply[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashDropWhile1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashDropWhile1x2[T] = js.native
}

