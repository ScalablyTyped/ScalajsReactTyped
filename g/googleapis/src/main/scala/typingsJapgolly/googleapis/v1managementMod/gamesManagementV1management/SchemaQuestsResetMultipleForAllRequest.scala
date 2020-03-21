package typingsJapgolly.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for multiple quests reset all request.
  */
@js.native
trait SchemaQuestsResetMultipleForAllRequest extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#questsResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The IDs of quests to reset.
    */
  var quest_ids: js.UndefOr[js.Array[String]] = js.native
}

object SchemaQuestsResetMultipleForAllRequest {
  @scala.inline
  def apply(kind: String = null, quest_ids: js.Array[String] = null): SchemaQuestsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (quest_ids != null) __obj.updateDynamic("quest_ids")(quest_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuestsResetMultipleForAllRequest]
  }
}

