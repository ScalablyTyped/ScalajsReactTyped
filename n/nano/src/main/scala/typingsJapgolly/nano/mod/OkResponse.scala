package typingsJapgolly.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#delete--db
// http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
trait OkResponse extends js.Object {
  // Operation status
  var ok: Boolean
}

object OkResponse {
  @scala.inline
  def apply(ok: Boolean): OkResponse = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OkResponse]
  }
}

