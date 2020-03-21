package typingsJapgolly.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetActionSummary extends js.Object {
  /**
    * The name of the action which automatically creates the data set's contents.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  /**
    * The type of action by which the data set's contents are automatically created.
    */
  var actionType: js.UndefOr[DatasetActionType] = js.native
}

object DatasetActionSummary {
  @scala.inline
  def apply(actionName: DatasetActionName = null, actionType: DatasetActionType = null): DatasetActionSummary = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetActionSummary]
  }
}

