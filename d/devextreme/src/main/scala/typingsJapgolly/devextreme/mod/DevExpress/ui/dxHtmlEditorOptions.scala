package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEventModel
import typingsJapgolly.devextreme.AnonJQueryEvent
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.html
import typingsJapgolly.devextreme.devextremeStrings.invalid
import typingsJapgolly.devextreme.devextremeStrings.markdown
import typingsJapgolly.devextreme.devextremeStrings.pending
import typingsJapgolly.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorOptions extends EditorOptions[dxHtmlEditor] {
  /** Allows you to customize Quill and 3rd-party modules. */
  var customizeModules: js.UndefOr[js.Function1[/* config */ js.Any, _]] = js.undefined
  /** Configures media resizing. */
  var mediaResizing: js.UndefOr[dxHtmlEditorMediaResizing] = js.undefined
  /** Configures mentions. */
  var mentions: js.UndefOr[js.Array[dxHtmlEditorMention]] = js.undefined
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.undefined
  /** A function that is executed when the widget gets focus. */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ AnonEventModel, _]] = js.undefined
  /** A function that is executed when the widget loses focus. */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ AnonEventModel, _]] = js.undefined
  /** Specifies the text displayed when the input field is empty. */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Configures the widget's toolbar. */
  var toolbar: js.UndefOr[dxHtmlEditorToolbar] = js.undefined
  /** Specifies in which markup language the value is stored. */
  var valueType: js.UndefOr[html | markdown] = js.undefined
  /** Configures variables, which are placeholders to be replaced with actual values when processing text. */
  var variables: js.UndefOr[dxHtmlEditorVariables] = js.undefined
}

object dxHtmlEditorOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    customizeModules: /* config */ js.Any => CallbackTo[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mediaResizing: dxHtmlEditorMediaResizing = null,
    mentions: js.Array[dxHtmlEditorMention] = null,
    name: String = null,
    onContentReady: /* e */ AnonComponentElement[dxHtmlEditor] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxHtmlEditor] => CallbackTo[js.Any] = null,
    onFocusIn: /* e */ AnonEventModel => CallbackTo[js.Any] = null,
    onFocusOut: /* e */ AnonEventModel => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxHtmlEditor] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxHtmlEditor] => CallbackTo[js.Any] = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxHtmlEditor] => CallbackTo[js.Any] = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    toolbar: dxHtmlEditorToolbar = null,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.Any = null,
    valueType: html | markdown = null,
    variables: dxHtmlEditorVariables = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxHtmlEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (customizeModules != null) __obj.updateDynamic("customizeModules")(js.Any.fromFunction1((t0: /* config */ js.Any) => customizeModules(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (mediaResizing != null) __obj.updateDynamic("mediaResizing")(mediaResizing.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor]) => onDisposing(t0).runNow()))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventModel) => onFocusIn(t0).runNow()))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventModel) => onFocusOut(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor]) => onOptionChanged(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxHtmlEditor]) => onValueChanged(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorOptions]
  }
}

