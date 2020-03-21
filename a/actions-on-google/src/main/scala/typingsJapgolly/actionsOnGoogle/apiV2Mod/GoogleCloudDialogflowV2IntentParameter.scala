package typingsJapgolly.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentParameter extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var entityTypeDisplayName: js.UndefOr[String] = js.undefined
  var isList: js.UndefOr[Boolean] = js.undefined
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prompts: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentParameter {
  @scala.inline
  def apply(
    defaultValue: String = null,
    displayName: String = null,
    entityTypeDisplayName: String = null,
    isList: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prompts: js.Array[String] = null,
    value: String = null
  ): GoogleCloudDialogflowV2IntentParameter = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (entityTypeDisplayName != null) __obj.updateDynamic("entityTypeDisplayName")(entityTypeDisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isList)) __obj.updateDynamic("isList")(isList.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prompts != null) __obj.updateDynamic("prompts")(prompts.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentParameter]
  }
}

