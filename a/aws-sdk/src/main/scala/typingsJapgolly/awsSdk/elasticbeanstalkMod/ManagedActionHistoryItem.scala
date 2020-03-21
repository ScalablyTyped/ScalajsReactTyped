package typingsJapgolly.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedActionHistoryItem extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of the managed action.
    */
  var ActionType: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  /**
    * The date and time that the action started executing.
    */
  var ExecutedTime: js.UndefOr[js.Date] = js.native
  /**
    * If the action failed, a description of the failure.
    */
  var FailureDescription: js.UndefOr[String] = js.native
  /**
    * If the action failed, the type of failure.
    */
  var FailureType: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.FailureType] = js.native
  /**
    * The date and time that the action finished executing.
    */
  var FinishedTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionHistoryStatus] = js.native
}

object ManagedActionHistoryItem {
  @scala.inline
  def apply(
    ActionDescription: String = null,
    ActionId: String = null,
    ActionType: ActionType = null,
    ExecutedTime: js.Date = null,
    FailureDescription: String = null,
    FailureType: FailureType = null,
    FinishedTime: js.Date = null,
    Status: ActionHistoryStatus = null
  ): ManagedActionHistoryItem = {
    val __obj = js.Dynamic.literal()
    if (ActionDescription != null) __obj.updateDynamic("ActionDescription")(ActionDescription.asInstanceOf[js.Any])
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId.asInstanceOf[js.Any])
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (ExecutedTime != null) __obj.updateDynamic("ExecutedTime")(ExecutedTime.asInstanceOf[js.Any])
    if (FailureDescription != null) __obj.updateDynamic("FailureDescription")(FailureDescription.asInstanceOf[js.Any])
    if (FailureType != null) __obj.updateDynamic("FailureType")(FailureType.asInstanceOf[js.Any])
    if (FinishedTime != null) __obj.updateDynamic("FinishedTime")(FinishedTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedActionHistoryItem]
  }
}

