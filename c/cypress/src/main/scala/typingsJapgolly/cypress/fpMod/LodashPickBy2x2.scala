package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.NumericDictionary
import typingsJapgolly.cypress.lodashMod.ValueKeyIteratee
import typingsJapgolly.cypress.lodashMod.ValueKeyIterateeTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy2x2[T] extends js.Object {
  def apply(predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
}

