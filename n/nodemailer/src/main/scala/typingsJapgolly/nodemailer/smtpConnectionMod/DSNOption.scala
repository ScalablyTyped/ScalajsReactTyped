package typingsJapgolly.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodemailer.nodemailerStrings.NEVER
  - typingsJapgolly.nodemailer.nodemailerStrings.SUCCESS
  - typingsJapgolly.nodemailer.nodemailerStrings.FAILURE
  - typingsJapgolly.nodemailer.nodemailerStrings.DELAY
*/
trait DSNOption extends js.Object

object DSNOption {
  @scala.inline
  def DELAY: typingsJapgolly.nodemailer.nodemailerStrings.DELAY = this.cast("DELAY")
  @scala.inline
  def FAILURE: typingsJapgolly.nodemailer.nodemailerStrings.FAILURE = this.cast("FAILURE")
  @scala.inline
  def NEVER: typingsJapgolly.nodemailer.nodemailerStrings.NEVER = this.cast("NEVER")
  @scala.inline
  def SUCCESS: typingsJapgolly.nodemailer.nodemailerStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

