package typingsJapgolly.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.natsHemera.natsHemeraStrings.fatal
  - typingsJapgolly.natsHemera.natsHemeraStrings.error
  - typingsJapgolly.natsHemera.natsHemeraStrings.warn
  - typingsJapgolly.natsHemera.natsHemeraStrings.info
  - typingsJapgolly.natsHemera.natsHemeraStrings.debug
  - typingsJapgolly.natsHemera.natsHemeraStrings.trace
  - typingsJapgolly.natsHemera.natsHemeraStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.natsHemera.natsHemeraStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.natsHemera.natsHemeraStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.natsHemera.natsHemeraStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.natsHemera.natsHemeraStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsJapgolly.natsHemera.natsHemeraStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typingsJapgolly.natsHemera.natsHemeraStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.natsHemera.natsHemeraStrings.warn = this.cast("warn")
}

