package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMinBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMinBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMinBy1x2[T] = js.native
}

