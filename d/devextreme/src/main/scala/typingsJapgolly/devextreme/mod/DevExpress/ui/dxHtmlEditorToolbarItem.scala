package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.devextremeStrings.after
import typingsJapgolly.devextreme.devextremeStrings.alignCenter
import typingsJapgolly.devextreme.devextremeStrings.alignJustify
import typingsJapgolly.devextreme.devextremeStrings.alignLeft
import typingsJapgolly.devextreme.devextremeStrings.alignRight
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.background
import typingsJapgolly.devextreme.devextremeStrings.before
import typingsJapgolly.devextreme.devextremeStrings.blockquote
import typingsJapgolly.devextreme.devextremeStrings.bold
import typingsJapgolly.devextreme.devextremeStrings.bulletList
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.codeBlock
import typingsJapgolly.devextreme.devextremeStrings.color
import typingsJapgolly.devextreme.devextremeStrings.decreaseIndent
import typingsJapgolly.devextreme.devextremeStrings.header
import typingsJapgolly.devextreme.devextremeStrings.image
import typingsJapgolly.devextreme.devextremeStrings.inMenu
import typingsJapgolly.devextreme.devextremeStrings.increaseIndent
import typingsJapgolly.devextreme.devextremeStrings.italic
import typingsJapgolly.devextreme.devextremeStrings.link
import typingsJapgolly.devextreme.devextremeStrings.never
import typingsJapgolly.devextreme.devextremeStrings.orderedList
import typingsJapgolly.devextreme.devextremeStrings.redo
import typingsJapgolly.devextreme.devextremeStrings.separator
import typingsJapgolly.devextreme.devextremeStrings.strike
import typingsJapgolly.devextreme.devextremeStrings.subscript
import typingsJapgolly.devextreme.devextremeStrings.superscript
import typingsJapgolly.devextreme.devextremeStrings.underline
import typingsJapgolly.devextreme.devextremeStrings.undo
import typingsJapgolly.devextreme.devextremeStrings.variable
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorToolbarItem extends dxToolbarItem {
  /** Specifies the predefined item that this object customizes or a format with multiple choices. */
  var formatName: js.UndefOr[
    background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
  ] = js.undefined
  /** Specifies values for a format with multiple choices. Should be used with the formatName. */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
}

object dxHtmlEditorToolbarItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatName: background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String = null,
    formatValues: js.Array[String | Double | Boolean] = null,
    html: String = null,
    locateInMenu: always | auto | never = null,
    location: after | before | center = null,
    menuItemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    options: js.Any = null,
    showText: always | inMenu = null,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widget: typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete | typingsJapgolly.devextreme.devextremeStrings.dxButton | typingsJapgolly.devextreme.devextremeStrings.dxCheckBox | typingsJapgolly.devextreme.devextremeStrings.dxDateBox | typingsJapgolly.devextreme.devextremeStrings.dxMenu | typingsJapgolly.devextreme.devextremeStrings.dxSelectBox | typingsJapgolly.devextreme.devextremeStrings.dxTabs | typingsJapgolly.devextreme.devextremeStrings.dxTextBox | typingsJapgolly.devextreme.devextremeStrings.dxButtonGroup | typingsJapgolly.devextreme.devextremeStrings.dxDropDownButton = null
  ): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (formatName != null) __obj.updateDynamic("formatName")(formatName.asInstanceOf[js.Any])
    if (formatValues != null) __obj.updateDynamic("formatValues")(formatValues.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (locateInMenu != null) __obj.updateDynamic("locateInMenu")(locateInMenu.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menuItemTemplate != null) __obj.updateDynamic("menuItemTemplate")(menuItemTemplate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
}

