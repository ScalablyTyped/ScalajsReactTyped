package typingsJapgolly.propTypes.mod

import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prop-types", "oneOfType")
@js.native
object oneOfType extends js.Object {
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}

