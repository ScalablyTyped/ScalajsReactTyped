package typingsJapgolly.airbnbPropTypes.mod

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "shape")
@js.native
object shape extends js.Object {
  def apply[T /* <: js.Object */](propTypes: ValidationMap[T]): Requireable[T] = js.native
}

