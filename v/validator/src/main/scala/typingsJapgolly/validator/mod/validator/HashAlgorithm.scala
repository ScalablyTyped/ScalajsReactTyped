package typingsJapgolly.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.validator.validatorStrings.md4
  - typingsJapgolly.validator.validatorStrings.md5
  - typingsJapgolly.validator.validatorStrings.sha1
  - typingsJapgolly.validator.validatorStrings.sha256
  - typingsJapgolly.validator.validatorStrings.sha384
  - typingsJapgolly.validator.validatorStrings.sha512
  - typingsJapgolly.validator.validatorStrings.ripemd128
  - typingsJapgolly.validator.validatorStrings.ripemd160
  - typingsJapgolly.validator.validatorStrings.tiger128
  - typingsJapgolly.validator.validatorStrings.tiger160
  - typingsJapgolly.validator.validatorStrings.tiger192
  - typingsJapgolly.validator.validatorStrings.crc32
  - typingsJapgolly.validator.validatorStrings.crc32b
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crc32: typingsJapgolly.validator.validatorStrings.crc32 = this.cast("crc32")
  @scala.inline
  def crc32b: typingsJapgolly.validator.validatorStrings.crc32b = this.cast("crc32b")
  @scala.inline
  def md4: typingsJapgolly.validator.validatorStrings.md4 = this.cast("md4")
  @scala.inline
  def md5: typingsJapgolly.validator.validatorStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd128: typingsJapgolly.validator.validatorStrings.ripemd128 = this.cast("ripemd128")
  @scala.inline
  def ripemd160: typingsJapgolly.validator.validatorStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typingsJapgolly.validator.validatorStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsJapgolly.validator.validatorStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsJapgolly.validator.validatorStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsJapgolly.validator.validatorStrings.sha512 = this.cast("sha512")
  @scala.inline
  def tiger128: typingsJapgolly.validator.validatorStrings.tiger128 = this.cast("tiger128")
  @scala.inline
  def tiger160: typingsJapgolly.validator.validatorStrings.tiger160 = this.cast("tiger160")
  @scala.inline
  def tiger192: typingsJapgolly.validator.validatorStrings.tiger192 = this.cast("tiger192")
}

