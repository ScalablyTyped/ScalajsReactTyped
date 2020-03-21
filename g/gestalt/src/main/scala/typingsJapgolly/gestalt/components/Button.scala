package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
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
import typingsJapgolly.gestalt.mod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
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
    `type`: submit | button = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ButtonProps, typingsJapgolly.gestalt.mod.Button, Unit, ButtonProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Button](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.ButtonProps])(children: _*)
  }
  @JSImport("gestalt", "Button")
  @js.native
  object componentImport extends js.Object
  
}

