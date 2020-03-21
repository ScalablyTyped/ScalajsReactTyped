package typingsJapgolly.ddTrace

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebug extends js.Object {
  def debug(message: String): Unit = js.native
  def error(err: String): Unit = js.native
  def error(err: Error): Unit = js.native
}

