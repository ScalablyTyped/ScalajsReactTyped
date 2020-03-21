package typingsJapgolly.shaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.shaJs.shaJsStrings.sha
  - typingsJapgolly.shaJs.shaJsStrings.sha1
  - typingsJapgolly.shaJs.shaJsStrings.sha224
  - typingsJapgolly.shaJs.shaJsStrings.sha256
  - typingsJapgolly.shaJs.shaJsStrings.sha384
  - typingsJapgolly.shaJs.shaJsStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha: typingsJapgolly.shaJs.shaJsStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typingsJapgolly.shaJs.shaJsStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsJapgolly.shaJs.shaJsStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsJapgolly.shaJs.shaJsStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsJapgolly.shaJs.shaJsStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsJapgolly.shaJs.shaJsStrings.sha512 = this.cast("sha512")
}

