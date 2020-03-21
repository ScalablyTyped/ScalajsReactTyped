package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.NumericDictionary
import typingsJapgolly.lodash.mod.ValueKeyIteratee
import typingsJapgolly.lodash.mod.ValueKeyIterateeTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy2x2[T] extends js.Object {
  def apply(predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
}

