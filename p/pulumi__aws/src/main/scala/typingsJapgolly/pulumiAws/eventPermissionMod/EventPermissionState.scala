package typingsJapgolly.pulumiAws.eventPermissionMod

import typingsJapgolly.pulumiAws.inputMod.cloudwatch.EventPermissionCondition
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPermissionState extends js.Object {
  /**
    * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
    */
  val action: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
    */
  val condition: js.UndefOr[Input[EventPermissionCondition]] = js.native
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
    */
  val principal: js.UndefOr[Input[String]] = js.native
  /**
    * An identifier string for the external account that you are granting permissions to.
    */
  val statementId: js.UndefOr[Input[String]] = js.native
}

object EventPermissionState {
  @scala.inline
  def apply(
    action: Input[String] = null,
    condition: Input[EventPermissionCondition] = null,
    principal: Input[String] = null,
    statementId: Input[String] = null
  ): EventPermissionState = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (statementId != null) __obj.updateDynamic("statementId")(statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPermissionState]
  }
}

