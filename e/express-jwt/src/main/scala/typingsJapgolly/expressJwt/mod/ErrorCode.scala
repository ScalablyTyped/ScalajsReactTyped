package typingsJapgolly.expressJwt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expressJwt.expressJwtStrings.revoked_token
  - typingsJapgolly.expressJwt.expressJwtStrings.invalid_token
  - typingsJapgolly.expressJwt.expressJwtStrings.credentials_bad_scheme
  - typingsJapgolly.expressJwt.expressJwtStrings.credentials_bad_format
  - typingsJapgolly.expressJwt.expressJwtStrings.credentials_required
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credentials_bad_format: typingsJapgolly.expressJwt.expressJwtStrings.credentials_bad_format = this.cast("credentials_bad_format")
  @scala.inline
  def credentials_bad_scheme: typingsJapgolly.expressJwt.expressJwtStrings.credentials_bad_scheme = this.cast("credentials_bad_scheme")
  @scala.inline
  def credentials_required: typingsJapgolly.expressJwt.expressJwtStrings.credentials_required = this.cast("credentials_required")
  @scala.inline
  def invalid_token: typingsJapgolly.expressJwt.expressJwtStrings.invalid_token = this.cast("invalid_token")
  @scala.inline
  def revoked_token: typingsJapgolly.expressJwt.expressJwtStrings.revoked_token = this.cast("revoked_token")
}

