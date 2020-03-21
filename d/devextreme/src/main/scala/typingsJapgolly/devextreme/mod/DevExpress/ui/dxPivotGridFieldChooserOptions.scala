package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonAllFields
import typingsJapgolly.devextreme.AnonAreaComponent
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonSearchTimeout
import typingsJapgolly.devextreme.devextremeNumbers.`0`
import typingsJapgolly.devextreme.devextremeNumbers.`1`
import typingsJapgolly.devextreme.devextremeNumbers.`2`
import typingsJapgolly.devextreme.devextremeStrings.instantly
import typingsJapgolly.devextreme.devextremeStrings.onDemand
import typingsJapgolly.devextreme.mod.DevExpress.data.PivotGridDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPivotGridFieldChooserOptions extends WidgetOptions[dxPivotGridFieldChooser] {
  /** Specifies whether the field chooser allows searching in the "All Fields" section. */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  /** Specifies when to apply changes made in the widget to the PivotGrid. */
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.undefined
  /** The data source of a PivotGrid widget. */
  var dataSource: js.UndefOr[PivotGridDataSource] = js.undefined
  /** Configures the header filter feature. */
  var headerFilter: js.UndefOr[AnonSearchTimeout] = js.undefined
  /** Specifies the field chooser layout. */
  var layout: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonAreaComponent, _]] = js.undefined
  /** Specifies a delay in milliseconds between when a user finishes typing in the field chooser's search panel, and when the search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  /** The widget's state. */
  var state: js.UndefOr[js.Any] = js.undefined
  /** Strings that can be changed or localized in the PivotGridFieldChooser widget. */
  var texts: js.UndefOr[AnonAllFields] = js.undefined
}

object dxPivotGridFieldChooserOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    applyChangesMode: instantly | onDemand = null,
    bindingOptions: js.Any = null,
    dataSource: PivotGridDataSource = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    headerFilter: AnonSearchTimeout = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    layout: `0` | `1` | `2` = null,
    onContentReady: /* e */ AnonComponentElement[dxPivotGridFieldChooser] => CallbackTo[js.Any] = null,
    onContextMenuPreparing: /* e */ AnonAreaComponent => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxPivotGridFieldChooser] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxPivotGridFieldChooser] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxPivotGridFieldChooser] => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    searchTimeout: Int | Double = null,
    state: js.Any = null,
    tabIndex: Int | Double = null,
    texts: AnonAllFields = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPivotGridFieldChooserOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (applyChangesMode != null) __obj.updateDynamic("applyChangesMode")(applyChangesMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser]) => onContentReady(t0).runNow()))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAreaComponent) => onContextMenuPreparing(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser]) => onOptionChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPivotGridFieldChooserOptions]
  }
}

