package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.ValueIterateeCustom
import typingsJapgolly.cypress.lodashMod.ValueIteratorTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLast1x2[T] extends js.Object {
  def apply(predicate: ValueIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
}

