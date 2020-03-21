package typingsJapgolly.sixRuntime.Six_.plugins

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait log extends js.Object {
  def debug(msg: String, restOfVar: js.Any*): Unit = js.native
  def error(msg: String, restOfVar: js.Any*): Unit = js.native
  def error(msg: Error, restOfVar: js.Any*): Unit = js.native
  def info(msg: String, restOfVar: js.Any*): Unit = js.native
  def warn(msg: String, restOfVar: js.Any*): Unit = js.native
}

