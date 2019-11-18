package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.Comparator
import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUniqWith extends js.Object {
  def apply[T](comparator: Comparator[T]): LodashUniqWith1x1[T] = js.native
  def apply[T](comparator: Comparator[T], array: List[T]): js.Array[T] = js.native
  def apply[T](comparator: __): LodashUniqWith1x2[T] = js.native
  def apply[T](comparator: __, array: List[T]): LodashUniqWith1x2[T] = js.native
}

