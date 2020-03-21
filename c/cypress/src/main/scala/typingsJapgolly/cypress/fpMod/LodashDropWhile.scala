package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.ValueIteratee
import typingsJapgolly.cypress.lodashMod.__
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

