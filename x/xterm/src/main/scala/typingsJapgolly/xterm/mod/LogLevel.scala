package typingsJapgolly.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xterm.xtermStrings.debug
  - typingsJapgolly.xterm.xtermStrings.info
  - typingsJapgolly.xterm.xtermStrings.warn
  - typingsJapgolly.xterm.xtermStrings.error
  - typingsJapgolly.xterm.xtermStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.xterm.xtermStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.xterm.xtermStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.xterm.xtermStrings.info = this.cast("info")
  @scala.inline
  def off: typingsJapgolly.xterm.xtermStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsJapgolly.xterm.xtermStrings.warn = this.cast("warn")
}

