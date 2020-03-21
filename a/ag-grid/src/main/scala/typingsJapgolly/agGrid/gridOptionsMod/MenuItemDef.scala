package typingsJapgolly.agGrid.gridOptionsMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemDef extends js.Object {
  var action: js.UndefOr[js.Function0[Unit]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var cssClasses: js.UndefOr[js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[HTMLElement | String] = js.undefined
  var name: String
  var shortcut: js.UndefOr[String] = js.undefined
  var subMenu: js.UndefOr[js.Array[MenuItemDef | String]] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object MenuItemDef {
  @scala.inline
  def apply(
    name: String,
    action: js.UndefOr[Callback] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    cssClasses: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: HTMLElement | String = null,
    shortcut: String = null,
    subMenu: js.Array[MenuItemDef | String] = null,
    tooltip: String = null
  ): MenuItemDef = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    action.foreach(p => __obj.updateDynamic("action")(p.toJsFn))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemDef]
  }
}

