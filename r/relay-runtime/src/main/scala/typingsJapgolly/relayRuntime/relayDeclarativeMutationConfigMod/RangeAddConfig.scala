package typingsJapgolly.relayRuntime.relayDeclarativeMutationConfigMod

import typingsJapgolly.relayRuntime.AnonFilters
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeAddConfig extends DeclarativeMutationConfig {
  var connectionInfo: js.UndefOr[js.Array[AnonFilters]] = js.undefined
  var connectionName: js.UndefOr[String] = js.undefined
  var edgeName: String
  var parentID: js.UndefOr[String] = js.undefined
  var parentName: js.UndefOr[String] = js.undefined
  var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.undefined
  var `type`: RANGE_ADD
}

object RangeAddConfig {
  @scala.inline
  def apply(
    edgeName: String,
    `type`: RANGE_ADD,
    connectionInfo: js.Array[AnonFilters] = null,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null,
    rangeBehaviors: RangeBehaviors = null
  ): RangeAddConfig = {
    val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connectionInfo != null) __obj.updateDynamic("connectionInfo")(connectionInfo.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (parentID != null) __obj.updateDynamic("parentID")(parentID.asInstanceOf[js.Any])
    if (parentName != null) __obj.updateDynamic("parentName")(parentName.asInstanceOf[js.Any])
    if (rangeBehaviors != null) __obj.updateDynamic("rangeBehaviors")(rangeBehaviors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAddConfig]
  }
}

