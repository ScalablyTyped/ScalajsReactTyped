package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTriggerResponse extends js.Object {
  /**
    * The resulting trigger definition.
    */
  var Trigger: js.UndefOr[typingsJapgolly.awsSdk.glueMod.Trigger] = js.native
}

object UpdateTriggerResponse {
  @scala.inline
  def apply(Trigger: Trigger = null): UpdateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Trigger != null) __obj.updateDynamic("Trigger")(Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTriggerResponse]
  }
}

