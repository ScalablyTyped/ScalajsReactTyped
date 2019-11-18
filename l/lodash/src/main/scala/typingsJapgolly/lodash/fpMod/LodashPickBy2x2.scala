package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.NumericDictionary
import typingsJapgolly.lodash.lodashMod.ValueKeyIteratee
import typingsJapgolly.lodash.lodashMod.ValueKeyIterateeTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy2x2[T] extends js.Object {
  def apply(predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
}

