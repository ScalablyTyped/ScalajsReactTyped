package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMemberSettings extends js.Object {
  // If set to true, members can add and remove apps.
  var allowAddRemoveApps: js.UndefOr[Boolean] = js.undefined
  // If set to true, members can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[Boolean] = js.undefined
  // If set to true, members can add, update, and remove connectors.
  var allowCreateUpdateRemoveConnectors: js.UndefOr[Boolean] = js.undefined
  // If set to true, members can add, update, and remove tabs.
  var allowCreateUpdateRemoveTabs: js.UndefOr[Boolean] = js.undefined
  // If set to true, members can delete channels.
  var allowDeleteChannels: js.UndefOr[Boolean] = js.undefined
}

object TeamMemberSettings {
  @scala.inline
  def apply(
    allowAddRemoveApps: js.UndefOr[Boolean] = js.undefined,
    allowCreateUpdateChannels: js.UndefOr[Boolean] = js.undefined,
    allowCreateUpdateRemoveConnectors: js.UndefOr[Boolean] = js.undefined,
    allowCreateUpdateRemoveTabs: js.UndefOr[Boolean] = js.undefined,
    allowDeleteChannels: js.UndefOr[Boolean] = js.undefined
  ): TeamMemberSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAddRemoveApps)) __obj.updateDynamic("allowAddRemoveApps")(allowAddRemoveApps.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCreateUpdateChannels)) __obj.updateDynamic("allowCreateUpdateChannels")(allowCreateUpdateChannels.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCreateUpdateRemoveConnectors)) __obj.updateDynamic("allowCreateUpdateRemoveConnectors")(allowCreateUpdateRemoveConnectors.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCreateUpdateRemoveTabs)) __obj.updateDynamic("allowCreateUpdateRemoveTabs")(allowCreateUpdateRemoveTabs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteChannels)) __obj.updateDynamic("allowDeleteChannels")(allowDeleteChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMemberSettings]
  }
}

