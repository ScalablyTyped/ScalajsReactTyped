package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.ValueIterateeCustom
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindIndex extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndex1x1[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def apply[T](predicate: __): LodashFindIndex1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashFindIndex1x2[T] = js.native
}

