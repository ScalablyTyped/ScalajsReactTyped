package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.AnonEvent
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.button
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.submit
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.gestaltStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[blue | gray | red | transparent | white] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ AnonEvent, Unit]] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
  var text: String
  var `type`: js.UndefOr[submit | button] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    text: String,
    accessibilityExpanded: js.UndefOr[Boolean] = js.undefined,
    accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    color: blue | gray | red | transparent | white = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onClick: /* args */ AnonEvent => Callback = null,
    size: sm | md | lg = null,
    `type`: submit | button = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEvent) => onClick(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

