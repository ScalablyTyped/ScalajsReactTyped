package typingsJapgolly.materialTabs.tabBarConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialTabs.materialTabsStrings.MDCTabBarColonchange
import typingsJapgolly.materialTabs.materialTabsStrings.`Dotmdc-tab-bar__indicator`
import typingsJapgolly.materialTabs.materialTabsStrings.`Dotmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHANGE_EVENT: MDCTabBarColonchange
  var INDICATOR_SELECTOR: `Dotmdc-tab-bar__indicator`
  var TAB_SELECTOR: `Dotmdc-tab`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCTabBarColonchange,
    INDICATOR_SELECTOR: `Dotmdc-tab-bar__indicator`,
    TAB_SELECTOR: `Dotmdc-tab`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INDICATOR_SELECTOR = INDICATOR_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

