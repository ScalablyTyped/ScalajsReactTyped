package typingsJapgolly.justPick

import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("just-pick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T, U /* <: String */](obj: T, select1: U, selectn: U*): Pick[T, U] = js.native
  def apply[T, U /* <: String */](obj: T, select: js.Array[U]): Pick[T, U] = js.native
}

