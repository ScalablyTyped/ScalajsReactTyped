package typingsJapgolly.decorum.mod

import typingsJapgolly.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "MinLength")
@js.native
object MinLength extends js.Object {
  def apply(minLength: Double): PropertyDecorator = js.native
  def apply(minLength: Double, message: String): PropertyDecorator = js.native
  def apply(minLength: Double, message: MessageHandler[MinLengthValidator]): PropertyDecorator = js.native
}

