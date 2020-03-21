package typingsJapgolly.airbnbPropTypes.mod

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "mutuallyExclusiveProps")
@js.native
object mutuallyExclusiveProps extends js.Object {
  def apply[T](propType: Requireable[T], propNames: String*): Requireable[T] = js.native
  def apply[T](// tslint:disable-next-line:unified-signatures
  propType: Validator[T], propNames: String*): Requireable[T] = js.native
}

