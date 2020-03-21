package typingsJapgolly.airbnbPropTypes.mod

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "nChildren")
@js.native
object nChildren extends js.Object {
  def apply[T, P](n: Double): Requireable[T] = js.native
  def apply[T, P](n: Double, propType: Validator[P]): Requireable[T] = js.native
}

