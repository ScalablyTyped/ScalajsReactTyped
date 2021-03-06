package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonAddedItemsComponent
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonComponentT
import typingsJapgolly.devextreme.AnonCustomItem
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementEventJQueryEvent
import typingsJapgolly.devextreme.AnonElementModelValue
import typingsJapgolly.devextreme.AnonIcon
import typingsJapgolly.devextreme.AnonItemElementItemIndex
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonMultiTagElement
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonPreviousValue
import typingsJapgolly.devextreme.devextremeStrings.allPages
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.contains
import typingsJapgolly.devextreme.devextremeStrings.dropDown
import typingsJapgolly.devextreme.devextremeStrings.email
import typingsJapgolly.devextreme.devextremeStrings.filled
import typingsJapgolly.devextreme.devextremeStrings.instantly
import typingsJapgolly.devextreme.devextremeStrings.invalid
import typingsJapgolly.devextreme.devextremeStrings.onFocus
import typingsJapgolly.devextreme.devextremeStrings.outlined
import typingsJapgolly.devextreme.devextremeStrings.page
import typingsJapgolly.devextreme.devextremeStrings.password
import typingsJapgolly.devextreme.devextremeStrings.pending
import typingsJapgolly.devextreme.devextremeStrings.search
import typingsJapgolly.devextreme.devextremeStrings.startswith
import typingsJapgolly.devextreme.devextremeStrings.tel
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.devextremeStrings.underlined
import typingsJapgolly.devextreme.devextremeStrings.url
import typingsJapgolly.devextreme.devextremeStrings.useButtons
import typingsJapgolly.devextreme.devextremeStrings.valid
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTagBoxOptions extends dxSelectBoxOptions[dxTagBox] {
  /** A Boolean value specifying whether or not to hide selected items. */
  var hideSelectedItems: js.UndefOr[Boolean] = js.undefined
  /** Specifies the limit on displayed tags. On exceeding it, the widget replaces all tags with a single multi-tag that displays the number of selected items. */
  var maxDisplayedTags: js.UndefOr[Double] = js.undefined
  /** A Boolean value specifying whether or not the widget is multiline. */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed before the multi-tag is rendered. */
  var onMultiTagPreparing: js.UndefOr[js.Function1[/* e */ AnonMultiTagElement, _]] = js.undefined
  /** A function that is executed when the "Select All" check box value is changed. Applies only if showSelectionControls is true. */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ AnonElementModelValue, _]] = js.undefined
  /** A function that is executed when a list item is selected or selection is canceled. */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTagBoxOptions: js.UndefOr[js.Function1[/* e */ AnonAddedItemsComponent, _]] = js.undefined
  /** Specifies the mode in which all items are selected. */
  var selectAllMode: js.UndefOr[allPages | page] = js.undefined
  /** Gets the currently selected items. */
  var selectedItems: js.UndefOr[js.Array[String | Double | _]] = js.undefined
  /** Specifies whether the multi-tag is shown without ordinary tags. */
  var showMultiTagOnly: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom template for tags. */
  var tagTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* itemData */ js.Any, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies the selected items. */
  @JSName("value")
  var value_dxTagBoxOptions: js.UndefOr[js.Array[String | Double | _]] = js.undefined
}

object dxTagBoxOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    dataSource: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    displayValue: String = null,
    dropDownButtonTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    elementAttr: js.Any = null,
    fieldTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery]) = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hideSelectedItems: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[CollectionWidgetItem | _] = null,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    maxDisplayedTags: Int | Double = null,
    maxLength: String | Double = null,
    minSearchLength: Int | Double = null,
    mode: email | password | search | tel | text | url = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    noDataText: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onClosed: /* e */ AnonComponentT[dxTagBox] => CallbackTo[js.Any] = null,
    onContentReady: /* e */ AnonComponentElement[dxTagBox] => CallbackTo[js.Any] = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onCustomItemCreating: /* e */ AnonCustomItem[dxTagBox] => CallbackTo[js.Any] = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxTagBox] => CallbackTo[js.Any] = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxTagBox] => CallbackTo[js.Any] = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onItemClick: /* e */ AnonItemElementItemIndex[dxTagBox] => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onMultiTagPreparing: /* e */ AnonMultiTagElement => CallbackTo[js.Any] = null,
    onOpened: /* e */ AnonComponentT[dxTagBox] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxTagBox] => CallbackTo[js.Any] = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxTagBox] => CallbackTo[js.Any] = null,
    onSelectAllValueChanged: /* e */ AnonElementModelValue => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonAddedItemsComponent => CallbackTo[js.Any] = null,
    onValueChanged: /* e */ AnonPreviousValue[dxTagBox] => CallbackTo[js.Any] = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith = null,
    searchTimeout: Int | Double = null,
    selectAllMode: allPages | page = null,
    selectedItem: js.Any = null,
    selectedItems: js.Array[String | Double | _] = null,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDataBeforeSearch: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    showMultiTagOnly: js.UndefOr[Boolean] = js.undefined,
    showSelectionControls: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    tagTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* itemData */ js.Any, /* itemElement */ dxElement, String | Element | JQuery]) = null,
    text: String = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.Array[String | Double | _] = null,
    valueChangeEvent: String = null,
    valueExpr: String | (js.Function1[/* item */ js.Any, String | Double | Boolean]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wrapItemText: js.UndefOr[Boolean] = js.undefined
  ): dxTagBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fieldTemplate != null) __obj.updateDynamic("fieldTemplate")(fieldTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSelectedItems)) __obj.updateDynamic("hideSelectedItems")(hideSelectedItems.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (maxDisplayedTags != null) __obj.updateDynamic("maxDisplayedTags")(maxDisplayedTags.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minSearchLength != null) __obj.updateDynamic("minSearchLength")(minSearchLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onChange(t0).runNow()))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentT[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onClosed(t0).runNow()))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onContentReady(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onCopy(t0).runNow()))
    if (onCustomItemCreating != null) __obj.updateDynamic("onCustomItemCreating")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCustomItem[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onCustomItemCreating(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onCut(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onDisposing(t0).runNow()))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onEnterKey(t0).runNow()))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onFocusIn(t0).runNow()))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onFocusOut(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onInitialized(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onInput(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemElementItemIndex[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onItemClick(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onKeyUp(t0).runNow()))
    if (onMultiTagPreparing != null) __obj.updateDynamic("onMultiTagPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonMultiTagElement) => onMultiTagPreparing(t0).runNow()))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentT[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onOpened(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onOptionChanged(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventJQueryEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onPaste(t0).runNow()))
    if (onSelectAllValueChanged != null) __obj.updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelValue) => onSelectAllValueChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAddedItemsComponent) => onSelectionChanged(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonPreviousValue[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTagBox]) => onValueChanged(t0).runNow()))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (selectAllMode != null) __obj.updateDynamic("selectAllMode")(selectAllMode.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataBeforeSearch)) __obj.updateDynamic("showDataBeforeSearch")(showDataBeforeSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showMultiTagOnly)) __obj.updateDynamic("showMultiTagOnly")(showMultiTagOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectionControls)) __obj.updateDynamic("showSelectionControls")(showSelectionControls.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tagTemplate != null) __obj.updateDynamic("tagTemplate")(tagTemplate.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapItemText)) __obj.updateDynamic("wrapItemText")(wrapItemText.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTagBoxOptions]
  }
}

