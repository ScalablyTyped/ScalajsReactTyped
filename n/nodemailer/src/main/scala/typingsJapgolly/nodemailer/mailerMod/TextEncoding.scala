package typingsJapgolly.nodemailer.mailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodemailer.nodemailerStrings.`quoted-printable`
  - typingsJapgolly.nodemailer.nodemailerStrings.base64
*/
trait TextEncoding extends js.Object

object TextEncoding {
  @scala.inline
  def base64: typingsJapgolly.nodemailer.nodemailerStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `quoted-printable`: typingsJapgolly.nodemailer.nodemailerStrings.`quoted-printable` = this.cast("quoted-printable")
}

