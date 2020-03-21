package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
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
import typingsJapgolly.gestalt.mod.IconButtonProps
import typingsJapgolly.gestalt.mod.Icons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconButton {
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
    size: xs | sm | md | lg | xl = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IconButtonProps, typingsJapgolly.gestalt.mod.IconButton, Unit, IconButtonProps] = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
  
      if (!js.isUndefined(accessibilityExpanded)) __obj.updateDynamic("accessibilityExpanded")(accessibilityExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityHaspopup)) __obj.updateDynamic("accessibilityHaspopup")(accessibilityHaspopup.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEvent) => onClick(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.IconButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.IconButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.IconButtonProps])(children: _*)
  }
  @JSImport("gestalt", "IconButton")
  @js.native
  object componentImport extends js.Object
  
}

