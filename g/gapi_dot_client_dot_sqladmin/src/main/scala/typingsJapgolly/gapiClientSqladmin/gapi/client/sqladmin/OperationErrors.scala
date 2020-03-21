package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationErrors extends js.Object {
  /** The list of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[OperationError]] = js.undefined
  /** This is always sql#operationErrors. */
  var kind: js.UndefOr[String] = js.undefined
}

object OperationErrors {
  @scala.inline
  def apply(errors: js.Array[OperationError] = null, kind: String = null): OperationErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationErrors]
  }
}

