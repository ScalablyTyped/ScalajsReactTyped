package typingsJapgolly.d3.mod

import typingsJapgolly.d3Collection.mod.Set_
import typingsJapgolly.d3Collection.mod.Stringifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "set")
@js.native
object set extends js.Object {
  def apply(): Set_ = js.native
  def apply(array: js.Array[String | Stringifiable]): Set_ = js.native
  def apply(d3Set: Set_): Set_ = js.native
  def apply[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], String]
  ): Set_ = js.native
}

