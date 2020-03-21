package typingsJapgolly.breeze

import typingsJapgolly.breeze.breeze.EntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntityType extends js.Object {
  var entityType: js.UndefOr[EntityType] = js.undefined
  var ignore: js.UndefOr[Boolean] = js.undefined
  var nodeId: js.UndefOr[js.Any] = js.undefined
  var nodeRefId: js.UndefOr[js.Any] = js.undefined
}

object AnonEntityType {
  @scala.inline
  def apply(
    entityType: EntityType = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    nodeId: js.Any = null,
    nodeRefId: js.Any = null
  ): AnonEntityType = {
    val __obj = js.Dynamic.literal()
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (nodeRefId != null) __obj.updateDynamic("nodeRefId")(nodeRefId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntityType]
  }
}

