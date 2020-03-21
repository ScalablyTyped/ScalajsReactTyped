package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonColumnComponent
import typingsJapgolly.devextreme.AnonColumnComponentRow
import typingsJapgolly.devextreme.AnonRowType
import typingsJapgolly.devextreme.devextremeStrings.cancel
import typingsJapgolly.devextreme.devextremeStrings.delete
import typingsJapgolly.devextreme.devextremeStrings.edit
import typingsJapgolly.devextreme.devextremeStrings.save
import typingsJapgolly.devextreme.devextremeStrings.undelete
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridColumnButton extends GridBaseColumnButton {
  /** The name used to identify a built-in button. */
  var name: js.UndefOr[cancel | delete | edit | save | undelete | String] = js.undefined
  /** A function that is executed when the button is clicked or tapped. Not executed if a template is used. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonColumnComponent, _]) | String] = js.undefined
  /** Specifies a custom button template. */
  var template: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ AnonRowType, String | Element | JQuery])
  ] = js.undefined
  /** Specifies the button's visibility. */
  var visible: js.UndefOr[Boolean | (js.Function1[/* options */ AnonColumnComponentRow, Boolean])] = js.undefined
}

object dxDataGridColumnButton {
  @scala.inline
  def apply(
    cssClass: String = null,
    hint: String = null,
    icon: String = null,
    name: cancel | delete | edit | save | undelete | String = null,
    onClick: (js.Function1[/* e */ AnonColumnComponent, _]) | String = null,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ AnonRowType, String | Element | JQuery]) = null,
    text: String = null,
    visible: Boolean | (js.Function1[/* options */ AnonColumnComponentRow, Boolean]) = null
  ): dxDataGridColumnButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridColumnButton]
  }
}

