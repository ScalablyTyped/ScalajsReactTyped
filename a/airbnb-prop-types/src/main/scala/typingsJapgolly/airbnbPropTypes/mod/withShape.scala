package typingsJapgolly.airbnbPropTypes.mod

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.ValidationMap
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "withShape")
@js.native
object withShape extends js.Object {
  def apply[T /* <: js.Object */, P, S](propType: Validator[P], propTypes: ValidationMap[S]): Requireable[T] = js.native
}

