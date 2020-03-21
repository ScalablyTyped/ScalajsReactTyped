package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.FFAddonSDK.ActionButton
import typingsJapgolly.jpm.FFAddonSDK.ActionButtonState
import typingsJapgolly.jpm.FFAddonSDK.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadge extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var badgeColor: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: Icon
  var id: String
  var label: String
  var onChange: js.UndefOr[js.Function1[/* state */ ActionButtonState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* state */ ActionButton, _]] = js.undefined
}

object AnonBadge {
  @scala.inline
  def apply(
    icon: Icon,
    id: String,
    label: String,
    badge: String | Double = null,
    badgeColor: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* state */ ActionButtonState => CallbackTo[js.Any] = null,
    onClick: /* state */ ActionButton => CallbackTo[js.Any] = null
  ): AnonBadge = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.jpm.FFAddonSDK.ActionButtonState) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.jpm.FFAddonSDK.ActionButton) => onClick(t0).runNow()))
    __obj.asInstanceOf[AnonBadge]
  }
}

