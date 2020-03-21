package typingsJapgolly.materialToolbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialToolbar.materialToolbarStrings.MDCToolbarColonchange
import typingsJapgolly.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__icon`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__rowColonfirst-child`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__title`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHANGE_EVENT: MDCToolbarColonchange
  var FIRST_ROW_SELECTOR: `Dotmdc-toolbar__rowColonfirst-child`
  var ICON_SELECTOR: `Dotmdc-toolbar__icon`
  var TITLE_SELECTOR: `Dotmdc-toolbar__title`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCToolbarColonchange,
    FIRST_ROW_SELECTOR: `Dotmdc-toolbar__rowColonfirst-child`,
    ICON_SELECTOR: `Dotmdc-toolbar__icon`,
    TITLE_SELECTOR: `Dotmdc-toolbar__title`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

