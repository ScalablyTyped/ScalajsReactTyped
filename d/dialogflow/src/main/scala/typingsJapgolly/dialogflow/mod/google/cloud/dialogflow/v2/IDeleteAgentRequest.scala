package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteAgentRequest. */
trait IDeleteAgentRequest extends js.Object {
  /** DeleteAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IDeleteAgentRequest {
  @scala.inline
  def apply(parent: String = null): IDeleteAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteAgentRequest]
  }
}

