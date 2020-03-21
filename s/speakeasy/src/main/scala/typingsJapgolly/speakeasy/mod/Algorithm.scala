package typingsJapgolly.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.speakeasy.speakeasyStrings.sha1
  - typingsJapgolly.speakeasy.speakeasyStrings.sha256
  - typingsJapgolly.speakeasy.speakeasyStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha1: typingsJapgolly.speakeasy.speakeasyStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsJapgolly.speakeasy.speakeasyStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha512: typingsJapgolly.speakeasy.speakeasyStrings.sha512 = this.cast("sha512")
}

