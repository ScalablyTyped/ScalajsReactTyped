package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonEditorOptions
import typingsJapgolly.devextreme.AnonLocation
import typingsJapgolly.devextreme.devextremeStrings.button
import typingsJapgolly.devextreme.devextremeStrings.empty
import typingsJapgolly.devextreme.devextremeStrings.group
import typingsJapgolly.devextreme.devextremeStrings.simple
import typingsJapgolly.devextreme.devextremeStrings.tabbed
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormSimpleItem extends js.Object {
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the path to the formData object field bound to the current form item. */
  var dataField: js.UndefOr[String] = js.undefined
  /** Configures the form item's editor. */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** Specifies which editor widget is used to display and edit the form item value. */
  var editorType: js.UndefOr[
    typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete | typingsJapgolly.devextreme.devextremeStrings.dxCalendar | typingsJapgolly.devextreme.devextremeStrings.dxCheckBox | typingsJapgolly.devextreme.devextremeStrings.dxColorBox | typingsJapgolly.devextreme.devextremeStrings.dxDateBox | typingsJapgolly.devextreme.devextremeStrings.dxDropDownBox | typingsJapgolly.devextreme.devextremeStrings.dxHtmlEditor | typingsJapgolly.devextreme.devextremeStrings.dxLookup | typingsJapgolly.devextreme.devextremeStrings.dxNumberBox | typingsJapgolly.devextreme.devextremeStrings.dxRadioGroup | typingsJapgolly.devextreme.devextremeStrings.dxRangeSlider | typingsJapgolly.devextreme.devextremeStrings.dxSelectBox | typingsJapgolly.devextreme.devextremeStrings.dxSlider | typingsJapgolly.devextreme.devextremeStrings.dxSwitch | typingsJapgolly.devextreme.devextremeStrings.dxTagBox | typingsJapgolly.devextreme.devextremeStrings.dxTextArea | typingsJapgolly.devextreme.devextremeStrings.dxTextBox
  ] = js.undefined
  /** Specifies the help text displayed for the current form item. */
  var helpText: js.UndefOr[String] = js.undefined
  /** Specifies whether the current form item is required. */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  /** Specifies the item's type. Set it to "simple" to create a simple item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** Specifies options for the form item label. */
  var label: js.UndefOr[AnonLocation] = js.undefined
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.undefined
  /** A template to be used for rendering the form item. */
  var template: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonEditorOptions, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** An array of validation rules to be checked for the form item editor. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormSimpleItem {
  @scala.inline
  def apply(
    colSpan: Int | Double = null,
    cssClass: String = null,
    dataField: String = null,
    editorOptions: js.Any = null,
    editorType: typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete | typingsJapgolly.devextreme.devextremeStrings.dxCalendar | typingsJapgolly.devextreme.devextremeStrings.dxCheckBox | typingsJapgolly.devextreme.devextremeStrings.dxColorBox | typingsJapgolly.devextreme.devextremeStrings.dxDateBox | typingsJapgolly.devextreme.devextremeStrings.dxDropDownBox | typingsJapgolly.devextreme.devextremeStrings.dxHtmlEditor | typingsJapgolly.devextreme.devextremeStrings.dxLookup | typingsJapgolly.devextreme.devextremeStrings.dxNumberBox | typingsJapgolly.devextreme.devextremeStrings.dxRadioGroup | typingsJapgolly.devextreme.devextremeStrings.dxRangeSlider | typingsJapgolly.devextreme.devextremeStrings.dxSelectBox | typingsJapgolly.devextreme.devextremeStrings.dxSlider | typingsJapgolly.devextreme.devextremeStrings.dxSwitch | typingsJapgolly.devextreme.devextremeStrings.dxTagBox | typingsJapgolly.devextreme.devextremeStrings.dxTextArea | typingsJapgolly.devextreme.devextremeStrings.dxTextBox = null,
    helpText: String = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    itemType: empty | group | simple | tabbed | button = null,
    label: AnonLocation = null,
    name: String = null,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonEditorOptions, /* itemElement */ dxElement, String | Element | JQuery]) = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null
  ): dxFormSimpleItem = {
    val __obj = js.Dynamic.literal()
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorType != null) __obj.updateDynamic("editorType")(editorType.asInstanceOf[js.Any])
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormSimpleItem]
  }
}

