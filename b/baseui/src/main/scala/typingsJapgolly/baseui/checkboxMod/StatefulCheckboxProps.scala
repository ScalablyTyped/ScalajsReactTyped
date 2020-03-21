package typingsJapgolly.baseui.checkboxMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.toggle
import typingsJapgolly.baseui.baseuiStrings.toggle_round
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulCheckboxProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[typingsJapgolly.baseui.checkboxMod.initialState] = js.undefined
  var inputRef: js.UndefOr[Ref] = js.undefined
  var isError: js.UndefOr[Boolean] = js.undefined
  var isIndeterminate: js.UndefOr[Boolean] = js.undefined
  var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
}

object StatefulCheckboxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checkmarkType: default_ | toggle | toggle_round = null,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: initialState = null,
    inputRef: Ref = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    isIndeterminate: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    onBlur: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    overrides: CheckboxOverrides = null
  ): StatefulCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (checkmarkType != null) __obj.updateDynamic("checkmarkType")(checkmarkType.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onFocus(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseLeave(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulCheckboxProps]
  }
}

