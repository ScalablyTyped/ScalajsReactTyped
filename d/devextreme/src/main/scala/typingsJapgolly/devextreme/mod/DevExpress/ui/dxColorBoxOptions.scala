package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonComponentT
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementEventJQueryEvent
import typingsJapgolly.devextreme.AnonIcon
import typingsJapgolly.devextreme.AnonJQueryEvent
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.dropDown
import typingsJapgolly.devextreme.devextremeStrings.email
import typingsJapgolly.devextreme.devextremeStrings.filled
import typingsJapgolly.devextreme.devextremeStrings.instantly
import typingsJapgolly.devextreme.devextremeStrings.invalid
import typingsJapgolly.devextreme.devextremeStrings.onFocus
import typingsJapgolly.devextreme.devextremeStrings.outlined
import typingsJapgolly.devextreme.devextremeStrings.password
import typingsJapgolly.devextreme.devextremeStrings.pending
import typingsJapgolly.devextreme.devextremeStrings.search
import typingsJapgolly.devextreme.devextremeStrings.tel
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.devextremeStrings.underlined
import typingsJapgolly.devextreme.devextremeStrings.url
import typingsJapgolly.devextreme.devextremeStrings.useButtons
import typingsJapgolly.devextreme.devextremeStrings.valid
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxColorBoxOptions extends dxDropDownEditorOptions[dxColorBox] {
  /** Specifies the text displayed on the button that applies changes and closes the drop-down editor. */
  var applyButtonText: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed on the button that cancels changes and closes the drop-down editor. */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /** Specifies whether or not the widget value includes the alpha channel component. */
  var editAlphaChannel: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom template for the input field. Must contain the TextBox widget. */
  var fieldTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ String, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies the size of a step by which a handle is moved using a keyboard shortcut. */
  var keyStep: js.UndefOr[Double] = js.undefined
}

object dxColorBoxOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    applyButtonText: String = null,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    cancelButtonText: String = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropDownButtonTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    editAlphaChannel: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    fieldTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ String, /* fieldElement */ dxElement, String | Element | JQuery]) = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    keyStep: Int | Double = null,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    maxLength: String | Double = null,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onClosed: /* e */ AnonComponentT[dxColorBox] => CallbackTo[js.Any] = null,
    onContentReady: /* e */ AnonComponentElement[dxColorBox] => CallbackTo[js.Any] = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxColorBox] => CallbackTo[js.Any] = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxColorBox] => CallbackTo[js.Any] = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onOpened: /* e */ AnonComponentT[dxColorBox] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxColorBox] => CallbackTo[js.Any] = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxColorBox] => CallbackTo[js.Any] = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: String = null,
    valueChangeEvent: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxColorBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (applyButtonText != null) __obj.updateDynamic("applyButtonText")(applyButtonText.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(editAlphaChannel)) __obj.updateDynamic("editAlphaChannel")(editAlphaChannel.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fieldTemplate != null) __obj.updateDynamic("fieldTemplate")(fieldTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (keyStep != null) __obj.updateDynamic("keyStep")(keyStep.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onChange(t0).runNow()))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentT[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onClosed(t0).runNow()))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onContentReady(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onCut(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onDisposing(t0).runNow()))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onEnterKey(t0).runNow()))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onFocusIn(t0).runNow()))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onFocusOut(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onInitialized(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onInput(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onKeyUp(t0).runNow()))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentT[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onOpened(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onOptionChanged(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onPaste(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxColorBox]) => onValueChanged(t0).runNow()))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxColorBoxOptions]
  }
}

