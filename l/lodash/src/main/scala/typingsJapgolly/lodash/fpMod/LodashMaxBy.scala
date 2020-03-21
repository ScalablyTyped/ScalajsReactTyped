package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMaxBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMaxBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMaxBy1x2[T] = js.native
}

