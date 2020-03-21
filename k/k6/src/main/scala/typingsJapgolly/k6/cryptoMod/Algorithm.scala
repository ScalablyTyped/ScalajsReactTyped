package typingsJapgolly.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.k6.k6Strings.md4
  - typingsJapgolly.k6.k6Strings.md5
  - typingsJapgolly.k6.k6Strings.sha1
  - typingsJapgolly.k6.k6Strings.sha256
  - typingsJapgolly.k6.k6Strings.sha384
  - typingsJapgolly.k6.k6Strings.sha512
  - typingsJapgolly.k6.k6Strings.sha512_224
  - typingsJapgolly.k6.k6Strings.sha512_256
  - typingsJapgolly.k6.k6Strings.ripemd160
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md4: typingsJapgolly.k6.k6Strings.md4 = this.cast("md4")
  @scala.inline
  def md5: typingsJapgolly.k6.k6Strings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typingsJapgolly.k6.k6Strings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typingsJapgolly.k6.k6Strings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsJapgolly.k6.k6Strings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsJapgolly.k6.k6Strings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsJapgolly.k6.k6Strings.sha512 = this.cast("sha512")
  @scala.inline
  def sha512_224: typingsJapgolly.k6.k6Strings.sha512_224 = this.cast("sha512_224")
  @scala.inline
  def sha512_256: typingsJapgolly.k6.k6Strings.sha512_256 = this.cast("sha512_256")
}

