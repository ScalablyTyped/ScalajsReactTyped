package typingsJapgolly.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_request
  - typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_client
  - typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_grant
  - typingsJapgolly.oauth2orize.oauth2orizeStrings.unauthorized_client
  - typingsJapgolly.oauth2orize.oauth2orizeStrings.unsupported_grant_type
  - typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_scope
*/
trait TokenErrorCode extends js.Object

object TokenErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid_client: typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_client = this.cast("invalid_client")
  @scala.inline
  def invalid_grant: typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_grant = this.cast("invalid_grant")
  @scala.inline
  def invalid_request: typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_request = this.cast("invalid_request")
  @scala.inline
  def invalid_scope: typingsJapgolly.oauth2orize.oauth2orizeStrings.invalid_scope = this.cast("invalid_scope")
  @scala.inline
  def unauthorized_client: typingsJapgolly.oauth2orize.oauth2orizeStrings.unauthorized_client = this.cast("unauthorized_client")
  @scala.inline
  def unsupported_grant_type: typingsJapgolly.oauth2orize.oauth2orizeStrings.unsupported_grant_type = this.cast("unsupported_grant_type")
}

