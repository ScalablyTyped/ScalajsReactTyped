package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteAllContextsRequest. */
trait IDeleteAllContextsRequest extends js.Object {
  /** DeleteAllContextsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IDeleteAllContextsRequest {
  @scala.inline
  def apply(parent: String = null): IDeleteAllContextsRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteAllContextsRequest]
  }
}

