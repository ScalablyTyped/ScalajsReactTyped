package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.AnonEvent
import typingsJapgolly.gestalt.AnonPath
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.gestaltStrings.transparentDarkGray
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: String
  var bgColor: js.UndefOr[transparent | transparentDarkGray | gray | lightGray | white | blue] = js.undefined
  var dangerouslySetSvgPath: js.UndefOr[AnonPath] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: Icons
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ AnonEvent, Unit]] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    icon: Icons,
    accessibilityExpanded: js.UndefOr[Boolean] = js.undefined,
    accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined,
    bgColor: transparent | transparentDarkGray | gray | lightGray | white | blue = null,
    dangerouslySetSvgPath: AnonPath = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconColor: blue | darkGray | gray | red | white = null,
    onClick: /* args */ AnonEvent => Callback = null,
    size: xs | sm | md | lg | xl = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEvent) => onClick(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

