package typingsJapgolly.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.speakeasy.speakeasyStrings.ascii
  - typingsJapgolly.speakeasy.speakeasyStrings.hex
  - typingsJapgolly.speakeasy.speakeasyStrings.base32
  - typingsJapgolly.speakeasy.speakeasyStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typingsJapgolly.speakeasy.speakeasyStrings.ascii = this.cast("ascii")
  @scala.inline
  def base32: typingsJapgolly.speakeasy.speakeasyStrings.base32 = this.cast("base32")
  @scala.inline
  def base64: typingsJapgolly.speakeasy.speakeasyStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.speakeasy.speakeasyStrings.hex = this.cast("hex")
}

