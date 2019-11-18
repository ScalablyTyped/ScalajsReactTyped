package typingsJapgolly.coreDashJs

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/some", JSImport.Namespace)
@js.native
object libraryFnArraySomeMod extends js.Object {
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Boolean = js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
}

