package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.RaisedButtonProps
import typingsJapgolly.materialUi.materialUiStrings.after
import typingsJapgolly.materialUi.materialUiStrings.before
import typingsJapgolly.materialUi.raisedButtonMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RaisedButton {
  def apply(
    backgroundColor: String = null,
    buttonStyle: CSSProperties = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containerElement: Node | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledBackgroundColor: String = null,
    disabledLabelColor: String = null,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: VdomNode = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: VdomNode = null,
    labelColor: String = null,
    labelPosition: before | after = null,
    labelStyle: CSSProperties = null,
    linkButton: js.UndefOr[Boolean] = js.undefined,
    onBlur: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onKeyboardFocus: (/* e */ ReactFocusEventFrom[js.Object with Element], /* isKeyboardFocused */ Boolean) => Callback = null,
    onMouseDown: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    overlayStyle: CSSProperties = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    rippleStyle: CSSProperties = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    target: String = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    `type`: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RaisedButtonProps, default, Unit, RaisedButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledBackgroundColor != null) __obj.updateDynamic("disabledBackgroundColor")(disabledBackgroundColor.asInstanceOf[js.Any])
    if (disabledLabelColor != null) __obj.updateDynamic("disabledLabelColor")(disabledLabelColor.asInstanceOf[js.Any])
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor.asInstanceOf[js.Any])
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* isKeyboardFocused */ scala.Boolean) => onKeyboardFocus(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (rippleStyle != null) __obj.updateDynamic("rippleStyle")(rippleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor.asInstanceOf[js.Any])
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.RaisedButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.raisedButtonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.RaisedButtonProps])(children: _*)
  }
  @JSImport("material-ui/RaisedButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

