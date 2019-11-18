package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIteratee
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMeanBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashMeanBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashMeanBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMeanBy1x2[T] = js.native
}

