package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/find-index", JSImport.Namespace)
@js.native
object arrayFindIndexMod extends js.Object {
  def apply[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
  def apply[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
}

