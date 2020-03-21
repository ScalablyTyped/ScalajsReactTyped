package typingsJapgolly.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowDependencyAdding extends js.Object {
  var allowDependencyAdding: js.UndefOr[Boolean] = js.undefined
  var allowDependencyDeleting: js.UndefOr[Boolean] = js.undefined
  var allowDependencyUpdating: js.UndefOr[Boolean] = js.undefined
  var allowResourceAdding: js.UndefOr[Boolean] = js.undefined
  var allowResourceDeleting: js.UndefOr[Boolean] = js.undefined
  var allowResourceUpdating: js.UndefOr[Boolean] = js.undefined
  var allowTaskAdding: js.UndefOr[Boolean] = js.undefined
  var allowTaskDeleting: js.UndefOr[Boolean] = js.undefined
  var allowTaskUpdating: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowDependencyAdding {
  @scala.inline
  def apply(
    allowDependencyAdding: js.UndefOr[Boolean] = js.undefined,
    allowDependencyDeleting: js.UndefOr[Boolean] = js.undefined,
    allowDependencyUpdating: js.UndefOr[Boolean] = js.undefined,
    allowResourceAdding: js.UndefOr[Boolean] = js.undefined,
    allowResourceDeleting: js.UndefOr[Boolean] = js.undefined,
    allowResourceUpdating: js.UndefOr[Boolean] = js.undefined,
    allowTaskAdding: js.UndefOr[Boolean] = js.undefined,
    allowTaskDeleting: js.UndefOr[Boolean] = js.undefined,
    allowTaskUpdating: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowDependencyAdding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDependencyAdding)) __obj.updateDynamic("allowDependencyAdding")(allowDependencyAdding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDependencyDeleting)) __obj.updateDynamic("allowDependencyDeleting")(allowDependencyDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDependencyUpdating)) __obj.updateDynamic("allowDependencyUpdating")(allowDependencyUpdating.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResourceAdding)) __obj.updateDynamic("allowResourceAdding")(allowResourceAdding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResourceDeleting)) __obj.updateDynamic("allowResourceDeleting")(allowResourceDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResourceUpdating)) __obj.updateDynamic("allowResourceUpdating")(allowResourceUpdating.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTaskAdding)) __obj.updateDynamic("allowTaskAdding")(allowTaskAdding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTaskDeleting)) __obj.updateDynamic("allowTaskDeleting")(allowTaskDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTaskUpdating)) __obj.updateDynamic("allowTaskUpdating")(allowTaskUpdating.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowDependencyAdding]
  }
}

