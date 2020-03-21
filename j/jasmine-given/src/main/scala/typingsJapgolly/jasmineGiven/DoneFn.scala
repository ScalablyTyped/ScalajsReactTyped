package typingsJapgolly.jasmineGiven

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneFn extends js.Object {
  def apply(): Unit = js.native
  /** fails the spec and indicates that it has completed. If the message is an Error, Error.message is used */
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def fail(message: Error): Unit = js.native
}

