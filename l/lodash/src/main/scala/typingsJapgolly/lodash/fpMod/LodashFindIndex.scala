package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.ValueIterateeCustom
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindIndex extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): Double = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def apply[T](predicate: __): LodashFindIndex1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashFindIndex1x2[T] = js.native
}

