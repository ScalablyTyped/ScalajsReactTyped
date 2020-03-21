package typingsJapgolly.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openfin.openfinStrings.verbose
  - typingsJapgolly.openfin.openfinStrings.info
  - typingsJapgolly.openfin.openfinStrings.warning
  - typingsJapgolly.openfin.openfinStrings.error
  - typingsJapgolly.openfin.openfinStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.openfin.openfinStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.openfin.openfinStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.openfin.openfinStrings.info = this.cast("info")
  @scala.inline
  def verbose: typingsJapgolly.openfin.openfinStrings.verbose = this.cast("verbose")
  @scala.inline
  def warning: typingsJapgolly.openfin.openfinStrings.warning = this.cast("warning")
}

