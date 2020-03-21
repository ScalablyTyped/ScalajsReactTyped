package typingsJapgolly.airbnbPropTypes.mod

import typingsJapgolly.airbnbPropTypes.AnonStripHOCs
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "componentWithName")
@js.native
object componentWithName extends js.Object {
  def apply[T](name: String): Requireable[T] = js.native
  def apply[T](name: String, options: AnonStripHOCs): Requireable[T] = js.native
  def apply[T](name: RegExp): Requireable[T] = js.native
  def apply[T](name: RegExp, options: AnonStripHOCs): Requireable[T] = js.native
}

