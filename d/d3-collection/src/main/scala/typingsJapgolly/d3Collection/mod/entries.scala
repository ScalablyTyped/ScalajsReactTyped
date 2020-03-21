package typingsJapgolly.d3Collection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.d3Collection.AnonKey
import typingsJapgolly.d3Collection.AnonValue
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-collection", "entries")
@js.native
object entries extends js.Object {
  def apply(obj: js.Object): js.Array[AnonValue] = js.native
  def apply[T](obj: StringDictionary[T]): js.Array[AnonKey[T]] = js.native
  def apply[T](obj: ArrayLike[T]): js.Array[AnonKey[T]] = js.native
}

