package typingsJapgolly.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperation extends js.Object {
  /** One of the CQN_OPCODE_* constants. */
  var operation: Double
  /** ROWID of the row that was affected. */
  var rowid: String
}

object AnonOperation {
  @scala.inline
  def apply(operation: Double, rowid: String): AnonOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], rowid = rowid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOperation]
  }
}

