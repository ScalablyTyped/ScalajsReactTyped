package typingsJapgolly.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRsa.nodeRsaStrings.ripemd160
  - typingsJapgolly.nodeRsa.nodeRsaStrings.md4
  - typingsJapgolly.nodeRsa.nodeRsaStrings.md5
  - typingsJapgolly.nodeRsa.nodeRsaStrings.sha1
  - typingsJapgolly.nodeRsa.nodeRsaStrings.sha224
  - typingsJapgolly.nodeRsa.nodeRsaStrings.sha256
  - typingsJapgolly.nodeRsa.nodeRsaStrings.sha384
  - typingsJapgolly.nodeRsa.nodeRsaStrings.sha512
*/
trait HashingAlgorithm extends js.Object

object HashingAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md4: typingsJapgolly.nodeRsa.nodeRsaStrings.md4 = this.cast("md4")
  @scala.inline
  def md5: typingsJapgolly.nodeRsa.nodeRsaStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typingsJapgolly.nodeRsa.nodeRsaStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typingsJapgolly.nodeRsa.nodeRsaStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsJapgolly.nodeRsa.nodeRsaStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsJapgolly.nodeRsa.nodeRsaStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsJapgolly.nodeRsa.nodeRsaStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsJapgolly.nodeRsa.nodeRsaStrings.sha512 = this.cast("sha512")
}

