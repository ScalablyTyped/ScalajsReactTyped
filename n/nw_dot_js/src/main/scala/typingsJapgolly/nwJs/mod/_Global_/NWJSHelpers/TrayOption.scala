package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import typingsJapgolly.nwJs.mod._Global_.nw.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Option for tray that contains initial settings for the Tray.
  */
trait TrayOption extends js.Object {
  /**
    * {string} alternate
    */
  var alticon: js.UndefOr[String] = js.undefined
  /**
    * {string} icon
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * {boolean} whether icons are templates
    */
  var iconsAreTemplates: js.UndefOr[Boolean] = js.undefined
  /**
    * {Menu} popup menu
    */
  var menu: js.UndefOr[Menu] = js.undefined
  /**
    * {string} title
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * {string} tooltip
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object TrayOption {
  @scala.inline
  def apply(
    alticon: String = null,
    icon: String = null,
    iconsAreTemplates: js.UndefOr[Boolean] = js.undefined,
    menu: Menu = null,
    title: String = null,
    tooltip: String = null
  ): TrayOption = {
    val __obj = js.Dynamic.literal()
    if (alticon != null) __obj.updateDynamic("alticon")(alticon.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconsAreTemplates)) __obj.updateDynamic("iconsAreTemplates")(iconsAreTemplates.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayOption]
  }
}

