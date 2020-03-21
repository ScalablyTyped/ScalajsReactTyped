package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonAnd
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonContains
import typingsJapgolly.devextreme.AnonEditorElement
import typingsJapgolly.devextreme.AnonEditorName
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelPreviousValue
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.and
import typingsJapgolly.devextreme.devextremeStrings.notAnd
import typingsJapgolly.devextreme.devextremeStrings.notOr
import typingsJapgolly.devextreme.devextremeStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFilterBuilderOptions extends WidgetOptions[dxFilterBuilder] {
  /** Specifies whether the widget can display hierarchical data fields. */
  var allowHierarchicalFields: js.UndefOr[Boolean] = js.undefined
  /** Configures custom filter operations. */
  var customOperations: js.UndefOr[js.Array[dxFilterBuilderCustomOperation]] = js.undefined
  /** Configures fields. */
  var fields: js.UndefOr[js.Array[dxFilterBuilderField]] = js.undefined
  /** Specifies filter operation descriptions. */
  var filterOperationDescriptions: js.UndefOr[AnonContains] = js.undefined
  /** Specifies group operation descriptions. */
  var groupOperationDescriptions: js.UndefOr[AnonAnd] = js.undefined
  /** Specifies a set of available group operations. */
  var groupOperations: js.UndefOr[js.Array[and | or | notAnd | notOr]] = js.undefined
  /** Specifies groups' maximum nesting level. */
  var maxGroupLevel: js.UndefOr[Double] = js.undefined
  /** A function that is executed after an editor is created. */
  var onEditorPrepared: js.UndefOr[js.Function1[/* e */ AnonEditorElement, _]] = js.undefined
  /** A function that is executed before an editor is created. */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ AnonEditorName, _]] = js.undefined
  /** A function that is executed after the widget's value is changed. */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonModelPreviousValue, _]] = js.undefined
  /** Allows you to specify a filter. */
  var value: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
}

object dxFilterBuilderOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowHierarchicalFields: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    customOperations: js.Array[dxFilterBuilderCustomOperation] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    fields: js.Array[dxFilterBuilderField] = null,
    filterOperationDescriptions: AnonContains = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupOperationDescriptions: AnonAnd = null,
    groupOperations: js.Array[and | or | notAnd | notOr] = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxGroupLevel: Int | Double = null,
    onContentReady: /* e */ AnonComponentElement[dxFilterBuilder] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxFilterBuilder] => CallbackTo[js.Any] = null,
    onEditorPrepared: /* e */ AnonEditorElement => CallbackTo[js.Any] = null,
    onEditorPreparing: /* e */ AnonEditorName => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxFilterBuilder] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxFilterBuilder] => CallbackTo[js.Any] = null,
    onValueChanged: /* e */ AnonModelPreviousValue => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    value: String | js.Array[_] | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFilterBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHierarchicalFields)) __obj.updateDynamic("allowHierarchicalFields")(allowHierarchicalFields.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (customOperations != null) __obj.updateDynamic("customOperations")(customOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterOperationDescriptions != null) __obj.updateDynamic("filterOperationDescriptions")(filterOperationDescriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (groupOperationDescriptions != null) __obj.updateDynamic("groupOperationDescriptions")(groupOperationDescriptions.asInstanceOf[js.Any])
    if (groupOperations != null) __obj.updateDynamic("groupOperations")(groupOperations.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (maxGroupLevel != null) __obj.updateDynamic("maxGroupLevel")(maxGroupLevel.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFilterBuilder]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFilterBuilder]) => onDisposing(t0).runNow()))
    if (onEditorPrepared != null) __obj.updateDynamic("onEditorPrepared")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEditorElement) => onEditorPrepared(t0).runNow()))
    if (onEditorPreparing != null) __obj.updateDynamic("onEditorPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEditorName) => onEditorPreparing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFilterBuilder]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFilterBuilder]) => onOptionChanged(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelPreviousValue) => onValueChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderOptions]
  }
}

