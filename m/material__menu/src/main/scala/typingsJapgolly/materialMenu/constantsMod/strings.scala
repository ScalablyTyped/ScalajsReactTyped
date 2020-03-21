package typingsJapgolly.materialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialMenu.materialMenuStrings.MDCMenuColoncancel
import typingsJapgolly.materialMenu.materialMenuStrings.MDCMenuColonselected
import typingsJapgolly.materialMenu.materialMenuStrings.`Dotmdc-menu__items`
import typingsJapgolly.materialMenu.materialMenuStrings.`aria-disabled`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_DISABLED_ATTR: `aria-disabled`
  var CANCEL_EVENT: MDCMenuColoncancel
  var ITEMS_SELECTOR: `Dotmdc-menu__items`
  var SELECTED_EVENT: MDCMenuColonselected
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED_ATTR: `aria-disabled`,
    CANCEL_EVENT: MDCMenuColoncancel,
    ITEMS_SELECTOR: `Dotmdc-menu__items`,
    SELECTED_EVENT: MDCMenuColonselected,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR.asInstanceOf[js.Any], CANCEL_EVENT = CANCEL_EVENT.asInstanceOf[js.Any], ITEMS_SELECTOR = ITEMS_SELECTOR.asInstanceOf[js.Any], SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

