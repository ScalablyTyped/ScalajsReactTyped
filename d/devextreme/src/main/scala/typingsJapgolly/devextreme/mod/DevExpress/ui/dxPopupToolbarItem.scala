package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.after
import typingsJapgolly.devextreme.devextremeStrings.before
import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPopupToolbarItem extends js.Object {
  /** Specifies whether a toolbar item should be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies html code inserted into the toolbar item element. */
  var html: js.UndefOr[String] = js.undefined
  /** Specifies a location for the item on the toolbar. */
  var location: js.UndefOr[after | before | center] = js.undefined
  /** Configures the DevExtreme widget used as a toolbar item. */
  var options: js.UndefOr[js.Any] = js.undefined
  /** Specifies a template that should be used to render this item only. */
  var template: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.core.template] = js.undefined
  /** Specifies text displayed for the toolbar item. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies whether the item is displayed on a top or bottom toolbar. */
  var toolbar: js.UndefOr[bottom | top] = js.undefined
  /** Specifies whether or not a widget item must be displayed. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** A widget that presents a toolbar item. */
  var widget: js.UndefOr[
    typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete | typingsJapgolly.devextreme.devextremeStrings.dxButton | typingsJapgolly.devextreme.devextremeStrings.dxCheckBox | typingsJapgolly.devextreme.devextremeStrings.dxDateBox | typingsJapgolly.devextreme.devextremeStrings.dxMenu | typingsJapgolly.devextreme.devextremeStrings.dxSelectBox | typingsJapgolly.devextreme.devextremeStrings.dxTabs | typingsJapgolly.devextreme.devextremeStrings.dxTextBox | typingsJapgolly.devextreme.devextremeStrings.dxButtonGroup | typingsJapgolly.devextreme.devextremeStrings.dxDropDownButton
  ] = js.undefined
}

object dxPopupToolbarItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    location: after | before | center = null,
    options: js.Any = null,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template = null,
    text: String = null,
    toolbar: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widget: typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete | typingsJapgolly.devextreme.devextremeStrings.dxButton | typingsJapgolly.devextreme.devextremeStrings.dxCheckBox | typingsJapgolly.devextreme.devextremeStrings.dxDateBox | typingsJapgolly.devextreme.devextremeStrings.dxMenu | typingsJapgolly.devextreme.devextremeStrings.dxSelectBox | typingsJapgolly.devextreme.devextremeStrings.dxTabs | typingsJapgolly.devextreme.devextremeStrings.dxTextBox | typingsJapgolly.devextreme.devextremeStrings.dxButtonGroup | typingsJapgolly.devextreme.devextremeStrings.dxDropDownButton = null
  ): dxPopupToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPopupToolbarItem]
  }
}

