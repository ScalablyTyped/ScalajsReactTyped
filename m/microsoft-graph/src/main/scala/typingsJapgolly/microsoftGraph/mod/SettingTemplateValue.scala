package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingTemplateValue extends js.Object {
  // Default value for the setting.
  var defaultValue: js.UndefOr[String] = js.undefined
  // Description of the setting.
  var description: js.UndefOr[String] = js.undefined
  // Name of the setting.
  var name: js.UndefOr[String] = js.undefined
  // Type of the setting.
  var `type`: js.UndefOr[String] = js.undefined
}

object SettingTemplateValue {
  @scala.inline
  def apply(
    defaultValue: String = null,
    description: String = null,
    name: String = null,
    `type`: String = null
  ): SettingTemplateValue = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingTemplateValue]
  }
}

