package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ValueIteratee
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUniqBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashUniqBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: __): LodashUniqBy1x2[T] = js.native
  def apply[T](iteratee: __, array: List[T]): LodashUniqBy1x2[T] = js.native
}

