package typingsJapgolly.justDebounceIt

import typingsJapgolly.justDebounceIt.justDebounceItBooleans.`false`
import typingsJapgolly.justDebounceIt.justDebounceItBooleans.`true`
import typingsJapgolly.justDebounceIt.justDebounceItNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("just-debounce-it", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T /* <: js.Function */](fn: T): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: Double): js.Function1[/* args */ ArgumentTypes[T], Unit] = js.native
  def apply[T /* <: js.Function */](fn: T, wait: Double, callFirst: `false`): js.Function1[/* args */ ArgumentTypes[T], Unit] = js.native
  def apply[T /* <: js.Function */](fn: T, wait: Double, callFirst: `true`): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: `0`): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: `0`, callFirst: Boolean): T = js.native
  type ArgumentTypes[F /* <: js.Function */] = js.Any
}

