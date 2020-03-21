package typingsJapgolly.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthError")
@js.native
class AuthError protected () extends js.Object {
  def this(queryString: QueryParams) = this()
  var code: String = js.native
  var description: String = js.native
  var uri: String = js.native
}

/* static members */
@JSGlobal("Dropbox.AuthError")
@js.native
object AuthError extends js.Object {
  var ACCESS_DENIED: String = js.native
  var INVALID_GRANT: String = js.native
  var INVALID_REQUEST: String = js.native
  var INVALID_SCOPE: String = js.native
  var SERVER_ERROR: String = js.native
  var TEMPORARILY_UNAVAILABLE: String = js.native
  var UNAUTHORIZED_CLIENT: String = js.native
  var UNSUPPORTED_GRANT_TYPE: String = js.native
  var UNSUPPORTED_RESPONSE_TYPE: String = js.native
}

