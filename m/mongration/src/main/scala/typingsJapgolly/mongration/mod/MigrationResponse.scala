package typingsJapgolly.mongration.mod

import typingsJapgolly.mongration.mongrationStrings.`not-run`
import typingsJapgolly.mongration.mongrationStrings.`rollback-error`
import typingsJapgolly.mongration.mongrationStrings.error
import typingsJapgolly.mongration.mongrationStrings.ok
import typingsJapgolly.mongration.mongrationStrings.pending
import typingsJapgolly.mongration.mongrationStrings.rollback
import typingsJapgolly.mongration.mongrationStrings.skipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationResponse extends js.Object {
  var id: String
  var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`
}

object MigrationResponse {
  @scala.inline
  def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationResponse]
  }
}

