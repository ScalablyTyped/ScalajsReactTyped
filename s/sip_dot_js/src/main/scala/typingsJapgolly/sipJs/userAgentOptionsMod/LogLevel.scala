package typingsJapgolly.sipJs.userAgentOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sipJs.sipJsStrings.debug
  - typingsJapgolly.sipJs.sipJsStrings.log
  - typingsJapgolly.sipJs.sipJsStrings.warn
  - typingsJapgolly.sipJs.sipJsStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.sipJs.sipJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.sipJs.sipJsStrings.error = this.cast("error")
  @scala.inline
  def log: typingsJapgolly.sipJs.sipJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typingsJapgolly.sipJs.sipJsStrings.warn = this.cast("warn")
}

