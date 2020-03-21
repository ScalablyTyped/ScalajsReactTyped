package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.devextremeStrings.after
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.before
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.copy
import typingsJapgolly.devextreme.devextremeStrings.create
import typingsJapgolly.devextreme.devextremeStrings.delete
import typingsJapgolly.devextreme.devextremeStrings.download
import typingsJapgolly.devextreme.devextremeStrings.inMenu
import typingsJapgolly.devextreme.devextremeStrings.move
import typingsJapgolly.devextreme.devextremeStrings.never
import typingsJapgolly.devextreme.devextremeStrings.refresh
import typingsJapgolly.devextreme.devextremeStrings.rename
import typingsJapgolly.devextreme.devextremeStrings.separator
import typingsJapgolly.devextreme.devextremeStrings.showNavPane
import typingsJapgolly.devextreme.devextremeStrings.upload
import typingsJapgolly.devextreme.devextremeStrings.viewSwitcher
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerToolbarItem extends dxToolbarItem {
  /** Specifies the toolbar item's name. */
  var name: js.UndefOr[
    showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator | String
  ] = js.undefined
}

object dxFileManagerToolbarItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    locateInMenu: always | auto | never = null,
    location: after | before | center = null,
    menuItemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    name: showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator | String = null,
    options: js.Any = null,
    showText: always | inMenu = null,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widget: typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete | typingsJapgolly.devextreme.devextremeStrings.dxButton | typingsJapgolly.devextreme.devextremeStrings.dxCheckBox | typingsJapgolly.devextreme.devextremeStrings.dxDateBox | typingsJapgolly.devextreme.devextremeStrings.dxMenu | typingsJapgolly.devextreme.devextremeStrings.dxSelectBox | typingsJapgolly.devextreme.devextremeStrings.dxTabs | typingsJapgolly.devextreme.devextremeStrings.dxTextBox | typingsJapgolly.devextreme.devextremeStrings.dxButtonGroup | typingsJapgolly.devextreme.devextremeStrings.dxDropDownButton = null
  ): dxFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (locateInMenu != null) __obj.updateDynamic("locateInMenu")(locateInMenu.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menuItemTemplate != null) __obj.updateDynamic("menuItemTemplate")(menuItemTemplate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerToolbarItem]
  }
}

