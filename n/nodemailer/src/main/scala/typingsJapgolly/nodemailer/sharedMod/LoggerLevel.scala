package typingsJapgolly.nodemailer.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodemailer.nodemailerStrings.trace
  - typingsJapgolly.nodemailer.nodemailerStrings.debug
  - typingsJapgolly.nodemailer.nodemailerStrings.info
  - typingsJapgolly.nodemailer.nodemailerStrings.warn
  - typingsJapgolly.nodemailer.nodemailerStrings.error
  - typingsJapgolly.nodemailer.nodemailerStrings.fatal
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.nodemailer.nodemailerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.nodemailer.nodemailerStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.nodemailer.nodemailerStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.nodemailer.nodemailerStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsJapgolly.nodemailer.nodemailerStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.nodemailer.nodemailerStrings.warn = this.cast("warn")
}

