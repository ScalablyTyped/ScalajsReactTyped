package typingsJapgolly.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pino.pinoStrings.fatal
  - typingsJapgolly.pino.pinoStrings.error
  - typingsJapgolly.pino.pinoStrings.warn
  - typingsJapgolly.pino.pinoStrings.info
  - typingsJapgolly.pino.pinoStrings.debug
  - typingsJapgolly.pino.pinoStrings.trace
*/
trait Level extends js.Object

object Level {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.pino.pinoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.pino.pinoStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.pino.pinoStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.pino.pinoStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsJapgolly.pino.pinoStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.pino.pinoStrings.warn = this.cast("warn")
}

