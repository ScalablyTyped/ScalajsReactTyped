package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEventItemData
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonRemovedItems
import typingsJapgolly.devextreme.devextremeStrings.contained
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.outlined
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxButtonGroupOptions extends WidgetOptions[dxButtonGroup] {
  /** Specifies a template for all the buttons in the group. */
  var buttonTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @deprecated Use the buttonTemplate option instead. */
  /** Specifies a custom button template. */
  var itemTemplate: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.core.template | js.Function] = js.undefined
  /** Configures buttons in the group. */
  var items: js.UndefOr[js.Array[dxButtonGroupItem]] = js.undefined
  /** Specifies which data field provides keys used to distinguish between the selected buttons. */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** A function that is executed when a button is clicked or tapped. */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonEventItemData, _]] = js.undefined
  /** A function that is executed when a button is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonRemovedItems, _]] = js.undefined
  /** Contains the keys of the selected buttons and allows selecting buttons initially. */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.undefined
  /** Contains the data objects that correspond to the selected buttons. The data objects are taken from the items array. */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies whether a single or multiple buttons can be in the selected state simultaneously. */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Specifies how buttons in the group are styled. */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
}

object dxButtonGroupOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttonTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | js.Function = null,
    items: js.Array[dxButtonGroupItem] = null,
    keyExpr: String | js.Function = null,
    onContentReady: /* e */ AnonComponentElement[dxButtonGroup] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxButtonGroup] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxButtonGroup] => CallbackTo[js.Any] = null,
    onItemClick: /* e */ AnonEventItemData => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxButtonGroup] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonRemovedItems => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: multiple | single_ = null,
    stylingMode: text | outlined | contained = null,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttonTemplate != null) __obj.updateDynamic("buttonTemplate")(buttonTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventItemData) => onItemClick(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup]) => onOptionChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonRemovedItems) => onSelectionChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxButtonGroupOptions]
  }
}

