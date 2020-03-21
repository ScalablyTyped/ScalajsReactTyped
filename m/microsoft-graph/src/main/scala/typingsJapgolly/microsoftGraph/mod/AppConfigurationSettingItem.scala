package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfigurationSettingItem extends js.Object {
  // app configuration key.
  var appConfigKey: js.UndefOr[String] = js.undefined
  // app configuration key type. Possible values are: stringType, integerType, realType, booleanType, tokenType.
  var appConfigKeyType: js.UndefOr[MdmAppConfigKeyType] = js.undefined
  // app configuration key value.
  var appConfigKeyValue: js.UndefOr[String] = js.undefined
}

object AppConfigurationSettingItem {
  @scala.inline
  def apply(
    appConfigKey: String = null,
    appConfigKeyType: MdmAppConfigKeyType = null,
    appConfigKeyValue: String = null
  ): AppConfigurationSettingItem = {
    val __obj = js.Dynamic.literal()
    if (appConfigKey != null) __obj.updateDynamic("appConfigKey")(appConfigKey.asInstanceOf[js.Any])
    if (appConfigKeyType != null) __obj.updateDynamic("appConfigKeyType")(appConfigKeyType.asInstanceOf[js.Any])
    if (appConfigKeyValue != null) __obj.updateDynamic("appConfigKeyValue")(appConfigKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfigurationSettingItem]
  }
}

