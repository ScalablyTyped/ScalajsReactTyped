package typingsJapgolly.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SCRYPT
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_MD5
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.MD5
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.BCRYPT
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SHA512
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SHA256
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SHA1
*/
trait HashAlgorithmType extends js.Object

object HashAlgorithmType {
  @scala.inline
  def BCRYPT: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.BCRYPT = this.cast("BCRYPT")
  @scala.inline
  def HMAC_MD5: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_MD5 = this.cast("HMAC_MD5")
  @scala.inline
  def HMAC_SHA1: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1 = this.cast("HMAC_SHA1")
  @scala.inline
  def HMAC_SHA256: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256 = this.cast("HMAC_SHA256")
  @scala.inline
  def HMAC_SHA512: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512 = this.cast("HMAC_SHA512")
  @scala.inline
  def MD5: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.MD5 = this.cast("MD5")
  @scala.inline
  def PBKDF2_SHA256: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256 = this.cast("PBKDF2_SHA256")
  @scala.inline
  def PBKDF_SHA1: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1 = this.cast("PBKDF_SHA1")
  @scala.inline
  def SCRYPT: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SCRYPT = this.cast("SCRYPT")
  @scala.inline
  def SHA1: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SHA1 = this.cast("SHA1")
  @scala.inline
  def SHA256: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SHA256 = this.cast("SHA256")
  @scala.inline
  def SHA512: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.SHA512 = this.cast("SHA512")
  @scala.inline
  def STANDARD_SCRYPT: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT = this.cast("STANDARD_SCRYPT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

